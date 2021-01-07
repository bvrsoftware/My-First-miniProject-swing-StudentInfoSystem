package studentinfosystem;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class StudentDetail extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pt;  
    ResultSet rs;
    Statement st;
    static int count=0;

    public StudentDetail() {
        initComponents();
        setconnection();
         DateFormat df=new SimpleDateFormat("dd/MM/YYYY");
        java.util.Date dateobj=new java.util.Date();
        lbldate.setText(df.format(dateobj));
        
    }
    
    public void  setconnection()
    {
       try
        {
         Class.forName("com.mysql.jdbc.Driver");
          con=Myconncetion.getConnection();
         st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
         System.out.println("connected");
         desEnable();
        }
        catch(Exception e)
        {
                System.out.println("Error in connection plz check:" +e);
        }
    }
      public void clear()
    {
        txtname.setText("");
        txtmob.setText("");
        txtstate.setText("");
        comboxcount.setSelectedIndex(0);
        txtaddress.setText("");
        buttonGroup1.clearSelection();
        txtemail.setText("");
        txtdob.setText("");
        txtpass.setText("");
        txtQ.setText("");
    }
      public void desEnable()
      {
          txtname.setEnabled(false);
        txtmob.setEnabled(false);
        txtstate.setEnabled(false);
        comboxcount.setEnabled(false);
        txtid.setEnabled(false);
        txtaddress.setEnabled(false);
        rdomale.setEnabled(false);
        rdofemale.setEnabled(false);
        txtemail.setEnabled(false);
        txtdob.setEnabled(false);
        txtpass.setEnabled(false);
        txtQ.setEnabled(false);
      }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        msgbox = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rdofemale = new javax.swing.JRadioButton();
        rdomale = new javax.swing.JRadioButton();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtmob = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        txtstate = new javax.swing.JTextField();
        comboxcount = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtQ = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnsave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtlogpass = new javax.swing.JPasswordField();
        txtuser = new javax.swing.JTextField();
        btnnew = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NAME");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("MOB NO.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("DOB");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("FULL ADDRESS");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("STATE");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("COUNTRY");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("GENDER:-");

        buttonGroup1.add(rdofemale);
        rdofemale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdofemale.setText("Female");

        buttonGroup1.add(rdomale);
        rdomale.setText("Male");

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        comboxcount.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select country", "Indian", "Sout Indian", "North Indian", "Amarica" }));
        comboxcount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxcountActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("E-MAIL");

        txtemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtemailMouseReleased(evt);
            }
        });
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailFocusGained(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtemailKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("PASSWORD");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Qualification");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel4)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmob, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(39, 39, 39)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(txtQ))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 44, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(459, 459, 459))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(442, 442, 442)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9))
                .addGap(4, 4, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtstate)
                    .addComponent(comboxcount, 0, 178, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdomale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(rdofemale)
                        .addGap(30, 30, 30))
                    .addComponent(txtemail)
                    .addComponent(txtdob)
                    .addComponent(txtpass))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboxcount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdofemale)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdomale)
                                .addComponent(jLabel9)))
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, 280));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setForeground(new java.awt.Color(51, 51, 255));

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsave.setForeground(new java.awt.Color(0, 0, 153));
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Change Or Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btncancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(51, 51, 255));
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnnext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnext.setForeground(new java.awt.Color(51, 51, 255));
        btnnext.setText("NEXT");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addComponent(btnsave)
                .addGap(52, 52, 52)
                .addComponent(btnnext)
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addGap(56, 56, 56)
                .addComponent(btncancel)
                .addGap(66, 66, 66))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(jButton1)
                    .addComponent(btncancel)
                    .addComponent(btnnext))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 890, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Developed by sanjeev kumar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, 240, 20));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("User  ID");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Password");

        btnnew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnew.setForeground(new java.awt.Color(0, 153, 153));
        btnnew.setText("NEW");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        btnlogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(0, 153, 153));
        btnlogin.setText("LogIn");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon("G:\\image\\tmu3.gif")); // NOI18N
        jLabel14.setText("STUDENT DETAIL FORM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtuser, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(txtlogpass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnlogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnew))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlogin)
                            .addComponent(txtlogpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1040, 110));

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 210, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboxcountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxcountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxcountActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
          if(txtmob.getText().equals("")){
                 msgbox.showMessageDialog(this, "Enter the property first ", "UnSave", 1, null);
                 txtname.setEditable(true);
                    txtmob.setText("");
                    txtstate.setEditable(true);
                    comboxcount.setEditable(true);
                    txtaddress.setEditable(true);
                    txtdob.setEditable(true);
                    txtemail.setEditable(true);
                    txtpass.setEditable(true);
                    txtQ.setEditable(true);
                 
        }
        else{
        int id=Integer.parseInt(txtid.getText());
        String name,mob,add,st,co,ge,dob,email,pass,qlf;
        mob=txtmob.getText();
        qlf=txtQ.getText();
        name=txtname.getText();
        st=txtstate.getText();
        add=txtaddress.getText();
        pass=txtpass.getText();
        ge=" ";
        if(rdomale.isSelected()==true)
        {
            ge="Male";
        }
        if(rdofemale.isSelected()==true)
        {
            ge="Female";
        }
        dob=txtdob.getText();
        email=txtemail.getText(); 
       boolean status=Validation.valid(txtemail.getText());
       if(status)
          msgbox.showMessageDialog(this,"invalid Email");
        
        co=(String)comboxcount.getSelectedItem();
        if(co.equals("Select country"))
                msgbox.showMessageDialog(this, "Choose an authenticated country", "Authenticated Country", 3, null);
         else
          {
            try
            {
            pt=con.prepareStatement("insert into studentdetail values(?,?,?,?,?,?,?,?,?,?,?)");
            pt.setInt(1, id);
            pt.setString(2, name);
            pt.setString(3, dob);
            pt.setString(4, ge);
            pt.setString(5, qlf);
            pt.setString(6, mob);
            pt.setString(7, st);
            pt.setString(8, co);
            pt.setString(9, add);
            pt.setString(10, email);
            pt.setString(11, pass);
            pt.executeUpdate();
            pt=con.prepareStatement("insert into history values(?,?,?,?,?,?,?,?,?,?,?)");
            pt.setInt(1, id);
            pt.setString(2, name);
            pt.setString(3, dob);
            pt.setString(4, ge);
            pt.setString(5, qlf);
            pt.setString(6, mob);
            pt.setString(7, st);
            pt.setString(8, co);
            pt.setString(9, add);
            pt.setString(10, email);
            pt.setString(11, "New Entry");
            pt.executeUpdate();
            msgbox.showMessageDialog(this, "detail saved  successfully", "Save", 1, null);
                    clear();
            }
        catch(Exception ex)
        {
             msgbox.showMessageDialog(this, "This detail is already exist", "Unsave", 2, null);
        }
      }}
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        
        if(txtmob.getText().equals("")){
                 msgbox.showMessageDialog(this, "Enter the property first ", "UnSave", 1, null);
                 txtname.setEditable(true);
                    txtmob.setText("");
                    txtstate.setEditable(true);
                    comboxcount.setEditable(true);
                    txtaddress.setEditable(true);
                    txtdob.setEditable(true);
                    txtemail.setEditable(true);
                    txtpass.setEditable(true);
                    txtQ.setEditable(true);
                 
        }
        else{
        int id=Integer.parseInt(txtid.getText());
        String pass,name,mob,add,st,co,ge,dob,email,qlf;
        name=txtname.getText();
        mob=txtmob.getText();
        st=txtstate.getText();
        qlf=txtQ.getText();
        add=txtaddress.getText();
        pass=txtpass.getText();
        ge="  ";
        if(rdomale.isSelected()==true)
        {
            ge="Male";
        }
        if(rdofemale.isSelected()==true)
        {
            ge="Female";
        }
        dob=txtdob.getText();
       email=txtemail.getText();
        boolean status=Validation.valid(email);
        if(status){
        }else
        {
             msgbox.showMessageDialog(this,"invalid Email");
        }
        co=(String)comboxcount.getSelectedItem();
        if(co.equals("Select country"))
                msgbox.showMessageDialog(this, "Choose an authenticated country", "Authenticated Country", 3, null);
        else
          {
            try
            {
            pt=con.prepareStatement("insert into studentdetail values(?,?,?,?,?,?,?,?,?,?,?)");
            pt.setInt(1, id);
            pt.setString(2, name);
            pt.setString(3, dob);
            pt.setString(4, ge);
            pt.setString(5, qlf);
            pt.setString(6, mob);
            pt.setString(7, st);
            pt.setString(8, co);
            pt.setString(9, add);
            pt.setString(10, email);
            pt.setString(11, pass);
            pt.executeUpdate();
            pt=con.prepareStatement("insert into history values(?,?,?,?,?,?,?,?,?,?,?)");
            pt.setInt(1, id);
            pt.setString(2, name);
            pt.setString(3, dob);
            pt.setString(4, ge);
            pt.setString(5, qlf);
            pt.setString(6, mob);
            pt.setString(7, st);
            pt.setString(8, co);
            pt.setString(9, add);
            pt.setString(10, email);
            pt.setString(11, "New Entry");
            pt.executeUpdate();
            msgbox.showMessageDialog(this, "Detail saved  successfully", "Save", 1, null);
            clear();
            txtname.setEditable(true);
            txtstate.setEditable(true);
            comboxcount.setEditable(true);
            count=0;
            }
             catch(Exception ex)
           {
             msgbox.showMessageDialog(this, "This detail is already exist", "Unsave", 2, null);
           }
        }
      }
    }//GEN-LAST:event_btnnextActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
         clear();
    }//GEN-LAST:event_btncancelActionPerformed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseEntered

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        txtname.setEnabled(true);
        txtmob.setEnabled(true);
        txtstate.setEnabled(true);
        comboxcount.setEnabled(true);
        txtid.setEnabled(true);
        txtaddress.setEnabled(true);
        rdomale.setEnabled(true);
        rdofemale.setEnabled(true);
        txtemail.setEnabled(true);
        txtdob.setEnabled(true);
        txtpass.setEnabled(true);
        txtQ.setEnabled(true);
         int i=0;
        try
        {
            rs=st.executeQuery("Select Id from studentdetail order by Id desc");
            rs.next();
            i=rs.getInt(1);
            i=i+1;
            txtid.setText(i+ "");
        }
        catch(Exception e)
        {
            txtid.setText("1401150");
        }
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
       String un,p;
        un=txtuser.getText();
        p=txtlogpass.getText();
        try
        {
            rs=st.executeQuery("select*from studentdetail where Id='"+un+"'and Password='"+p+"'");
            if(rs.next())
            {
             msgbox.showMessageDialog(this,"LogIn Successful"); 
              new Menu().setVisible(true);
              this.dispose();
            }
            else
            {
                msgbox.showMessageDialog(this,"Invailed Username and password");
            }
        }catch(Exception e){
        e.printStackTrace();
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         msgbox.showMessageDialog(this,"first LogIn your ID");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusGained
       
        
    }//GEN-LAST:event_txtemailFocusGained

    private void txtemailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtemailMouseReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtemailMouseReleased

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
//DO add your handling code here:
    }//GEN-LAST:event_txtemailKeyReleased

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailKeyPressed

    private void txtemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailKeyTyped

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
            java.util.logging.Logger.getLogger(StudentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboxcount;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldate;
    private javax.swing.JOptionPane msgbox;
    private javax.swing.JRadioButton rdofemale;
    private javax.swing.JRadioButton rdomale;
    private javax.swing.JTextField txtQ;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JPasswordField txtlogpass;
    private javax.swing.JTextField txtmob;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtstate;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
