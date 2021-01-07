package studentinfosystem;

import java.awt.Color;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class Setting extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pt;  
    ResultSet rs;
    Statement st;
    String U="Yes";
    int FlagCP=0;
    int FlagCA=0;
    int FlagCU=0;
    
    public Setting() {
        initComponents();
         DateFormat df=new SimpleDateFormat("dd/MM/YYYY");
        java.util.Date dateobj=new java.util.Date();
        lbldate.setText(df.format(dateobj));
       setconnection();
        VisDisAC(); 
        VisDisSC();
    }
    
    public void  setconnection()
    {
       try
        {
         Class.forName("com.mysql.jdbc.Driver");
          con=Myconncetion.getConnection();
         st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
         System.out.println("connected"); 
        }
        catch(Exception e)
        {
                System.out.println("Error in connection plz check:" +e);
        }
    }
     public void VisEnabAC()
    {
        txtusername.setEnabled(true);
        txtACP.setEnabled(true);
        txtANP.setEnabled(true);
        txtACnP.setEnabled(true);
        btnACPcncl.setEnabled(true);
        btnACPsv.setEnabled(true);
    }
    public void VisDisAC()
    {
        txtusername.setEnabled(false);
        txtACP.setEnabled(false);
        txtANP.setEnabled(false);
        txtACnP.setEnabled(false);
        btnACPcncl.setEnabled(false);
        btnACPsv.setEnabled(false);
    }
    public void VisEnabSC()
    {
        txtuserid.setEnabled(true);
        txtSCP.setEnabled(true);
        txtSNP.setEnabled(true);
        txtSCnP.setEnabled(true);
        btnSCPcncl.setEnabled(true);
        btnSCPsv.setEnabled(true);
    }
    public void VisDisSC()
    {
        txtuserid.setEnabled(false);
        txtSCP.setEnabled(false);
        txtSNP.setEnabled(false);
        txtSCnP.setEnabled(false);
        btnSCPcncl.setEnabled(false);
        btnSCPsv.setEnabled(false);
    }
     public void setNameAC()
    {
        txtusername.setText("Username");
        txtACP.setText("Current Password");
        txtANP.setText("New Password");
        txtACnP.setText("ConfirmPassword");
    }
    public void setNameSC()
    {
        txtuserid.setText("Student ID");
        txtSCP.setText("Current Password");
        txtSNP.setText("New Password");
        txtSCnP.setText("ConfirmPassword");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblAdminName = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        btnChngAP = new javax.swing.JButton();
        btnChngSP = new javax.swing.JButton();
        pnlChngPwd = new javax.swing.JPanel();
        btnACPcncl = new javax.swing.JButton();
        btnACPsv = new javax.swing.JButton();
        txtACP = new javax.swing.JTextField();
        txtANP = new javax.swing.JTextField();
        txtACnP = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        pnlChngUname = new javax.swing.JPanel();
        btnSCPcncl = new javax.swing.JButton();
        btnSCPsv = new javax.swing.JButton();
        txtuserid = new javax.swing.JTextField();
        txtSNP = new javax.swing.JTextField();
        txtSCnP = new javax.swing.JTextField();
        txtSCP = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lbldate = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        msgbox = new javax.swing.JOptionPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 251, 218));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\image\\tmu3.gif")); // NOI18N
        jLabel1.setText("    PASSWORD CHANGE FORM");

        lblAdminName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAdminName.setForeground(new java.awt.Color(255, 255, 255));

        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setText("Log Out");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                        .addComponent(lblLogout)
                        .addGap(43, 43, 43))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblLogout)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnChngAP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChngAP.setText("Admin Password Change");
        btnChngAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChngAPActionPerformed(evt);
            }
        });

        btnChngSP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChngSP.setText("Student Password Change");
        btnChngSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChngSPActionPerformed(evt);
            }
        });

        pnlChngPwd.setBackground(new java.awt.Color(0, 102, 102));
        pnlChngPwd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnACPcncl.setText(" Cancel ");
        btnACPcncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACPcnclActionPerformed(evt);
            }
        });

        btnACPsv.setText("  Save  ");
        btnACPsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACPsvActionPerformed(evt);
            }
        });

        txtACP.setText("Current Password");
        txtACP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtACPMouseClicked(evt);
            }
        });
        txtACP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtACPActionPerformed(evt);
            }
        });

        txtANP.setText("New Password");
        txtANP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtANPMouseClicked(evt);
            }
        });

        txtACnP.setText("Confirm Password");
        txtACnP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtACnPMouseClicked(evt);
            }
        });

        txtusername.setText("Username");
        txtusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtusernameMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlChngPwdLayout = new javax.swing.GroupLayout(pnlChngPwd);
        pnlChngPwd.setLayout(pnlChngPwdLayout);
        pnlChngPwdLayout.setHorizontalGroup(
            pnlChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChngPwdLayout.createSequentialGroup()
                .addGroup(pnlChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlChngPwdLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlChngPwdLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pnlChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtANP, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnlChngPwdLayout.createSequentialGroup()
                                    .addComponent(btnACPcncl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnACPsv))
                                .addComponent(txtACP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtACnP, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnlChngPwdLayout.setVerticalGroup(
            pnlChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChngPwdLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtACP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtANP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtACnP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnACPcncl)
                    .addComponent(btnACPsv))
                .addContainerGap())
        );

        pnlChngUname.setBackground(new java.awt.Color(0, 102, 102));
        pnlChngUname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSCPcncl.setText(" Cancel ");
        btnSCPcncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSCPcnclActionPerformed(evt);
            }
        });

        btnSCPsv.setText("  Save  ");
        btnSCPsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSCPsvActionPerformed(evt);
            }
        });

        txtuserid.setText("Student Id");
        txtuserid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtuseridMouseClicked(evt);
            }
        });

        txtSNP.setText("New Password");
        txtSNP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSNPMouseClicked(evt);
            }
        });

        txtSCnP.setText("Confirm Password");
        txtSCnP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSCnPMouseClicked(evt);
            }
        });
        txtSCnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSCnPActionPerformed(evt);
            }
        });

        txtSCP.setText("Current Password");
        txtSCP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSCPMouseClicked(evt);
            }
        });
        txtSCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSCPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlChngUnameLayout = new javax.swing.GroupLayout(pnlChngUname);
        pnlChngUname.setLayout(pnlChngUnameLayout);
        pnlChngUnameLayout.setHorizontalGroup(
            pnlChngUnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChngUnameLayout.createSequentialGroup()
                .addGroup(pnlChngUnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlChngUnameLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnSCPcncl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSCPsv))
                    .addGroup(pnlChngUnameLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pnlChngUnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSCP, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtuserid, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSNP, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSCnP, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnlChngUnameLayout.setVerticalGroup(
            pnlChngUnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChngUnameLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtuserid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSCP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSNP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSCnP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(pnlChngUnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSCPcncl)
                    .addComponent(btnSCPsv))
                .addGap(20, 20, 20))
        );

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Developed by sanjeev kumar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnChngAP)))
                .addGap(140, 691, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlChngPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnChngSP, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(183, 183, 183))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(pnlChngUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnChngAP)
                            .addComponent(btnChngSP))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlChngPwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlChngUname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Developed by sanjeev kumar ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(msgbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 598, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(msgbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChngAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChngAPActionPerformed
        FlagCP=1;
        VisEnabAC();
        VisDisSC();
        setNameAC();
        setNameSC();
    }//GEN-LAST:event_btnChngAPActionPerformed

    private void btnChngSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChngSPActionPerformed
        FlagCU=1;
        VisDisAC();
        VisEnabSC();
        setNameAC();
        setNameSC();
    }//GEN-LAST:event_btnChngSPActionPerformed

    private void btnACPcnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACPcnclActionPerformed
        // TODO add your handling code here:
        setNameAC();
    }//GEN-LAST:event_btnACPcnclActionPerformed

    private void btnACPsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACPsvActionPerformed
        // TODO add your handling code here:
        String user=txtusername.getText();
        String CFP=txtACnP.getText();
        String NP=txtANP.getText();
        String CP=txtACP.getText();
         try
        {
            rs=st.executeQuery("select*from login where Username='"+user+"'and Password='"+CP+"'");
            if(rs.next())
            {
             if(NP.equals(CFP)==false)
        {
            msgbox.showMessageDialog(this, "Password missmatch", "Failure",2, null);
        }
        else
        {
            try{
                pt=con.prepareStatement("update login set Password=? where Username=?");
                pt.setString(1,CFP);
                pt.setString(2,user);
                pt.executeUpdate();
                msgbox.showMessageDialog(this,"Password changed","Update",1, null);
                msgbox.showMessageDialog(this,"Log in agian","Update",1,null);
                new LogIn().setVisible(true);
                this.dispose();
                setNameAC();

            }catch(Exception ex){}
            }}
            else
            {
                msgbox.showMessageDialog(this,"Invailed Username and password");
            }
        }catch(Exception e){
        e.printStackTrace();
        }
        

    }//GEN-LAST:event_btnACPsvActionPerformed

    private void txtACPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtACPMouseClicked
        if(FlagCP==1)
        txtACP.setText("");
    }//GEN-LAST:event_txtACPMouseClicked

    private void txtANPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtANPMouseClicked
        if(FlagCP==1){
            String CP=txtACP.getText();
            try{
                rs=st.executeQuery("select * from login where Password='"+CP+"'");
                rs.next();
                if(CP.equals(rs.getString(2))==false)
                {
                    txtANP.setEditable(false);
                    msgbox.showMessageDialog(this,"Wrong Current Password","Password failure",2, null);
                }
                else
                txtANP.setText("");
                txtANP.setEditable(true);

            }catch(Exception ex){
                msgbox.showMessageDialog(this,"Wrong Current Password","Password failure",2, null);
                // ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_txtANPMouseClicked

    private void txtACnPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtACnPMouseClicked
        if(FlagCP==1);
        txtACnP.setText("");
    }//GEN-LAST:event_txtACnPMouseClicked

    private void btnSCPcnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSCPcnclActionPerformed
        setNameSC();
    }//GEN-LAST:event_btnSCPcnclActionPerformed

    private void btnSCPsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSCPsvActionPerformed
        String id=txtuserid.getText();
        String NP=txtSNP.getText();
        String CFP=txtSCnP.getText();
        String op=txtSCP.getText();
        try
        {
            rs=st.executeQuery("select*from studentdetail where Id='"+id+"'and Password='"+op+"'");
            if(rs.next())
            {
             if(NP.equals(CFP)==false)
        {
            msgbox.showMessageDialog(this, "Password missmatch", "Failure",2, null);
        }
        else
        {
            try{
                pt=con.prepareStatement("update studentdetail set Password=? where Id=?");
                pt.setString(1,CFP);
                pt.setString(2,id);
                pt.executeUpdate();
                msgbox.showMessageDialog(this,"Password changed","Update",1, null);
                msgbox.showMessageDialog(this,"Log in agian","Update",1,null);
                new Userlogin().setVisible(true);
                this.dispose();
                setNameSC();

            }catch(Exception ex){}
            }}
            else
            {
                msgbox.showMessageDialog(this,"Invailed Username and password");
            }
        }catch(Exception e){
        e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_btnSCPsvActionPerformed

    private void txtuseridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtuseridMouseClicked
        if(FlagCU==1)
        txtuserid.setText("");

    }//GEN-LAST:event_txtuseridMouseClicked

    private void txtSNPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSNPMouseClicked
        if(FlagCU==1)
        txtSNP.setText("");

    }//GEN-LAST:event_txtSNPMouseClicked

    private void txtSCnPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSCnPMouseClicked
        if(FlagCU==1)
        txtSCnP.setText("");
    }//GEN-LAST:event_txtSCnPMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        try{
            rs=st.executeQuery("select * from login where Status='"+U+"'");
            rs.next();
            lblAdminName.setText(rs.getString(1));
        }catch(Exception ex){}
    }//GEN-LAST:event_jPanel1MouseMoved

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited

        lblLogout.setForeground(Color.white);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered

        lblLogout.setForeground(Color.RED);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        new LogIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void txtSCPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSCPMouseClicked
         if(FlagCP==1)
        txtSCP.setText("");
    }//GEN-LAST:event_txtSCPMouseClicked

    private void txtusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusernameMouseClicked
      if(FlagCP==1)
        txtusername.setText("");
    }//GEN-LAST:event_txtusernameMouseClicked

    private void txtACPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtACPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtACPActionPerformed

    private void txtSCnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSCnPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSCnPActionPerformed

    private void txtSCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSCPActionPerformed

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
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnACPcncl;
    private javax.swing.JButton btnACPsv;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChngAP;
    private javax.swing.JButton btnChngSP;
    private javax.swing.JButton btnSCPcncl;
    private javax.swing.JButton btnSCPsv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAdminName;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lbldate;
    private javax.swing.JOptionPane msgbox;
    private javax.swing.JPanel pnlChngPwd;
    private javax.swing.JPanel pnlChngUname;
    private javax.swing.JTextField txtACP;
    private javax.swing.JTextField txtACnP;
    private javax.swing.JTextField txtANP;
    private javax.swing.JTextField txtSCP;
    private javax.swing.JTextField txtSCnP;
    private javax.swing.JTextField txtSNP;
    private javax.swing.JTextField txtuserid;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
