
import config.dbConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.sql.SQLException;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
    }
        Color navcolor = new Color(204,204,204);
        Color headcolor = new Color(0,153,153);
        Color bodycolor = new Color(0,102,102);
       
    
        
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        leftie = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        rightie = new javax.swing.JPanel();
        un = new javax.swing.JTextField();
        ps = new javax.swing.JPasswordField();
        ex = new javax.swing.JButton();
        lg = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(0, 102, 102));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("WELCOME TO BARANGAY DOCUMENTS REQUEST SYSTEM!");
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        minimize.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        minimize.setForeground(new java.awt.Color(240, 240, 240));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        header.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 40, 40));

        close.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        close.setForeground(new java.awt.Color(240, 240, 240));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        header.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 30, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-removebg-preview.png"))); // NOI18N
        header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, -1, 90));

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 70));

        leftie.setBackground(new java.awt.Color(0, 153, 153));
        leftie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/building-removebg-preview.png"))); // NOI18N
        leftie.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 260, 520));

        jPanel1.add(leftie, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 62, 330, 530));

        rightie.setBackground(new java.awt.Color(0, 102, 102, 80));
        rightie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        rightie.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 200, 30));
        rightie.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 200, 30));

        ex.setText("Exit");
        ex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exMouseExited(evt);
            }
        });
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });
        rightie.add(ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 80, 30));

        lg.setText("Login");
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
        lg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgActionPerformed(evt);
            }
        });
        rightie.add(lg, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 80, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Password:");
        rightie.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 80, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Username:");
        rightie.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 80, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("New User? Click here to Register");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        rightie.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 240, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sktinaan-removebg-preview.png"))); // NOI18N
        rightie.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 510, 520));

        jPanel1.add(rightie, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 580, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exActionPerformed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0); 
    }//GEN-LAST:event_closeMouseClicked

    private void exMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exMouseEntered
        ex.setBackground(bodycolor);
    }//GEN-LAST:event_exMouseEntered

    private void exMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exMouseExited
        ex.setBackground(navcolor);
    }//GEN-LAST:event_exMouseExited

    private void lgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgMouseEntered
        lg.setBackground(bodycolor);
    }//GEN-LAST:event_lgMouseEntered
        
    private void lgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgMouseExited
        lg.setBackground(navcolor);
    }//GEN-LAST:event_lgMouseExited

    private void lgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgMouseClicked
        String username = un.getText().trim();
        String password = new String(ps.getPassword()).trim();

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your username and password!", "Input Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        dbConnector dbc = new dbConnector();
        Connection conn = dbc.getConnection();

        if (conn == null) {
            JOptionPane.showMessageDialog(this, "Database connection failed!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "SELECT first_name, password FROM users WHERE username = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                validateLogin(rs, password);
                return;
            }

            JOptionPane.showMessageDialog(this, "User not found!", "Login Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void validateLogin(ResultSet rs, String inputPassword) throws SQLException {
        String firstName = rs.getString("first_name");
        String dbPassword = rs.getString("password");
        String hashedInputPassword = hashPassword(inputPassword);

        boolean isDbPasswordHashed = dbPassword.length() == 64 && dbPassword.matches("[0-9a-fA-F]{64}");
        boolean passwordMatches = isDbPasswordHashed ? hashedInputPassword.equals(dbPassword) : inputPassword.equals(dbPassword);

        if (passwordMatches) {
            JOptionPane.showMessageDialog(this, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            new DashBoard(firstName).setVisible(true); // Pass user's name
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect password!", "Login Error", JOptionPane.ERROR_MESSAGE);
        }
    }

// Function to verify login and redirect
private void validateLogin(ResultSet rs, String inputPassword, String userType) throws SQLException {
    String dbPassword = rs.getString("password");
    String hashedInputPassword = hashPassword(inputPassword);

    boolean isDbPasswordHashed = dbPassword.length() == 64 && dbPassword.matches("[0-9a-fA-F]{64}");
    boolean passwordMatches = isDbPasswordHashed ? hashedInputPassword.equals(dbPassword) : inputPassword.equals(dbPassword);

    if (passwordMatches) {
        JOptionPane.showMessageDialog(this, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        if (userType.equals("admin")) {
            SuperAdminDashboard adminDash = new SuperAdminDashboard();
            this.dispose();
            adminDash.setVisible(true);
        } else {
            DashBoard citizenDash = new DashBoard();
            this.dispose();
            citizenDash.setVisible(true);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Incorrect password!", "Login Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_lgMouseClicked

    private void lgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lgActionPerformed

    private void exMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
    createaccount ca = new createaccount();
    this.dispose();
    ca.setVisible(true);       
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new LoginForm().setVisible(true));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JButton ex;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel leftie;
    private javax.swing.JButton lg;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField ps;
    private javax.swing.JPanel rightie;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }

}
