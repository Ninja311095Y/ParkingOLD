/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDialog;

import Base_de_Datos.conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author thomy
 */
public class ver_usuarios extends javax.swing.JDialog {

    /**
     * Creates new form ver_usuarios
     */
    String sql;
    conexion objcon = new conexion();
    registrar_usuario ru = new registrar_usuario(null, rootPaneCheckingEnabled);
    MyDefaultTableModel mdtm = new MyDefaultTableModel();
    JTable jtable = new JTable();
    String Nombre, Cedula, Correo, Telefono, Posicion, Estado, nombre, apellido;
    mi_perfil perfil = new mi_perfil(null, rootPaneCheckingEnabled);

    public ver_usuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        setLocationRelativeTo(null);
        jtable.setModel(mdtm);
        mdtm.setTable(jTable_empleados);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupM_tablaEmp = new javax.swing.JPopupMenu();
        jMenuItem_ver = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_suspender = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_empleados = new javax.swing.JTable();
        jButton_nuevoE = new javax.swing.JButton();

        jMenuItem_ver.setText("Ver usuario");
        jMenuItem_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_verActionPerformed(evt);
            }
        });
        jPopupM_tablaEmp.add(jMenuItem_ver);
        jPopupM_tablaEmp.add(jSeparator1);

        jMenuItem_suspender.setText("Activar/Suspender");
        jMenuItem_suspender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_suspenderActionPerformed(evt);
            }
        });
        jPopupM_tablaEmp.add(jMenuItem_suspender);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(238, 237, 240));

        jTable_empleados.setModel(mdtm);
        jTable_empleados.setComponentPopupMenu(jPopupM_tablaEmp);
        jScrollPane1.setViewportView(jTable_empleados);

        jButton_nuevoE.setBackground(new java.awt.Color(246, 207, 18));
        jButton_nuevoE.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_nuevoE.setForeground(new java.awt.Color(3, 73, 223));
        jButton_nuevoE.setText("Nuevo Empleado");
        jButton_nuevoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nuevoEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton_nuevoE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton_nuevoE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_nuevoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nuevoEActionPerformed
        // TODO add your handling code here:
        ru.setVisible(true);
    }//GEN-LAST:event_jButton_nuevoEActionPerformed

    private void jMenuItem_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_verActionPerformed
        // TODO add your handling code here:
        Cedula = mdtm.getValueAt(jTable_empleados.getSelectedRow(), 1).toString();
        sql = "SELECT e.nombre_empleado, e.apellido_empleado, e.cedula_empleado,e.correo_empleado,e.telefono_empleado,u.usuario, u.contrasena_usuario,u.Posicion FROM empleados AS e INNER JOIN usuarios AS u on e.id_empleado = u.id_empleado WHERE e.cedula_empleado = '" + Cedula + "'";
        perfil.paso = false;
        perfil.posicion = "Administrador";
        perfil.DatosUsuario(sql);
        perfil.setVisible(true);
    }//GEN-LAST:event_jMenuItem_verActionPerformed

    private void jMenuItem_suspenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_suspenderActionPerformed
        // TODO add your handling code here:
        
        Estado = mdtm.getValueAt(jTable_empleados.getSelectedRow(), 5).toString();
        Cedula = mdtm.getValueAt(jTable_empleados.getSelectedRow(), 1).toString();
        
        if (Estado.equalsIgnoreCase("Activo")){
            
            sql = "UPDATE usuarios AS u INNER JOIN empleados AS e on u.id_empleado = e.id_empleado "
                + "SET u.estado = 'Inactivo' WHERE e.cedula_empleado = '" + Cedula + "'";
            objcon.ejecutarSQL(sql);

        }else{
            
            sql = "UPDATE empleados AS e INNER JOIN usuarios AS u ON e.id_empleado = u.id_empleado "
                    + "SET u.Estado = 'Activo' WHERE e.cedula_empleado = '" + Cedula + "'"; 
            objcon.ejecutarSQL(sql);

        }
        
        rellenarTabla();
    }//GEN-LAST:event_jMenuItem_suspenderActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        
        rellenarTabla();
    }//GEN-LAST:event_formWindowGainedFocus

    //METODO PARA CREAR LA TABLA
    public final void crearTabla() {

        TableColumnModel columnModel = jTable_empleados.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(80);
        columnModel.getColumn(1).setPreferredWidth(70);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(80);
        columnModel.getColumn(4).setPreferredWidth(70);
        columnModel.getColumn(5).setPreferredWidth(40);
        columnModel.getColumn(6).setPreferredWidth(80);
        columnModel.getColumn(7).setPreferredWidth(30);

        mdtm = (MyDefaultTableModel) jTable_empleados.getModel();
        mdtm.setRowCount(0);

    } //Fin Crear Tabla

    //METODO PARA RELLENAR LA TABLA
    public final void rellenarTabla() {
        
        mdtm.setRowCount(0);
        try {

            sql = "SELECT CONCAT(e.nombre_empleado,' ',e.apellido_empleado) AS Nombre,e.cedula_empleado,e.correo_empleado,e.telefono_empleado,u.Posicion, u.Estado FROM empleados AS e INNER JOIN usuarios AS u on e.id_empleado = u.id_empleado ";
            objcon.ejecutarSQLSelect(sql);

            conexion.resultado.first();

            do {
                
                Object[] fila = {conexion.resultado.getString(1),
                    conexion.resultado.getString(2),
                    conexion.resultado.getString(3),
                    conexion.resultado.getString(4),
                    conexion.resultado.getString(5),
                    conexion.resultado.getString(6),
                    "Editar",
                    false};

                mdtm.addRow(fila);

            } while (conexion.resultado.next());

        } catch (SQLException ex) {
            Logger.getLogger(ver_usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//Fin rellenar Tabla

    //METODO PARA ACTUALIZAR DATOS EDITADOS
    public final void actualizaDatos() {

            mdtm.setOnGuardarDatosListener(datos -> {

                Nombre = (String) datos[0];
                Cedula = (String) datos[1];
                Correo = (String) datos[2];
                Telefono = (String) datos[3];
                Posicion = (String) datos[4];
                Estado = (String) datos[5];

                String nombres[] = Nombre.split(" ");
                nombre = nombres[0];
                apellido = nombres[1];

                sql = "UPDATE empleados AS e INNER JOIN usuarios AS u on e.id_empleado = u.id_empleado SET "
                        + "    e.nombre_empleado = '" + nombre + "', e.apellido_empleado = '" + apellido
                        + "' , e.cedula_empleado = '" + Cedula + "', e.correo_empleado = '" + Correo
                        + "' , e.telefono_empleado = '" + Telefono + "', u.Posicion = '" + Posicion
                        + "' , u.estado = '" + Estado + " ' WHERE e.cedula_empleado = '" + Cedula + "'";
                objcon.ejecutarSQL(sql);

            });
    
            rellenarTabla();
    }//FIN METODO
    
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
            java.util.logging.Logger.getLogger(ver_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ver_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ver_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ver_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ver_usuarios dialog = new ver_usuarios(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton_nuevoE;
    private javax.swing.JMenuItem jMenuItem_suspender;
    private javax.swing.JMenuItem jMenuItem_ver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupM_tablaEmp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable_empleados;
    // End of variables declaration//GEN-END:variables
}
