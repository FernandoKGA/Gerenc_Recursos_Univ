/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.split;

import javax.swing.JOptionPane;
import negocio.*;
import objetos.*;
import bancodados.Log;
import java.awt.Component;
/**
 *
 * @author ferna
 */
public class DialogConfExcRec extends javax.swing.JDialog {

    /**
     * Creates new form DialogConfDesmRec
     * @param parent
     * @param modal
     */
    public DialogConfExcRec(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void habilitaVisibilidadeDialogConfExcRec(){
        this.setVisible(true);
    }
    
    public void desabilitaVisibilidadeDialogConfExcRec(){
        this.setVisible(false);
    }
    
    public String getLabelNome_BDDialogConfExcRec() {
        return LabelNome_BDDialogConfExcRec.getText();
    }

    public void setLabelNome_BDDialogConfExcRec(String LabelNome_BDDialogConfExcRec) {  //Colocar como string
        this.LabelNome_BDDialogConfExcRec.setText(LabelNome_BDDialogConfExcRec);
    }

    public String getLabelPredio_BDDialogConfExcRec() {
        return LabelPredio_BDDialogConfExcRec.getText();
    }

    public void setLabelPredio_BDDialogConfExcRec(String LabelPredio_BDDialogConfExcRec) {
        this.LabelPredio_BDDialogConfExcRec.setText(LabelPredio_BDDialogConfExcRec);
    }

    public String getLabelTipo_BDDialogConfExcRec() {
        return LabelTipo_BDDialogConfExcRec.getText();
    }

    public void setLabelTipo_BDDialogConfExcRec(String LabelTipo_BDDialogConfExcRec) {
        this.LabelTipo_BDDialogConfExcRec.setText(LabelTipo_BDDialogConfExcRec);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogConfExcRec = new javax.swing.JDialog();
        LabelDialogConfExcRec = new javax.swing.JLabel();
        LabelSubDialogConfExcRec = new javax.swing.JLabel();
        LabelPredioDialogConfExcRec = new javax.swing.JLabel();
        LabelPredio_BDDialogConfExcRec = new javax.swing.JLabel();
        LabelTipoDialogConfExcRec = new javax.swing.JLabel();
        LabelTipo_BDDialogConfExcRec = new javax.swing.JLabel();
        LabelNomeDialogConfExcRec = new javax.swing.JLabel();
        LabelNome_BDDialogConfExcRec = new javax.swing.JLabel();
        BotaoDescRec = new javax.swing.JButton();
        BotaoRetFromDiagConfExcRec = new javax.swing.JButton();

        DialogConfExcRec.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        DialogConfExcRec.setMinimumSize(new java.awt.Dimension(250, 250));

        LabelDialogConfExcRec.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelDialogConfExcRec.setForeground(new java.awt.Color(255, 0, 0));
        LabelDialogConfExcRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDialogConfExcRec.setText("Confirmar Ação");

        LabelSubDialogConfExcRec.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        LabelSubDialogConfExcRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSubDialogConfExcRec.setText("Deseja excluir este recurso?");

        LabelPredioDialogConfExcRec.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LabelPredioDialogConfExcRec.setText("Prédio:");

        LabelPredio_BDDialogConfExcRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelPredio_BDDialogConfExcRec.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelPredio_BDDialogConfExcRec.setText("I1");

        LabelTipoDialogConfExcRec.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LabelTipoDialogConfExcRec.setText("Tipo:");

        LabelTipo_BDDialogConfExcRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelTipo_BDDialogConfExcRec.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelTipo_BDDialogConfExcRec.setText("Sala");

        LabelNomeDialogConfExcRec.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LabelNomeDialogConfExcRec.setText("Nome:");

        LabelNome_BDDialogConfExcRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelNome_BDDialogConfExcRec.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelNome_BDDialogConfExcRec.setText("320");

        BotaoDescRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoDescRec.setText("Confirmar");
        BotaoDescRec.setActionCommand("Sim");
        BotaoDescRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDescRecActionPerformed(evt);
            }
        });

        BotaoRetFromDiagConfExcRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromDiagConfExcRec.setText("Cancelar");
        BotaoRetFromDiagConfExcRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromDiagConfExcRecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogConfExcRecLayout = new javax.swing.GroupLayout(DialogConfExcRec.getContentPane());
        DialogConfExcRec.getContentPane().setLayout(DialogConfExcRecLayout);
        DialogConfExcRecLayout.setHorizontalGroup(
            DialogConfExcRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelDialogConfExcRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabelSubDialogConfExcRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DialogConfExcRecLayout.createSequentialGroup()
                .addGroup(DialogConfExcRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogConfExcRecLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(BotaoRetFromDiagConfExcRec)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoDescRec))
                    .addGroup(DialogConfExcRecLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DialogConfExcRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelPredioDialogConfExcRec)
                            .addComponent(LabelNomeDialogConfExcRec))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DialogConfExcRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelPredio_BDDialogConfExcRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogConfExcRecLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(LabelNome_BDDialogConfExcRec, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(DialogConfExcRecLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelTipoDialogConfExcRec)
                        .addGap(61, 61, 61)
                        .addComponent(LabelTipo_BDDialogConfExcRec, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                .addContainerGap())
        );
        DialogConfExcRecLayout.setVerticalGroup(
            DialogConfExcRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogConfExcRecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelDialogConfExcRec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSubDialogConfExcRec)
                .addGap(9, 9, 9)
                .addGroup(DialogConfExcRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPredioDialogConfExcRec)
                    .addComponent(LabelPredio_BDDialogConfExcRec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(DialogConfExcRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTipoDialogConfExcRec)
                    .addComponent(LabelTipo_BDDialogConfExcRec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DialogConfExcRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNomeDialogConfExcRec)
                    .addComponent(LabelNome_BDDialogConfExcRec))
                .addGap(36, 36, 36)
                .addGroup(DialogConfExcRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoRetFromDiagConfExcRec)
                    .addComponent(BotaoDescRec))
                .addGap(14, 14, 14))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoDescRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDescRecActionPerformed
        // Botao Descadastra Recurso
        try {
            RegrasNegocio r = new RegrasNegocio();
            Recurso rec = new Recurso();
            rec.setNome(this.getLabelNome_BDDialogConfExcRec());
            rec.setPredio(this.getLabelPredio_BDDialogConfExcRec());
            rec.setTipo(this.getLabelTipo_BDDialogConfExcRec());
            r.excluirRecurso(rec);
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
            desabilitaVisibilidadeDialogConfExcRec();
        } catch (RegrasNegocioException e) {
            Log.gravaLog(e);
            JOptionPane.showMessageDialog(null, "Recurso não encontrado!");
        }
    }//GEN-LAST:event_BotaoDescRecActionPerformed

    private void BotaoRetFromDiagConfExcRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromDiagConfExcRecActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jButton31ActionPerformed()");
        habilitaVisibilidadeDialogConfExcRec();
    }//GEN-LAST:event_BotaoRetFromDiagConfExcRecActionPerformed

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
            java.util.logging.Logger.getLogger(DialogConfExcRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogConfExcRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogConfExcRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogConfExcRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogConfExcRec dialog = new DialogConfExcRec(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoDescRec;
    private javax.swing.JButton BotaoRetFromDiagConfExcRec;
    private javax.swing.JDialog DialogConfExcRec;
    private javax.swing.JLabel LabelDialogConfExcRec;
    private javax.swing.JLabel LabelNomeDialogConfExcRec;
    private javax.swing.JLabel LabelNome_BDDialogConfExcRec;
    private javax.swing.JLabel LabelPredioDialogConfExcRec;
    private javax.swing.JLabel LabelPredio_BDDialogConfExcRec;
    private javax.swing.JLabel LabelSubDialogConfExcRec;
    private javax.swing.JLabel LabelTipoDialogConfExcRec;
    private javax.swing.JLabel LabelTipo_BDDialogConfExcRec;
    // End of variables declaration//GEN-END:variables
}
