/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Control_Empleados;

import Control_Usuario.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author ernes
 */
public class jd_AgregarEmpleado extends javax.swing.JDialog {

    /**
     * Creates new form jd_AgregarEmpleado
     */
    public jd_AgregarEmpleado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtPuesto = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelarE = new javax.swing.JButton();
        btnLimpiarE = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jspSalarioFijo = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Id del Empleado:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Cargo:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Salario Fijo:");

        txtID.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtPuesto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnGuardar.setBackground(new java.awt.Color(204, 255, 204));
        btnGuardar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\ernes\\OneDrive\\Documentos\\Proyecto_imagenes\\disquete.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelarE.setBackground(new java.awt.Color(255, 204, 204));
        btnCancelarE.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCancelarE.setIcon(new javax.swing.ImageIcon("C:\\Users\\ernes\\OneDrive\\Documentos\\Proyecto_imagenes\\cancelar.png")); // NOI18N
        btnCancelarE.setText("Cancelar");
        btnCancelarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEActionPerformed(evt);
            }
        });

        btnLimpiarE.setBackground(new java.awt.Color(255, 255, 204));
        btnLimpiarE.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnLimpiarE.setIcon(new javax.swing.ImageIcon("C:\\Users\\ernes\\OneDrive\\Documentos\\Proyecto_imagenes\\limpiar.png")); // NOI18N
        btnLimpiarE.setText("Limpiar");
        btnLimpiarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarEActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Agregar Empleado");

        jspSalarioFijo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jspSalarioFijo.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 0.25f));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ernes\\OneDrive\\Documentos\\Proyecto_imagenes\\agregarEmpleado.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(btnCancelarE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                        .addComponent(txtNombre)
                        .addComponent(txtApellido)
                        .addComponent(txtPuesto)
                        .addComponent(jspSalarioFijo)))
                .addGap(26, 26, 26)
                .addComponent(btnLimpiarE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(254, 254, 254))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(286, 286, 286))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnLimpiarE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jspSalarioFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelarE))
                .addGap(103, 103, 103))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        AgregarEmpleado();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarEActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarEActionPerformed

    private void btnCancelarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarEActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

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
            java.util.logging.Logger.getLogger(jd_AgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jd_AgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jd_AgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jd_AgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            jd_AgregarEmpleado dialog = new jd_AgregarEmpleado(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }
    
    public void AgregarEmpleado(){
        try {
        String IdEmpleado, NombreEmpleado, ApellidoEmpleado, PuestoEmpleado;
        Double Salario_Fijo;
        
        if (txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese el id del empleado", "Notificación" , JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre del empleado", "Notificación" , JOptionPane.INFORMATION_MESSAGE);
            return;
        }        
        
        if (txtApellido.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese el apellido del empleado", "Notificación" , JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        if (txtPuesto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese el puesto del empleado", "Notificación" , JOptionPane.INFORMATION_MESSAGE);
            return;
        }   
        
        if (Double.parseDouble(jspSalarioFijo.getValue().toString()) <= 0 ) {
            JOptionPane.showMessageDialog(this, "ingrese un salario valido", "Notificación" , JOptionPane.INFORMATION_MESSAGE);
            jspSalarioFijo.setValue(0);
            return;
        }        
                
        IdEmpleado = txtID.getText().toString();
        NombreEmpleado= txtNombre.getText().toString();
        ApellidoEmpleado = txtApellido.getText().toString();
        PuestoEmpleado = txtPuesto.getText().toString();
        Salario_Fijo = Double.parseDouble(jspSalarioFijo.getValue().toString());
        
             boolean EmpleadoExiste = ValidarEmpleado(IdEmpleado);
          if (EmpleadoExiste) {
            JOptionPane.showMessageDialog(this, "El empleado ya existe", "Error" , JOptionPane.ERROR_MESSAGE);
            return;
        } 
        if (JOptionPane.showConfirmDialog(this, "Desea agregar los datos del empleado ingresado?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
          return;
        }
        
        Empleado empleado = new Empleado(IdEmpleado, NombreEmpleado, ApellidoEmpleado, PuestoEmpleado, Salario_Fijo);
        
        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        empleadoDAO.crearEmpleado(empleado);
                      
        JOptionPane.showMessageDialog(this, "Empleado guardado exitosamente", "Notificación" , JOptionPane.INFORMATION_MESSAGE);
        
        limpiar();
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al guardar el Empleado", "Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
    
    public void limpiar(){
        
        txtID.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtPuesto.setText("");
        jspSalarioFijo.setValue(0);
        
    }
  public boolean ValidarEmpleado(String IdEmpleado){
        
        try {
            boolean existe = false;
            List<Empleado> empleadoList = new ArrayList<>();            
            EmpleadoDAO empleadoDAO = new EmpleadoDAO(); //Llama al dao de usuario
            empleadoList = empleadoDAO.leerEmpleado();

            
            for (Empleado us : empleadoList) {
            
                 if (us.getIdEmpleado().equals(IdEmpleado)) {
                    existe = true;
                    break;
                }
            }
            
            return existe;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al guardar el empleado", "Error" , JOptionPane.ERROR_MESSAGE);
            return false;
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarE;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiarE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jspSalarioFijo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPuesto;
    // End of variables declaration//GEN-END:variables

  
}
