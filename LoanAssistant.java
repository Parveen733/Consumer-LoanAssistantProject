/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loanassistant;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Parveen Yadav
 */
public class LoanAssistant extends javax.swing.JFrame {

    boolean computePayment;

    public LoanAssistant() {

        initComponents();
        jTextArea1.setEditable(false);
        jTextArea1.setFocusable(false);
        //monthButton.setVisible(false);
        //analysisButton.setEnabled(false);
        //monthsTextField.setBackground(Color.YELLOW);
        //monthsTextField.setEditable(false);
        //monthsTextField.setFocusable(false);
        monthButton.doClick();

    }

    private boolean validDecimalNumber(JTextField tf) {
// checks to see if text field contains
// valid decimal number with only digits and a single decimal point
        String s = tf.getText().trim();
        boolean hasDecimal = false;
        boolean valid = true;
        if (s.length() == 0) {
            valid = false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= '0' && c <= '9') {
                    continue;
                } else if (c == '.' && !hasDecimal) {
                    hasDecimal = true;
                } else {
// invalid character found

                    valid = false;
                }
            }
        }
        tf.setText(s);
        if (!valid) {
            tf.requestFocus();
        }
        return (valid);

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BalanceTextField = new javax.swing.JTextField();
        InterestTextField = new javax.swing.JTextField();
        paymentTextField = new javax.swing.JTextField();
        monthsTextField = new javax.swing.JTextField();
        PaymentButton = new javax.swing.JButton();
        monthButton = new javax.swing.JButton();
        computeButton = new javax.swing.JButton();
        analysisButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LoanAssistant");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Loan Balance");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Interest Rate");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Number Of Payment");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Monthly Payment");

        BalanceTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BalanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceTextFieldActionPerformed(evt);
            }
        });

        InterestTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        InterestTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterestTextFieldActionPerformed(evt);
            }
        });

        paymentTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        paymentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentTextFieldActionPerformed(evt);
            }
        });

        monthsTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        monthsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthsTextFieldActionPerformed(evt);
            }
        });

        PaymentButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PaymentButton.setText("X");
        PaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentButtonActionPerformed(evt);
            }
        });

        monthButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        monthButton.setText("X");
        monthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthButtonActionPerformed(evt);
            }
        });

        computeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        computeButton.setText("Compute Monthly Payment");
        computeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeButtonActionPerformed(evt);
            }
        });

        analysisButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        analysisButton.setText("New Loan Analysis");
        analysisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analysisButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Loan Analysis");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setPreferredSize(null);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(BalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(52, 52, 52)
                                        .addComponent(InterestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(5, 5, 5)
                                        .addComponent(paymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(PaymentButton))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(monthsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(monthButton))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(computeButton))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(analysisButton)))
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(BalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(InterestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(paymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PaymentButton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(monthsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(monthButton))
                        .addGap(26, 26, 26)
                        .addComponent(computeButton)
                        .addGap(11, 11, 11)
                        .addComponent(analysisButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void analysisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analysisButtonActionPerformed
        BalanceTextField.setText("");
        InterestTextField.setText("");
        paymentTextField.setText("");
        monthsTextField.setText("");
        jTextArea1.setText("");
        analysisButton.setEnabled(false);
        computeButton.setEnabled(true);
    }//GEN-LAST:event_analysisButtonActionPerformed

    private void PaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentButtonActionPerformed
        // will compute montlyPayment
        computePayment = false;
        PaymentButton.setVisible(false);
        monthButton.setVisible(true);
        monthsTextField.setEditable(true);
        monthsTextField.setBackground(Color.WHITE);
        monthsTextField.setFocusable(true);
        paymentTextField.setText("");
        paymentTextField.setEditable(false);
        paymentTextField.setBackground(Color.yellow);
        paymentTextField.setFocusable(false);
        computeButton.setText("Compute Number of Payments");
        BalanceTextField.requestFocus();
    }//GEN-LAST:event_PaymentButtonActionPerformed

    private void monthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthButtonActionPerformed
        // will compute No_Of_Payment
        computePayment = true;
        PaymentButton.setVisible(true);
        monthButton.setVisible(false);
        monthsTextField.setText("");
        monthsTextField.setEditable(false);
        monthsTextField.setBackground(Color.yellow);
        monthsTextField.setFocusable(false);
        paymentTextField.setEditable(true);
        paymentTextField.setBackground(Color.WHITE);
        paymentTextField.setFocusable(true);

        computeButton.setText("Compute Monthly Payment");
        BalanceTextField.requestFocus();
    }//GEN-LAST:event_monthButtonActionPerformed

    private void computeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeButtonActionPerformed
        double balance, interest, montlyPayment;
        int No_Of_Payment;
        double monthlyInterest, multiplier;
        double loanBalance, finalPayment;
        if (validDecimalNumber(BalanceTextField)) {
            balance = Double.valueOf(BalanceTextField.getText()).doubleValue();

        } else {
            JOptionPane.showConfirmDialog(null, "Invalid or empty Loan Balance entry.\nPlease correct.", "Balance Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (validDecimalNumber(InterestTextField)) {
            interest = Double.valueOf(InterestTextField.getText()).doubleValue();
        } else {
            JOptionPane.showConfirmDialog(null, "Invalid or empty Interest rate entry.\nPlease correct.", "Interest Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        monthlyInterest = interest / 1200;
        if (computePayment) {
// Compute loan montlyPayment

            if (validDecimalNumber(paymentTextField)) {
                No_Of_Payment = Integer.valueOf(paymentTextField.getText()).intValue();
            } else {
                if (paymentTextField.isFocusable()) {
                    JOptionPane.showConfirmDialog(null, "Invalid or empty Number of Payments entry.\nPlease correct.", "Number of Payments Input Error",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                }
                return;
            }
            if (interest == 0) {
                montlyPayment = balance / No_Of_Payment;
            } else {
                multiplier = Math.pow(1 + monthlyInterest, No_Of_Payment);
                montlyPayment = balance * monthlyInterest * multiplier / (multiplier - 1);
            }
            monthsTextField.setText(new DecimalFormat("0.00").format(montlyPayment));
        } 
        else {
            // Compute number of payments
            if (validDecimalNumber(monthsTextField)) {
                montlyPayment = Double.valueOf(monthsTextField.getText()).doubleValue();
                if (montlyPayment <= (balance * monthlyInterest + 1.0)) {
                    if (JOptionPane.showConfirmDialog(null, "Minimum payment must be Rs"
                            + new DecimalFormat("0.00").format((int) (balance * monthlyInterest + 1.0)) + "\n" + "Do you want to use the minimum payment?", "Input Error", JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                        monthsTextField.setText(new DecimalFormat("0.00").format((int) (balance
                                * monthlyInterest + 1.0)));
                        montlyPayment = Double.valueOf(monthsTextField.getText()).doubleValue();
                    }
                    else {
                        monthsTextField.requestFocus();
                        return;
                    }
                }
            } else {
                if (monthsTextField.isFocusable()) {
                    JOptionPane.showConfirmDialog(null, "Invalid or empty Monthly Payment entry.\nPlease correct.", "Payment Input Error", JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE);
                }
                return;
            }
            if (interest == 0) {
                No_Of_Payment = (int) (balance / montlyPayment);
            } else {
                No_Of_Payment = (int) ((Math.log(montlyPayment) - Math.log(montlyPayment - balance * monthlyInterest))
                        / Math.log(1 + monthlyInterest));
            }
            paymentTextField.setText(String.valueOf(No_Of_Payment));
        }

        montlyPayment
                = Double.valueOf(monthsTextField.getText()).doubleValue();

        jTextArea1.setText("Loan Balance: Rs" + new DecimalFormat("0.00").format(balance));
        jTextArea1.append("\n" + "Interest Rate: " + new DecimalFormat("0.00").format(interest) + "%");

        loanBalance = balance;
        for (int paymentNumber = 1; paymentNumber <= No_Of_Payment - 1; paymentNumber++) {
            loanBalance += loanBalance * monthlyInterest - montlyPayment;
        }

        finalPayment = loanBalance;
        if (finalPayment > montlyPayment) {

            loanBalance += loanBalance * monthlyInterest - montlyPayment;
            finalPayment = loanBalance;
            No_Of_Payment++;
            paymentTextField.setText(String.valueOf(No_Of_Payment));
        }
        jTextArea1.append("\n\n" + String.valueOf(No_Of_Payment - 1) + " Payments of Rs" + new DecimalFormat("0.00").format(montlyPayment));
        jTextArea1.append("\n" + "Final Payment of: Rs" + new DecimalFormat("0.00").format(finalPayment));
        jTextArea1.append("\n" + "Total Payments: Rs" + new DecimalFormat("0.00").format((No_Of_Payment - 1) * montlyPayment + finalPayment));
        jTextArea1.append("\n" + "Interest Paid Rs" + new DecimalFormat("0.00").format((No_Of_Payment - 1) * montlyPayment + finalPayment - balance));
        computeButton.setEnabled(false);
        analysisButton.setEnabled(true);
        analysisButton.requestFocus();
    }//GEN-LAST:event_computeButtonActionPerformed

    private void BalanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceTextFieldActionPerformed
        BalanceTextField.transferFocus();
    }//GEN-LAST:event_BalanceTextFieldActionPerformed

    private void InterestTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterestTextFieldActionPerformed
        InterestTextField.transferFocus();
    }//GEN-LAST:event_InterestTextFieldActionPerformed

    private void paymentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentTextFieldActionPerformed
        paymentTextField.transferFocus();
    }//GEN-LAST:event_paymentTextFieldActionPerformed

    private void monthsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthsTextFieldActionPerformed
        monthsTextField.transferFocus();
    }//GEN-LAST:event_monthsTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanAssistant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BalanceTextField;
    private javax.swing.JTextField InterestTextField;
    private javax.swing.JButton PaymentButton;
    private javax.swing.JButton analysisButton;
    private javax.swing.JButton computeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton monthButton;
    private javax.swing.JTextField monthsTextField;
    private javax.swing.JTextField paymentTextField;
    // End of variables declaration//GEN-END:variables
}
