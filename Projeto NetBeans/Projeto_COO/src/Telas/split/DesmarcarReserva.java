package Telas.split;

import bancodados.Log;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.*;
import objetos.*;

/**
 *
 * @author Denise
 */
public class DesmarcarReserva extends AbstractJPanel {

    private final Background back;
    
    /**
     * Creates new form DesmarcarReserva
     * @param back
     */
    public DesmarcarReserva(Background back) {
        this.back = back;
        initComponents();
    }

    public String getTF_NUSP_DesmResv(){
        return this.TF_NUSP_DesmResv.getText();
    }
    
    public void habilitaTabelaDesmResv(){
        TabelaDesmResv.setEnabled(true);
    }
    
    public void desabilitaTabelaDesmResv(){
        TabelaDesmResv.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogConfDesmResv = new javax.swing.JDialog();
        LabelDiagConfDesmResv = new javax.swing.JLabel();
        LabelSubDiagConfDesmResv = new javax.swing.JLabel();
        LabelDataDiagConfDesmResv = new javax.swing.JLabel();
        LabelData_BDDiagConfDesmResv = new javax.swing.JLabel();
        LabelTipoDiagConfDesmResv = new javax.swing.JLabel();
        LabelTipo_BDDiagConfDesmResv = new javax.swing.JLabel();
        LabelPredioDiagConfDesmResv = new javax.swing.JLabel();
        LabelPredio_BDDiagConfDesmResv = new javax.swing.JLabel();
        LabelRecDiagConfDesmResv = new javax.swing.JLabel();
        LabelRec_BDDiagConfDesmResv = new javax.swing.JLabel();
        LabelHoraDiagConfDesmResv = new javax.swing.JLabel();
        LabelHora_BDDiagConfDesmResv = new javax.swing.JLabel();
        BotaoDesmResv = new javax.swing.JButton();
        BotaoRetFromDiagConfDesmResv = new javax.swing.JButton();
        LabelNomeTelaDesmResv = new javax.swing.JLabel();
        LabelUsuarioTelaDesmResv = new javax.swing.JLabel();
        TF_NUSP_DesmResv = new javax.swing.JTextField();
        BotaoBusca_DesmResv = new javax.swing.JButton();
        ScrolDesmResv = new javax.swing.JScrollPane();
        TabelaDesmResv = new javax.swing.JTable();
        BotaoGoDiagConfResv = new javax.swing.JButton();
        BotaoRetFromDesmResv = new javax.swing.JButton();

        DialogConfDesmResv.setMinimumSize(new java.awt.Dimension(250, 300));

        LabelDiagConfDesmResv.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelDiagConfDesmResv.setForeground(new java.awt.Color(255, 0, 0));
        LabelDiagConfDesmResv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDiagConfDesmResv.setText("Confirmar Ação");

        LabelSubDiagConfDesmResv.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        LabelSubDiagConfDesmResv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSubDiagConfDesmResv.setText("Deseja desmarcar a reserva?");

        LabelDataDiagConfDesmResv.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LabelDataDiagConfDesmResv.setText("Data:");

        LabelData_BDDiagConfDesmResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelData_BDDiagConfDesmResv.setText("15/04");

        LabelTipoDiagConfDesmResv.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LabelTipoDiagConfDesmResv.setText("Tipo:");

        LabelTipo_BDDiagConfDesmResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelTipo_BDDiagConfDesmResv.setText("Sala");

        LabelPredioDiagConfDesmResv.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LabelPredioDiagConfDesmResv.setText("Prédio:");

        LabelPredio_BDDiagConfDesmResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelPredio_BDDiagConfDesmResv.setText("I1");

        LabelRecDiagConfDesmResv.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LabelRecDiagConfDesmResv.setText("Recurso:");

        LabelRec_BDDiagConfDesmResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelRec_BDDiagConfDesmResv.setText("219");

        LabelHoraDiagConfDesmResv.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LabelHoraDiagConfDesmResv.setText("Horário:");

        LabelHora_BDDiagConfDesmResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelHora_BDDiagConfDesmResv.setText("10:00 - 11:00");

        BotaoDesmResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoDesmResv.setText("Confirmar");
        BotaoDesmResv.setActionCommand("Sim");
        BotaoDesmResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDesmResvActionPerformed(evt);
            }
        });

        BotaoRetFromDiagConfDesmResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromDiagConfDesmResv.setText("Cancelar");
        BotaoRetFromDiagConfDesmResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromDiagConfDesmResvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogConfDesmResvLayout = new javax.swing.GroupLayout(DialogConfDesmResv.getContentPane());
        DialogConfDesmResv.getContentPane().setLayout(DialogConfDesmResvLayout);
        DialogConfDesmResvLayout.setHorizontalGroup(
            DialogConfDesmResvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelDiagConfDesmResv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabelSubDiagConfDesmResv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DialogConfDesmResvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogConfDesmResvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogConfDesmResvLayout.createSequentialGroup()
                        .addComponent(BotaoRetFromDiagConfDesmResv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(BotaoDesmResv))
                    .addGroup(DialogConfDesmResvLayout.createSequentialGroup()
                        .addComponent(LabelDataDiagConfDesmResv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelData_BDDiagConfDesmResv))
                    .addGroup(DialogConfDesmResvLayout.createSequentialGroup()
                        .addComponent(LabelTipoDiagConfDesmResv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelTipo_BDDiagConfDesmResv))
                    .addGroup(DialogConfDesmResvLayout.createSequentialGroup()
                        .addComponent(LabelPredioDiagConfDesmResv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelPredio_BDDiagConfDesmResv))
                    .addGroup(DialogConfDesmResvLayout.createSequentialGroup()
                        .addComponent(LabelRecDiagConfDesmResv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelRec_BDDiagConfDesmResv))
                    .addGroup(DialogConfDesmResvLayout.createSequentialGroup()
                        .addComponent(LabelHoraDiagConfDesmResv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelHora_BDDiagConfDesmResv)))
                .addContainerGap())
        );
        DialogConfDesmResvLayout.setVerticalGroup(
            DialogConfDesmResvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogConfDesmResvLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelDiagConfDesmResv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSubDiagConfDesmResv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DialogConfDesmResvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDataDiagConfDesmResv)
                    .addComponent(LabelData_BDDiagConfDesmResv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DialogConfDesmResvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTipoDiagConfDesmResv)
                    .addComponent(LabelTipo_BDDiagConfDesmResv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DialogConfDesmResvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPredioDiagConfDesmResv)
                    .addComponent(LabelPredio_BDDiagConfDesmResv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DialogConfDesmResvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelRecDiagConfDesmResv)
                    .addComponent(LabelRec_BDDiagConfDesmResv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DialogConfDesmResvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelHoraDiagConfDesmResv)
                    .addComponent(LabelHora_BDDiagConfDesmResv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(DialogConfDesmResvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoRetFromDiagConfDesmResv)
                    .addComponent(BotaoDesmResv))
                .addGap(11, 11, 11))
        );

        LabelNomeTelaDesmResv.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelNomeTelaDesmResv.setForeground(new java.awt.Color(250, 0, 0));
        LabelNomeTelaDesmResv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNomeTelaDesmResv.setText("DESMARCAR RESERVA");

        LabelUsuarioTelaDesmResv.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        LabelUsuarioTelaDesmResv.setText("Usuário:");

        TF_NUSP_DesmResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NUSP_DesmResvActionPerformed(evt);
            }
        });

        BotaoBusca_DesmResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoBusca_DesmResv.setText("Buscar");
        BotaoBusca_DesmResv.setMaximumSize(new java.awt.Dimension(113, 27));
        BotaoBusca_DesmResv.setMinimumSize(new java.awt.Dimension(113, 27));
        BotaoBusca_DesmResv.setPreferredSize(new java.awt.Dimension(113, 27));
        BotaoBusca_DesmResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBusca_DesmResvActionPerformed(evt);
            }
        });

        TabelaDesmResv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Predio", "Tipo", "Nome", "Horário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaDesmResv.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        ScrolDesmResv.setViewportView(TabelaDesmResv);

        BotaoGoDiagConfResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoDiagConfResv.setText("Desmarcar");
        BotaoGoDiagConfResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoDiagConfResvActionPerformed(evt);
            }
        });

        BotaoRetFromDesmResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromDesmResv.setText("Voltar");
        BotaoRetFromDesmResv.setMaximumSize(new java.awt.Dimension(113, 27));
        BotaoRetFromDesmResv.setMinimumSize(new java.awt.Dimension(113, 27));
        BotaoRetFromDesmResv.setPreferredSize(new java.awt.Dimension(113, 27));
        BotaoRetFromDesmResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromDesmResvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelNomeTelaDesmResv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ScrolDesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelUsuarioTelaDesmResv)
                                .addGap(18, 18, 18)
                                .addComponent(TF_NUSP_DesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(BotaoBusca_DesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 21, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoRetFromDesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoGoDiagConfResv)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LabelNomeTelaDesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUsuarioTelaDesmResv)
                    .addComponent(TF_NUSP_DesmResv)
                    .addComponent(BotaoBusca_DesmResv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(ScrolDesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoGoDiagConfResv)
                    .addComponent(BotaoRetFromDesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TF_NUSP_DesmResvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NUSP_DesmResvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_NUSP_DesmResvActionPerformed

    private void BotaoBusca_DesmResvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBusca_DesmResvActionPerformed
        // Botao Buscar Reservas do Usuario para excluir
        List<Reserva> listaReservas = null;
        try {
            RegrasNegocio r = new RegrasNegocio();
            //NAO USAR .getSelectedText()!!!!!!!
            String numeroUSP = TF_NUSP_DesmResv.getText();
            if (back.valida.verificaNUSP(numeroUSP)) {
                listaReservas = r.listaReservasDoUsuario(numeroUSP);
                DefaultTableModel model = (DefaultTableModel) TabelaDesmResv.getModel();
                int last_col = TabelaDesmResv.getColumnCount() - 1;
                //Dá espaco para os horarios aparecerem corretamente e nao precisarem ser editados
                TabelaDesmResv.getColumnModel().getColumn(last_col).setPreferredWidth(90);
                //equivalente a clearTable();
                model.setNumRows(0);
                for (Reserva res : listaReservas) {
                    String horarios = res.getHoraInicio() + " - " + res.getHoraFim();
                    Recurso rec = res.getRecurso();
                    model.addRow(new Object[]{res.getData(), rec.getPredio(), rec.getTipo(), rec.getNome(), horarios});
                }
            }
            r.atualizaReservas();
        } catch (RegrasNegocioException e) {
            Log.gravaLog(e);
        }
    }//GEN-LAST:event_BotaoBusca_DesmResvActionPerformed

    private void BotaoGoDiagConfResvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGoDiagConfResvActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jButton14ActionPerformed()");
        if (TabelaDesmResv.getSelectedRow() == (-1)) {
            JOptionPane.showMessageDialog(null, "Selecione uma reserva para "
                + "excluir.");
        } else {
            int row = TabelaDesmResv.getSelectedRow();
            Object data = TabelaDesmResv.getValueAt(row, 0);
            String data_show = (String) data;
            Object predio = TabelaDesmResv.getValueAt(row, 1);
            String predio_show = (String) predio;
            Object tipo = TabelaDesmResv.getValueAt(row, 2);
            String tipo_show = (String) tipo;
            Object recurso = TabelaDesmResv.getValueAt(row, 3);
            String recurso_show = (String) recurso;
            Object hora = TabelaDesmResv.getValueAt(row, 4);
            String hora_show = (String) hora;

            //Insercao na Dialog
            LabelData_BDDiagConfDesmResv.setText(data_show);
            LabelPredio_BDDiagConfDesmResv.setText(predio_show);
            LabelTipo_BDDiagConfDesmResv.setText(tipo_show);
            LabelRec_BDDiagConfDesmResv.setText(recurso_show);
            LabelHora_BDDiagConfDesmResv.setText(hora_show);

            TabelaDesmResv.setEnabled(false);
            DialogConfDesmResv.setVisible(true);
        }
    }//GEN-LAST:event_BotaoGoDiagConfResvActionPerformed

    private void BotaoRetFromDesmResvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromDesmResvActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoRetFromTelaDesmarcarReserva");
        back.habilitaTelaDescadastrarSelecao();
        back.desabilitaTelaDesmarcarReserva();
    }//GEN-LAST:event_BotaoRetFromDesmResvActionPerformed

    private void BotaoDesmResvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDesmResvActionPerformed
        // Botao que Confirma a desmarcação da reserva
        String data = LabelData_BDDiagConfDesmResv.getText();
        String predio = LabelPredio_BDDiagConfDesmResv.getText();
        String tipo = LabelTipo_BDDiagConfDesmResv.getText();
        String recurso_nome = LabelRec_BDDiagConfDesmResv.getText();
        //String LabelRec_BDDiagConfDesmResv.getText();
        String hora = LabelHora_BDDiagConfDesmResv.getText();
        try {
            RegrasNegocio r = new RegrasNegocio();
            String numeroUSP = getTF_NUSP_DesmResv();   //Nao deveria ter uma variavel que guardasse?
            List<Reserva> lista_reserva = r.listaReservasDoUsuario(numeroUSP);
            //Gambiarra para achar a reserva (como fazer isso melhor???)
            for (Reserva reserva : lista_reserva) {
                if ((data.equalsIgnoreCase(reserva.getData()))
                    && (predio.equalsIgnoreCase(reserva.getRecurso().getPredio()))
                    && (tipo.equalsIgnoreCase(reserva.getRecurso().getTipo()))
                    && (recurso_nome.equalsIgnoreCase(reserva.getRecurso().getNome()))
                    && (hora.substring(0, 5).equalsIgnoreCase(reserva.getHoraInicio()))
                    && (hora.substring(8, hora.length()).equalsIgnoreCase(reserva.getHoraFim()))
                    /*&& (numeroUSP.equalsIgnoreCase(reserva.getUsuario().getNUSP()))*/) {
                    Recurso rec = r.buscaRecurso(recurso_nome, predio, tipo);
                    reserva.getRecurso().setId_Recurso(rec.getId_Recurso());
                    System.out.println("Encontramos! é o de ID " + reserva.getRecurso().getId_Recurso());
                    r.excluirReserva(reserva);
                    JOptionPane.showMessageDialog(null,"Desmarcou com sucesso!");
                }
            }
            r.atualizaReservas();
            habilitaTabelaDesmResv();
            DialogConfDesmResv.setVisible(false);
        } catch (RegrasNegocioException e) {
            Log.gravaLog(e);
        }
    }//GEN-LAST:event_BotaoDesmResvActionPerformed

    private void BotaoRetFromDiagConfDesmResvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromDiagConfDesmResvActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jButton28ActionPerformed()");
        DialogConfDesmResv.setVisible(false);
    }//GEN-LAST:event_BotaoRetFromDiagConfDesmResvActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBusca_DesmResv;
    private javax.swing.JButton BotaoDesmResv;
    private javax.swing.JButton BotaoGoDiagConfResv;
    private javax.swing.JButton BotaoRetFromDesmResv;
    private javax.swing.JButton BotaoRetFromDiagConfDesmResv;
    private javax.swing.JDialog DialogConfDesmResv;
    private javax.swing.JLabel LabelDataDiagConfDesmResv;
    private javax.swing.JLabel LabelData_BDDiagConfDesmResv;
    private javax.swing.JLabel LabelDiagConfDesmResv;
    private javax.swing.JLabel LabelHoraDiagConfDesmResv;
    private javax.swing.JLabel LabelHora_BDDiagConfDesmResv;
    private javax.swing.JLabel LabelNomeTelaDesmResv;
    private javax.swing.JLabel LabelPredioDiagConfDesmResv;
    private javax.swing.JLabel LabelPredio_BDDiagConfDesmResv;
    private javax.swing.JLabel LabelRecDiagConfDesmResv;
    private javax.swing.JLabel LabelRec_BDDiagConfDesmResv;
    private javax.swing.JLabel LabelSubDiagConfDesmResv;
    private javax.swing.JLabel LabelTipoDiagConfDesmResv;
    private javax.swing.JLabel LabelTipo_BDDiagConfDesmResv;
    private javax.swing.JLabel LabelUsuarioTelaDesmResv;
    private javax.swing.JScrollPane ScrolDesmResv;
    private javax.swing.JTextField TF_NUSP_DesmResv;
    private javax.swing.JTable TabelaDesmResv;
    // End of variables declaration//GEN-END:variables
}
