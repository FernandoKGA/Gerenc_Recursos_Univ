package Telas.split;

import java.awt.Component;
import javax.swing.JOptionPane;
import negocio.*;
import objetos.*;
import bancodados.Log;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import javax.swing.JRadioButton;

public class CadastraReserva extends AbstractJPanel {

    private final Background back;
    
    public CadastraReserva(Background back) {
        this.back = back;
        initComponents();
    }

    public void desabilitaComponentesCadResv(){
        Component[] array = this.getComponents();
        limpaCampos_CadReserva();
        TF_NUSPCadResv.setEnabled(false);
        LabelUsuarioCadResv.setEnabled(false);
        BotaoCadastraReserva.setEnabled(false);
        CBTipoCadResv.setEnabled(false);
        LabelTipoCadResv.setEnabled(false);
        CBNomeCadResv.setEnabled(false);
        LabelNomeCadResv.setEnabled(false);
        for (Component cp : array){
            if(cp instanceof JRadioButton){
                cp.setEnabled(false);
            }
        }
    }
    
    private void limpaCampos_CadReserva(){
        TF_NUSPCadResv.setText("");
        FTF_DataCadResv.setText("");
        CBPredioCadResv.setSelectedIndex(0);
        CBTipoCadResv.setSelectedIndex(0);
        CBNomeCadResv.setSelectedIndex(0);
    }

    public void desabilitaRadioButtonCadResv(){
        Component[] array = this.getComponents();
        TF_NUSPCadResv.setEnabled(false);
        LabelUsuarioCadResv.setEnabled(false);
        BotaoCadastraReserva.setEnabled(false);
        for (Component cp : array){
            if (cp instanceof JRadioButton){
                cp.setEnabled(false);
            }
        }
    }
    
    public void habilitaRadioButtonCadResv(){
        Component[] array = this.getComponents();
        TF_NUSPCadResv.setEnabled(true);
        LabelUsuarioCadResv.setEnabled(true);
        BotaoCadastraReserva.setEnabled(true);
        for (Component cp : array){
            if (cp instanceof JRadioButton){
                cp.setEnabled(true);
            }
        }
    }
            
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTelaCadResv = new javax.swing.JLabel();
        LabelDataCadResv = new javax.swing.JLabel();
        LabelPredioCadResv = new javax.swing.JLabel();
        LabelTipoCadResv = new javax.swing.JLabel();
        LabelNomeCadResv = new javax.swing.JLabel();
        LabelUsuarioCadResv = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        SeparadorCadResv = new javax.swing.JSeparator();
        CBPredioCadResv = new javax.swing.JComboBox<>();
        CBTipoCadResv = new javax.swing.JComboBox<>();
        CBNomeCadResv = new javax.swing.JComboBox<>();
        BotaoRetFromTelaCadResv = new javax.swing.JButton();
        BotaoCadastraReserva = new javax.swing.JButton();
        FTF_DataCadResv = new javax.swing.JFormattedTextField();
        TF_NUSPCadResv = new javax.swing.JTextField();

        LabelTelaCadResv.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelTelaCadResv.setForeground(new java.awt.Color(250, 0, 0));
        LabelTelaCadResv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTelaCadResv.setText("CADASTRO DE RESERVA");

        LabelDataCadResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelDataCadResv.setText("Data:");

        LabelPredioCadResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelPredioCadResv.setText("Prédio:");

        LabelTipoCadResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelTipoCadResv.setText("Tipo:");

        LabelNomeCadResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelNomeCadResv.setText("Nome:");

        LabelUsuarioCadResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelUsuarioCadResv.setText("Usuário:");

        jRadioButton1.setText("08:00 - 09:00");
        jRadioButton1.setName("jRadioButton1"); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("09:00 - 10:00");
        jRadioButton2.setName("jRadioButton2"); // NOI18N
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("10:00 - 11:00");
        jRadioButton3.setName("jRadioButton3"); // NOI18N
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("11:00 - 12:00");
        jRadioButton4.setName("jRadioButton4"); // NOI18N
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("12:00 - 13:00");
        jRadioButton5.setName("jRadioButton5"); // NOI18N

