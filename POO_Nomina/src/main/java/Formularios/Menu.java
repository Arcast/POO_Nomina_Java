/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Control_CuentasEmpresa.jd_AgregarCuentas;
import Control_CuentasEmpresa.jd_AgregarSaldo;
import Control_Empleados.jd_AgregarEmpleado;
import Control_Empleados.jd_EliminarEmpleado;
import Control_Empleados.jd_ModificarEmpleados;
import Control_Empleados.jd_MostrarEmpleados;
import Control_Usuario.jd_AgregarUsuario;
import Control_Usuario.jd_EliminarUsuario;
import Control_Usuario.jd_ModificarUsuario;
import Control_Usuario.jd_MostrarUsuarios;
import javax.swing.JFrame;
import pago__Nomina.jd_Nomina;
import pago__Nomina.jd_NominaEmpleados;
import presentacion.Presentacion;

/**
 *
 * @author Yamil
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();        
        this.setLocationRelativeTo(null);
        this.setTitle("Control de Nómina");
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH); //Maximizar el frm
    }

    /**
     * This method is calle-
     * d from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * 
     */
                      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Uni = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Jmi_Salir = new javax.swing.JMenuItem();
        jmi_AgregarEmpleado = new javax.swing.JMenu();
        jmi = new javax.swing.JMenuItem();
        jmi_VerListaEmpleado = new javax.swing.JMenuItem();
        jmodificarDatosE = new javax.swing.JMenuItem();
        jmEliminarEmpleado = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmi_AgregarCuentas = new javax.swing.JMenuItem();
        jmi_ModificarSaldo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmi_NominaEmpleado = new javax.swing.JMenuItem();
        EmpleadosNomina = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Jmi_AgregarUsuarios = new javax.swing.JMenuItem();
        Jmi_MostrarUsuarios = new javax.swing.JMenuItem();
        Jmi_ModificarUsuarios = new javax.swing.JMenuItem();
        Jmi_EliminarUsuarios = new javax.swing.JMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel3.setText("\"Creciendo juntos, un empleado a la vez.\"");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 143, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(140, 140, 140))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        Uni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UNI.png"))); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jMenuItem1.setText("Quienes somos?");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Uni.add(jMenuItem1);

        jMenuBar1.add(Uni);

        jMenu1.setText("Inicio");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        Jmi_Salir.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        Jmi_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cerrar-sesion.png"))); // NOI18N
        Jmi_Salir.setText("Salir");
        Jmi_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Jmi_Salir);

        jMenuBar1.add(jMenu1);

        jmi_AgregarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hombre-empleado-alt.png"))); // NOI18N
        jmi_AgregarEmpleado.setText("Empleados");
        jmi_AgregarEmpleado.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        jmi.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jmi.setText("Agregar Empleado");
        jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiActionPerformed(evt);
            }
        });
        jmi_AgregarEmpleado.add(jmi);

        jmi_VerListaEmpleado.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jmi_VerListaEmpleado.setText("Ver lista de Empleados");
        jmi_VerListaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_VerListaEmpleadoActionPerformed(evt);
            }
        });
        jmi_AgregarEmpleado.add(jmi_VerListaEmpleado);

        jmodificarDatosE.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jmodificarDatosE.setText("Modificar Datodos de empleado");
        jmodificarDatosE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmodificarDatosEActionPerformed(evt);
            }
        });
        jmi_AgregarEmpleado.add(jmodificarDatosE);

        jmEliminarEmpleado.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jmEliminarEmpleado.setText("Eliminar Empleado");
        jmEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEliminarEmpleadoActionPerformed(evt);
            }
        });
        jmi_AgregarEmpleado.add(jmEliminarEmpleado);

        jMenuBar1.add(jmi_AgregarEmpleado);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuenta (1).png"))); // NOI18N
        jMenu5.setText("Cuentas Empresa");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        jmi_AgregarCuentas.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jmi_AgregarCuentas.setText("Agregar Cuentas");
        jmi_AgregarCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AgregarCuentasActionPerformed(evt);
            }
        });
        jMenu5.add(jmi_AgregarCuentas);

        jmi_ModificarSaldo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jmi_ModificarSaldo.setText("Modificar Saldo");
        jmi_ModificarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ModificarSaldoActionPerformed(evt);
            }
        });
        jMenu5.add(jmi_ModificarSaldo);

        jMenuBar1.add(jMenu5);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendario-de-nomina.png"))); // NOI18N
        jMenu3.setText("Nomina");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        jmi_NominaEmpleado.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jmi_NominaEmpleado.setText("Mostrar nomina");
        jmi_NominaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_NominaEmpleadoActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_NominaEmpleado);

        EmpleadosNomina.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EmpleadosNomina.setText("Nomina General");
        EmpleadosNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadosNominaActionPerformed(evt);
            }
        });
        jMenu3.add(EmpleadosNomina);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo-de-usuario.png"))); // NOI18N
        jMenu4.setText("Usuario");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        Jmi_AgregarUsuarios.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        Jmi_AgregarUsuarios.setText("Agregar Usuarios");
        Jmi_AgregarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_AgregarUsuariosActionPerformed(evt);
            }
        });
        jMenu4.add(Jmi_AgregarUsuarios);

        Jmi_MostrarUsuarios.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        Jmi_MostrarUsuarios.setText("Mostrar Usuarios");
        Jmi_MostrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_MostrarUsuariosActionPerformed(evt);
            }
        });
        jMenu4.add(Jmi_MostrarUsuarios);

        Jmi_ModificarUsuarios.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        Jmi_ModificarUsuarios.setText("Cambiar Contraseña");
        Jmi_ModificarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_ModificarUsuariosActionPerformed(evt);
            }
        });
        jMenu4.add(Jmi_ModificarUsuarios);

        Jmi_EliminarUsuarios.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        Jmi_EliminarUsuarios.setText("Eliminar Usuarios");
        Jmi_EliminarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_EliminarUsuariosActionPerformed(evt);
            }
        });
        jMenu4.add(Jmi_EliminarUsuarios);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

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

    private void Jmi_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_SalirActionPerformed
        // TODO add your handling code here:
        Inicio inicio = new Inicio();
        inicio.setVisible(true);    
        this.dispose();    
    }//GEN-LAST:event_Jmi_SalirActionPerformed

    private void Jmi_AgregarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_AgregarUsuariosActionPerformed
        // TODO add your handling code here:
        jd_AgregarUsuario agregarUsuarios = new jd_AgregarUsuario(this, rootPaneCheckingEnabled);
        agregarUsuarios.show();
    }//GEN-LAST:event_Jmi_AgregarUsuariosActionPerformed

    private void Jmi_MostrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_MostrarUsuariosActionPerformed
        // TODO add your handling code here:
        jd_MostrarUsuarios mostrarUsuarios = new jd_MostrarUsuarios(this, rootPaneCheckingEnabled);
        mostrarUsuarios.show();
    }//GEN-LAST:event_Jmi_MostrarUsuariosActionPerformed

    private void jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiActionPerformed
        // TODO add your handling code here:
         jd_AgregarEmpleado AgregarEmpleado = new jd_AgregarEmpleado(this, rootPaneCheckingEnabled);
         AgregarEmpleado.show();
    }//GEN-LAST:event_jmiActionPerformed

    private void Jmi_ModificarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_ModificarUsuariosActionPerformed
        // TODO add your handling code here:
        jd_ModificarUsuario modificarUsuario = new jd_ModificarUsuario(this, rootPaneCheckingEnabled);
        modificarUsuario.show();
    }//GEN-LAST:event_Jmi_ModificarUsuariosActionPerformed

    private void Jmi_EliminarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_EliminarUsuariosActionPerformed
        // TODO add your handling code here:
        jd_EliminarUsuario eliminarUsuario = new jd_EliminarUsuario(this, rootPaneCheckingEnabled);
        eliminarUsuario.show();
    }//GEN-LAST:event_Jmi_EliminarUsuariosActionPerformed

    private void jmodificarDatosEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmodificarDatosEActionPerformed
        // TODO add your handling code here:
        jd_ModificarEmpleados mofificarEmpleado = new jd_ModificarEmpleados(this, rootPaneCheckingEnabled);
        mofificarEmpleado.show();
    }//GEN-LAST:event_jmodificarDatosEActionPerformed

    private void jmi_NominaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_NominaEmpleadoActionPerformed
        // TODO add your handling code here:
        jd_NominaEmpleados nominaE= new jd_NominaEmpleados (this, rootPaneCheckingEnabled);
        nominaE.show();
       
                      
    }//GEN-LAST:event_jmi_NominaEmpleadoActionPerformed

    private void jmEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEliminarEmpleadoActionPerformed
        jd_EliminarEmpleado Eliminar_E = new jd_EliminarEmpleado(this, rootPaneCheckingEnabled);
        Eliminar_E.show();
    }//GEN-LAST:event_jmEliminarEmpleadoActionPerformed

    private void jmi_VerListaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_VerListaEmpleadoActionPerformed
        // TODO add your handling code here:
        jd_MostrarEmpleados Mostrar_E = new jd_MostrarEmpleados(this, rootPaneCheckingEnabled);
       Mostrar_E.show();
    }//GEN-LAST:event_jmi_VerListaEmpleadoActionPerformed

    private void EmpleadosNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadosNominaActionPerformed
        // TODO add your handling code here:
         jd_Nomina nomina = new jd_Nomina(this,rootPaneCheckingEnabled); 
        nomina.show();
    }//GEN-LAST:event_EmpleadosNominaActionPerformed

    private void jmi_ModificarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ModificarSaldoActionPerformed
        // TODO add your handling code here:
        jd_AgregarSaldo saldo = new jd_AgregarSaldo(this, rootPaneCheckingEnabled);
        saldo.show();
    }//GEN-LAST:event_jmi_ModificarSaldoActionPerformed

    private void jmi_AgregarCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AgregarCuentasActionPerformed
        // TODO add your handling code here:
        jd_AgregarCuentas cuentas = new jd_AgregarCuentas(this, rootPaneCheckingEnabled);
        cuentas.show();
    }//GEN-LAST:event_jmi_AgregarCuentasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         Presentacion presentacion = new Presentacion(this, rootPaneCheckingEnabled);
        presentacion.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EmpleadosNomina;
    private javax.swing.JMenuItem Jmi_AgregarUsuarios;
    private javax.swing.JMenuItem Jmi_EliminarUsuarios;
    private javax.swing.JMenuItem Jmi_ModificarUsuarios;
    private javax.swing.JMenuItem Jmi_MostrarUsuarios;
    private javax.swing.JMenuItem Jmi_Salir;
    private javax.swing.JMenu Uni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JMenuItem jmEliminarEmpleado;
    private javax.swing.JMenuItem jmi;
    private javax.swing.JMenuItem jmi_AgregarCuentas;
    private javax.swing.JMenu jmi_AgregarEmpleado;
    private javax.swing.JMenuItem jmi_ModificarSaldo;
    private javax.swing.JMenuItem jmi_NominaEmpleado;
    private javax.swing.JMenuItem jmi_VerListaEmpleado;
    private javax.swing.JMenuItem jmodificarDatosE;
    // End of variables declaration//GEN-END:variables
}
