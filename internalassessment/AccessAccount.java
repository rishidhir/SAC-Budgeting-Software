/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalassessment; 
/**
 *
 * @author rishidhir
 */
public class AccessAccount extends javax.swing.JFrame {
    
    private HomePage first; 
    private Club listClub[] = new Club[150];
    private String ammount;
    private Club club; 
    /**
     * Creates new form AccessAccount
     */
    public AccessAccount() {
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

        accessAccountPanel = new javax.swing.JPanel();
        returnBtn = new javax.swing.JButton();
        text1 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        initialAmtBtn = new javax.swing.JButton();
        currentAmtBtn = new javax.swing.JButton();
        accessAccountTxt = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accessAccountPanel.setBackground(new java.awt.Color(36, 47, 65));

        returnBtn.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N
        returnBtn.setText("Return ");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        text1.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        text1.setToolTipText("");
        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });

        text2.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N

        initialAmtBtn.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        initialAmtBtn.setText("Initial Amount");
        initialAmtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initialAmtBtnActionPerformed(evt);
            }
        });

        currentAmtBtn.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        currentAmtBtn.setText("Current Amount");
        currentAmtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentAmtBtnActionPerformed(evt);
            }
        });

        accessAccountTxt.setFont(new java.awt.Font("PT Sans", 1, 48)); // NOI18N
        accessAccountTxt.setForeground(new java.awt.Color(255, 255, 255));
        accessAccountTxt.setText("Access Account");

        javax.swing.GroupLayout accessAccountPanelLayout = new javax.swing.GroupLayout(accessAccountPanel);
        accessAccountPanel.setLayout(accessAccountPanelLayout);
        accessAccountPanelLayout.setHorizontalGroup(
            accessAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accessAccountPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(accessAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accessAccountPanelLayout.createSequentialGroup()
                        .addComponent(accessAccountTxt)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accessAccountPanelLayout.createSequentialGroup()
                        .addComponent(returnBtn)
                        .addGap(267, 267, 267))))
            .addGroup(accessAccountPanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(accessAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(initialAmtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentAmtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
                .addGroup(accessAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        accessAccountPanelLayout.setVerticalGroup(
            accessAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accessAccountPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(accessAccountTxt)
                .addGap(120, 120, 120)
                .addGroup(accessAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(initialAmtBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(text1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(accessAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentAmtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125)
                .addComponent(returnBtn)
                .addGap(40, 40, 40))
        );

        getContentPane().add(accessAccountPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 640, 640));

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internalassessment/rsz_rsz_icon_process-improvement_600_600colo-255-255-255-0_1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internalassessment/rsz_11photo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 640));

        setSize(new java.awt.Dimension(900, 660));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
        text1.setText(null);
        text2.setText(null);
        setVisible(false);
        first.setVisible(true);
    }//GEN-LAST:event_returnBtnActionPerformed
 
    private void initialAmtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initialAmtBtnActionPerformed
        // TODO add your handling code here:
        text1.setText("$20000.00");
    }//GEN-LAST:event_initialAmtBtnActionPerformed

    private void currentAmtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentAmtBtnActionPerformed
        // TODO add your handling code here:
        text2.setText("$" + ammount +"0");
        
    }//GEN-LAST:event_currentAmtBtnActionPerformed

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed
    public void getCurrentAmt(HomePage h, SAC s, Club m) {
        first = h;  
        this.setVisible(true);
        double amt = s.getCurrentAmt();
        String amt2 = Double.toString(amt);
        ammount = amt2;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accessAccountPanel;
    private javax.swing.JLabel accessAccountTxt;
    private javax.swing.JButton currentAmtBtn;
    private javax.swing.JButton initialAmtBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton returnBtn;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    // End of variables declaration//GEN-END:variables
}
