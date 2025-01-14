package visual;

import javax.swing.JOptionPane;
import entidades.Cliente;
import dao.ClienteDAO;
import excepciones.BDException;
import excepciones.ConnectionException;
import excepciones.CorreoException;
import excepciones.FaltanDatosException;
import excepciones.LongitudException;
import excepciones.ReeupException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import utiles.keyboradUtil;

public class JD_Adicionar_cliente extends javax.swing.JDialog {

    private ClienteDAO cDAO = new ClienteDAO();
    private String codCliente;
    private boolean cambios;
    private boolean editar;
    
    public JD_Adicionar_cliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(getIconImage("add_button"));
             
        siguienteCampo();
        focusButtons();
        maxLength();
        soloNumeros();
        keyboradUtil.isCorreo(jtfcorreo);                
    }

    public Image getIconImage(String nombre_icono) {
        Image res = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/"+nombre_icono+".png"));
        return res;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jpNuevo_Cliente = new javax.swing.JPanel();
        jtforganismo = new custom_swing.TextField();
        jtfcod_cliente = new custom_swing.TextField();
        jtfnombre = new custom_swing.TextField();
        jtfnit = new custom_swing.TextField();
        jtfreeup = new custom_swing.TextField();
        jtfcorreo = new custom_swing.TextField();
        jtfdireccion = new custom_swing.TextField();
        jtftelefono = new custom_swing.TextField();
        btnCancelar = new custom_swing.Button();
        btnAceptar = new custom_swing.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Cliente");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jpNuevo_Cliente.setBackground(new java.awt.Color(255, 255, 255));

        jtforganismo.setToolTipText("Inserte el organismo del cliente");
        jtforganismo.setLabelText("ORGANISMO");
        jtforganismo.setOpaque(false);

        jtfcod_cliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtfcod_cliente.setToolTipText("Inserte código del cliente");
        jtfcod_cliente.setLabelText("CÓDIGO*");
        jtfcod_cliente.setOpaque(false);
        jtfcod_cliente.setPreferredSize(new java.awt.Dimension(64, 48));
        jtfcod_cliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfcod_clienteFocusLost(evt);
            }
        });
        jtfcod_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfcod_clienteKeyReleased(evt);
            }
        });

        jtfnombre.setToolTipText("Inserte nombre del cliente");
        jtfnombre.setLabelText("NOMBRE*");
        jtfnombre.setOpaque(false);
        jtfnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfnombreKeyReleased(evt);
            }
        });

        jtfnit.setToolTipText("Inserte el nit del cliente");
        jtfnit.setLabelText("NIT");
        jtfnit.setOpaque(false);

        jtfreeup.setToolTipText("Inserte el reeup del cliente");
        jtfreeup.setLabelText("REEUP");
        jtfreeup.setOpaque(false);
        jtfreeup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfreeupKeyPressed(evt);
            }
        });

        jtfcorreo.setToolTipText("Inserte el correo del cliente");
        jtfcorreo.setLabelText("CORREO ELECTRÓNICO");
        jtfcorreo.setOpaque(false);

        jtfdireccion.setToolTipText("Inserte la dirección del cliente");
        jtfdireccion.setLabelText("DIRECCIÓN");
        jtfdireccion.setOpaque(false);

        jtftelefono.setToolTipText("Inserte el teléfono del cliente");
        jtftelefono.setLabelText("TELÉFONO");
        jtftelefono.setOpaque(false);

        btnCancelar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(45, 125, 246)));
        btnCancelar.setForeground(new java.awt.Color(45, 125, 246));
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cerrar diálogo de captación");
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAceptar.setText("Aceptar");
        btnAceptar.setToolTipText("Agregar cliente");
        btnAceptar.setEnabled(false);
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpNuevo_ClienteLayout = new javax.swing.GroupLayout(jpNuevo_Cliente);
        jpNuevo_Cliente.setLayout(jpNuevo_ClienteLayout);
        jpNuevo_ClienteLayout.setHorizontalGroup(
            jpNuevo_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevo_ClienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpNuevo_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtforganismo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfreeup, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfcod_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jpNuevo_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNuevo_ClienteLayout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpNuevo_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtftelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfcorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                        .addComponent(jtfnit, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                    .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jpNuevo_ClienteLayout.setVerticalGroup(
            jpNuevo_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevo_ClienteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpNuevo_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfcod_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpNuevo_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtforganismo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpNuevo_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfreeup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpNuevo_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jpNuevo_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpNuevo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpNuevo_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpNuevo_Cliente.getAccessibleContext().setAccessibleName("NUEVO_CLIENTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (!editar){
            // Agregar cliente
            accionAgregar();
        }else{
            // Editar cliente
            accionEditar();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jtfcod_clienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcod_clienteKeyReleased
        camposRequeridos();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            completarCodigo(jtfcod_cliente.getText());
        } 
    }//GEN-LAST:event_jtfcod_clienteKeyReleased

    private void jtfnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfnombreKeyReleased
        camposRequeridos();
    }//GEN-LAST:event_jtfnombreKeyReleased

    private void jtfcod_clienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfcod_clienteFocusLost
        completarCodigo(jtfcod_cliente.getText());       
    }//GEN-LAST:event_jtfcod_clienteFocusLost

    private void jtfreeupKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfreeupKeyPressed
        // Agregar guiones mientras escribe
        String contenido = jtfreeup.getText();
        int length = contenido.length();

        // Si no está borrando agrega un guión en las posiciones indicadas
        if (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (length == 3 || length == 5) {
                contenido += "-";
                jtfreeup.setText(contenido);
            }
        }
    }//GEN-LAST:event_jtfreeupKeyPressed

    // Limpiar todos los campos y hacer focus el primero
    private void limpiar() {
        jtfcod_cliente.setText("");
        jtfnit.setText("");
        jtfreeup.setText("");
        jtfdireccion.setText("");
        jtfnombre.setText("");
        jtfcorreo.setText("");
        jtforganismo.setText("");
        jtftelefono.setText("");
        jtfcod_cliente.requestFocus();
        camposRequeridos();
    }

    // Permitir determinada longitud de caracteres
    private void maxLength() {
        keyboradUtil.maxLength(jtfcod_cliente, 4);
        keyboradUtil.maxLength(jtfreeup, 11);
        keyboradUtil.maxLength(jtfnombre, 50);
        keyboradUtil.maxLength(jtfnit, 16);
        keyboradUtil.maxLength(jtfcorreo, 50);
        keyboradUtil.maxLength(jtfdireccion, 100);
        keyboradUtil.maxLength(jtftelefono, 8);
    }

    // Permitir solo números
    private void soloNumeros() {
        keyboradUtil.soloNumeros(jtfcod_cliente);
        keyboradUtil.soloNumeros(jtftelefono);
        keyboradUtil.soloNumeros(jtfnit);
        keyboradUtil.soloNumeros(jtfreeup);
    }

    // Ir al siguiente campo al presionar ENTER
    private void siguienteCampo() {
        keyboradUtil.siguienteCampo(jtfcod_cliente, jtfnombre);
        keyboradUtil.siguienteCampo(jtfnombre, jtforganismo);
        keyboradUtil.siguienteCampo(jtforganismo, jtfnit);
        keyboradUtil.siguienteCampo(jtfnit, jtfreeup);
        keyboradUtil.siguienteCampo(jtfreeup, jtfcorreo);
        keyboradUtil.siguienteCampo(jtfcorreo, jtfdireccion);
        keyboradUtil.siguienteCampo(jtfdireccion, jtftelefono);
        keyboradUtil.siguienteCampo(jtftelefono, btnAceptar, btnCancelar);
    }
    
    //Método para validar que no exista los campos requeridos vacíos
    private void camposRequeridos() {
        if (jtfcod_cliente.getText().isEmpty() || jtfnombre.getText().isEmpty()) {
            btnAceptar.setEnabled(false);
        } else {
            btnAceptar.setEnabled(true);
        }
    }
    
    // Método para cambiar el focus al siguiente botón 
    private void focusButtons(){
        keyboradUtil.focusButton(btnAceptar, btnCancelar);
        keyboradUtil.focusButton(btnCancelar, btnAceptar);
    }
    
    // Método para completar con ceros a la izquierda si el código no tiene 4 dígitos
    private void completarCodigo(String codigo){
        if (codigo.length() != 4 && codigo.length() != 0){
            while(codigo.length() != 4){
                codigo = "0"+codigo;    
            }
            jtfcod_cliente.setText(codigo);
        }          
    }
    
    // Agregar cliente a bd
    private void accionAgregar(){
        Cliente c = new Cliente();
        c.setCod_cliente(jtfcod_cliente.getText());
        c.setNombre(jtfnombre.getText());       
        if(!jtforganismo.getText().isEmpty()){
            c.setOrganismo(jtforganismo.getText());
        }
        if(!jtfnit.getText().isEmpty()){
            c.setNit(jtfnit.getText());
        }
        if(!jtfreeup.getText().isEmpty()){
            c.setReeup(c.reeupSinGuiones(jtfreeup.getText()));
        }
        if(!jtfcorreo.getText().isEmpty()){
            c.setCorreo(jtfcorreo.getText());
        }
        if(!jtfdireccion.getText().isEmpty()){
            c.setDireccion(jtfdireccion.getText());
        }
        if(!jtftelefono.getText().isEmpty()){
            c.setTelefono(jtftelefono.getText());
        }
        c.setActivo((byte) (1));

        try {
            // Validar campos
            if (c.isValido()) {
                int res = cDAO.agregarCliente(c);
                if (res != -1){
                    JOptionPane.showMessageDialog(this, "Cliente agregado con éxito.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    cambios = true;
                }else{
                    JOptionPane.showMessageDialog(this, "Ocurrió un error al agregar", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (FaltanDatosException | ReeupException | LongitudException | CorreoException | ConnectionException | BDException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error al establecer conexión con la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    // Editar cliente en bd
    private void accionEditar(){
        Cliente c = new Cliente();
        c.setCod_cliente(jtfcod_cliente.getText());
        c.setNombre(jtfnombre.getText());
        
        if(!jtforganismo.getText().isEmpty()){
            c.setOrganismo(jtforganismo.getText());
        }
        if(!jtfnit.getText().isEmpty()){
            c.setNit(jtfnit.getText());
        }
        if(!jtfreeup.getText().isEmpty()){
            c.setReeup(c.reeupSinGuiones(jtfreeup.getText()));
        }
        if(!jtfcorreo.getText().isEmpty()){
            c.setCorreo(jtfcorreo.getText());
        }
        if(!jtfdireccion.getText().isEmpty()){
            c.setDireccion(jtfdireccion.getText());
        }
        if(!jtftelefono.getText().isEmpty()){
            c.setTelefono(jtftelefono.getText());
        }

        try {          
            if (c.isValido()) {   // Validar campos
                int res = cDAO.editarCliente(codCliente, c);
                if (res != -1) {
                    JOptionPane.showMessageDialog(this, "Cliente editado con éxito.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    cambios = true;
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Ocurrió un error al editar", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (FaltanDatosException | ReeupException | LongitudException | CorreoException | ConnectionException | BDException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error al establecer conexión con la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JD_Adicionar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JD_Adicionar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JD_Adicionar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JD_Adicionar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JD_Adicionar_cliente dialog = new JD_Adicionar_cliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private custom_swing.Button btnAceptar;
    private custom_swing.Button btnCancelar;
    private javax.swing.JPanel jpNuevo_Cliente;
    private custom_swing.TextField jtfcod_cliente;
    private custom_swing.TextField jtfcorreo;
    private custom_swing.TextField jtfdireccion;
    private custom_swing.TextField jtfnit;
    private custom_swing.TextField jtfnombre;
    private custom_swing.TextField jtforganismo;
    private custom_swing.TextField jtfreeup;
    private custom_swing.TextField jtftelefono;
    // End of variables declaration//GEN-END:variables

    //Cambios que se producirán si se va a editar el cliente
    public void dialogo_editar(Cliente c){  
        editar = true;
        codCliente = c.getCod_cliente();
        // Editar título e icono
        setTitle("Editar Cliente");
        setIconImage(getIconImage("edit_button"));
        // Cambiar toolTip del btnAceptar
        btnAceptar.setToolTipText("Editar cliente");
        // Mostrar datos en campo correspondiente
        setJtfcod_cliente(c.getCod_cliente());
        setJtfnombre(c.getNombre());
        setJtforganismo(c.getOrganismo());
        setJtfnit(c.getNit());
        setJtfreeup(c.getReeup());
        setJtfcorreo(c.getCorreo());
        setJtfdireccion(c.getDireccion());
        setJtftelefono(c.getTelefono());
        // Comprobar campos para que se active el btnAceptar
        camposRequeridos();
    }
    
    // retorna si se realizó algún cambio o no
    public boolean cambios() {
        return cambios;
    }
     
    // Setters
    public void setJtfcod_cliente(String jtfcod_cliente) {
        this.jtfcod_cliente.setText(jtfcod_cliente);
    }

    public void setJtfcorreo(String jtfcorreo) {
        if(jtfcorreo != null){
            this.jtfcorreo.setText(jtfcorreo);
        }
    }

    public void setJtfdireccion(String jtfdireccion) {
        if(jtfdireccion != null){
            this.jtfdireccion.setText(jtfdireccion);
        }
    }

    public void setJtfnit(String jtfnit) {
        if(jtfnit != null){
            this.jtfnit.setText(jtfnit);
        }
    }

    public void setJtfnombre(String jtfnombre) {
        this.jtfnombre.setText(jtfnombre);
    }

    public void setJtforganismo(String jtforganismo) {
        if(jtforganismo != null){
            this.jtforganismo.setText(jtforganismo);
        }
    }

    public void setJtfreeup(String jtfreeup) {
        if(jtfreeup != null){
            this.jtfreeup.setText(jtfreeup);
        }
    }

    public void setJtftelefono(String jtftelefono) {
        if(jtftelefono != null){
            this.jtftelefono.setText(jtftelefono);
        }
    } 

}
