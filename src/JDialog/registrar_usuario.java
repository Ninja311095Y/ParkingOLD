/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDialog;

import Base_de_Datos.conexion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author thomy
 */
public class registrar_usuario extends javax.swing.JDialog {

    conexion objcon = new conexion();
    ArrayList<String> lista = new ArrayList<>();

    String nombre,
           apellido,
           cedula,
           correo,
           telefono,
           usuario,
           pass,
           pass_conf,
           sql,
           posicion;
    
    public registrar_usuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        objcon.crearConexion();
        llenaJcomboPosicion();

        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_nombre = new javax.swing.JLabel();
        jLabel_apellido = new javax.swing.JLabel();
        jLabel_cedula = new javax.swing.JLabel();
        jLabel_correo = new javax.swing.JLabel();
        jLabel_celular = new javax.swing.JLabel();
        jButton_registrar = new javax.swing.JButton();
        jButton_limpiar = new javax.swing.JButton();
        jButton_cancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel_usuario = new javax.swing.JLabel();
        jLabel_pass = new javax.swing.JLabel();
        jTF_usuario = new javax.swing.JTextField();
        jLabel_passConfirm = new javax.swing.JLabel();
        jTF_confirmar = new javax.swing.JPasswordField();
        jTF_pass = new javax.swing.JPasswordField();
        jTF_nombre = new javax.swing.JTextField();
        jTF_apellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jFTF_cedula = new javax.swing.JFormattedTextField();
        jTF_correo = new javax.swing.JTextField();
        jFTF_telefono = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jCB_Posicion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(238, 237, 240));

        jLabel_nombre.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(3, 73, 223));
        jLabel_nombre.setText("Nombre");

        jLabel_apellido.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel_apellido.setForeground(new java.awt.Color(3, 73, 223));
        jLabel_apellido.setText("Apellido");

        jLabel_cedula.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel_cedula.setForeground(new java.awt.Color(3, 73, 223));
        jLabel_cedula.setText("Cedula");

        jLabel_correo.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel_correo.setForeground(new java.awt.Color(3, 73, 223));
        jLabel_correo.setText("Correo");

        jLabel_celular.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel_celular.setForeground(new java.awt.Color(3, 73, 223));
        jLabel_celular.setText("Telefono/Celular");

        jButton_registrar.setBackground(new java.awt.Color(246, 207, 18));
        jButton_registrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_registrar.setForeground(new java.awt.Color(3, 73, 223));
        jButton_registrar.setText("Registrar");
        jButton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarActionPerformed(evt);
            }
        });

        jButton_limpiar.setBackground(new java.awt.Color(246, 207, 18));
        jButton_limpiar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_limpiar.setForeground(new java.awt.Color(3, 73, 223));
        jButton_limpiar.setText("Limpiar Campos");
        jButton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limpiarActionPerformed(evt);
            }
        });

        jButton_cancelar.setBackground(new java.awt.Color(246, 207, 18));
        jButton_cancelar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_cancelar.setForeground(new java.awt.Color(3, 73, 223));
        jButton_cancelar.setText("Cancelar");
        jButton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuario y Contraseña para el Sistema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(3, 73, 223))); // NOI18N

        jLabel_usuario.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel_usuario.setForeground(new java.awt.Color(3, 73, 223));
        jLabel_usuario.setText("Usuario");

        jLabel_pass.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel_pass.setForeground(new java.awt.Color(3, 73, 223));
        jLabel_pass.setText("Contraseña");

        jLabel_passConfirm.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel_passConfirm.setForeground(new java.awt.Color(3, 73, 223));
        jLabel_passConfirm.setText("Confirmar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_usuario)
                    .addComponent(jLabel_passConfirm)
                    .addComponent(jLabel_pass))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTF_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(jTF_confirmar)
                    .addComponent(jTF_usuario))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_usuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_pass)
                    .addComponent(jTF_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_passConfirm)
                    .addComponent(jTF_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N

        try {
            jFTF_cedula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTF_cedula.setCaretPosition(0);

        try {
            jFTF_telefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTF_telefono.setToolTipText("");
        jFTF_telefono.setCaretPosition(0);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(3, 73, 223));
        jLabel1.setText("Posicion");

        jCB_Posicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCB_Posicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_PosicionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_nombre)
                                    .addComponent(jLabel_cedula))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jFTF_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel_correo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTF_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel_apellido)))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTF_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTF_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel_celular)
                                        .addGap(27, 27, 27)
                                        .addComponent(jFTF_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton_registrar)
                        .addGap(60, 60, 60)
                        .addComponent(jButton_limpiar)
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCB_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_cancelar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombre)
                    .addComponent(jLabel_apellido)
                    .addComponent(jTF_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_cedula)
                    .addComponent(jLabel_correo)
                    .addComponent(jFTF_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_celular)
                    .addComponent(jFTF_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jCB_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_registrar)
                    .addComponent(jButton_limpiar)
                    .addComponent(jButton_cancelar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenaJcomboPosicion() {

        String consulta = "SELECT * FROM cargo";
        String dato = "cargo_posicion";

        jCB_Posicion.removeAllItems();
        lista = conexion.llenacombo(consulta, dato);

        lista.forEach(e -> {
            jCB_Posicion.addItem(e);
        });
    }

    public void limpia_campos() {

        jTF_nombre.setText("");
        jTF_apellido.setText("");
        jFTF_cedula.setText("");
        jTF_correo.setText("");
        jFTF_telefono.setText("");
        jTF_usuario.setText("");
        jTF_pass.setText("");
        jTF_confirmar.setText("");
    }

    public void registra_usuario(String nombre, String apellido, String cedula, String correo, String telefono, String usuario, String pass, String pass_conf, String posicion) {

        if (nombre.isBlank() || apellido.isBlank() || cedula.isBlank() || correo.isBlank() || telefono.isBlank() || usuario.isBlank() || pass.isBlank()) {

            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completados", "Campos Incompletos", JOptionPane.ERROR_MESSAGE);
        } else {

            if (pass.equals(pass_conf)) {

                sql = "INSERT INTO empleados (nombre_empleado,apellido_empleado,cedula_empleado,correo_empleado,telefono_empleado) VALUES ('"
                        + nombre + "', '" + apellido + "', '" + cedula + "', '" + correo + "', '" + telefono + "')";
                objcon.ejecutarSQL(sql);

                sql = "SELECT MAX(id_empleado) AS ID FROM empleados";
                objcon.ejecutarSQLSelect(sql);

                try {

                    conexion.resultado.first();

                    int id_empleado = conexion.resultado.getInt("ID");

                    sql = "INSERT INTO usuarios (usuario,contrasena_usuario,id_empleado,Posicion,Estado) VALUES ('" + usuario + "', '" + pass + "', '" + id_empleado + "', '" + posicion + "', 'Activo')";
                    objcon.ejecutarSQL(sql);

                    JOptionPane.showMessageDialog(null, "Usuario Registrado Exitosamente!");

                    limpia_campos();

                } catch (SQLException ex) {

                    Logger.getLogger(registrar_usuario.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {

                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }

    }
    
    private void jButton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarActionPerformed
        // TODO add your handling code here:
        
        nombre = jTF_nombre.getText();
        apellido = jTF_apellido.getText();
        cedula = jFTF_cedula.getText();
        correo = jTF_correo.getText();
        telefono = jFTF_telefono.getText();
        usuario = jTF_usuario.getText();
        pass = jTF_pass.getText();
        pass_conf = jTF_confirmar.getText();
        posicion = (String) jCB_Posicion.getSelectedItem();
        
        registra_usuario(nombre,apellido,cedula,correo,telefono,usuario,pass,pass_conf,posicion);
        
    }//GEN-LAST:event_jButton_registrarActionPerformed

    private void jButton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limpiarActionPerformed
        // TODO add your handling code here:
        
            limpia_campos();
    }//GEN-LAST:event_jButton_limpiarActionPerformed

    private void jButton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelarActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton_cancelarActionPerformed

    private void jCB_PosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_PosicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCB_PosicionActionPerformed

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
            java.util.logging.Logger.getLogger(registrar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                registrar_usuario dialog = new registrar_usuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton_cancelar;
    private javax.swing.JButton jButton_limpiar;
    private javax.swing.JButton jButton_registrar;
    private javax.swing.JComboBox<String> jCB_Posicion;
    private javax.swing.JFormattedTextField jFTF_cedula;
    private javax.swing.JFormattedTextField jFTF_telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_apellido;
    private javax.swing.JLabel jLabel_cedula;
    private javax.swing.JLabel jLabel_celular;
    private javax.swing.JLabel jLabel_correo;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_pass;
    private javax.swing.JLabel jLabel_passConfirm;
    private javax.swing.JLabel jLabel_usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTF_apellido;
    private javax.swing.JPasswordField jTF_confirmar;
    private javax.swing.JTextField jTF_correo;
    private javax.swing.JTextField jTF_nombre;
    private javax.swing.JPasswordField jTF_pass;
    private javax.swing.JTextField jTF_usuario;
    // End of variables declaration//GEN-END:variables
}
