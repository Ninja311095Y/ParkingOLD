/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDialog;

import Jpanel.inicio;
import Base_de_Datos.conexion;
import Jpanel.Usuario;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.UUID;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author thomy
 */
public class Login extends javax.swing.JDialog {

    inicio pp = new inicio();
    conexion objcon = new conexion();
    registrar_usuario ru = new registrar_usuario(null, true);
    Usuario miUsuario = Usuario.getUsuario();

    String sql;
    String usuario = "";
    String pass;
    String destino;
    String codigo_gene;
    String codigo_introd;
    final String remitente = "thomisgarrido@gmail.com";
    final String clave = "@mateo3195@";
    String host = "smtp.gmail.com";
    final String port = "587";
    String texto
            = "<font size=5>Este es un correo con un codigo solicitado para el <b>Restablecimiento</b> de la contraseña del usuario <br><br></font>"
            + "<font color='red' size=4>No comparta este codigo</font><br><br>"
            + "<b><font color='green'>" + codigoUUID() + "</font></b>";

    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        setLocationRelativeTo(null);

        objcon.crearConexion();
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
        jLabel_usuario = new javax.swing.JLabel();
        jTextField_usuario = new javax.swing.JTextField();
        jLabel_pass = new javax.swing.JLabel();
        jButton_login = new javax.swing.JButton();
        jButton_reset = new javax.swing.JButton();
        jLabel_ayuda = new javax.swing.JLabel();
        jTextField_pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LOGIN");
        setIconImage(null);

