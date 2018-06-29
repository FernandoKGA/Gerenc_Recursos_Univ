/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.split;

/**
 *
 * @author Denise
 */
public class CadastroRecurso extends javax.swing.JPanel {

    /**
     * Creates new form CadastraRecurso
     */
    public CadastroRecurso() {
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

        LabelTelaCadRec = new javax.swing.JLabel();
        LabelNomeCadRec = new javax.swing.JLabel();
        LabelTipoCadRec = new javax.swing.JLabel();
        LabelPredioCadRec = new javax.swing.JLabel();
        LabelCursoCadRec = new javax.swing.JLabel();
        CBTipoCadRec = new javax.swing.JComboBox<>();
        CBPredioCadRec = new javax.swing.JComboBox<>();
        CBCursoCadRec = new javax.swing.JComboBox<>();
        BotaoRetFromTelaCadRec = new javax.swing.JButton();
        BotaoCadastraRecurso = new javax.swing.JButton();
        TF_NomeCadRec = new javax.swing.JTextField();

        LabelTelaCadRec.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelTelaCadRec.setForeground(new java.awt.Color(250, 0, 0));
        LabelTelaCadRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTelaCadRec.setText("CADASTRO DE RECURSO");

        LabelNomeCadRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelNomeCadRec.setText("Nome do Recurso");

        LabelTipoCadRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelTipoCadRec.setText("Tipo de Recurso");

        LabelPredioCadRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelPredioCadRec.setText("Identificador do Prédio");

        LabelCursoCadRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelCursoCadRec.setText("Espec. Curso");

        CBTipoCadRec.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CBTipoCadRec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Sala", "Laboratório", "Auditório" }));
        CBTipoCadRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTipoCadRecActionPerformed(evt);
            }
        });

        CBPredioCadRec.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CBPredioCadRec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "I1", "I3", "I5", "A2", "A3", "CB", "INCUB" }));
        CBPredioCadRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPredioCadRecActionPerformed(evt);
            }
        });

        CBCursoCadRec.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CBCursoCadRec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "BTC", "LCN", "EFS", "GER", "GA", "GPP", "LZT", "MKT", "OBS", "SI", "TM" }));
        CBCursoCadRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCursoCadRecActionPerformed(evt);
            }
        });

        BotaoRetFromTelaCadRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromTelaCadRec.setText("Cancelar");
        BotaoRetFromTelaCadRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromTelaCadRecActionPerformed(evt);
            }
        });

        BotaoCadastraRecurso.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoCadastraRecurso.setText("Cadastrar");
        BotaoCadastraRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastraRecursoActionPerformed(evt);
            }
        });

        TF_NomeCadRec.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TF_NomeCadRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NomeCadRecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelTelaCadRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoRetFromTelaCadRec)
                        .addGap(57, 57, 57))
                    .addComponent(LabelNomeCadRec, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTipoCadRec, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPredioCadRec, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCursoCadRec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(BotaoCadastraRecurso)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CBCursoCadRec, 0, 184, Short.MAX_VALUE)
                            .addComponent(CBTipoCadRec, javax.swing.GroupLayout.Alignment.LEADING, 0, 184, Short.MAX_VALUE)
                            .addComponent(CBPredioCadRec, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TF_NomeCadRec))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LabelTelaCadRec)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNomeCadRec)
                    .addComponent(TF_NomeCadRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTipoCadRec)
                    .addComponent(CBTipoCadRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPredioCadRec)
                    .addComponent(CBPredioCadRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCursoCadRec, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBCursoCadRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoRetFromTelaCadRec)
                    .addComponent(BotaoCadastraRecurso))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CBTipoCadRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTipoCadRecActionPerformed
        // Ativa ou desativa o ComboBox "curso" de acordo com o valor
        System.out.println("Telas.Telas.jComboBox4ActionPerformed()");
        String tipo = CBTipoCadRec.getSelectedItem().toString();
        System.out.println(tipo);
        if (!(tipo.equalsIgnoreCase("LABORATÓRIO"))) {
            LabelCursoCadRec.setEnabled(false);
            CBCursoCadRec.setEnabled(false);
        } else {
            LabelCursoCadRec.setEnabled(true);
            CBCursoCadRec.setEnabled(true);
        }
    }//GEN-LAST:event_CBTipoCadRecActionPerformed

    private void CBPredioCadRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPredioCadRecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBPredioCadRecActionPerformed

    private void CBCursoCadRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCursoCadRecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCursoCadRecActionPerformed

    private void BotaoRetFromTelaCadRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromTelaCadRecActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoRetFromTelaCadastroRecurso");
        habilitaTelaSelecaoCadastro();
        desabilitaTelaCadastroRecurso();
    }//GEN-LAST:event_BotaoRetFromTelaCadRecActionPerformed

    private void BotaoCadastraRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastraRecursoActionPerformed
        String nome = TF_NomeCadRec.getText();
        String tipo = CBTipoCadRec.getSelectedItem().toString();
        String predio = CBPredioCadRec.getSelectedItem().toString();
        String curso = null;
        if (CBCursoCadRec.isEnabled()) {
            curso = CBCursoCadRec.getSelectedItem().toString();
            System.out.println(curso);
        }
        try {
            RegrasNegocio r = new RegrasNegocio();
            if (!verificaTextoNumeros(nome)) {
                JOptionPane.showMessageDialog(null, "Nome contém caracteres inválidos!");
                return;
            }

            if (tipo.equalsIgnoreCase("SELECIONE")) {
                JOptionPane.showMessageDialog(null, "Selecione um tipo!");
                return;
            }

            if (predio.equalsIgnoreCase("SELECIONE")) {
                JOptionPane.showMessageDialog(null, "Selecione um prédio!");
                return;
            }

            if (curso == null) {
                r.cadastraRecurso(nome, tipo, predio);
                JOptionPane.showMessageDialog(null, "Cadastrou Recurso com sucesso!");
                limpaCampos_CadRecurso();
            } else {
                if (curso.equalsIgnoreCase("SELECIONE")) {
                    JOptionPane.showMessageDialog(null, "Selecione um curso!");
                    return;
                }
                r.cadastraLaboratorio(nome, tipo, predio, curso);
                JOptionPane.showMessageDialog(null, "Cadastrou Recurso com sucesso!");
                limpaCampos_CadRecurso();
            }
        } catch (RegrasNegocioException e) {
            Log.gravaLog(e);
        }
    }//GEN-LAST:event_BotaoCadastraRecursoActionPerformed

    private void TF_NomeCadRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NomeCadRecActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jTextField1ActionPerformed()");
    }//GEN-LAST:event_TF_NomeCadRecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastraRecurso;
    private javax.swing.JButton BotaoRetFromTelaCadRec;
    private javax.swing.JComboBox<String> CBCursoCadRec;
    private javax.swing.JComboBox<String> CBPredioCadRec;
    private javax.swing.JComboBox<String> CBTipoCadRec;
    private javax.swing.JLabel LabelCursoCadRec;
    private javax.swing.JLabel LabelNomeCadRec;
    private javax.swing.JLabel LabelPredioCadRec;
    private javax.swing.JLabel LabelTelaCadRec;
    private javax.swing.JLabel LabelTipoCadRec;
    private javax.swing.JTextField TF_NomeCadRec;
    // End of variables declaration//GEN-END:variables
}