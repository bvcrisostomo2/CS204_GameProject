package BridgeCrossing;

import java.awt.Component;
import javax.swing.JOptionPane;

public class BridgeCrossingGUI extends javax.swing.JFrame {
    boolean passed = false;
    boolean isIvarNo = true;
    boolean isKumoNo = true;
    boolean isKumoTNo = true;
    boolean isWendigoNo = true;
    boolean isIvarPass = false;
    boolean isKumoPass = false;
    boolean isKumoTPass = false;
    boolean isWendigoPass = false;
    Component frame = null;
    public boolean key;
    
    public BridgeCrossingGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ik = new javax.swing.JButton();
        iw = new javax.swing.JButton();
        it = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        i = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ivarNo = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        kumoNo = new javax.swing.JLabel();
        kumoTNo = new javax.swing.JLabel();
        wendigoNo = new javax.swing.JLabel();
        ivarPass = new javax.swing.JLabel();
        kumoPass = new javax.swing.JLabel();
        kumoTPass = new javax.swing.JLabel();
        wendigoPass = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        answer = new javax.swing.JTextArea();
        done = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ik.setText("Ivar and Kumo");
        ik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ikActionPerformed(evt);
            }
        });

        iw.setText("Ivar and Wendigo");
        iw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iwActionPerformed(evt);
            }
        });

        it.setText("Ivar and Kumo's Treats");
        it.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Bridge");

        i.setText("Ivar only");
        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });

        jLabel4.setText("The goal is to let them pass through the bridge without having Wendigo eat Kumo or Kumo eat his treats.");

        ivarNo.setText("Ivar");

        jButton5.setText("See Possible Moves");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        kumoNo.setText("Kumo");

        kumoTNo.setText("Kumo's Treats");

        wendigoNo.setText("Wendigo");

        answer.setColumns(20);
        answer.setRows(5);
        jScrollPane2.setViewportView(answer);

        done.setText("Done");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(ivarNo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(kumoTNo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(kumoNo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)
                                .addGap(47, 47, 47)
                                .addComponent(ivarPass, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(wendigoNo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kumoTPass, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kumoPass, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wendigoPass, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ik, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iw, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(it))))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iw)
                    .addComponent(ik))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(i)
                    .addComponent(it))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kumoTNo)
                            .addComponent(wendigoNo))
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ivarPass, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ivarNo)
                                .addComponent(kumoNo)
                                .addComponent(kumoPass, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(wendigoPass, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(kumoTPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(done))
                        .addGap(13, 13, 13)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ikActionPerformed
        if (passed==false){
            if (isIvarNo && isKumoNo){
                isIvarNo = false;
                isKumoNo = false;
                isIvarPass = true;
                isKumoPass = true;
                ivarNo.setText("");
                kumoNo.setText("");
                ivarPass.setText("Ivar");
                kumoPass.setText("Kumo");
                passed = true;
            }
        }else{
            if (isIvarPass && isKumoPass){
                isIvarNo = true;
                isKumoNo = true;
                isIvarPass = false;
                isKumoPass = false;
                ivarNo.setText("Ivar");
                kumoNo.setText("Kumo");
                ivarPass.setText("");
                kumoPass.setText("");
                passed = false;
            }
        }
    }//GEN-LAST:event_ikActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       BridgeCrossing bc = new BridgeCrossing();
       bc.printAnswer();
       answer.setText(bc.answer);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void iwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iwActionPerformed
        if (passed==false){
            if (isIvarNo && isWendigoNo){
                if ((!kumoNo.getText().equals("Kumo")  || !kumoTNo.getText().equals("Kumo's Treats")) ){
                    isIvarNo = false;
                    isWendigoNo = false;
                    isIvarPass = true;
                    isWendigoPass = true;
                    ivarNo.setText("");
                    wendigoNo.setText("");
                    ivarPass.setText("Ivar");
                    wendigoPass.setText("Wendigo");
                    passed = true;
                }else{
                    JOptionPane.showMessageDialog(frame, "Kumo will eat his treats");
                }
            }
        }else{
            if (isIvarPass && isWendigoPass){
                if ((!isKumoPass || !isKumoTPass)){
                    isIvarNo = true;
                    isKumoNo = true;
                    isIvarPass = false;
                    isWendigoPass = false;
                    ivarNo.setText("Ivar");
                    wendigoNo.setText("Wendigo");
                    ivarPass.setText("");
                    wendigoPass.setText("");
                    passed = false;
                }else{
                    JOptionPane.showMessageDialog(frame, "Kumo will eat his treats");
                }
            }
        }
    }//GEN-LAST:event_iwActionPerformed

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
        if (passed==false){
            if (isIvarNo){
                if ((!kumoNo.getText().equals("Kumo")  || !kumoTNo.getText().equals("Kumo's Treats")) && (!kumoNo.getText().equals("Kumo")  || !wendigoNo.getText().equals("Wendigo")) ){
                    isIvarNo = false;
                    isIvarPass = true;
                    ivarNo.setText("");
                    ivarPass.setText("Ivar");
                    passed = true;
                }else{
                    if (isKumoTNo){
                        JOptionPane.showMessageDialog(frame, "Kumo will eat his treats");
                    }else
                        JOptionPane.showMessageDialog(frame, "Wendigo will eat Kumo!");
                }
            }
        }else{
            if (isIvarPass){
                if ((!isKumoPass || !isKumoTPass) && (!isKumoPass || !isWendigoPass)){
                    isIvarNo = true;
                    isIvarPass = false;
                    ivarNo.setText("Ivar");
                    ivarPass.setText("");
                    passed = false;
                }else{
                    if (isKumoTPass){
                        JOptionPane.showMessageDialog(frame, "Kumo will eat his treats");
                    }else
                        JOptionPane.showMessageDialog(frame, "Wendigo will eat Kumo!");
                }
            }
        }
    }//GEN-LAST:event_iActionPerformed

    private void itActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itActionPerformed
        if (passed==false){
            if (isIvarNo){
                if ((!kumoNo.getText().equals("Kumo")  || !kumoTNo.getText().equals("Kumo's Treats")) || (!kumoNo.getText().equals("Kumo")  || !wendigoNo.getText().equals("Wendigo")) ){
                    isIvarNo = false;
                    isKumoTNo = false;
                    isIvarPass = true;
                    isKumoTPass = true;
                    ivarNo.setText("");
                    ivarPass.setText("Ivar");
                    kumoTNo.setText("");
                    kumoTPass.setText("Kumo's Treats");
                    passed = true;
                }else{
                    if (isKumoNo && isWendigoNo)
                        JOptionPane.showMessageDialog(frame, "Wendigo will eat Kumo");
                }
            }
        }else{
            if (isIvarPass){
                if ((!isKumoPass || !isKumoTPass) || (!isKumoPass || !isWendigoPass)){
                    isIvarNo = true;
                    isKumoTNo = true;
                    isIvarPass = false;
                    isKumoTPass = false;
                    ivarNo.setText("Ivar");
                    ivarPass.setText("");
                    kumoTNo.setText("Kumo's Treats");
                    kumoTPass.setText("");
                    passed = false;
                }else{
                    if (isKumoPass && isWendigoPass)
                        JOptionPane.showMessageDialog(frame, "Wendigo will eat Kumo!");
                    if (isKumoPass && isKumoTPass)
                        JOptionPane.showMessageDialog(frame, "Kumo will eat his treats");
                }
            }
        }
    }//GEN-LAST:event_itActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        if (isIvarPass && isKumoPass && isWendigoPass && isKumoTPass){
            JOptionPane.showMessageDialog(frame, "Correct!");
            key = true;
            dispose();
        }else{
            JOptionPane.showMessageDialog(frame, "Not yet complete!");
        }
    }//GEN-LAST:event_doneActionPerformed

   /*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BridgeCrossingGUI().setVisible(true);
            }
        });
    }
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea answer;
    private javax.swing.JButton done;
    private javax.swing.JButton i;
    private javax.swing.JButton ik;
    private javax.swing.JButton it;
    private javax.swing.JLabel ivarNo;
    private javax.swing.JLabel ivarPass;
    private javax.swing.JButton iw;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel kumoNo;
    private javax.swing.JLabel kumoPass;
    private javax.swing.JLabel kumoTNo;
    private javax.swing.JLabel kumoTPass;
    private javax.swing.JLabel wendigoNo;
    private javax.swing.JLabel wendigoPass;
    // End of variables declaration//GEN-END:variables
}
