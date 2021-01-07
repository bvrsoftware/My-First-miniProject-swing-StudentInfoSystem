package studentinfosystem;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
        
        public class Welcome extends javax.swing.JFrame {
    public Welcome() {
        initComponents();
        DateFormat df=new SimpleDateFormat("dd/MM/YYYY");
        Date dateobj=new Date();
        lbldate.setText(df.format(dateobj));
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnstudent = new javax.swing.JButton();
        btnadmin1 = new javax.swing.JButton();
        lbldate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\Student information System\\StudentInfoSystem\\photos\\tmu3.gif")); // NOI18N
        jLabel1.setText("   STUDENT INFORMATION SYSTEM");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 10, 910, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\Student information System\\StudentInfoSystem\\photos\\wellcome.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 313, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel3.setText("Developed by sanjeev kumar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 240, -1));

        btnstudent.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnstudent.setForeground(new java.awt.Color(0, 0, 255));
        btnstudent.setText("Student");
        btnstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstudentActionPerformed(evt);
            }
        });
        getContentPane().add(btnstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 300, -1));

        btnadmin1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnadmin1.setForeground(new java.awt.Color(0, 0, 255));
        btnadmin1.setText("Admin");
        btnadmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadmin1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnadmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 300, -1));

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 180, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstudentActionPerformed
        new Userlogin().setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnstudentActionPerformed

    private void btnadmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadmin1ActionPerformed
         new LogIn().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnadmin1ActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadmin1;
    private javax.swing.JButton btnstudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbldate;
    // End of variables declaration//GEN-END:variables
}
