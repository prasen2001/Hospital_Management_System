/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import myPackage.Homepage;

/**
 *
 * @author Prasenjeet Tambe
 */
public class AddDiagnosisInformation extends javax.swing.JFrame
{
    int flag = 0;

    /**
     * Creates new form AddDiagnosisInformation
     */
    public AddDiagnosisInformation()
    {
        initComponents();
        lblNotFound.setVisible(false);
        lblWardType.setVisible(false);
        cmbWardType.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblPatientID = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        btnPatientSearch = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnNameSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();
        lblNotFound = new javax.swing.JLabel();
        lblSymtoms = new javax.swing.JLabel();
        lblMedicines = new javax.swing.JLabel();
        lblDiagnosis = new javax.swing.JLabel();
        txtSymptoms = new javax.swing.JTextField();
        txtDiagnosis = new javax.swing.JTextField();
        txtMedicines = new javax.swing.JTextField();
        lblWardRequired = new javax.swing.JLabel();
        lblWardType = new javax.swing.JLabel();
        chkWardRequired = new javax.swing.JCheckBox();
        cmbWardType = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPatientID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPatientID.setText("Patient ID");
        getContentPane().add(lblPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 70, 30));

        txtPatientID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 250, 30));

        btnPatientSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPatientSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        btnPatientSearch.setText("Search");
        btnPatientSearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPatientSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnPatientSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 130, 30));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName.setText("Name");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 70, 30));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 250, 30));

        btnNameSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNameSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        btnNameSearch.setText("Search");
        btnNameSearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNameSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnNameSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 130, -1));

        tblDisplay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Patient ID", "Name", "Contact", "Age", "Gender", "Blood Group"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblDisplay.setShowHorizontalLines(true);
        tblDisplay.setShowVerticalLines(true);
        tblDisplay.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblDisplay);
        if (tblDisplay.getColumnModel().getColumnCount() > 0)
        {
            tblDisplay.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblDisplay.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 768, 70));

        lblNotFound.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNotFound.setForeground(new java.awt.Color(153, 0, 51));
        lblNotFound.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNotFound.setText("Patient records not found!");
        getContentPane().add(lblNotFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 250, 28));

        lblSymtoms.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSymtoms.setText("Symptoms");
        getContentPane().add(lblSymtoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 90, 30));

        lblMedicines.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMedicines.setText("Medicines");
        getContentPane().add(lblMedicines, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 90, 30));

        lblDiagnosis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDiagnosis.setText("Diagnosis");
        getContentPane().add(lblDiagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 90, 30));
        getContentPane().add(txtSymptoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 250, 30));
        getContentPane().add(txtDiagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 250, 30));
        getContentPane().add(txtMedicines, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 250, 30));

        lblWardRequired.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblWardRequired.setText("Ward required?");
        getContentPane().add(lblWardRequired, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, 30));

        lblWardType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblWardType.setText("Type of ward");
        getContentPane().add(lblWardType, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 105, 30));

        chkWardRequired.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkWardRequired.setText("Yes");
        chkWardRequired.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                chkWardRequiredActionPerformed(evt);
            }
        });
        getContentPane().add(chkWardRequired, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 93, 30));

        cmbWardType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbWardType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Single", "Duo" }));
        getContentPane().add(cmbWardType, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, -1, 30));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save-icon--1.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 100, 30));

        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, 100, 30));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add new patient background.jpg"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCloseActionPerformed
    {//GEN-HEADEREND:event_btnCloseActionPerformed
        // TODO add your handling code here:
        var a = JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Select", JOptionPane.YES_NO_OPTION);
        
        if(a == 0)
        {
            this.dispose();
            Homepage.btnAddDiagnosisInformation.setEnabled(true);
           
        }
    }//GEN-LAST:event_btnCloseActionPerformed

    private void chkWardRequiredActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chkWardRequiredActionPerformed
    {//GEN-HEADEREND:event_chkWardRequiredActionPerformed
        // TODO add your handling code here:
        if(chkWardRequired.isSelected())
        {
            lblWardType.setVisible(true);
            cmbWardType.setVisible(true);
        }
        else
        {
            lblWardType.setVisible(false);
            cmbWardType.setVisible(false);
        }
    }//GEN-LAST:event_chkWardRequiredActionPerformed

    private void btnPatientSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPatientSearchActionPerformed
    {//GEN-HEADEREND:event_btnPatientSearchActionPerformed
        // TODO add your handling code here:
        String patientID = txtPatientID.getText();
        System.out.println("Done");
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_database","root","mySQL");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from patient where patientID="+patientID+"");
            
            if(!rs.first())
            {
                lblNotFound.setVisible(true);
            }
            else
            {
                lblNotFound.setVisible(false);
                txtPatientID.setEditable(false);
                String str = rs.getString("name");
                txtName.setText(str);
                flag = 1;
                
                String id = rs.getString("patientID");
                String name = rs.getString("name");
                String contact = rs.getString("contactNumber");
                int age = rs.getInt("age");
                String gender = rs.getString("gender");
                String bg = rs.getString("bloodGroup");
                
                System.out.println(id+" "+name+" "+contact+" "+age+" "+" "+gender+" "+bg);
                
                Object content[] = {id,name,contact,age,gender,bg};
                
                DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
                model.addRow(content);
                
                JOptionPane.showMessageDialog(this, "Found", "Prompt",JOptionPane.OK_OPTION);
            }
            
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Connection Error");
        }
    }//GEN-LAST:event_btnPatientSearchActionPerformed

    private void btnNameSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNameSearchActionPerformed
    {//GEN-HEADEREND:event_btnNameSearchActionPerformed
        // TODO add your handling code here:
        String patientName = txtName.getText();
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_database","root","mySQL");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from patient where name = '"+patientName+"'");
            
