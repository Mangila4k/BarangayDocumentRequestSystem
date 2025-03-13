
import config.dbConnector;
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Macky Server
 */
public class documentsform extends javax.swing.JFrame {

    public documentsform() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); // Ensure multiple instances
    }
        Color navcolor = new Color(204,204,204);
        Color headcolor = new Color(0,153,153);
        Color bodycolor = new Color(0,102,102);
        
        public String action;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        did = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        dtype = new javax.swing.JTextField();
        dprice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 80, 70));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Please fill in the required details to proceed.\"");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 320, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("\"Would you like to add a new document?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 290, -1));

        did.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        did.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        did.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        did.setEnabled(false);
        did.setOpaque(false);
        jPanel2.add(did, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 200, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Documents Id:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Document Type:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        dtype.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        dtype.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dtype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dtype.setOpaque(false);
        jPanel2.add(dtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 200, 30));

        dprice.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        dprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dprice.setOpaque(false);
        dprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpriceActionPerformed(evt);
            }
        });
        jPanel2.add(dprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 200, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Documents Price:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        save.setBackground(new java.awt.Color(0, 102, 102));
        save.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(240, 240, 240));
        save.setText("SAVE");
        save.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
        });
        jPanel2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 100, 30));

        exit.setBackground(new java.awt.Color(0, 102, 102));
        exit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(240, 240, 240));
        exit.setText("EXIT");
        exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpriceActionPerformed

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
    dbConnector dbc = new dbConnector();

    if (dtype.getText().isEmpty() || dprice.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all fields!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (action == null) {
        JOptionPane.showMessageDialog(null, "Error: Action is not set!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        double price = Double.parseDouble(dprice.getText()); // Convert price

        if (action.equals("Add")) {
            String sql = "INSERT INTO tbl_documents (d_type, d_price) VALUES ('" + dtype.getText() + "', " + price + ")";
            int result = dbc.insertData(sql);

            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Document added successfully!");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Error saving data!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (action.equals("Update")) {
            if (did.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: No ID found for update!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql = "UPDATE tbl_documents SET d_type = '" + dtype.getText() + "', d_price = " + price + " WHERE d_id = " + did.getText();
            int result = dbc.insertData(sql);

            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Document updated successfully!");

                // Refresh the table after updating
                Documents mainForm = new Documents();
                mainForm.displayData();

                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Error updating data!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid price format. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_saveMouseClicked

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        save.setBackground(bodycolor);
    }//GEN-LAST:event_saveMouseEntered

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseEntered

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
            java.util.logging.Logger.getLogger(documentsform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(documentsform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(documentsform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(documentsform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new documentsform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField did;
    public javax.swing.JTextField dprice;
    public javax.swing.JTextField dtype;
    public javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
