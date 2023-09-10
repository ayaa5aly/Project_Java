package cafe.management.system;

import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    public String email;

    public Home() {
        initComponents();
    }

    public Home(String userEmail) {
        initComponents();
        email = userEmail;
        if (!email.equals("anas@gmail.com")) {
            btnNewP.setVisible(false);
            btnVEDP.setVisible(false);
            btnManageC.setVisible(false);
            btnVerifyU.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        btnPlaceO = new javax.swing.JButton();
        btnVbOp = new javax.swing.JButton();
        btnChangeP = new javax.swing.JButton();
        btnChangeSQ = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnNewP = new javax.swing.JButton();
        btnVEDP = new javax.swing.JButton();
        btnManageC = new javax.swing.JButton();
        btnVerifyU = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnLogout.setText("LogOut");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 300, 40));

        btnPlaceO.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnPlaceO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        btnPlaceO.setText("Place Order");
        btnPlaceO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlaceO, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 300, 40));

        btnVbOp.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnVbOp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png"))); // NOI18N
        btnVbOp.setText("View bill & Orders Placed");
        btnVbOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVbOpActionPerformed(evt);
            }
        });
        getContentPane().add(btnVbOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 300, 40));

        btnChangeP.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnChangeP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Password.png"))); // NOI18N
        btnChangeP.setText("Change Password");
        btnChangeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 300, 40));

        btnChangeSQ.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnChangeSQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Security Question.png"))); // NOI18N
        btnChangeSQ.setText("Change Security Question");
        btnChangeSQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeSQActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangeSQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 300, 40));

        btnExit.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit small.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 130, 300, 40));

        btnNewP.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnNewP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        btnNewP.setText("New Product");
        btnNewP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 300, 40));

        btnVEDP.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnVEDP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view edit delete product.png"))); // NOI18N
        btnVEDP.setText("View & Edit & Delete Product");
        btnVEDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVEDPActionPerformed(evt);
            }
        });
        getContentPane().add(btnVEDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 650, 300, 40));

        btnManageC.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnManageC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        btnManageC.setText("Manage Category");
        btnManageC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCActionPerformed(evt);
            }
        });
        getContentPane().add(btnManageC, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 650, 300, 40));

        btnVerifyU.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnVerifyU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verify users.png"))); // NOI18N
        btnVerifyU.setText("Verify Users");
        btnVerifyU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyUActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerifyU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 650, 300, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg home.jpg"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "DO you want to close application?", "Select", JOptionPane.YES_NO_CANCEL_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "DO you want to LogOut?", "Select", JOptionPane.YES_NO_CANCEL_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnManageCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCActionPerformed
        // TODO add your handling code here:
        new ManageCategories().setVisible(true);
    }//GEN-LAST:event_btnManageCActionPerformed

    private void btnVerifyUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyUActionPerformed
        // TODO add your handling code here:
        new verifyUsers().setVisible(true);
    }//GEN-LAST:event_btnVerifyUActionPerformed

    private void btnChangeSQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeSQActionPerformed
        // TODO add your handling code here:
        new ChangeSecurityQuestion(email).setVisible(true);
    }//GEN-LAST:event_btnChangeSQActionPerformed

    private void btnChangePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePActionPerformed
        // TODO add your handling code here:
        new ChangePassword(email).setVisible(true);
    }//GEN-LAST:event_btnChangePActionPerformed

    private void btnPlaceOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new PlaceOrder(email).setVisible(true);
    }//GEN-LAST:event_btnPlaceOActionPerformed

    private void btnNewPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPActionPerformed
        // TODO add your handling code here:
        new AddNewProduct().setVisible(true);
    }//GEN-LAST:event_btnNewPActionPerformed

    private void btnVEDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVEDPActionPerformed
        // TODO add your handling code here:
        new ViewEditDeleteProduct().setVisible(true);
    }//GEN-LAST:event_btnVEDPActionPerformed

    private void btnVbOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVbOpActionPerformed
        // TODO add your handling code here:
        new ViewBillsOrderPlacedDetails().setVisible(true);
    }//GEN-LAST:event_btnVbOpActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeP;
    private javax.swing.JButton btnChangeSQ;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageC;
    private javax.swing.JButton btnNewP;
    private javax.swing.JButton btnPlaceO;
    private javax.swing.JButton btnVEDP;
    private javax.swing.JButton btnVbOp;
    private javax.swing.JButton btnVerifyU;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
