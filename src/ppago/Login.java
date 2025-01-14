package ppago;

import entidades.Usuario;
import excepciones.ConnectionException;
import excepciones.FaltanDatosException;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar Moya
 */
public class Login {

    // Método para validar el usuario y contraseña 
    // retorna 0 si las credenciales son incorrectas
    // retorna 1 si es usuario válido
    // retorna 2 si no ha iniciado sesión anteriormente
    public static int validarUser(ConexionPg connPg, Usuario u) throws SQLException, ConnectionException, FaltanDatosException {
        if (!u.getIdentificador().isEmpty() && !u.getContrasenna().isEmpty()) {
            Connection conn = connPg.getConexion();
            if (conn == null) {
                throw new ConnectionException("No existe una conexión con la base de datos.");
            } else {
                try {
                    //Comprobar si se ingresa la master password
                    if (u.getIdentificador().equals(connPg.getUsuario())
                            && u.getContrasenna().equals(connPg.getPassword())) {
                        //Se cierra la conexion solo cuando es un usuario válido
                        //En caso de no serlo no se puede cerrar porque se puede seguir intentando loguear
                        conn.close();
                        return 1;
                    }

                    //Query para obtener la cantidad de usuarios donde ese username coincida con la contraseña, además de comprobar si está activo
                    String query = "SELECT public.login_usuario(?, ?)";
                    PreparedStatement stmt = conn.prepareStatement(query);
                    stmt.setString(1, u.getIdentificador());
                    stmt.setString(2, u.getContrasenna());
                    ResultSet res = stmt.executeQuery();
                    
                    res.next();
                    int result = res.getInt("login_usuario"); 
                    
                    if(result == 1){
                        conn.close();
                    }
                    return result;
                } catch (Exception e) {
                    //Para en caso de que ocurra una excepcion en la consulta
                    JOptionPane.showMessageDialog(null, "Error al obtener información de la base de datos seleccionada." + e.getMessage());
                }
            }
        } else {
            throw new FaltanDatosException("Complete todos los campos antes de continuar.");
        }
        return 0;
    }

    /**
     * Método utilizado en la conexión a la base de datos Para validar que la
     * base de datos seleccionada es correcta Se verifica que el nombre de las
     * tablas es el correcto (Se le puede añadir otra validación)
     *
     * @param username
     * @param password
     * @param servidor
     * @param puerto
     * @param bd
     * @return True si es correcta y False en caso que no lo sea
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static boolean validarBD(String username, String password, String servidor, String puerto, String bd) throws ClassNotFoundException, SQLException, IOException, ConnectionException, FaltanDatosException {
        List<String> lista = Arrays.asList("rol", "usuario_rol", "usuario", "cliente", "programacion", "ejercicio", "tipofinan", "moneda", "destino", "periodo", "prog_destino_periodo");
        if (!username.isEmpty() && !password.isEmpty() && servidor != null && puerto != null && bd != null) {
            ConexionPg c = new ConexionPg(username, password, servidor, puerto, bd);
            Connection conn = c.conectar();

            if (conn != null) {
                try {
                    //Query para obtener el nombre de todas las tablas de la bd seleccionada
                    String query = "SELECT table_name FROM information_schema.tables WHERE table_schema='public' AND table_type='BASE TABLE'";
                    PreparedStatement stmt = conn.prepareStatement(query);
                    ResultSet res = stmt.executeQuery();

                    //Guardar en una lista todas las tablas
                    while (res.next()) {
                        if (!lista.contains(res.getString("table_name"))) {
                            return false;
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al obtener información de la base de datos seleccionada.");
                } finally {
                    conn.close();
                }

                //Se guarda la conexion establecida en un fichero binario
                c.guardar(c);
                return true;
            } else {
                throw new ConnectionException("No existe una conexión con la base de datos.");
            }
        } else {
            throw new FaltanDatosException("Complete todos los campos antes de continuar.");
        }
    }

    //Obtener lista con todas las base de datos 
    public static ArrayList<String> getListaBD(String user, String pass, String host, String port) throws SQLException, ClassNotFoundException {
        ConexionPg c = new ConexionPg(user, pass, host, port, "");
        Connection conn = c.conectar();
        ArrayList<String> lista = new ArrayList<>();

        if (conn != null) {
            try {
                String query = "SELECT datname FROM pg_database";
                PreparedStatement stmt = conn.prepareStatement(query);
                ResultSet res = stmt.executeQuery();

                while (res.next()) {
                    if (!res.getString("datname").equals("template0") && !res.getString("datname").equals("template1")) {
                        lista.add(res.getString("datname"));
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al obtener información de la base de datos.");
            } finally {
                conn.close();
            }
        }
        return lista;
    }

    /**
     * @return lista de servidores disponibles
     * @throws UnknownHostException
     * @throws SocketException
     */
    public static ArrayList<String> getServidores() throws UnknownHostException, SocketException {
        ArrayList<String> lista = new ArrayList<>();
        lista.add(getLocalHost());

        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface iface = interfaces.nextElement();
            Enumeration<InetAddress> direcciones = iface.getInetAddresses();

            while (direcciones.hasMoreElements()) {
                InetAddress direccion = direcciones.nextElement();
                if (direccion instanceof Inet4Address && !direccion.isLoopbackAddress()) {
                    String res = direccion.getHostAddress();
                    lista.add(InetAddress.getByName(res).getHostName());
                }
            }
        }
        return lista;
    }

    /**
     * Siempre devuelve localhost
     *
     * @return String con el localhost de la computadora
     */
    public static String getLocalHost() {
        InetAddress local = InetAddress.getLoopbackAddress();
        String localhost = local.getHostName();
        return localhost;
    }

}
