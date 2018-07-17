/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalassessment;
import java.util.Date;

/**
 *
 * @author rishidhir
 */
public class ExtensionEditClub extends javax.swing.JFrame {
    private HomePage first;
    private EditClub fourth; 
    private SAC account;
    private int changed;
    private double oldAmount;
    /**
     * Creates new form ExtensionSearchClub
     */
    public ExtensionEditClub() {
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

        addClubPanel = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        president = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        executive = new javax.swing.JLabel();
        money = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        inputPresident = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        inputPhone = new javax.swing.JTextField();
        inputExecutive = new javax.swing.JTextField();
        inputMoney = new javax.swing.JTextField();
        inputDate = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();
        addClubPanel5 = new javax.swing.JPanel();
        clubLabel = new javax.swing.JLabel();
        presidentLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        executivesLabel = new javax.swing.JLabel();
        moneyLabel = new javax.swing.JLabel();
        clubTxt1 = new javax.swing.JTextField();
        presidentTxt1 = new javax.swing.JTextField();
        emailTxt1 = new javax.swing.JTextField();
        phoneTxt1 = new javax.swing.JTextField();
        executivesTxt1 = new javax.swing.JTextField();
        moneyTxt1 = new javax.swing.JTextField();
        saveBtn5 = new javax.swing.JButton();
        returnBtn5 = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        addClubPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));

        name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        name.setText("Club Name");

        president.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        president.setText("Club President");

        email.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        email.setText("Club Email");

        phone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        phone.setText("Club Phone Number");

        executive.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        executive.setText("Number of Executives");

        money.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        money.setText("Money Given");

        date.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        date.setText("Date");

        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        saveBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        returnBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        returnBtn.setText("Return");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addClubPanelLayout = new javax.swing.GroupLayout(addClubPanel);
        addClubPanel.setLayout(addClubPanelLayout);
        addClubPanelLayout.setHorizontalGroup(
            addClubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addClubPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(addClubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addClubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(date)
                        .addComponent(money)
                        .addComponent(executive)
                        .addComponent(phone)
                        .addComponent(email)
                        .addComponent(president)
                        .addComponent(name))
                    .addGroup(addClubPanelLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(returnBtn)))
                .addGroup(addClubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addClubPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(addClubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputPresident, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputExecutive, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputMoney, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addGap(117, 117, 117))
                    .addGroup(addClubPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(saveBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        addClubPanelLayout.setVerticalGroup(
            addClubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addClubPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(addClubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(addClubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(president)
                    .addComponent(inputPresident, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(addClubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(addClubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone)
                    .addComponent(inputPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(addClubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(executive)
                    .addComponent(inputExecutive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(addClubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(money)
                    .addComponent(inputMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(addClubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date)
                    .addComponent(inputDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addClubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveBtn)
                    .addComponent(returnBtn))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addClubPanel5.setBackground(new java.awt.Color(36, 47, 65));

        clubLabel.setFont(new java.awt.Font("PT Sans", 0, 16)); // NOI18N
        clubLabel.setForeground(new java.awt.Color(255, 255, 255));
        clubLabel.setText("Club Name");

        presidentLabel.setFont(new java.awt.Font("PT Sans", 0, 16)); // NOI18N
        presidentLabel.setForeground(new java.awt.Color(255, 255, 255));
        presidentLabel.setText("Club President");

        emailLabel.setFont(new java.awt.Font("PT Sans", 0, 16)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Club Email");

        phoneLabel.setFont(new java.awt.Font("PT Sans", 0, 16)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneLabel.setText("Club Phone Number");

        executivesLabel.setFont(new java.awt.Font("PT Sans", 0, 16)); // NOI18N
        executivesLabel.setForeground(new java.awt.Color(255, 255, 255));
        executivesLabel.setText("Number of Executives");

        moneyLabel.setFont(new java.awt.Font("PT Sans", 0, 16)); // NOI18N
        moneyLabel.setForeground(new java.awt.Color(255, 255, 255));
        moneyLabel.setText("Money Given");

        clubTxt1.setFont(new java.awt.Font("PT Sans", 0, 16)); // NOI18N
        clubTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubTxt1ActionPerformed(evt);
            }
        });

        presidentTxt1.setFont(new java.awt.Font("PT Sans", 0, 16)); // NOI18N

        emailTxt1.setFont(new java.awt.Font("PT Sans", 0, 16)); // NOI18N

        phoneTxt1.setFont(new java.awt.Font("PT Sans", 0, 16)); // NOI18N
        phoneTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxt1ActionPerformed(evt);
            }
        });

        executivesTxt1.setFont(new java.awt.Font("PT Sans", 0, 16)); // NOI18N

        moneyTxt1.setFont(new java.awt.Font("PT Sans", 0, 16)); // NOI18N

        saveBtn5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        saveBtn5.setText("Save");
        saveBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtn5ActionPerformed(evt);
            }
        });

        returnBtn5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        returnBtn5.setText("Return");
        returnBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtn5ActionPerformed(evt);
            }
        });

        dateLabel.setFont(new java.awt.Font("PT Sans", 0, 16)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setText("Date");

        jLabel1.setFont(new java.awt.Font("PT Sans", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit Club");

        javax.swing.GroupLayout addClubPanel5Layout = new javax.swing.GroupLayout(addClubPanel5);
        addClubPanel5.setLayout(addClubPanel5Layout);
        addClubPanel5Layout.setHorizontalGroup(
            addClubPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addClubPanel5Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(addClubPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(presidentLabel)
                    .addComponent(clubLabel)
                    .addComponent(emailLabel)
                    .addComponent(phoneLabel)
                    .addComponent(executivesLabel)
                    .addComponent(moneyLabel)
                    .addComponent(dateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(addClubPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(presidentTxt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clubTxt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTxt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTxt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(executivesTxt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moneyTxt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
            .addGroup(addClubPanel5Layout.createSequentialGroup()
                .addGroup(addClubPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addClubPanel5Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(returnBtn5)
                        .addGap(48, 48, 48)
                        .addComponent(saveBtn5))
                    .addGroup(addClubPanel5Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addClubPanel5Layout.setVerticalGroup(
            addClubPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addClubPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(addClubPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clubLabel)
                    .addComponent(clubTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(addClubPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(presidentLabel)
                    .addComponent(presidentTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(addClubPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(addClubPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLabel))
                .addGap(32, 32, 32)
                .addGroup(addClubPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(executivesTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(executivesLabel))
                .addGap(37, 37, 37)
                .addGroup(addClubPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moneyTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moneyLabel))
                .addGap(39, 39, 39)
                .addGroup(addClubPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(addClubPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnBtn5)
                    .addComponent(saveBtn5))
                .addGap(29, 29, 29))
        );

        getContentPane().add(addClubPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 640, 640));

        jPanel2.setBackground(new java.awt.Color(97, 212, 195));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internalassessment/rsz_rsz_icon_process-improvement_600_600colo-255-255-255-0_1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internalassessment/rsz_11photo.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 640));

        setSize(new java.awt.Dimension(900, 662));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
   
    }//GEN-LAST:event_saveBtnActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnBtnActionPerformed

    private void returnBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtn5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        fourth.setVisible(true);
    }//GEN-LAST:event_returnBtn5ActionPerformed

    private void saveBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtn5ActionPerformed
        // TODO add your handling code here:        
        String name = clubTxt1.getText();
        String president = presidentTxt1.getText();
        String email = emailTxt1.getText();
        String phone = phoneTxt1.getText();
        String executive = executivesTxt1.getText();
        Date date = dateChooser.getDate();
        String money = moneyTxt1.getText();
        double doubleMoney = Double.parseDouble(money);

        Club edit = new Club(name,president,email,phone,executive,date,money);
        account.changeCurrentAmt(doubleMoney);
        Club [] clubs = account.getClub();
        account.changeClub(edit, changed);
        dateChooser.setDate(null);
        this.setVisible(false);
        first.setVisible(true);
    }//GEN-LAST:event_saveBtn5ActionPerformed

    private void phoneTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxt1ActionPerformed

    private void clubTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clubTxt1ActionPerformed
    
    public void display(HomePage p, EditClub z, Club c, SAC s, int e) {
        first = p;
        fourth = z;
        account = s;
        changed = e;
        clubTxt1.setText(c.getName());
        presidentTxt1.setText(c.getPresident());
        emailTxt1.setText(c.getEmail());
        phoneTxt1.setText(c.getPhone());
        executivesTxt1.setText(c.getExecutive());
        String tempamount = c.getMoney();
        oldAmount = Double.parseDouble(tempamount);
        s.addCurrentAmt(oldAmount);
        moneyTxt1.setText(tempamount);  
        dateChooser.setDate(c.getDate());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addClubPanel;
    private javax.swing.JPanel addClubPanel5;
    private javax.swing.JLabel clubLabel;
    private javax.swing.JTextField clubTxt1;
    private javax.swing.JLabel date;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTxt1;
    private javax.swing.JLabel executive;
    private javax.swing.JLabel executivesLabel;
    private javax.swing.JTextField executivesTxt1;
    private javax.swing.JTextField inputDate;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputExecutive;
    private javax.swing.JTextField inputMoney;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputPhone;
    private javax.swing.JTextField inputPresident;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel money;
    private javax.swing.JLabel moneyLabel;
    private javax.swing.JTextField moneyTxt1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTxt1;
    private javax.swing.JLabel president;
    private javax.swing.JLabel presidentLabel;
    private javax.swing.JTextField presidentTxt1;
    private javax.swing.JButton returnBtn;
    private javax.swing.JButton returnBtn5;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton saveBtn5;
    // End of variables declaration//GEN-END:variables
}
