package DijkstraGame;


import java.awt.Component;
import javax.swing.JOptionPane;

public class Challenge extends javax.swing.JFrame {
    static String answer = "";
    static String given;
    String answerKumo = "";
    String answerWendigo = "";
    String answerKumoTreats = "";
    String answerHint = "";
    public boolean isPresent;
    
    public Challenge(String who) {
        initComponents();
        if (who.equals("KT")){
                whoLabel.setText("Input correct answer to get Kumo's Treats");
                GraphChallenge gc3 = new GraphChallenge();
                gc3.testExcute();
                answerKumoTreats = gc3.getAnswer();
                given = problem.getText();
                problem.setText(given+gc3.frm);
                given = problem2.getText();
                problem2.setText(given+gc3.to);
                problemGiven.setText(gc3.given);
                answerKumo = gc3.getAnswer();
                answer = answerKumoTreats;
                System.out.print(answerKumoTreats);
        }
        if (who.equals("K")){
                GraphChallenge gc1 = new GraphChallenge();
                gc1.testExcute();
                whoLabel.setText("Input correct answer to save Kumo");
                answerKumo = gc1.getAnswer();
                given = problem.getText();
                problem.setText(given+gc1.frm);
                given = problem2.getText();
                problem2.setText(given+gc1.to);
                problemGiven.setText(gc1.given);
                answerKumo = gc1.getAnswer();
                answer = answerKumo;
                System.out.print(answerKumo);
        }
        if (who.equals("W")){
                whoLabel.setText("Input correct answer to get save Wendigo");
                GraphChallenge gc2 = new GraphChallenge();
                gc2.testExcute();
                answerWendigo = gc2.getAnswer();
                given = problem.getText();
                problem.setText(given+gc2.frm);
                given = problem2.getText();
                problem2.setText(given+gc2.to);
                problemGiven.setText(gc2.given);
                answerKumo = gc2.getAnswer();
                answer = answerWendigo;
                System.out.print(answerWendigo);
        }
//        {
//                whoLabel.setText("Input correct answer to get a Hint");
//                GraphChallenge gc4 = new GraphChallenge();
//                gc4.testExcute();
//                answerHint = gc4.getAnswer();
//                given = problem.getText();
//                problem.setText(given+gc4.frm);
//                given = problem2.getText();
//                problem2.setText(given+gc4.to);
//                problemGiven.setText(gc4.given);
//                answerKumo = gc4.getAnswer();
//                answer = answerHint;
//                System.out.print(answerHint);
//            }
        
    }

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tryAnswer = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        problem = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        problemGiven = new javax.swing.JTextArea();
        wrongAnswer = new javax.swing.JLabel();
        problem1 = new javax.swing.JLabel();
        problem2 = new javax.swing.JLabel();
        whoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tryAnswer.setColumns(20);
        tryAnswer.setRows(5);
        jScrollPane1.setViewportView(tryAnswer);

        jButton1.setText("Answer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Input answers example:");

        jLabel2.setText("Node_5");

        jLabel3.setText("Node_6");

        jLabel4.setText("Node_7");

        problem.setText("Get the shortest path from Node_");

        problemGiven.setColumns(20);
        problemGiven.setRows(5);
        jScrollPane3.setViewportView(problemGiven);

        problem1.setText("Input answer here:");

        problem2.setText("to Node_");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(whoLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(problem)
                                .addGap(18, 18, 18)
                                .addComponent(problem2))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(wrongAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)
                                            .addGap(49, 49, 49))
                                        .addComponent(jScrollPane1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(problem1)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(whoLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(problem1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wrongAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(problem)
                            .addComponent(problem2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tryAnswer.getText().equals(answer.trim())){
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Correct!.");
            isPresent = true;
            dispose();
        }else{
            
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Wrong Answer, Try Again.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

//    public static void main(String args[]) {
//        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Challenge().setVisible(true);
//            }
//        });
//        
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JLabel problem;
    private javax.swing.JLabel problem1;
    public static javax.swing.JLabel problem2;
    public javax.swing.JTextArea problemGiven;
    private javax.swing.JTextArea tryAnswer;
    private javax.swing.JLabel whoLabel;
    private javax.swing.JLabel wrongAnswer;
    // End of variables declaration//GEN-END:variables
}
