import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class userprofileupdate extends javax.swing.JFrame {

    private static final String URL = "jdbc:mysql://localhost:3306/bdrs";

    public static boolean updateUserProfile(int id, String firstName, String lastName, String gender, 
                                        String contact, String username, String password, 
                                        String userType, String status) {
    // ✅ Get connection from dbConnector
    dbConnector dbc = new dbConnector();
    Connection conn = dbc.getConnection();

    // ✅ SQL query
    String sql = "UPDATE users SET first_name = ?, last_name = ?, gender = ?, contact = ?, " +
                 "username = ?, password = ?, user_type = ?, status = ? WHERE id = ?";

    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, firstName);
        pstmt.setString(2, lastName);
        pstmt.setString(3, gender);
        pstmt.setString(4, contact);
        pstmt.setString(5, username);
        pstmt.setString(6, password);
        pstmt.setString(7, userType);
        pstmt.setString(8, status);
        pstmt.setInt(9, id);

        int affectedRows = pstmt.executeUpdate();
        conn.close(); // ✅ Close connection after update
        
        if (affectedRows > 0) {
            JOptionPane.showMessageDialog(null, "✅ User profile updated successfully!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "⚠ No records updated. Check if the user ID exists!", "Update Failed", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "❌ Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}

    public userprofileupdate() {
        initComponents();
    }
    
    Color navcolor = new Color(204,204,204);
    Color headcolor = new Color(0,153,153);
    Color bodycolor = new Color(0,102,102);
    public String action;

    private String userId; // Store the user ID globally

    public userprofileupdate(String userId) { // Corrected constructor
        this.userId = userId; // Assign user ID
        initComponents(); // Initialize UI components
        loadUserData(); // Load user data into fields
    }


    private void loadUserData() {
        try {
            dbConnector dbc = new dbConnector();
            String sql = "SELECT * FROM users WHERE id = ?";
            PreparedStatement pstmt = dbc.getConnection().prepareStatement(sql);
            pstmt.setString(1, userId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                fname.setText(rs.getString("first_name"));
                lname.setText(rs.getString("last_name"));
                gender.setText(rs.getString("gender"));
                contact.setText(rs.getString("contact"));
                uname.setText(rs.getString("username"));
                pwd.setText(rs.getString("password"));
                sts.setText(rs.getString("status"));
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error loading user data: " + ex.getMessage());
        }
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        gender = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pwd = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        sts = new javax.swing.JTextField();

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

        id.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        id.setEnabled(false);
        id.setOpaque(false);
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 200, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("User Id:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("First Name:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        fname.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fname.setOpaque(false);
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 200, 30));

        lname.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lname.setOpaque(false);
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 200, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Last Name:");
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
        jPanel2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 630, 100, 30));

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
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 100, 30));

        gender.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        gender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gender.setEnabled(false);
        gender.setOpaque(false);
        jPanel2.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 200, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Gender:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Contact:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        contact.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contact.setOpaque(false);
        jPanel2.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 200, 30));

        uname.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        uname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        uname.setOpaque(false);
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        jPanel2.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 200, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("UserName:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Password:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        pwd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        pwd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pwd.setOpaque(false);
        pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdActionPerformed(evt);
            }
        });
        jPanel2.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 200, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Status:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        sts.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sts.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sts.setOpaque(false);
        sts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stsActionPerformed(evt);
            }
        });
        jPanel2.add(sts, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        if (fname.getText().isEmpty() || lname.getText().isEmpty() || uname.getText().isEmpty() || pwd.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all required fields!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (userId == null || userId.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Error: No User ID found for update!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    boolean isUpdated = updateUserProfile(
            Integer.parseInt(userId),
            fname.getText(),
            lname.getText(),
            gender.getText(),
            contact.getText(),
            uname.getText(),
            pwd.getText(),
            "Citizen", // Default user type
            sts.getText()
    );

    if (isUpdated) {
        JOptionPane.showMessageDialog(null, "User profile updated successfully!");
        disableEditFields();
    } else {
        JOptionPane.showMessageDialog(null, "Error updating data!", "Error", JOptionPane.ERROR_MESSAGE);
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

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdActionPerformed

    private void stsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new userprofileupdate("1").setVisible(true); // ✅ Open with test user ID
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField contact;
    public javax.swing.JButton exit;
    public javax.swing.JTextField fname;
    public javax.swing.JTextField gender;
    public javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField lname;
    public javax.swing.JTextField pwd;
    public javax.swing.JButton save;
    public javax.swing.JTextField sts;
    public javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables

    private void disableEditFields() {
    fname.setEnabled(false);
    lname.setEnabled(false);
    gender.setEnabled(false);
    contact.setEnabled(false);
    uname.setEnabled(false);
    pwd.setEnabled(false);
    sts.setEnabled(false);
    save.setEnabled(false); // Disable the save button after update
}
}
