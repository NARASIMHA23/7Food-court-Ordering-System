
package javaapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Log extends javax.swing.JFrame {
    //varables declared 
    Connection conn;
ResultSet rs;
PreparedStatement pst;

  
    public Log() {
        super("Login");
        initComponents();
        //connect to data base
        conn=javaconnect.ConnecrDb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginPage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        usertextfield = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        loginbutton = new javax.swing.JButton();
        signupbutton = new javax.swing.JButton();
        passwordtextfield = new javax.swing.JPasswordField();
        forgotbutton = new javax.swing.JButton();
        showpasswordcheckbox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        showusercheckbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(235, 244, 242));

        jPanel1.setBackground(new java.awt.Color(210, 82, 127));

        loginPage.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        loginPage.setForeground(new java.awt.Color(246, 246, 242));
        loginPage.setText("Login ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPage)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(69, 64, 87));

        username.setBackground(new java.awt.Color(54, 215, 183));
        username.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(248, 236, 236));
        username.setText("User Name:");

        password.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(252, 245, 245));
        password.setText("Password:");

        loginbutton.setBackground(new java.awt.Color(23, 79, 156));
        loginbutton.setForeground(new java.awt.Color(255, 245, 245));
        loginbutton.setText("Login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });

        signupbutton.setBackground(new java.awt.Color(201, 13, 13));
        signupbutton.setForeground(new java.awt.Color(247, 237, 237));
        signupbutton.setText("Signup");
        signupbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbuttonActionPerformed(evt);
            }
        });

        passwordtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtextfieldActionPerformed(evt);
            }
        });

        forgotbutton.setBackground(new java.awt.Color(156, 156, 17));
        forgotbutton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        forgotbutton.setForeground(new java.awt.Color(161, 8, 8));
        forgotbutton.setText("Forgot Password");
        forgotbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotbuttonActionPerformed(evt);
            }
        });

        showpasswordcheckbox.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        showpasswordcheckbox.setIcon(new javax.swing.ImageIcon("/home/utpl/Desktop/7FoodCourtordering/lock.png")); // NOI18N
        showpasswordcheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordcheckboxActionPerformed(evt);
            }
        });

        showusercheckbox.setIcon(new javax.swing.ImageIcon("/home/utpl/Desktop/7FoodCourtordering/visi.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(username)
                            .addComponent(password))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(signupbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(usertextfield)
                            .addComponent(passwordtextfield))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showpasswordcheckbox)
                            .addComponent(jLabel4)
                            .addComponent(showusercheckbox)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(forgotbutton)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username)
                    .addComponent(usertextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(showusercheckbox))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showpasswordcheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(password)
                        .addComponent(passwordtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(forgotbutton)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        // TODO add your handling code here:
        
    
        //Retriveing data from the data base:
        String sql="select * from foods where Username=? and Password=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, usertextfield.getText());
            pst.setString(2, passwordtextfield.getText());
            rs=pst.executeQuery();
            if(usertextfield.getText().equals("")&&passwordtextfield.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter Username and Password");
            }
            else if(rs.next()){
                rs.close();
                pst.close();
               
       
                      
                //It is used to move one screen to another screen.
                setVisible(false);
                load ob=new load();
                ob.setUpLoad();
                ob.setVisible(true);
                
                
             //if it has an error the popup will rised   
            }
            else {
                JOptionPane.showMessageDialog(null, "Incorrect Username and Password");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            } finally{
                    try{
                    rs.close();
                    pst.close();
                    
            }catch(Exception e){
                    
                    }       }
        
        
        
        
        
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void signupbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbuttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        signup ob=new signup();
        ob.setVisible(true);
        
    }//GEN-LAST:event_signupbuttonActionPerformed

    private void forgotbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotbuttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        forgot ob=new forgot();
        ob.setVisible(true);

    }//GEN-LAST:event_forgotbuttonActionPerformed

    private void showpasswordcheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordcheckboxActionPerformed
        // TODO add your handling code here:
        //it is used to show the password what you write in password text.
         if(showpasswordcheckbox.isSelected()){
           passwordtextfield.setEchoChar((char)0);
       }else{
           passwordtextfield.setEchoChar('*');
       } 
        
    }//GEN-LAST:event_showpasswordcheckboxActionPerformed

    private void passwordtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtextfieldActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forgotbutton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loginPage;
    private javax.swing.JButton loginbutton;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordtextfield;
    private javax.swing.JCheckBox showpasswordcheckbox;
    private javax.swing.JCheckBox showusercheckbox;
    private javax.swing.JButton signupbutton;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usertextfield;
    // End of variables declaration//GEN-END:variables
}
