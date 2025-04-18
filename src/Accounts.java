
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import config.dbConnector; // Assuming you have this class
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Macky Server
 */
public class Accounts extends javax.swing.JFrame {

    Color navcolor = new Color(204, 204, 204);
    Color headcolor = new Color(0, 153, 153);
    Color bodycolor = new Color(0, 102, 102);

    public Accounts() {
        initComponents();
    }
private citizenform addFormInstance = null;
private userprofileupdate editFormInstance = null;
    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT * FROM users");
            accs.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        app = new javax.swing.JButton();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        ref = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        accs = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setMinimumSize(new java.awt.Dimension(910, 590));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        minimize.setForeground(new java.awt.Color(240, 240, 240));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel2.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 30, 30));

        close.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        close.setForeground(new java.awt.Color(240, 240, 240));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 30, 30));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        app.setBackground(new java.awt.Color(0, 153, 153));
        app.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        app.setForeground(new java.awt.Color(240, 240, 240));
        app.setText("APPROVED");
        app.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        app.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                appMouseEntered(evt);
            }
        });
        app.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appActionPerformed(evt);
            }
        });
        jPanel3.add(app, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 80, 30));

        add.setBackground(new java.awt.Color(0, 153, 153));
        add.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        add.setForeground(new java.awt.Color(240, 240, 240));
        add.setText("ADD");
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
        });
        jPanel3.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 30));

        edit.setBackground(new java.awt.Color(0, 153, 153));
        edit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        edit.setForeground(new java.awt.Color(240, 240, 240));
        edit.setText("EDIT");
        edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
        });
        jPanel3.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 90, 30));

        delete.setBackground(new java.awt.Color(0, 153, 153));
        delete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(240, 240, 240));
        delete.setText("DELETE");
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 90, 30));

        ref.setBackground(new java.awt.Color(0, 153, 153));
        ref.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ref.setForeground(new java.awt.Color(240, 240, 240));
        ref.setText("REFRESH");
        ref.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ref.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refMouseEntered(evt);
            }
        });
        jPanel3.add(ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 90, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 10, 160, 30));

        accs.setToolTipText("");
        jScrollPane1.setViewportView(accs);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 790, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 70));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("BARANGAY DOCUMENT REQUEST SYSTEM");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ADMIN_LOGO-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 40, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("ADMIN");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 80, 50, 30));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("DOCUMENTS");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 120, 30));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("STATUS");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 120, 30));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setForeground(new java.awt.Color(240, 240, 240));
        jButton3.setText("CITIZEN");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 120, 30));

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setForeground(new java.awt.Color(240, 240, 240));
        jButton4.setText("ACCOUNTS");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 120, 30));

        lg.setBackground(new java.awt.Color(0, 102, 102));
        lg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lg.setForeground(new java.awt.Color(240, 240, 240));
        lg.setText("LOGOUT");
        lg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lgMouseExited(evt);
            }
        });
        jPanel2.add(lg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Documents docs = new Documents();
        this.dispose();
        docs.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Status sts = new Status();
        this.dispose();
        sts.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Citizen citizen = new Citizen();
        this.dispose();
        citizen.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        Accounts acc = new Accounts();
        this.dispose();
        acc.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void lgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgMouseClicked
        this.dispose();

        // Create and show the LoginForm
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }//GEN-LAST:event_lgMouseClicked

    private void lgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgMouseEntered
        lg.setBackground(bodycolor);
    }//GEN-LAST:event_lgMouseEntered

    private void lgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgMouseExited

    }//GEN-LAST:event_lgMouseExited

    private void appMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appMouseClicked
        int rowindex = accs.getSelectedRow();
        if (rowindex < 0) {
            JOptionPane.showMessageDialog(null, "Please select an account to activate.");
            return;
        }

        TableModel model = accs.getModel();
        String userId = model.getValueAt(rowindex, 0).toString(); // Assuming user ID is in the first column

        dbConnector dbc = new dbConnector();
        String sql = "UPDATE users SET status = 'active' WHERE id = " + userId;

        int result = dbc.insertData(sql);

        if (result == 1) {
            JOptionPane.showMessageDialog(null, "Account activated successfully!");
            displayData(); // Refresh the table
        } else {
            JOptionPane.showMessageDialog(null, "Error activating account!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_appMouseClicked

    private void appMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appMouseEntered
        app.setBackground(bodycolor);
    }//GEN-LAST:event_appMouseEntered

    private void appActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        citizenform cf = new citizenform();

        // Check if the form was created successfully
        if (addFormInstance == null || !addFormInstance.isVisible()) {
        addFormInstance = new citizenform();
        addFormInstance.save.setText("SAVE");
        addFormInstance.action = "Add";
        addFormInstance.setVisible(true);

        // Reset to null when form is closed
        addFormInstance.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                addFormInstance = null;
            }
        });
    } else {
        addFormInstance.toFront();
        }
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(bodycolor);
    }//GEN-LAST:event_addMouseEntered

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
    int rowindex = accs.getSelectedRow();

    if (rowindex < 0) {
        JOptionPane.showMessageDialog(null, "Please select a user to edit.");
        return;
    }

    TableModel model = accs.getModel();
    String userId = model.getValueAt(rowindex, 0).toString();

    if (editFormInstance == null || !editFormInstance.isVisible()) {
        editFormInstance = new userprofileupdate(userId);
        editFormInstance.setVisible(true);

        // Reset to null when form is closed
        editFormInstance.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                editFormInstance = null;
            }
        });
    } else {
        editFormInstance.toFront();
    }
    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setBackground(bodycolor);
    }//GEN-LAST:event_editMouseEntered

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int rowindex = accs.getSelectedRow();

        if (rowindex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a record to delete!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        TableModel model = accs.getModel();
        String citizenId = model.getValueAt(rowindex, 0).toString(); // Get selected citizen's ID

        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?",
            "Delete Confirmation", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            dbConnector dbc = new dbConnector();
            String sql = "DELETE FROM tbl_citizen WHERE c_id = " + citizenId;

            int result = dbc.insertData(sql); // Execute delete query

            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Citizen deleted successfully!");
                displayData(); // Refresh the table after deletion
            } else {
                JOptionPane.showMessageDialog(null, "Error deleting record!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(bodycolor);
    }//GEN-LAST:event_deleteMouseEntered

    private void refMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refMouseClicked
        displayData();
    }//GEN-LAST:event_refMouseClicked

    private void refMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refMouseEntered
        ref.setBackground(bodycolor);
    }//GEN-LAST:event_refMouseEntered

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
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accounts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable accs;
    private javax.swing.JButton add;
    private javax.swing.JButton app;
    private javax.swing.JLabel close;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lg;
    private javax.swing.JLabel minimize;
    private javax.swing.JButton ref;
    // End of variables declaration//GEN-END:variables
}
