package studentinfosystem;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class History extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pt;  
    ResultSet rs;
    Statement st;
    String U="Yes";
    static int count=0;
      String [] cp=new String[]{"Id","Name","DOB","Gender","Courss","Number","State","Country","Address","Email","Action"};
       DefaultTableModel dtmp=new DefaultTableModel(cp,0){
        @Override
        public boolean isCellEditable(int row,int column)
        {
           
                    return false;
           
        }
    };

    public History() {
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
         rs=st.executeQuery("select * from history");
            fillgrid(rs);
        }
        catch(Exception e)
        {
            System.out.println("Error in Connection plz Check :" +e);
        }
    }
    public void fillgrid(ResultSet rs1)
    {
        Historygrid();
        Object []ob=new Object[11];
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
                   ob[10]=rs1.getString(11);
                   dtmp.addRow(ob);
                  historygrid.setModel(dtmp);
               }    
           }
           catch(Exception e)
           {
               e.printStackTrace(); 
           }
  }
        public void Historygrid()
  {
      int rc=dtmp.getRowCount();
        for(int i=0;i<rc;i++)
        {
            dtmp.removeRow(0);
        }
  }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        comboxsearch = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        historygrid = new javax.swing.JTable();
        btnok = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbladmin = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\Student information System\\StudentInfoSystem\\photos\\tmu3.gif")); // NOI18N
        jLabel1.setText("  STUDENT HISORY FORM");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204), 3));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 1000, 120));

        btnlogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnlogout.setText("LogOut");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 200, 90, -1));

        btnback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 253, 90, 30));

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
        getContentPane().add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 180, -1));

        comboxsearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Search with", "Id", "Name", "DOB", "Gender", "Number", "Courss", "State", "Country", "Address", "Email", "Action" }));
        getContentPane().add(comboxsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 180, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        historygrid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        jScrollPane1.setViewportView(historygrid);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 312, 950, 290));

        btnok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnok.setText("Ok");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });
        getContentPane().add(btnok, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 248, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel3.setText("Developed by sanjeev kumar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 630, 240, -1));

        lbladmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbladmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 220, 30));

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 180, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
       
        String str,combo=(String)comboxsearch.getSelectedItem();
       str=txtsearch.getText();
       if(combo.equals("Id")==true)
        {      
            try{
                rs=st.executeQuery("select * from history where Id like '%"+str+"%'");
                fillgrid(rs);
                
            }catch(Exception ex){
            ex.printStackTrace();
            }
        }
       if(combo.equals("Courss")==true)
        {      
            try{
                rs=st.executeQuery("select * from history where Courss like '%"+str+"%'");
                fillgrid(rs);
                
            }catch(Exception ex){
            ex.printStackTrace();
            }
        }
       if(combo.equals("Name")==true)
        {
            try{
                rs=st.executeQuery("select * from history where Name like '%"+str+"%'");
                fillgrid(rs);
                
            }catch(Exception ex){
            ex.printStackTrace();
            }
        }
        if(combo.equals("DOB")==true)
        {
            try{
                rs=st.executeQuery("select * from history where DOB like '%"+str+"%'");
                fillgrid(rs);
                
            }catch(Exception ex){
            ex.printStackTrace();
            }
        }
         if(combo.equals("Gender")==true)
        {
            try{
                rs=st.executeQuery("select * from history where Gender like '%"+str+"%'");
                fillgrid(rs);
                
            }catch(Exception ex){
            ex.printStackTrace();
            }
        }
       if(combo.equals("Number")==true)
        {
            try{
                rs=st.executeQuery("select * from history where Number like '%"+str+"%'");
                fillgrid(rs);
                
            }catch(Exception ex){
            ex.printStackTrace();
            }
        }
       if(combo.equals("State")==true)
        {
            try{
                rs=st.executeQuery("select * from history where State like '%"+str+"%'");
                fillgrid(rs);
                
            }catch(Exception ex){
            ex.printStackTrace();
            }
        }
       if(combo.equals("Country")==true)
        {
            try{
                rs=st.executeQuery("select * from history where Country like '%"+str+"%'");
                fillgrid(rs);
                
            }catch(Exception ex){
            ex.printStackTrace();
            }
        }
        if(combo.equals("Address")==true)
        {
            try{
                rs=st.executeQuery("select * from history where Address like '%"+str+"%'");
                fillgrid(rs);
                
            }catch(Exception ex){
            ex.printStackTrace();
            }
        }
         if(combo.equals("Email")==true)
        {
            try{
                rs=st.executeQuery("select * from history where Email like '%"+str+"%'");
                fillgrid(rs);
                
            }catch(Exception ex){
            ex.printStackTrace();
            }
        }
      if(combo.equals("Action")==true)
        {
            try{
                rs=st.executeQuery("select * from history where Action like '%"+str+"%'");
                fillgrid(rs);
                
            }catch(Exception ex){
            ex.printStackTrace();
            }
        }
      
    }//GEN-LAST:event_txtsearchKeyReleased

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        int row=historygrid.getRowCount();
        try{
            pt=con.prepareStatement("insert into history values(?,?,?,?,?,?,?,?,?,?,?)");
            pt.setString(1,(String)historygrid.getValueAt(row-1,0));
            pt.setString(2,(String)historygrid.getValueAt(row-1,1));
            pt.setString(3,(String)historygrid.getValueAt(row-1,2));
            pt.setString(4,(String)historygrid.getValueAt(row-1,3));
            pt.setString(5,(String)historygrid.getValueAt(row-1,4));
            pt.setString(6,(String)historygrid.getValueAt(row-1,5));
            pt.setString(7,(String)historygrid.getValueAt(row-1,6));
            pt.setString(8,(String)historygrid.getValueAt(row-1,7));
            pt.setString(9,(String)historygrid.getValueAt(row-1,8));
            pt.setString(10,(String)historygrid.getValueAt(row-1,9));
            pt.setString(11,"Search");
            pt.executeUpdate();

        }catch(Exception ex){}
    }//GEN-LAST:event_btnokActionPerformed

    private void txtsearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchMousePressed

    private void txtsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMouseClicked
         String combo=(String)comboxsearch.getSelectedItem();
        if(combo.equals("Search with")==true)
            JOptionPane.showMessageDialog(this,"Please select search type ","Suggestion",3, null);
        else                
          txtsearch.setText("");
       
    }//GEN-LAST:event_txtsearchMouseClicked

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

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

    // Variabl
                new History().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnok;
    private javax.swing.JComboBox comboxsearch;
    private javax.swing.JTable historygrid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbladmin;
    private javax.swing.JLabel lbldate;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
