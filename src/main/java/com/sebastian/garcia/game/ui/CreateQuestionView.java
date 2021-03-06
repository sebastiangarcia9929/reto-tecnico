package com.sebastian.garcia.game.ui;

import com.sebastian.garcia.game.controller.AppController;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;


public class CreateQuestionView extends javax.swing.JFrame {
   
    public CreateQuestionView() {
        initComponents();
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        category.setModel(dcm);
        AppController.getInstance().getCategoriesNames().forEach(caterory -> dcm.addElement(caterory));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        wrongAnswer3 = new javax.swing.JTextField();
        wrongAnswer2 = new javax.swing.JTextField();
        wrongAnswer1 = new javax.swing.JTextField();
        correctAnswer = new javax.swing.JTextField();
        settingQuestion = new javax.swing.JTextField();
        groupQuestion = new javax.swing.JLabel();
        category = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);

        save.setBackground(new java.awt.Color(153, 255, 255));
        save.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        save.setForeground(java.awt.Color.black);
        save.setText("Guardar");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        wrongAnswer3.setBackground(new java.awt.Color(204, 204, 204));
        wrongAnswer3.setForeground(new java.awt.Color(0, 0, 0));
        wrongAnswer3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "respuesta incorrecta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        wrongAnswer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrongAnswer3ActionPerformed(evt);
            }
        });

        wrongAnswer2.setBackground(new java.awt.Color(204, 204, 204));
        wrongAnswer2.setForeground(new java.awt.Color(0, 0, 0));
        wrongAnswer2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "respuesta incorrecta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        wrongAnswer1.setBackground(new java.awt.Color(204, 204, 204));
        wrongAnswer1.setForeground(new java.awt.Color(0, 0, 0));
        wrongAnswer1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "respuesta incorrecta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        correctAnswer.setBackground(new java.awt.Color(204, 204, 204));
        correctAnswer.setForeground(new java.awt.Color(0, 0, 0));
        correctAnswer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "respuesta correcta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        correctAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctAnswerActionPerformed(evt);
            }
        });

        settingQuestion.setBackground(new java.awt.Color(204, 204, 204));
        settingQuestion.setForeground(new java.awt.Color(0, 0, 0));
        settingQuestion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preguntas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        settingQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingQuestionActionPerformed(evt);
            }
        });

        groupQuestion.setBackground(new java.awt.Color(0, 0, 0));
        groupQuestion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        groupQuestion.setForeground(new java.awt.Color(0, 0, 0));
        groupQuestion.setText("Grupo de respuestas");

        category.setBackground(new java.awt.Color(153, 255, 255));
        category.setForeground(java.awt.Color.black);
        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CATEGORIAS", " ", "NIVEL 1", "NIVEL 2", "NIVEL 3", "NIVEL 4", "NIVEL 5" }));
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(correctAnswer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addComponent(settingQuestion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wrongAnswer1)
                    .addComponent(wrongAnswer2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wrongAnswer3, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(groupQuestion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(settingQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(groupQuestion)
                .addGap(18, 18, 18)
                .addComponent(correctAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wrongAnswer1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wrongAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(wrongAnswer3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        AppController.getInstance().createQuestion(category.getSelectedIndex(), settingQuestion.getText(), Arrays.asList(correctAnswer.getText(), wrongAnswer1.getText(), wrongAnswer2.getText(), wrongAnswer3.getText()));
        this.setVisible(false);
    }//GEN-LAST:event_saveActionPerformed

    private void settingQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settingQuestionActionPerformed

    private void correctAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correctAnswerActionPerformed

    private void wrongAnswer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrongAnswer3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wrongAnswer3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel CreateQuestionView code (optional) ">
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
            java.util.logging.Logger.getLogger(CreateQuestionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateQuestionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateQuestionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateQuestionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new CreateQuestionView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> category;
    private javax.swing.JTextField correctAnswer;
    private javax.swing.JLabel groupQuestion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton save;
    private javax.swing.JTextField settingQuestion;
    private javax.swing.JTextField wrongAnswer1;
    private javax.swing.JTextField wrongAnswer2;
    private javax.swing.JTextField wrongAnswer3;
    // End of variables declaration//GEN-END:variables
}
