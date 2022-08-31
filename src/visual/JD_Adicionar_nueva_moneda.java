/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import java.awt.Color;
import javax.swing.JOptionPane;
import entidades.Moneda;
import dao.MonedaDAO;
import java.awt.Image;
import java.awt.Toolkit;
/**
 *
 * @author Lester
 */
public class JD_Adicionar_nueva_moneda extends javax.swing.JDialog {

    /**
     * Creates new form JD_Adicionar_nueva_moneda
     */
    public JD_Adicionar_nueva_moneda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(getIconImage());
    }
    
    public Image getIconImage (){
        Image res = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/ic_iniciarsesion.png"));
        return res;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpNueva_moneda = new javax.swing.JPanel();
        jtfsiglas = new custom_swing.TextField();
        jtfnombre = new custom_swing.TextField();
        btnAceptar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        labelCancelar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpNueva_moneda.setBackground(new java.awt.Color(255, 255, 255));
        jpNueva_moneda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)), "NUEVA MONEDA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Calibri", 0, 10), new java.awt.Color(102, 102, 102))); // NOI18N

        jtfsiglas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtfsiglas.setToolTipText("Inserte las siglas de la moneda");
        jtfsiglas.setLabelText("SIGLAS*");
        jtfsiglas.setOpaque(false);

        jtfnombre.setToolTipText("Inserte el nombre de la moneda");
        jtfnombre.setLabelText("NOMBRE*");
        jtfnombre.setOpaque(false);

        btnAceptar.setBackground(new java.awt.Color(45, 125, 246));
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAceptarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAceptarMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aceptar");

        javax.swing.GroupLayout btnAceptarLayout = new javax.swing.GroupLayout(btnAceptar);
        btnAceptar.setLayout(btnAceptarLayout);
        btnAceptarLayout.setHorizontalGroup(
            btnAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
            .addGroup(btnAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnAceptarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnAceptarLayout.setVerticalGroup(
            btnAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(btnAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnAceptarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(45, 125, 246), new java.awt.Color(45, 125, 246), new java.awt.Color(45, 125, 246), new java.awt.Color(45, 125, 246)));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelarMouseReleased(evt);
            }
        });

        labelCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCancelar.setForeground(new java.awt.Color(45, 125, 246));
        labelCancelar.setText("Cancelar");

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
            .addGroup(btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCancelarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(labelCancelar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCancelarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(labelCancelar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jpNueva_monedaLayout = new javax.swing.GroupLayout(jpNueva_moneda);
        jpNueva_moneda.setLayout(jpNueva_monedaLayout);
        jpNueva_monedaLayout.setHorizontalGroup(
            jpNueva_monedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNueva_monedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpNueva_monedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfsiglas, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpNueva_monedaLayout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpNueva_monedaLayout.setVerticalGroup(
            jpNueva_monedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNueva_monedaLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jtfsiglas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jpNueva_monedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpNueva_moneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpNueva_moneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked

        try{
            Moneda m = new Moneda();
            m.setSiglas(jtfsiglas.getText());
            m.setNombre(jtfnombre.getText());
            m.setActivo(true);

            MonedaDAO mDAO = new MonedaDAO();
            if(mDAO.agregarMoneda(m)){
                JOptionPane.showMessageDialog(this,"Nueva moneda adicionada correctamente");
                this.limpiar();
            } else {
                JOptionPane.showMessageDialog(this,"Ha ocurrido un error");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void limpiar(){
        jtfsiglas.setText("");
        jtfnombre.setText("");       
    }
    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        //Color del botón cuando el mouse está encima
        btnAceptar.setBackground(new Color(32,112,233));
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        //Color del botón cuando el mouse no está encima
        btnAceptar.setBackground(new Color(45,125,246));
    }//GEN-LAST:event_btnAceptarMouseExited

    private void btnAceptarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMousePressed
        //Color del botón cuando es presionado
        btnAceptar.setBackground(new Color(20,100,221));
    }//GEN-LAST:event_btnAceptarMousePressed

    private void btnAceptarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseReleased
        //Color del botón luego de ser presionado
        btnAceptar.setBackground(new Color(45,125,246));
    }//GEN-LAST:event_btnAceptarMouseReleased

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        //Color del botón cuando el mouse está encima
        btnCancelar.setBackground(new Color(242,242,242));
        labelCancelar.setForeground(new Color(32,112,233));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        //Color del botón cuando el mouse no está encima
        btnCancelar.setBackground(new Color(255,255,255));
        labelCancelar.setForeground(new Color(45,125,246));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        //Color del botón cuando es presionado
        btnCancelar.setBackground(new Color(230,230,230));
        labelCancelar.setForeground(new Color(20,100,221));
    }//GEN-LAST:event_btnCancelarMousePressed

    private void btnCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseReleased
        //Color del botón luego de ser prejtfcod_tipo       btnCancelar.setBackground(new Color(255,255,255));
        labelCancelar.setForeground(new Color(45,125,246));
    }//GEN-LAST:event_btnCancelarMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JD_Adicionar_nueva_moneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JD_Adicionar_nueva_moneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JD_Adicionar_nueva_moneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JD_Adicionar_nueva_moneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JD_Adicionar_nueva_moneda dialog = new JD_Adicionar_nueva_moneda(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel btnAceptar;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpNueva_moneda;
    private custom_swing.TextField jtfnombre;
    private custom_swing.TextField jtfsiglas;
    private javax.swing.JLabel labelCancelar;
    // End of variables declaration//GEN-END:variables
}
