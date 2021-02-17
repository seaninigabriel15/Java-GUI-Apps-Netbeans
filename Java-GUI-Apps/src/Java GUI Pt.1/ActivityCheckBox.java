/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity1;

import java.awt.Color;

/**
 *
 * @author PC20
 */
public class ActivityCheckBox extends javax.swing.JFrame {
String Cheese = "",pepperoni = "",ham="",pineapple="",bacon = "",mushroom="",olives="";
int chese,pepp,hamm,pine,baconn,mush,olivess,thick,thin,amount;  
    public ActivityCheckBox() {
        initComponents();
        jPanel1.setBackground(new Color(240,240,240,30));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheese = new javax.swing.JCheckBox();
        jPepperoni = new javax.swing.JCheckBox();
        jHam = new javax.swing.JCheckBox();
        jPineapple = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jProcess = new javax.swing.JButton();
        jThin = new javax.swing.JRadioButton();
        jThick = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jAmount = new javax.swing.JTextField();
        payment = new javax.swing.JTextField();
        jchange = new javax.swing.JTextField();
        jCompute = new javax.swing.JButton();
        jbacon = new javax.swing.JCheckBox();
        jmushroom = new javax.swing.JCheckBox();
        jolives = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SeaniniPizza");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Panel");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activity1/imgs/pizzaHD.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 70));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Clear");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 93, 32));

        jCheese.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheese.setText("CHEESE(5)");
        jCheese.setOpaque(false);
        jCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheeseActionPerformed(evt);
            }
        });
        getContentPane().add(jCheese, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jPepperoni.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPepperoni.setText("PEPPERONI(10)");
        jPepperoni.setOpaque(false);
        jPepperoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPepperoniActionPerformed(evt);
            }
        });
        getContentPane().add(jPepperoni, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, 26));

        jHam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jHam.setText("HAM(5)");
        jHam.setOpaque(false);
        jHam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHamActionPerformed(evt);
            }
        });
        getContentPane().add(jHam, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jPineapple.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPineapple.setText("PINEAPPLE(10)");
        jPineapple.setOpaque(false);
        jPineapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPineappleActionPerformed(evt);
            }
        });
        getContentPane().add(jPineapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tekton Pro Cond", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 420, 124));

        jProcess.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jProcess.setText("Process");
        jProcess.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProcessActionPerformed(evt);
            }
        });
        getContentPane().add(jProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 93, 33));

        jThin.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup3.add(jThin);
        jThin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jThin.setText("THIN CRUST(500)");
        jThin.setOpaque(false);
        jThin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jThinActionPerformed(evt);
            }
        });
        getContentPane().add(jThin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        buttonGroup3.add(jThick);
        jThick.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jThick.setText("THICK CRUST(550)");
        jThick.setOpaque(false);
        jThick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jThickActionPerformed(evt);
            }
        });
        getContentPane().add(jThick, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 26));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Amount:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Payment:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Change: ");

        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });

        jchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchangeActionPerformed(evt);
            }
        });

        jCompute.setText("Compute");
        jCompute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComputeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jAmount)
                            .addComponent(payment, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(jchange)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jCompute)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jchange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCompute)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, 240));

        jbacon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbacon.setText("BACON(5)");
        jbacon.setOpaque(false);
        jbacon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbaconActionPerformed(evt);
            }
        });
        getContentPane().add(jbacon, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jmushroom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jmushroom.setText("MUSHROOM(5)");
        jmushroom.setOpaque(false);
        jmushroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmushroomActionPerformed(evt);
            }
        });
        getContentPane().add(jmushroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        jolives.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jolives.setText("OLIVES(5)");
        jolives.setOpaque(false);
        jolives.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jolivesActionPerformed(evt);
            }
        });
        getContentPane().add(jolives, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 490, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activity1/imgs/pizzaBg2.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 540, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jHamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHamActionPerformed
if (jHam.isSelected()){
    ham = " Ham \n";
    hamm = 5;
}         // TODO add your handling code here:
    }//GEN-LAST:event_jHamActionPerformed

    private void jPineappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPineappleActionPerformed
