/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalassessment;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author rishidhir
 */
public class ListTransactions extends javax.swing.JFrame {
    private HomePage first;
    private SAC account;
    

    /**
     * Creates new form ListTransactions
     */
    public ListTransactions() {
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

        jPanel1 = new javax.swing.JPanel();
        listTransactionsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTable();
        returnBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));

        listTransactionsLabel.setFont(new java.awt.Font("PT Sans", 1, 48)); // NOI18N
        listTransactionsLabel.setForeground(new java.awt.Color(255, 255, 255));
        listTransactionsLabel.setText("List Transactions");

        output.setAutoCreateRowSorter(true);
        output.setFont(new java.awt.Font("PT Sans", 0, 16)); // NOI18N
        output.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Club Name", "Amount", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(output);
        if (output.getColumnModel().getColumnCount() > 0) {
            output.getColumnModel().getColumn(0).setResizable(false);
            output.getColumnModel().getColumn(1).setResizable(false);
            output.getColumnModel().getColumn(2).setMinWidth(100);
            output.getColumnModel().getColumn(2).setPreferredWidth(100);
            output.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        returnBtn.setFont(new java.awt.Font("PT Sans", 0, 16)); // NOI18N
        returnBtn.setText("Return");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(returnBtn)
                        .addGap(275, 275, 275))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(listTransactionsLabel)
                        .addGap(149, 149, 149))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(listTransactionsLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(returnBtn)
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 650, 640));

        jPanel2.setBackground(new java.awt.Color(97, 212, 195));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internalassessment/rsz_rsz_icon_process-improvement_600_600colo-255-255-255-0_1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internalassessment/rsz_11photo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 640));

        setSize(new java.awt.Dimension(909, 661));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void listTransactions(SAC a, HomePage p) {
       account = a;
       first = p;
       int number = account.getCount();
       Club [] clubs = account.getClub();
       
       account.sortClub();
       
       if (number>0) {
            for (int i = 0;i<number;i++) {
                DefaultTableModel model = (DefaultTableModel) output.getModel();
                model.addRow(new Object[]{   
                clubs[i].getName(),
                 "$"+clubs[i].getMoney()+".00",
                clubs[i].getDate(),
            });
        }
    }
       else {
           DefaultTableModel model = (DefaultTableModel) output.getModel();
           model.setRowCount(0);
       }
    }    
    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) output.getModel();
        model.setRowCount(0);
        this.setVisible(false);
        first.setVisible(true);       
    }//GEN-LAST:event_returnBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listTransactionsLabel;
    private javax.swing.JTable output;
    private javax.swing.JButton returnBtn;
    // End of variables declaration//GEN-END:variables
}