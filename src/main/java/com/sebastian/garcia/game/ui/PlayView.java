package com.sebastian.garcia.game.ui;

import com.sebastian.garcia.game.controller.AppController;
import com.sebastian.garcia.game.model.Answer;
import java.util.List;

public class PlayView extends javax.swing.JFrame {

    public List<Answer> answers;
    public int answerSelected;
    
    public PlayView() {
        initComponents();
        answerSelected = 0;
        initDataView();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionRespuesta = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        toRetire = new javax.swing.JButton();
        valid = new javax.swing.JButton();
        accumScore = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        viewQuestion = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        viewCategory = new javax.swing.JLabel();
        category = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);

        toRetire.setBackground(new java.awt.Color(153, 255, 255));
        toRetire.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        toRetire.setForeground(new java.awt.Color(0, 0, 0));
        toRetire.setText("Retirarse");
        toRetire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toRetireActionPerformed(evt);
            }
        });

        valid.setBackground(new java.awt.Color(153, 255, 255));
        valid.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        valid.setForeground(java.awt.Color.black);
        valid.setText("Validar");
        valid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validActionPerformed(evt);
            }
        });

        accumScore.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        accumScore.setForeground(new java.awt.Color(0, 0, 0));
        accumScore.setText("Puntaje acumulado");

        score.setForeground(new java.awt.Color(0, 0, 0));

        opcionRespuesta.add(op1);
        op1.setForeground(new java.awt.Color(0, 0, 0));
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        opcionRespuesta.add(op2);
        op2.setForeground(new java.awt.Color(0, 0, 0));
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        opcionRespuesta.add(op3);
        op3.setForeground(new java.awt.Color(0, 0, 0));
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        opcionRespuesta.add(op4);
        op4.setForeground(new java.awt.Color(0, 0, 0));
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        viewQuestion.setForeground(new java.awt.Color(0, 0, 0));

        question.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        question.setForeground(new java.awt.Color(0, 0, 0));
        question.setText("Pregunta");

        viewCategory.setForeground(new java.awt.Color(0, 0, 0));

        category.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        category.setForeground(new java.awt.Color(0, 0, 0));
        category.setText("Categoria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(op3)
                                    .addComponent(op1))
                                .addGap(102, 102, 102)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(op4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(op2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(toRetire))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(viewQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(valid, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accumScore, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(category)
                    .addComponent(accumScore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewCategory)
                    .addComponent(score))
                .addGap(43, 43, 43)
                .addComponent(question)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(op1)
                            .addComponent(op2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(op3)
                            .addComponent(op4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(toRetire, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(177, 177, 177))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initDataView() {        
        int level = AppController.getInstance().getCurrentLevel();
        viewCategory.setText(AppController.getInstance().getCategoriesNames().get(level - 1));
        viewQuestion.setText(AppController.getInstance().getCurrentQuestionDescription());
        score.setText(String.valueOf(AppController.getInstance().getCurrentTotalScore()));
        
        answers = AppController.getInstance().getCurrentAnswers();
        op1.setText(answers.get(0).getDescription());
        op2.setText(answers.get(1).getDescription());
        op3.setText(answers.get(2).getDescription());
        op4.setText(answers.get(3).getDescription());
    }
    
    private void validActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validActionPerformed
        boolean isFinalRound = AppController.getInstance().isFinalRound();
        boolean isValid = AppController.getInstance().validAnswer(answers.get(answerSelected));
               
        if(isValid) {
            initDataView();
        }
        
        if(isFinalRound || !isValid) {
            this.setVisible(false);
            new EndGameView().setVisible(true);
        }
        
        opcionRespuesta.clearSelection();
    }//GEN-LAST:event_validActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        answerSelected = 2;
    }//GEN-LAST:event_op3ActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        answerSelected = 0;
    }//GEN-LAST:event_op1ActionPerformed

    private void toRetireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toRetireActionPerformed
        AppController.getInstance().leave();
        this.setVisible(false);
        new EndGameView().setVisible(true);
    }//GEN-LAST:event_toRetireActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        answerSelected = 1;
    }//GEN-LAST:event_op2ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        answerSelected = 3;
    }//GEN-LAST:event_op4ActionPerformed

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
            java.util.logging.Logger.getLogger(PlayView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accumScore;
    private javax.swing.JLabel category;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.ButtonGroup opcionRespuesta;
    private javax.swing.JLabel question;
    private javax.swing.JLabel score;
    private javax.swing.JButton toRetire;
    private javax.swing.JButton valid;
    private javax.swing.JLabel viewCategory;
    private javax.swing.JLabel viewQuestion;
    // End of variables declaration//GEN-END:variables
}