        jRadioButton6.setText("13:00 - 14:00");
        jRadioButton6.setName("jRadioButton6"); // NOI18N

        jRadioButton7.setText("14:00 - 15:00");
        jRadioButton7.setName("jRadioButton7"); // NOI18N

        jRadioButton8.setText("15:00 - 16:00");
        jRadioButton8.setName("jRadioButton8"); // NOI18N

        jRadioButton9.setText("16:00 - 17:00");
        jRadioButton9.setName("jRadioButton9"); // NOI18N

        jRadioButton10.setText("17:00 - 18:00");
        jRadioButton10.setName("jRadioButton10"); // NOI18N

        jRadioButton11.setText("18:00 - 19:00");
        jRadioButton11.setName("jRadioButton11"); // NOI18N

        jRadioButton12.setText("19:00 - 20:00");
        jRadioButton12.setName("jRadioButton12"); // NOI18N
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        jRadioButton13.setText("20:00 - 21:00");
        jRadioButton13.setName("jRadioButton13"); // NOI18N

        jRadioButton14.setText("21:00 - 22:00");
        jRadioButton14.setName("jRadioButton14"); // NOI18N

        SeparadorCadResv.setOrientation(javax.swing.SwingConstants.VERTICAL);

        CBPredioCadResv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "I1", "I3", "I5", "A2", "A3", "CB", "INCUB" }));
        CBPredioCadResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPredioCadResvActionPerformed(evt);
            }
        });

        CBTipoCadResv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Sala", "Laboratório", "Auditório" }));
        CBTipoCadResv.setPreferredSize(new java.awt.Dimension(70, 20));
        CBTipoCadResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTipoCadResvActionPerformed(evt);
            }
        });

        CBNomeCadResv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        CBNomeCadResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBNomeCadResvActionPerformed(evt);
            }
        });

        BotaoRetFromTelaCadResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromTelaCadResv.setText("Voltar");
        BotaoRetFromTelaCadResv.setMaximumSize(new java.awt.Dimension(104, 27));
        BotaoRetFromTelaCadResv.setMinimumSize(new java.awt.Dimension(104, 27));
        BotaoRetFromTelaCadResv.setPreferredSize(new java.awt.Dimension(104, 27));
        BotaoRetFromTelaCadResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromTelaCadResvActionPerformed(evt);
            }
        });

        BotaoCadastraReserva.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoCadastraReserva.setText("Cadastrar");
        BotaoCadastraReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastraReservaActionPerformed(evt);
            }
        });

        try {
            FTF_DataCadResv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FTF_DataCadResv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FTF_DataCadResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTF_DataCadResvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBPredioCadResv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBTipoCadResv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBNomeCadResv, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelNomeCadResv)
                                    .addComponent(LabelTipoCadResv)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelDataCadResv)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FTF_DataCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LabelPredioCadResv))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SeparadorCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jRadioButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jRadioButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jRadioButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton9)
                                    .addComponent(jRadioButton10)
                                    .addComponent(jRadioButton8)
                                    .addComponent(jRadioButton11)
                                    .addComponent(jRadioButton12)
                                    .addComponent(jRadioButton13)
                                    .addComponent(jRadioButton14)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelUsuarioCadResv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TF_NUSPCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoRetFromTelaCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoCadastraReserva)))
                .addGap(18, 18, 18))
            .addComponent(LabelTelaCadResv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelTelaCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelDataCadResv)
                            .addComponent(FTF_DataCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelPredioCadResv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBPredioCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelTipoCadResv)
                        .addGap(3, 3, 3)
                        .addComponent(CBTipoCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelNomeCadResv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBNomeCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelUsuarioCadResv)
                            .addComponent(TF_NUSPCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton14)))
                    .addComponent(SeparadorCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoRetFromTelaCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCadastraReserva))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jRadioButton1ActionPerformed()");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jRadioButton10ActionPerformed()");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void CBPredioCadResvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPredioCadResvActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jComboBox1ActionPerformed()");
        String tipo = CBPredioCadResv.getSelectedItem().toString();
        System.out.println(tipo);
        //Se eh SELECIONE, deixa os outros desativados
        if ((tipo.equalsIgnoreCase("SELECIONE"))) {
            LabelTipoCadResv.setEnabled(false);
            CBTipoCadResv.setEnabled(false);
            LabelNomeCadResv.setEnabled(false);
            CBNomeCadResv.setEnabled(false);

        } else {
            LabelTipoCadResv.setEnabled(true);
            CBTipoCadResv.setEnabled(true);
        }
    }//GEN-LAST:event_CBPredioCadResvActionPerformed

    private void CBTipoCadResvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTipoCadResvActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jComboBox2ActionPerformed()");
        String predio = CBPredioCadResv.getSelectedItem().toString();
        String tipo = CBTipoCadResv.getSelectedItem().toString();
        System.out.println(tipo);
        if ((tipo.equalsIgnoreCase("SELECIONE"))) {
            LabelNomeCadResv.setEnabled(false);
            CBNomeCadResv.setEnabled(false);
            LabelPredioCadResv.setEnabled(true);
            CBPredioCadResv.setEnabled(true);
            //Gambis
            desabilitaComponentesCadResv();
            LabelTipoCadResv.setEnabled(true);
            CBTipoCadResv.setEnabled(true);
        } else {
            LabelNomeCadResv.setEnabled(true);
            CBNomeCadResv.setEnabled(true);
            LabelPredioCadResv.setEnabled(false);
            CBPredioCadResv.setEnabled(false);
            try {
                RegrasNegocio r = new RegrasNegocio();
                List<Recurso> lista = r.listaRecursos(predio, tipo);
                String slc = CBNomeCadResv.getItemAt(0);

                if (lista.isEmpty()) {
                    LabelNomeCadResv.setEnabled(false);
                    CBNomeCadResv.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Não há"
                        + " recursos com esses parâmetros.");
                    for (int i = 1; i < CBNomeCadResv.getItemCount(); i++) {
                        CBNomeCadResv.removeItemAt(i);
                    }
                } else {
                    if (CBNomeCadResv.getItemCount() == 1) {
                        for (Recurso rec : lista) {
                            CBNomeCadResv.addItem(rec.getNome());
                        }
                    } else {
                        for (int i = 1; i <= CBNomeCadResv.getItemCount(); i++) {
                            CBNomeCadResv.removeItemAt(i);
                        }
                        for (Recurso rec : lista) {
                            CBNomeCadResv.addItem(rec.getNome());
                        }
                    }
                }
            } catch (RegrasNegocioException e) {
                Log.gravaLog(e);
            }
        }
    }//GEN-LAST:event_CBTipoCadResvActionPerformed

    private void CBNomeCadResvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBNomeCadResvActionPerformed
        // ComboBox Nome Cadastro Reserva
        System.out.println("Telas.Telas.jComboBox3ActionPerformed()");
        String tipo = CBNomeCadResv.getSelectedItem().toString();
        if ((tipo.equalsIgnoreCase("SELECIONE"))) {
            desabilitaRadioButtonCadResv();
        } else {
            habilitaRadioButtonCadResv();
        }
    }//GEN-LAST:event_CBNomeCadResvActionPerformed

    private void BotaoRetFromTelaCadResvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromTelaCadResvActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoRetFromTelaCadastraReserva");
        back.habilitaTelaSelecaoCadastro();
        back.desabilitaTelaCadastraReserva();
    }//GEN-LAST:event_BotaoRetFromTelaCadResvActionPerformed

    private void BotaoCadastraReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastraReservaActionPerformed
        //Botao Cadastra Reserva
        String data_ftf = FTF_DataCadResv.getText();
        String predio = CBPredioCadResv.getSelectedItem().toString();
        String tipo = CBTipoCadResv.getSelectedItem().toString();
        String nome = CBNomeCadResv.getSelectedItem().toString();
        String nUSP = TF_NUSPCadResv.getText();
        //Recurso rec = (Recurso) CBNomeCadResv.getSelectedItem();
        Component[] array = this.getComponents();
        ArrayList<String> horarios = new ArrayList<>();
        for (Component cp : array) {
            if (cp instanceof JRadioButton) {
                if (((JRadioButton) cp).isSelected()) {
                    horarios.add(((JRadioButton) cp).getText());
                }
            }
        }
        
        if (!back.valida.taVazio(data_ftf)) {
            if (back.valida.verificaData(data_ftf)) {
                Date data_agora = new Date();
                String data_atual = (String) new SimpleDateFormat("dd/MM HH:mm").format(data_agora);
                if (back.valida.comparaDataAtual(data_atual, data_ftf)) {
                    String data_ftf_antique = data_ftf;
                    data_ftf = back.valida.transformaData(data_ftf);
                    if (back.valida.verificaNUSP(nUSP)) {
                        if (horarios.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Selecione um ou"
                                + " mais horários!");
                        } else {
                            System.out.println("data_atual "+data_atual);
                            System.out.println("data_ftf "+data_ftf);
                            System.out.println("data_ftf_antique "+data_ftf_antique);

                            try {
                                Recurso recurso = null;
                                RegrasNegocio r = new RegrasNegocio();
                                Usuario usuario = r.buscaUsuario(nUSP);
                                List<Recurso> lista = r.listaRecursos(predio, tipo);
                                for (Recurso rec : lista) {
                                    if (rec.getNome().equalsIgnoreCase(nome)) {
                                        /*
                                        Acha o recurso igual pelo nome pois
                                        nao tem como puxar do ComboBox de Tipo.
                                        */
                                        recurso = rec;
                                    }
                                }
                                if (usuario != null && recurso != null) {
                                    System.out.println(predio);
                                    System.out.println(tipo);
                                    System.out.println(nome);
                                    System.out.println(nUSP);
                                    if (r.cadastraReserva(horarios, data_ftf, recurso, usuario)) {
                                        JOptionPane.showMessageDialog(null, "Reserva "
                                            + "cadastrada com sucesso!");
                                    }
                                    
                                    limpaCampos_CadReserva();
                                    r.atualizaReservas();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Usuário não"
                                        + " encontrado!");
                                }
                            } catch (RegrasNegocioException e) {
                                Log.gravaLog(e);
                            }
                        }
                    }
                    //Verifica nUSP ja tem JOptions nele.
                } else {
                    JOptionPane.showMessageDialog(null, "Data anterior à de hoje!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Data não existe.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Data não foi inserida.");
        }

    }//GEN-LAST:event_BotaoCadastraReservaActionPerformed

    private void FTF_DataCadResvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTF_DataCadResvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FTF_DataCadResvActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastraReserva;
    private javax.swing.JButton BotaoRetFromTelaCadResv;
    private javax.swing.JComboBox<String> CBNomeCadResv;
    private javax.swing.JComboBox<String> CBPredioCadResv;
    private javax.swing.JComboBox<String> CBTipoCadResv;
    private javax.swing.JFormattedTextField FTF_DataCadResv;
    private javax.swing.JLabel LabelDataCadResv;
    private javax.swing.JLabel LabelNomeCadResv;
    private javax.swing.JLabel LabelPredioCadResv;
    private javax.swing.JLabel LabelTelaCadResv;
    private javax.swing.JLabel LabelTipoCadResv;
    private javax.swing.JLabel LabelUsuarioCadResv;
    private javax.swing.JSeparator SeparadorCadResv;
    private javax.swing.JTextField TF_NUSPCadResv;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
