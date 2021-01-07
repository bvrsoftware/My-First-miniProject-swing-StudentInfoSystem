package studentinfosystem;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pt;  
    ResultSet rs;
    Statement st;
    String U="Yes";
    static int count=0;
      String [] cp=new String[]{"Id","Name","DOB","Gender","Courss","Number","State","Country","Address","Email"};
       DefaultTableModel dtmp=new DefaultTableModel(cp,0){
        @Override
        public boolean isCellEditable(int row,int column)
        {
           
                    return false;
           
        }
    };
public Menu() {
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
         rs=st.executeQuery("select * from studentdetail");
            fillgrid(rs);
        }
        catch(Exception e)
        {
            System.out.println("Error in Connection plz Check :" +e);
        }
    }
    public void fillgrid(ResultSet rs1)
    {
        Menugrid();
        Object []ob=new Object[10];
        try
           {        
               while(rs1.next())
               {
                   
                   ob[0]=rs1.getString(1);
                   ob[1]=rs1.getString(2);
                   ob[2]=rs1.getString(3);
                   ob[3]=rs1.getString(4); 
                   ob[4]=rs1.getString(5); 
                   ob[5]=rs1.getString(6);
                   ob[6]=rs1.getString(7);
                   ob[7]=rs1.getString(8);
                   ob[8]=rs1.getString(9);
                   ob[9]=rs1.getString(10);
                   dtmp.addRow(ob);
                   menugrid.setModel(dtmp);
               }    
           }
           catch(Exception e)
           {
               e.printStackTrace(); 
           }
  }
        public void Menugrid()
  {
      int rc=dtmp.getRowCount();
        for(int i=0;i<rc;i++)
        {
            dtmp.removeRow(0);
        }
  }
         public void clear()
    {
        txtname.setText("");
        txtmob.setText("");
        txtstate.setText("");
        txtqlf.setText("");
        txtcountry.setText("");
        txtid.setText("");
        txtaddress.setText("");
        txtgender.setText("");
        txtemail.setText("");
        txtdob.setText("");
    }
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msgbox = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btback = new javax.swing.JButton();
        btnsetting = new javax.swing.JButton();
        btnhistory = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        txtmob = new javax.swing.JTextField();
        txtstate = new javax.swing.JTextField();
        txtcountry = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtqlf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        menugrid = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtsearch = new javax.swing.JTextField();
        btnok = new javax.swing.JButton();
        comboxsearch = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        lbladmin = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        lbldate = new javax.swing.JLabel();
        btnrefer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\image\\tmu3.gif")); // NOI18N
        jLabel1.setText(" STUDENT MENU FORM");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 3));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, 958, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(0, 0, 204));
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(0, 0, 204));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btback.setForeground(new java.awt.Color(0, 0, 204));
        btback.setText("New Student Entry");
        btback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackActionPerformed(evt);
            }
        });

        btnsetting.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsetting.setForeground(new java.awt.Color(0, 0, 204));
        btnsetting.setText("Setting");
        btnsetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsettingActionPerformed(evt);
            }
        });

        btnhistory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnhistory.setForeground(new java.awt.Color(0, 0, 204));
        btnhistory.setText("HISTORY");
        btnhistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhistoryActionPerformed(evt);
            }
        });

        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(0, 0, 204));
        btnsearch.setText("SEARCH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btback)
                .addGap(32, 32, 32)
                .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnhistory)
                .addGap(43, 43, 43)
                .addComponent(btnsetting, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupdate)
                    .addComponent(btndelete)
                    .addComponent(btback)
                    .addComponent(btnsetting)
                    .addComponent(btnhistory)
                    .addComponent(btnsearch))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 153, 958, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 2, 3, 2, new java.awt.Color(204, 204, 0)));

        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(txtqlf, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtmob, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtstate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtqlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 286, -1, -1));

        menugrid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 3));
        menugrid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        menugrid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menugridMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(menugrid);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 960, 279));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153), 3));

        txtsearch.setText("Saerch");
        txtsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsearchMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtsearchMousePressed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        btnok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnok.setForeground(new java.awt.Color(0, 51, 204));
        btnok.setText("Ok");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        comboxsearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Search with", "Id", "Name", "DOB", "Gender", "Number", "State", "Country", "Address", "Email", "Courss" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboxsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnok)
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnok))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel3.setText("Developed by sanjeev kumar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 640, 240, -1));

        lbladmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbladmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 190, 20));

        btnlogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(0, 0, 204));
        btnlogout.setText("LogOut");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, -1, -1));

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 210, 20));

        btnrefer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnrefer.setForeground(new java.awt.Color(0, 0, 204));
        btnrefer.setText("Refresh");
        btnrefer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreferActionPerformed(evt);
            }
        });
        getContentPane().add(btnrefer, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMouseClicked
        String combo=(String)comboxsearch.getSelectedItem();
        if(combo.equals("Search with")==true)
        msgbox.showMessageDialog(this,"Please select search type ","Suggestion",3, null);
        else
        txtsearch.setText("");

    }//GEN-LAST:event_txtsearchMouseClicked

    private void txtsearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchMousePressed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased

        String str,combo=(String)comboxsearch.getSelectedItem();
        str=txtsearch.getText();
        if(combo.equals("Id")==true)
        {
            try{
                rs=st.executeQuery("select * from studentdetail where Id like '%"+str+"%'");
                fillgrid(rs);

            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        if(combo.equals("Courss")==true)
        {
            try{
                rs=st.executeQuery("select * from studentdetail where Courss like '%"+str+"%'");
                fillgrid(rs);

            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        if(combo.equals("Name")==true)
        {
            try{
                rs=st.executeQuery("select * from studentdetail where Name like '%"+str+"%'");
                fillgrid(rs);

            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        if(combo.equals("DOB")==true)
        {
            try{
                rs=st.executeQuery("select * from studentdetail where DOB like '%"+str+"%'");
                fillgrid(rs);

            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        if(combo.equals("Gender")==true)
        {
            try{
                rs=st.executeQuery("select * from studentdetail where Gender like '%"+str+"%'");
                fillgrid(rs);

            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        if(combo.equals("Number")==true)
        {
            try{
                rs=st.executeQuery("select * from studentdetail where Number like '%"+str+"%'");
                fillgrid(rs);

            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        if(combo.equals("State")==true)
        {
            try{
                rs=st.executeQuery("select * from studentdetail where State like '%"+str+"%'");
                fillgrid(rs);

            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        if(combo.equals("Country")==true)
        {
            try{
                rs=st.executeQuery("select * from studentdetail where Country like '%"+str+"%'");
                fillgrid(rs);

            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        if(combo.equals("Address")==true)
        {
            try{
                rs=st.executeQuery("select * from studentdetail where Address like '%"+str+"%'");
                fillgrid(rs);

            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        if(combo.equals("Email")==true)
        {
            try{
                rs=st.executeQuery("select * from studentdetail where Email like '%"+str+"%'");
                fillgrid(rs);

            }catch(Exception ex){
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_txtsearchKeyReleased

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        int row=menugrid.getRowCount();
        try{
            pt=con.prepareStatement("insert into history values(?,?,?,?,?,?,?,?,?,?,?)");
            pt.setString(1,(String)menugrid.getValueAt(row-1,0));
            pt.setString(2,(String)menugrid.getValueAt(row-1,1));
            pt.setString(3,(String)menugrid.getValueAt(row-1,2));
            pt.setString(4,(String)menugrid.getValueAt(row-1,3));
            pt.setString(5,(String)menugrid.getValueAt(row-1,4));
            pt.setString(6,(String)menugrid.getValueAt(row-1,5));
            pt.setString(7,(String)menugrid.getValueAt(row-1,6));
            pt.setString(8,(String)menugrid.getValueAt(row-1,7));
            pt.setString(9,(String)menugrid.getValueAt(row-1,8));
            pt.setString(10,(String)menugrid.getValueAt(row-1,9)); 
            pt.setString(10,"Search");
            pt.executeUpdate();

        }catch(Exception ex){}
    }//GEN-LAST:event_btnokActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        if(txtmob.getText().equals("")){
                 msgbox.showMessageDialog(this, "Enter the property first ", "UnSave", 1, null);
                 txtname.setEditable(true);
                    txtmob.setText("");
                    txtstate.setEditable(true);
                    txtcountry.setEditable(true);
                    txtaddress.setEditable(true);
                    txtdob.setEditable(true);
                    txtemail.setEditable(true);
                    txtqlf.setEditable(true);
                 
        }
        else{
        int id=Integer.parseInt(txtid.getText());
        String name,mob,add,st,co,ge,dob,email,qlf;
        mob=txtmob.getText();
        name=txtname.getText();
        st=txtstate.getText();
        add=txtaddress.getText();
        qlf=txtqlf.getText();
        ge=txtgender.getText();
        dob=txtdob.getText();
        email=txtemail.getText();
        co=txtcountry.getText();
        {
            try
            {
            pt=con.prepareStatement("update studentdetail set Email=?,Name=?,DOB=?,Gender=?,Courss=?,Number=?,State=?,Country=?,Address=? where Id=?");
            pt.setString(1, email);
            pt.setString(2, name);
            pt.setString(3, dob);
            pt.setString(4, ge);
            pt.setString(5, qlf);
            pt.setString(6, mob);
            pt.setString(7, st);
            pt.setString(8, co);
            pt.setString(9, add);
            pt.setInt(10, id);
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
            pt.setString(11, "Update");
            pt.executeUpdate();
            msgbox.showMessageDialog(this, "detail saved  successfully", "Save", 1, null);
                    clear();
            }
        catch(Exception ex)
        {
             msgbox.showMessageDialog(this, "This detail is already exist", "Unsave", 2, null);
        }
      }
    }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
       
        String name,mob,add,st,co,ge,dob,email,qlf;
        mob=txtmob.getText();
        name=txtname.getText();
        st=txtstate.getText();
        add=txtaddress.getText();
        ge=txtgender.getText();
        dob=txtdob.getText();
        qlf=txtqlf.getText();
        email=txtemail.getText();
        co=txtcountry.getText();
        int id=Integer.parseInt(txtid.getText());
         try
         {
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
            pt.setString(11, "Delete");
            pt.executeUpdate();
            
            pt=con.prepareStatement("delete from studentdetail where Id='"+id+"'");
            pt.executeUpdate();
          msgbox.showMessageDialog(this,"Delete successfully ", "Delete",1, null);
         }catch(Exception ex)
         {
              msgbox.showMessageDialog(this,"Process failed ", "Failure",2, null);
         
         }
             
    }//GEN-LAST:event_btndeleteActionPerformed

    private void menugridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menugridMouseClicked
        int row=menugrid.getSelectedRow();
        
        txtid.setEditable(false);
        String id=(String)menugrid.getValueAt(row,0);     
        try{
            rs=st.executeQuery("select * from studentdetail where Id='"+id+"'");
            rs.first();
            txtid.setText(rs.getString(1));
            txtname.setText(rs.getString(2));
            txtdob.setText(rs.getString(3));
            txtgender.setText(rs.getString(4));
            txtqlf.setText(rs.getString(5));
            txtmob.setText(rs.getString(6));
            txtstate.setText(rs.getString(7));
            txtcountry.setText(rs.getString(8));
            txtaddress.setText(rs.getString(9));
            txtemail.setText(rs.getString(10));
            pt.executeUpdate();

        }catch(Exception ex){}


    }//GEN-LAST:event_menugridMouseClicked

    private void btnhistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhistoryActionPerformed
         new History().setVisible(true);
         this.dispose();    
    }//GEN-LAST:event_btnhistoryActionPerformed

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
         new StudentDetail().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btbackActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
        try{
            rs=st.executeQuery("select * from login where Username='"+U+"'");
            rs.next();
            lbladmin.setText(rs.getString(1));
        }catch(Exception ex){}
    }//GEN-LAST:event_formMouseMoved

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        new Welcome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnsettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsettingActionPerformed
        new Setting().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsettingActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed

    private void btnreferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreferActionPerformed
        
    }//GEN-LAST:event_btnreferActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btback;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnhistory;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnok;
    private javax.swing.JButton btnrefer;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnsetting;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox comboxsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbladmin;
    private javax.swing.JLabel lbldate;
    private javax.swing.JTable menugrid;
    private javax.swing.JOptionPane msgbox;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcountry;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmob;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtqlf;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtstate;
    // End of variables declaration//GEN-END:variables
}
