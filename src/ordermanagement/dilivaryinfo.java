/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanagement;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import ordermanagement.dbconnect.Dbconnect;

/**
 *
 * @author Shani
 */
public class dilivaryinfo extends javax.swing.JFrame {
    Connection con =  null;  
    PreparedStatement pst =null;
    ResultSet rs = null;
    /*
     *
     * Creates new form dilivaryinfo
     */
    public dilivaryinfo() {
        initComponents();
            con= Dbconnect.connect();
            {
            Dimension d= Toolkit.getDefaultToolkit().getScreenSize();
            setSize(d);
        }
    }
     
    
   /* public void validatecard(String [] args){
     
                credictcard validcard = new credictcard(44171234567899113L);
                credictcard invalidcard = new credictcard(4417123456899113L);
                System.out.println("actual valid card"+validcard.isValid());
                System.out.println("expected : true");
                System.out.println("actual invalid card"+invalidcard.isValid());
                System.out.println("expected : false");
                
                
    
    }
 
 
    public class credictcard {
        private Long cardnumber;
        
        public credictcard(Long cardnumber){
        
            this.cardnumber = cardnumber;
        
        }

    private boolean isValid() {
        
        
    int cardNumber =0;
    int n =cardNumber;
    int sum =0;
    int count =0;
        
    while(n >0 ){
    
        int digit = n % 10;
            System.out.println(digit);
             System.out.println("count :"+count);
          
        if(count %2 ==1){
            sum = sum + digit;
            
        }
        else if(digit < 5){
              sum = sum + 2* digit;
          }
        else{
            sum = sum + 2* digit- 9;
            
        }
     sum = sum + digit;
     n = n/2;
     count++;
    }
    
    return sum %10 == 0;
   
           
        }
        
        


     }
*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        Time = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtpostalcode = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttelephone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbprovince = new javax.swing.JComboBox<>();
        cmbcity = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtRname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtcrdno = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbbank = new javax.swing.JComboBox<>();
        cmboxcategory = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtname1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jButton21.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        jButton21.setText("Home");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21);
        jButton21.setBounds(1120, 30, 130, 40);

        Time.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Time);
        Time.setBounds(1080, 110, 210, 40);

        Date.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Date);
        Date.setBounds(1080, 160, 220, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cvbnmsdfghjk.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 240);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cvbnmsdfghjk.jpg"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, -50, 1430, 260);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1480, 230);

        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(310, 90, 220, 30);

        txtpostalcode.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        txtpostalcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpostalcodeActionPerformed(evt);
            }
        });
        txtpostalcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpostalcodeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpostalcodeKeyTyped(evt);
            }
        });
        jPanel2.add(txtpostalcode);
        txtpostalcode.setBounds(320, 380, 200, 30);

        jLabel6.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Postal Code");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(150, 380, 150, 30);

        txttelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelephoneKeyTyped(evt);
            }
        });
        jPanel2.add(txttelephone);
        txttelephone.setBounds(310, 210, 240, 30);

        jLabel10.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Province");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(150, 310, 100, 30);

        cmbprovince.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        cmbprovince.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select province", " Central", " Eastern", " North Central", " Northern", " North Western", " Sabaragamuwa", " Southern", " Uva", " Western" }));
        jPanel2.add(cmbprovince);
        cmbprovince.setBounds(320, 300, 200, 30);

        cmbcity.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        cmbcity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select city", "Akkaraipattu\t", "Ambalangoda\t", "Ampara\t", "Anuradhapura\t", "Badulla\t", "Balangoda\t", "Bandarawela\t", "Batticaloa\t", "Beruwala\t", "Boralesgamuwa\t", "Chavakachcheri\t", "Chilaw\t", "Colombo\t", "Dambulla\t", "Dehiwala-Mount Lavinia\t", "Embilipitiya\t", "Eravur\t", "Galle\t", "Gampaha\t", "Gampola\t", "Hambantota\t", "Haputale\t", "Hatton-Dickoya\t", "Hikkaduwa\t", "Horana\t", "Ja-Ela\t", "Jaffna\t", "Kadugannawa\t", "Kaduwela (Battaramulla)\t", "Kalmunai (incl. Sainthamarathu)\t", "Kalutara\t", "Kandy\t", "Kattankudy (Kathankudi)", "Katunayake (-Seeduwa)\t", "Kegalle\t", "Kesbewa\t", "Kilinochchi\t \t", "Kinniya\t", "Kolonnawa\t", "Kuliyapitiya\t", "Maharagama", "Mannar\t", "Matale\t", "Matara\t", "Minuwangoda\t", "Moneragala\t \t", "Moratuwa\t", "Mullaitivu\t \t", "Nawalapitiya", "Negombo\t", "Nuwara Eliya\t", "Panadura\t", "Peliyagoda\t", "Point Pedro\t", "Polonnaruwa\t \t", "Puttalam\t", "Ratnapura\t", "Seethawakapura (Avissawella)\t", "Sri Jayawardenepura (Kotte)\t", "Tangalle\t", "Thalawakele-Lindula\t", "Trincomalee", "Valvettithurai\t", "Vavuniya\t", "Wattala-Mabole\t", "Wattegama\t", "waligama" }));
        jPanel2.add(cmbcity);
        cmbcity.setBounds(320, 340, 200, 30);

        jLabel7.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("City");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(150, 340, 100, 30);

        jLabel5.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telephone No");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(80, 210, 130, 30);

        txtaddress.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        txtaddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtaddressKeyPressed(evt);
            }
        });
        jPanel2.add(txtaddress);
        txtaddress.setBounds(310, 250, 240, 30);

        jButton3.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jButton3.setText("Add details");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(170, 440, 140, 40);

        jLabel16.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Name of recipient's");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(80, 170, 200, 30);

        jButton2.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jButton2.setText("Cancel ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(400, 440, 140, 40);

        txtRname.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        txtRname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRnameKeyPressed(evt);
            }
        });
        jPanel2.add(txtRname);
        txtRname.setBounds(310, 170, 240, 30);

        jLabel9.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(80, 250, 120, 30);

        jLabel18.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("ID");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(80, 90, 130, 30);

        jLabel8.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Add dilivary informations");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(220, 20, 310, 50);

        jPanel3.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Add card informations");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(190, 40, 310, 50);

        jLabel14.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("card no");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(70, 170, 200, 30);

        txtcrdno.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        txtcrdno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcrdnoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcrdnoKeyTyped(evt);
            }
        });
        jPanel3.add(txtcrdno);
        txtcrdno.setBounds(320, 170, 240, 30);

        jLabel12.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("bank");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(70, 220, 200, 30);

        jLabel4.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("card type");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(70, 120, 200, 30);

        cmbbank.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        cmbbank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Bank", "Bank of Ceylon", "Cargills Bank ", "Commercial Bank ", "Hatton National Bank ", "National Savings Bank", "Nations Trust Bank ", "People's Bank", "Sampath Bank", "Seylan Bank PLC", " " }));
        jPanel3.add(cmbbank);
        cmbbank.setBounds(320, 220, 240, 30);

        cmboxcategory.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        cmboxcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select category", "Credict card ", "Debit card", " ", " " }));
        jPanel3.add(cmboxcategory);
        cmboxcategory.setBounds(320, 120, 240, 30);

        jButton4.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jButton4.setText("Enter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(280, 320, 140, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondos-abstractos-corel-draw-para-fondo-celular-en-hd-12.jpg"))); // NOI18N
        jLabel11.setToolTipText("");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(-660, -240, 1520, 870);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(660, 90, 690, 470);

        txtname1.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        txtname1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtname1KeyPressed(evt);
            }
        });
        jPanel2.add(txtname1);
        txtname1.setBounds(310, 130, 240, 30);

        jLabel17.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Owner's name ");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(80, 130, 130, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondos-abstractos-corel-draw-para-fondo-celular-en-hd-12.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 10, 1370, 540);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 220, 1570, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpostalcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpostalcodeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpostalcodeKeyPressed

    private void txtaddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaddressKeyPressed
        // search customer

        String search = txtaddress.getText();
        String sql =" SELECT * FROM items_shoe where name LIKE '%"+ search +"%' ORDER BY `name`.`CustID` ASC ";

        try{
           
        }
        catch(Exception e){

        }
    }//GEN-LAST:event_txtaddressKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Save button
          int x = JOptionPane.showConfirmDialog(null, "do you  want to save this data?");
             
        
             try{
  
            
              String q = "INSERT INTO  dilivaryinfo (ownerName,Rname,Rtel,Raddress,province,city,postalcode,) values('"+txtname1.getText()+"','"+txtRname.getText()+"','"+ txttelephone.getText()+"','"+ txtaddress.getText()+"','"+cmbprovince.getSelectedItem()+"','"+cmbcity.getSelectedItem()+"','"+txtpostalcode.getText()+"')";
             
            
              pst =con.prepareStatement(q);
              pst.execute();
              
              txtname1.setText("");
              txtRname.setText("");
              txttelephone.setText("");
              txtaddress.setText("");
              cmbprovince.setSelectedItem("");
              cmbcity.setSelectedItem("");
              txtpostalcode.setText("");
             }

                catch (Exception e) {
                  e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // cancel button
               txtname1.setText("");
              txtRname.setText("");
              txttelephone.setText("");
              txtaddress.setText("");
              cmbprovince.setSelectedItem("");
              cmbcity.setSelectedItem("");
              txtpostalcode.setText("");
       

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtcrdnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcrdnoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcrdnoKeyPressed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        //mouse click of add detail button
        
        
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // homebutton

        home h= new home();
        h.setVisible(true);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void txtRnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRnameKeyPressed

    private void txtname1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtname1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtname1KeyPressed

    private void txttelephoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelephoneKeyTyped
        // tel:
                
               
         try{
            char c=evt.getKeyChar(); 
            
                if(Character.isLetter(c)&&!evt.isAltDown()){
                    
                  evt.consume();
                 Toolkit.getDefaultToolkit().beep();
            }                                                          
                
        }catch(Exception e){
  
        }
    }//GEN-LAST:event_txttelephoneKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // enter button 
        try{
        //    
            String q = "INSERT INTO  dilivaryinfo (cardtype,cardnum,Bank) values('"+cmbprovince.getSelectedItem()+"','"+txtcrdno.getText()+"','"+cmbcity.getSelectedItem()+"')";
             
             String q1 ="select credictcard from customer";
             
            
        
              pst =con.prepareStatement(q);
              pst.execute();
              
              cmboxcategory.setSelectedItem("");
              txtcrdno.setText("");
              cmbbank.setSelectedItem("");
          //  }  
        }  
        
        catch(Exception e){
        
        
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtpostalcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpostalcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpostalcodeActionPerformed

    private void txtpostalcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpostalcodeKeyTyped
      //postal code
      
        try{
            char c=evt.getKeyChar(); 
            
                if(Character.isLetter(c)&&!evt.isAltDown()){
                    
                  evt.consume();
                 Toolkit.getDefaultToolkit().beep();
            }                                                          
                
        }catch(Exception e){
  
        }
    }//GEN-LAST:event_txtpostalcodeKeyTyped

    private void txtcrdnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcrdnoKeyTyped
        //credict card 
    }//GEN-LAST:event_txtcrdnoKeyTyped

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
            java.util.logging.Logger.getLogger(dilivaryinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dilivaryinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dilivaryinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dilivaryinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new dilivaryinfo().setVisible(true);
               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Time;
    private javax.swing.JComboBox<String> cmbbank;
    private javax.swing.JComboBox<String> cmbcity;
    private javax.swing.JComboBox<String> cmboxcategory;
    private javax.swing.JComboBox<String> cmbprovince;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JTextField txtRname;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcrdno;
    private javax.swing.JTextField txtname1;
    private javax.swing.JTextField txtpostalcode;
    private javax.swing.JTextField txttelephone;
    // End of variables declaration//GEN-END:variables

   
}
