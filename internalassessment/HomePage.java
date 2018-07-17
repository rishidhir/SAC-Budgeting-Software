/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalassessment;
import java.io.BufferedReader;
import java.util.*;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author rishidhir
 */
public class HomePage extends javax.swing.JFrame {
private SAC account = new SAC(20000);
private Club club; 
private AccessAccount second = new AccessAccount();
private AddClub third = new AddClub();
private EditClub fourth = new EditClub();
private LoginScreen login = new LoginScreen();
private DeleteClub fifth = new DeleteClub();
private ListTransactions sixth = new ListTransactions();
    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomeBox = new javax.swing.JPanel();
        accessActBtn = new javax.swing.JButton();
        addClubBtn = new javax.swing.JButton();
        editClubBtn = new javax.swing.JButton();
        deleteClubBtn = new javax.swing.JButton();
        listTransactionsBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        HomeTittle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeBox.setBackground(new java.awt.Color(36, 47, 65));

        accessActBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        accessActBtn.setText("Access Account");
        accessActBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accessActBtnActionPerformed(evt);
            }
        });

        addClubBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addClubBtn.setText("Add Club");
        addClubBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClubBtnActionPerformed(evt);
            }
        });

        editClubBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        editClubBtn.setText("Edit Club");
        editClubBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editClubBtnActionPerformed(evt);
            }
        });

        deleteClubBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deleteClubBtn.setText("Delete Club");
        deleteClubBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClubBtnActionPerformed(evt);
            }
        });

        listTransactionsBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listTransactionsBtn.setText("List Transactions");
        listTransactionsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listTransactionsBtnActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        HomeTittle.setFont(new java.awt.Font("PT Sans", 1, 48)); // NOI18N
        HomeTittle.setForeground(new java.awt.Color(255, 255, 255));
        HomeTittle.setText("Budgeting System");

        javax.swing.GroupLayout HomeBoxLayout = new javax.swing.GroupLayout(HomeBox);
        HomeBox.setLayout(HomeBoxLayout);
        HomeBoxLayout.setHorizontalGroup(
            HomeBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeBoxLayout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addGroup(HomeBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeBoxLayout.createSequentialGroup()
                        .addGroup(HomeBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accessActBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(HomeBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(addClubBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editClubBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteClubBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(listTransactionsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeBoxLayout.createSequentialGroup()
                        .addComponent(HomeTittle)
                        .addGap(127, 127, 127))))
        );
        HomeBoxLayout.setVerticalGroup(
            HomeBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeBoxLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(HomeTittle)
                .addGap(53, 53, 53)
                .addComponent(accessActBtn)
                .addGap(18, 18, 18)
                .addComponent(addClubBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editClubBtn)
                .addGap(18, 18, 18)
                .addComponent(deleteClubBtn)
                .addGap(18, 18, 18)
                .addComponent(listTransactionsBtn)
                .addGap(18, 18, 18)
                .addComponent(logoutBtn)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        getContentPane().add(HomeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 650, 640));

        jPanel2.setBackground(new java.awt.Color(97, 212, 195));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internalassessment/rsz_rsz_icon_process-improvement_600_600colo-255-255-255-0_1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internalassessment/rsz_11photo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 640));

        setSize(new java.awt.Dimension(909, 662));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    public void addClub (Club c) {
        account.addClub(c);
        double amt = Double.parseDouble(c.getMoney());
        account.changeCurrentAmt(amt);
    }
    private void accessActBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessActBtnActionPerformed
        // TODO AddClub your handling code here:
        second.getCurrentAmt(this, account, club);
        this.setVisible(false);
    }//GEN-LAST:event_accessActBtnActionPerformed

    private void listTransactionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listTransactionsBtnActionPerformed
        // TODO AddClub your handling code here:
        sixth.setVisible(true);
        this.setVisible(false);
        sixth.listTransactions(account, this);
    }//GEN-LAST:event_listTransactionsBtnActionPerformed

    private void addClubBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClubBtnActionPerformed
        // TODO AddClub your handling code here:
        third.setVisible(true);
        third.addClub(this);
        this.setVisible(false);
    }//GEN-LAST:event_addClubBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO AddClub your handling code here:
        this.setVisible(false);
        login.setVisible(true);
    try {
        writeToFile("example.txt");
    } catch (IOException ex) {
        Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
    }
    this.dispose();
    second.dispose();
    third.dispose();
    fourth.dispose();
    fifth.dispose();
    sixth.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void editClubBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editClubBtnActionPerformed
        // TODO AddClub your handling code here:
        this.setVisible(false);
        fourth.setVisible(true);
        fourth.clubList(account, this);
    }//GEN-LAST:event_editClubBtnActionPerformed

    private void deleteClubBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClubBtnActionPerformed
        // TODO AddClub your handling code here:
        this.setVisible(false);
        fifth.setVisible(true);
        fifth.deleteClubList(account, this);
    }//GEN-LAST:event_deleteClubBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    try {
        // TODO AddClub your handling code here:
        readFromFile("example.txt");
        } 
    catch (IOException ex) {
        Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    public void writeToFile(String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        int number = account.getCount();
        Club [] clubs = account.getClub();
        for (int i=0; i<number;i++) {
            String name = clubs[i].getName();
            String president = clubs[i].getPresident();
            String email = clubs[i].getEmail();
            String phone = clubs[i].getPhone();
            String executive = clubs[i].getExecutive();
            Date date2 = clubs[i].getDate();
            String date = date2.toString();
            String money = clubs[i].getMoney();
            
           writer.append(name).append(";").append(president).append(";").append(email).append(";").append(phone).append(";").append(executive).append(";").append(date).append(";").append(money);
           writer.newLine();
        }
        writer.close();
    }
    
    public void readFromFile (String filename) throws IOException {
        BufferedReader reader = new BufferedReader (new FileReader(filename));
        String currentLine;
        SAC account  = new SAC(20000);
        while ((currentLine= reader.readLine()) !=null) {
            String[] values = currentLine.split(";");
            String name =values[0];
            String president= values[1];
            String email= values[2];
            String phone = values[3];
            String executive = values[4];
            String date2 = values[5];
            Date date = new Date (date2);
            String money = values[6];
           
            Club c = new Club(name, president, email, phone, executive, date, money);
            this.addClub(c);
        } 
        reader.close();
}
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {            
               new LoginScreen().setVisible(true);
           }
       });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomeBox;
    private javax.swing.JLabel HomeTittle;
    private javax.swing.JButton accessActBtn;
    private javax.swing.JButton addClubBtn;
    private javax.swing.JButton deleteClubBtn;
    private javax.swing.JButton editClubBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton listTransactionsBtn;
    private javax.swing.JButton logoutBtn;
    // End of variables declaration//GEN-END:variables
}