        jPanel1.setBackground(new java.awt.Color(238, 237, 240));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));

        jLabel_usuario.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hombre.png"))); // NOI18N

        jLabel_pass.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contrasena.png"))); // NOI18N

        jButton_login.setBackground(new java.awt.Color(246, 207, 18));
        jButton_login.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(3, 73, 223));
        jButton_login.setText("Log in");
        jButton_login.setToolTipText("");
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        jButton_reset.setBackground(new java.awt.Color(246, 207, 18));
        jButton_reset.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_reset.setForeground(new java.awt.Color(3, 73, 223));
        jButton_reset.setText("Cambiar/Olvido");
        jButton_reset.setToolTipText("Presione si olvido o quiere cambiar la contraseña");
        jButton_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resetActionPerformed(evt);
            }
        });

        jLabel_ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/problema.png"))); // NOI18N
        jLabel_ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ayudaMouseClicked(evt);
            }
        });

        jTextField_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_passKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jButton_login)
                .addGap(99, 99, 99)
                .addComponent(jButton_reset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_pass)
                    .addComponent(jLabel_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_pass)
                            .addComponent(jTextField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_login)
                            .addComponent(jButton_reset))))
                .addGap(108, 108, 108))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private String codigoUUID() {

        codigo_gene = UUID.randomUUID().toString();

        codigo_gene = codigo_gene.replaceAll("-", "");

        codigo_gene = codigo_gene.substring(0, 32);

        return codigo_gene;
    }

    private boolean envia_correo(String destino) throws MessagingException {

        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", host);
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", port);
        propiedad.setProperty("mail.smtp,auth", "true");

        Session sesion = Session.getDefaultInstance(propiedad);
        MimeMessage mensaje = new MimeMessage(sesion);

        try {
            mensaje.setFrom(new InternetAddress(remitente));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));
            mensaje.setSubject("Codigo Restablecimiento de Contraseña");
            mensaje.setText(texto, "utf-8", "html");

            Transport transportar = sesion.getTransport("smtp");
            transportar.connect(remitente, clave);
            transportar.sendMessage(mensaje, mensaje.getRecipients(Message.RecipientType.TO));
            transportar.close();

            JOptionPane.showMessageDialog(null, "Listo, revise su correo");

        } catch (AddressException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    private void realiza_login() {

        try {
            // TODO add your handling code here:

            usuario = jTextField_usuario.getText();
            pass = jTextField_pass.getText();

            sql = "SELECT * FROM usuarios WHERE usuario = '" + usuario + "' AND contrasena_usuario = '" + pass + "'";
            objcon.ejecutarSQLSelect(sql);

            /*CONFIRMACION DE SI OBTUVO ALGUN RESULTADO EN CASO DE SI SE DA PASO AL SISTEMA DE LO CONTRARIO
            SE ENVIA UN MENSAJE NOTIFICANDOLO*/
            conexion.resultado.first();

            if (conexion.resultado.getString(6).equals("Activo")) {

                String pos = conexion.resultado.getString("Posicion");
                this.dispose();
                pp.setVisible(true);
                pp.setLocationRelativeTo(null);
                JOptionPane.showMessageDialog(null, "Bienvenido " + usuario);
                

                if (pos.equals("Asistente")) {

                    inicio.jMenu_usuarios.setVisible(false);
                    //inicio.jMenu_reportes.setVisible(false);
                }

                miUsuario.setUsu(usuario);

            } else {

                JOptionPane.showMessageDialog(null, "El usuario ingresado se encuentra Inactivo", "Usuario Inactivo", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al ingresar al sistema su USUARIO o CONTRASEÑA son incorrectos", "Error", JOptionPane.ERROR_MESSAGE);

            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cambia_contrasena() {

        try {

            sql = "SELECT * FROM usuarios WHERE usuario = '" + usuario + "' AND contrasena_usuario = '" + pass + "'";
            objcon.ejecutarSQLSelect(sql);

            if (conexion.resultado.first()) {

                String nueva = JOptionPane.showInputDialog(null, "Introduzca su nueva contraseña:", "Cambio de contraseña", JOptionPane.INFORMATION_MESSAGE);
                //Manejo de cadenas vacias
                if (nueva.equals("null")) {

                    JOptionPane.showMessageDialog(null, "Operación Cancelada", "Cancelar", JOptionPane.INFORMATION_MESSAGE);

                } else if (nueva.isEmpty() || nueva.isBlank()) {

                    JOptionPane.showMessageDialog(null, "Debe introducir una contraseña para proceder!");

                } else {

                    sql = "UPDATE usuarios SET contrasena_usuario = '" + nueva + "' WHERE usuario = '" + usuario + "'";
                    objcon.ejecutarSQL(sql);

                    if (conexion.resultado.first()) {

                        JOptionPane.showMessageDialog(null, "Contraseña actualizada");

                    }
                }

            }//FIN PRIMER IF
            else {

                JOptionPane.showMessageDialog(null, "Error al verificar los datos su USUARIO o CONTRASEÑA son incorrectos", "Error", JOptionPane.ERROR_MESSAGE);

            }

        } //FIN TRY
        catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//FIN CAMBIO CONTRASEÑA

    private void olvido_contrasena(String usu) throws MessagingException {

        int option = 0;
        boolean cont = true;
        /* */
        try {
            sql = "SELECT e.correo_empleado "
                    + "FROM usuarios AS u INNER JOIN empleados AS e "
                    + "ON u.id_empleado = e.id_empleado WHERE u.usuario = '" + usu + "'";
            objcon.ejecutarSQLSelect(sql);

            if (conexion.resultado.first()) {

                destino = conexion.resultado.getString("correo_empleado");

            }//FIN IF
            else {
                JOptionPane.showMessageDialog(null, "El usuario no posee un correo registrado", "Correo no encontrado", JOptionPane.ERROR_MESSAGE);
            }

        } //FIN TRY
        catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (envia_correo(destino)) {

            do {
                
                codigo_introd = JOptionPane.showInputDialog(null, "Ingrese el codigo enviado a su correo en el campo siguiente:", "Recuperación de contraseña", JOptionPane.OK_CANCEL_OPTION);

                if (codigo_gene.equals(codigo_introd)) {

                    String nueva = JOptionPane.showInputDialog(null, "Introduzca su nueva contraseña:", "Cambio de contraseña", JOptionPane.INFORMATION_MESSAGE);
                    sql = "UPDATE usuarios SET contrasena_usuario = '" + nueva + "' WHERE usuario = '" + usuario + "'";
                    objcon.ejecutarSQL(sql);

                    try {
                        if (conexion.resultado.first()) {

                            JOptionPane.showMessageDialog(null, "Contraseña actualizada");
                            cont = false;

                        }//FIN  TERCER IF
                    } catch (SQLException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }//FIN SEGUNDO IF
                else{

                    option = JOptionPane.showConfirmDialog(null, "El codigo ingresado en el sistema no concuerda con el enviado"
                            + "\nPor favor verifique los datos e intente nuevamente","Codigo invalido",JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
                    
                }
                
            } while ((cont == true) && option!= 2);
            
        }//FIN PRIMER IF

    }//FIN METODO

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed

        realiza_login();

    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jButton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resetActionPerformed
        // TODO add your handling code here:

        usuario = jTextField_usuario.getText();
        pass = jTextField_pass.getText();

        if (jTextField_usuario.getText().isEmpty()) {

            JOptionPane.showConfirmDialog(null, "En caso de querer cambiar su contraseña debe: "
                    + "\n 1) Ingresar su usuario y su contraseña actual. "
                    + "\n 2) Presione la opción de Cambio/Olvido Contraseña."
                    + "\n\nEn caso de olvido: "
                    + "\n 1) Ingrese su usuario."
                    + "\n 2) Presione la opción de Cambio/Olvido Contraseña.", "Ayuda",
                    JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE);

        } else if (!jTextField_usuario.getText().isEmpty() && !jTextField_pass.getText().isEmpty()) {

            cambia_contrasena();

        } else {

            try {
                olvido_contrasena(usuario);

            } catch (MessagingException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jButton_resetActionPerformed

    private void jTextField_passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_passKeyReleased
        // TODO add your handling code here:
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            realiza_login();
        }
    }//GEN-LAST:event_jTextField_passKeyReleased

    private void jLabel_ayudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ayudaMouseClicked
        // TODO add your handling code here:
        
        JOptionPane.showConfirmDialog(null, "En caso de querer cambiar su contraseña debe: "
                                          + "\n 1) Ingresar su usuario y su contraseña actual. "
                                          + "\n 2) Presione la opción de Cambio/Olvido Contraseña."
                                          + "\n\nEn caso de olvido: "
                                          + "\n 1) Ingrese su usuario."
                                          + "\n 2) Presione la opción de Cambio/Olvido Contraseña.","Ayuda",
                                             JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel_ayudaMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            Login dialog = new Login(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_login;
    private javax.swing.JButton jButton_reset;
    private javax.swing.JLabel jLabel_ayuda;
    private javax.swing.JLabel jLabel_pass;
    private javax.swing.JLabel jLabel_usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jTextField_pass;
    private javax.swing.JTextField jTextField_usuario;
    // End of variables declaration//GEN-END:variables
}