//            jTable1.setModel(DbUtils.re);
            
            if(!rs.first())
            {
                lblNotFound.setVisible(true);
            }
            else
            {
                lblNotFound.setVisible(false);
                txtPatientID.setEditable(false);
                String str = rs.getString("patientID");
                txtPatientID.setText(str);
                flag = 1;
                
                String id = rs.getString("patientID");
                String name = rs.getString("name");
                String contact = rs.getString("contactNumber");
                int age = rs.getInt("age");
                String gender = rs.getString("gender");
                String bg = rs.getString("bloodGroup");
                
                System.out.println(id+" "+name+" "+contact+" "+age+" "+" "+gender+" "+bg);
//                tblDisplay.setValueAt(id, 1, 1);
                
                Object content[] = {id,name,contact,age,gender,bg};
        
                
                DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
                model.addRow(content);
                
                JOptionPane.showMessageDialog(this, "Found", "Prompt",JOptionPane.OK_OPTION);
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Connection Error");
        }
    }//GEN-LAST:event_btnNameSearchActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveActionPerformed
    {//GEN-HEADEREND:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(flag==1)
        {
            String patientID = txtPatientID.getText();
            String symptom = txtSymptoms.getText();
            String diagnosis = txtDiagnosis.getText();
            String medicines = txtMedicines.getText();
            
            String wardReq;
            String wardType;
            
            if(chkWardRequired.isSelected())
            {
                wardReq="YES";
                wardType = (String)cmbWardType.getSelectedItem();
            }
            else
            {
                wardReq="NO";
                wardType="N.A";
            }
            
            try
            {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_database","root","mySQL");
                Statement st = con.createStatement();
                st.executeUpdate("insert into patient_report values('"+patientID+"','"+symptom+"','"+diagnosis+"','"+medicines+"','"+wardReq+"','"+wardType+"')");
                JOptionPane.showMessageDialog(this, "Updated Successfully");
               
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, "Error in updation!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Record not found");
        }
        
        
        txtPatientID.setText(null);
        txtSymptoms.setText(null);
        txtDiagnosis.setText(null);
        txtMedicines.setText(null);
        txtName.setText(null);
        chkWardRequired.setSelected(false);
        txtPatientID.setEditable(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(AddDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AddDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AddDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AddDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new AddDiagnosisInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnNameSearch;
    private javax.swing.JButton btnPatientSearch;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox chkWardRequired;
    private javax.swing.JComboBox<String> cmbWardType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblDiagnosis;
    private javax.swing.JLabel lblMedicines;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNotFound;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblSymtoms;
    private javax.swing.JLabel lblWardRequired;
    private javax.swing.JLabel lblWardType;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextField txtDiagnosis;
    private javax.swing.JTextField txtMedicines;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtSymptoms;
    // End of variables declaration//GEN-END:variables
}
