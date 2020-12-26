
package proyectoparqueadero;

import javax.swing.JOptionPane;
import JDialog.registrar_usuario;


/**
 *
 * @author thomis
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    PanelIngresarVehiculo panelingresarvehiculo;
    PanelRetirarVehiculo panelretirarvehiculo;
    PanelListarVehiculos panelListarVehiculos;
    registrar_usuario Registar = new registrar_usuario(this, rootPaneCheckingEnabled);
    
    int confirmacion;
    
    public Principal() {
        
        initComponents();
        setSize(800,450);
        panelingresarvehiculo = new PanelIngresarVehiculo();
        panelingresarvehiculo.setBounds(300,0,473,400);
        add(panelingresarvehiculo);
        panelretirarvehiculo = new PanelRetirarVehiculo();
        panelretirarvehiculo.setBounds(300,0,473,400);
        add(panelretirarvehiculo);
        panelretirarvehiculo.setVisible(false);
        panelListarVehiculos = new PanelListarVehiculos();
        panelListarVehiculos.setBounds(350,0,1116,400);
        add(panelListarVehiculos);
        panelListarVehiculos.setVisible(false);
   
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JB_IngresarVehiculo = new java.awt.Button();
        JB_RetirarV = new java.awt.Button();
        JButton_ListarVehiculos = new java.awt.Button();
        JB_Cierre = new java.awt.Button();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_usuarios = new javax.swing.JMenu();
        jMenuItem_ver_usuario = new javax.swing.JMenuItem();
        jMenuItem_movimientos = new javax.swing.JMenuItem();
        jMenuItem_nuevo_usuario = new javax.swing.JMenuItem();
        jMenu_reportes = new javax.swing.JMenu();
        jMenu_perfil = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 400));
        setPreferredSize(new java.awt.Dimension(800, 440));

        PanelMenu.setBackground(new java.awt.Color(2, 110, 182));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ParKing");

        JB_IngresarVehiculo.setBackground(new java.awt.Color(2, 110, 182));
        JB_IngresarVehiculo.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        JB_IngresarVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        JB_IngresarVehiculo.setLabel("Ingresar Vehiculo");
        JB_IngresarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_IngresarVehiculoActionPerformed(evt);
            }
        });

        JB_RetirarV.setBackground(new java.awt.Color(2, 110, 182));
        JB_RetirarV.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        JB_RetirarV.setForeground(new java.awt.Color(255, 255, 255));
        JB_RetirarV.setLabel("Retirar Vehiculo");
        JB_RetirarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_RetirarVActionPerformed(evt);
            }
        });

        JButton_ListarVehiculos.setBackground(new java.awt.Color(2, 110, 182));
        JButton_ListarVehiculos.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        JButton_ListarVehiculos.setForeground(new java.awt.Color(255, 255, 255));
        JButton_ListarVehiculos.setLabel("Listar Vehiculos");
        JButton_ListarVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_ListarVehiculosActionPerformed(evt);
            }
        });

        JB_Cierre.setBackground(new java.awt.Color(2, 110, 182));
        JB_Cierre.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        JB_Cierre.setForeground(new java.awt.Color(255, 255, 255));
        JB_Cierre.setLabel("Salir");
        JB_Cierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CierreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JB_IngresarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButton_ListarVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JB_Cierre, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_RetirarV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JB_IngresarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_RetirarV, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JButton_ListarVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_Cierre, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jMenu_usuarios.setText("Usuarios");

        jMenuItem_ver_usuario.setText("Ver usuarios");
        jMenu_usuarios.add(jMenuItem_ver_usuario);

        jMenuItem_movimientos.setText("Movimientos de usuarios");
        jMenu_usuarios.add(jMenuItem_movimientos);

        jMenuItem_nuevo_usuario.setText("Nuevo Usuario");
        jMenuItem_nuevo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_usuarioActionPerformed(evt);
            }
        });
        jMenu_usuarios.add(jMenuItem_nuevo_usuario);

        jMenuBar1.add(jMenu_usuarios);

        jMenu_reportes.setText("Reportes");
        jMenuBar1.add(jMenu_reportes);

        jMenu_perfil.setText("Mi Perfil");
        jMenuBar1.add(jMenu_perfil);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JB_IngresarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_IngresarVehiculoActionPerformed
        // TODO add your handling code here:
        setSize(800,450);
        panelListarVehiculos.setVisible(false);
        panelretirarvehiculo.setVisible(false);
        panelingresarvehiculo.setVisible(true);
        setLocationRelativeTo(null);
        
        revalidate();
        repaint();
    }//GEN-LAST:event_JB_IngresarVehiculoActionPerformed

    private void JB_RetirarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_RetirarVActionPerformed
        // TODO add your handling code here:
        setSize(800,450);
        panelListarVehiculos.setVisible(false);
        panelingresarvehiculo.setVisible(false);
        panelretirarvehiculo.setVisible(true);
        setLocationRelativeTo(null);
        
        revalidate();
        repaint();
        
    }//GEN-LAST:event_JB_RetirarVActionPerformed

    private void JButton_ListarVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_ListarVehiculosActionPerformed
        // TODO add your handling code here:
        setSize(1116,450);
        add(panelListarVehiculos);
        panelListarVehiculos.setVisible(true);
        panelingresarvehiculo.setVisible(false);
        panelretirarvehiculo.setVisible(false);
        setLocationRelativeTo(null);
        
        revalidate();
        repaint();
        
        panelListarVehiculos.rellenarTabla();
        
    }//GEN-LAST:event_JButton_ListarVehiculosActionPerformed

    private void JB_CierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CierreActionPerformed
        // TODO add your handling code here:
        
      confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir del programa?", 
                                                   "Salir", JOptionPane.YES_NO_OPTION);
      
      if (confirmacion == 0){
          
          System.exit(0);
      }//fin if
 
    }//GEN-LAST:event_JB_CierreActionPerformed

    private void jMenuItem_nuevo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_usuarioActionPerformed
        // TODO add your handling code here:
        
        Registar.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button JB_Cierre;
    private java.awt.Button JB_IngresarVehiculo;
    private java.awt.Button JB_RetirarV;
    private java.awt.Button JButton_ListarVehiculos;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_movimientos;
    private javax.swing.JMenuItem jMenuItem_nuevo_usuario;
    private javax.swing.JMenuItem jMenuItem_ver_usuario;
    public static javax.swing.JMenu jMenu_perfil;
    public static javax.swing.JMenu jMenu_reportes;
    public static javax.swing.JMenu jMenu_usuarios;
    // End of variables declaration//GEN-END:variables
}