if (jPineapple.isSelected()){
    pineapple = " Pineapple \n";
    pine= 5;
}         // TODO add your handling code here:
    }//GEN-LAST:event_jPineappleActionPerformed

    private void jThickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jThickActionPerformed
      if (jThick.isSelected()){
     thick = 550;
    }//GEN-LAST:event_jThickActionPerformed
    }
    private void jProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProcessActionPerformed
if (jThin.isSelected()){
    jTextField1.setText("You ordered Thin Crust with \n\n" + Cheese + pineapple + ham  +pepperoni +bacon+mushroom+olives);
   amount = thin + chese + pine+ hamm  +pepp +baconn +mush+olivess;
   String Amount=Integer.toString(amount);
   jAmount.setText(Amount);
}   else{
     jTextField1.setText("You ordered Thick Crust with \n\n" + Cheese + pineapple + ham + pepperoni +bacon+mushroom+olives);
     amount = thick + chese + pine+ hamm  +pepp +baconn +mush+olivess;
    
     String Amount=Integer.toString(amount);
     jAmount.setText(Amount);
} 
    }//GEN-LAST:event_jProcessActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
jThin.setSelected(false);
jThick.setSelected(false);
jCheese.setSelected(false);
jHam.setSelected(false); 
jPepperoni.setSelected(false);
jTextField1.setText("");
jPineapple.setSelected(false);
jbacon.setSelected(false);
jmushroom.setSelected(false);
jolives.setSelected(false);
jAmount.setText("");
payment.setText("");
jchange.setText("");


Cheese= "";
pineapple="";
ham="";
pepperoni="";
bacon ="";
mushroom="";
olives="";

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jThinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jThinActionPerformed
if (jThin.isSelected()){
    
    thin=500;

    }//GEN-LAST:event_jThinActionPerformed
    }
    private void jCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheeseActionPerformed
     if (jCheese.isSelected()){
    Cheese = " Cheese ";
    chese=5;
}   // TODO add your handling code here:
    }//GEN-LAST:event_jCheeseActionPerformed

    private void jPepperoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPepperoniActionPerformed
if (jPepperoni.isSelected()){
    pepperoni = " Pepperoni ";
    pepp=10;
}         // TODO add your handling code here:
    }//GEN-LAST:event_jPepperoniActionPerformed

    private void jchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jchangeActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentActionPerformed

    private void jolivesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jolivesActionPerformed
      if (jolives.isSelected()){
    olives = "olives ";
    olivess=5;
    }//GEN-LAST:event_jolivesActionPerformed
    }
    private void jmushroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmushroomActionPerformed
       if (jmushroom.isSelected()){
    mushroom = " mushroom ";
    mush=5;
    // TODO add your handling code here:
       }  
    }//GEN-LAST:event_jmushroomActionPerformed

    private void jbaconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbaconActionPerformed
    if (jbacon.isSelected()){
    bacon = "bacon"; 
    baconn=5;
// TODO add your handling code here:
    }//GEN-LAST:event_jbaconActionPerformed
    }
    private void jComputeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComputeActionPerformed
       String money,paid,change;
       int Money,Paid,Change;
       money= jAmount.getText();
       Money=Integer.parseInt(money);
       
       paid=payment.getText();
       Paid=Integer.parseInt(paid);
       
       Change= Paid-Money;
       change=Integer.toString(Change);
       jchange.setText(change);
      
    
    }//GEN-LAST:event_jComputeActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
MainPanel main = new MainPanel();
main.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ActivityCheckBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActivityCheckBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActivityCheckBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActivityCheckBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActivityCheckBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField jAmount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheese;
    private javax.swing.JButton jCompute;
    private javax.swing.JCheckBox jHam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox jPepperoni;
    private javax.swing.JCheckBox jPineapple;
    private javax.swing.JButton jProcess;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton jThick;
    private javax.swing.JRadioButton jThin;
    private javax.swing.JCheckBox jbacon;
    private javax.swing.JTextField jchange;
    private javax.swing.JCheckBox jmushroom;
    private javax.swing.JCheckBox jolives;
    private javax.swing.JTextField payment;
    // End of variables declaration//GEN-END:variables
}
