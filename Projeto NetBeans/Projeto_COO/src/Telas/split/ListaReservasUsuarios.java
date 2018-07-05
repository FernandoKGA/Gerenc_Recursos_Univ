package Telas.split;

import bancodados.Log;
import java.awt.Component;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import negocio.*;
import objetos.*;

public class ListaReservasUsuarios extends javax.swing.JPanel {

    private final Background back;

    public ListaReservasUsuarios(Background back) {
        this.back = back;
        initComponents();
    }
    
    public void habilitaVisibilidadeTelaListaResvUsr(){
        this.setVisible(true);
        Component[] array = this.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    public void desabilitaVisibilidadeTelaListaResvUsr(){
        this.setVisible(false);
        Component[] array = this.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelNomeTelaListResvUsr = new javax.swing.JLabel();
        LabelUsuarioListResvUsr = new javax.swing.JLabel();
        BotaoRetFromTelaListResvUsr = new javax.swing.JButton();
        BotaoBusca_ListResvUsr = new javax.swing.JButton();
        ScrolListaResvUsr = new javax.swing.JScrollPane();
        TabelaListaReserUsr = new javax.swing.JTable();
        TF_NUSP_ListResvUsr = new javax.swing.JTextField();

        LabelNomeTelaListResvUsr.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelNomeTelaListResvUsr.setForeground(new java.awt.Color(250, 0, 0));
        LabelNomeTelaListResvUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNomeTelaListResvUsr.setText("LISTA DE RESERVAS DO USUÁRIO");

        LabelUsuarioListResvUsr.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        LabelUsuarioListResvUsr.setText("Usuário:");

        BotaoRetFromTelaListResvUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromTelaListResvUsr.setText("Voltar");
        BotaoRetFromTelaListResvUsr.setMaximumSize(new java.awt.Dimension(113, 27));
        BotaoRetFromTelaListResvUsr.setMinimumSize(new java.awt.Dimension(113, 27));
        BotaoRetFromTelaListResvUsr.setPreferredSize(new java.awt.Dimension(113, 27));
        BotaoRetFromTelaListResvUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromTelaListResvUsrActionPerformed(evt);
            }
        });

        BotaoBusca_ListResvUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoBusca_ListResvUsr.setText("Buscar");
        BotaoBusca_ListResvUsr.setMaximumSize(new java.awt.Dimension(113, 27));
        BotaoBusca_ListResvUsr.setMinimumSize(new java.awt.Dimension(113, 27));
        BotaoBusca_ListResvUsr.setPreferredSize(new java.awt.Dimension(113, 27));
        BotaoBusca_ListResvUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBusca_ListResvUsrActionPerformed(evt);
            }
        });

        TabelaListaReserUsr.setModel(new javax.swing.table.DefaultTableModel(
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
        ScrolListaResvUsr.setViewportView(TabelaListaReserUsr);

        TF_NUSP_ListResvUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NUSP_ListResvUsrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelNomeTelaListResvUsr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ScrolListaResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelUsuarioListResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_NUSP_ListResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoBusca_ListResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoRetFromTelaListResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelNomeTelaListResvUsr)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelUsuarioListResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoBusca_ListResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_NUSP_ListResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)))
                .addGap(11, 11, 11)
                .addComponent(ScrolListaResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoRetFromTelaListResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoRetFromTelaListResvUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromTelaListResvUsrActionPerformed
        back.desabilitaTelaListaReservasUsuarios();
        back.habilitaTelaListaSelecao();
    }//GEN-LAST:event_BotaoRetFromTelaListResvUsrActionPerformed

    private void BotaoBusca_ListResvUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBusca_ListResvUsrActionPerformed
        try {
            //Tenta criar uma List baseado no nUSP
            RegrasNegocio r = new RegrasNegocio();
            String nUSP = TF_NUSP_ListResvUsr.getText();
            if (back.valida.verificaNUSP(nUSP)) {
                List<Reserva> lista = r.listaReservasDoUsuario(TF_NUSP_ListResvUsr.getText());
                DefaultTableModel model = (DefaultTableModel) TabelaListaReserUsr.getModel();
                //equivalente a clearTable();
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                for (Reserva res : lista) {
                    String horarios = res.getHoraInicio() + "~" + res.getHoraFim();
                    Recurso rec = res.getRecurso();
                    model.addRow(new Object[]{res.getData(), rec.getPredio(), rec.getTipo(), rec.getNome(), horarios});
                }
            }
        } catch (RegrasNegocioException ex) {
            Log.gravaLog(ex);
        }
    }//GEN-LAST:event_BotaoBusca_ListResvUsrActionPerformed

    private void TF_NUSP_ListResvUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NUSP_ListResvUsrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_NUSP_ListResvUsrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBusca_ListResvUsr;
    private javax.swing.JButton BotaoRetFromTelaListResvUsr;
    private javax.swing.JLabel LabelNomeTelaListResvUsr;
    private javax.swing.JLabel LabelUsuarioListResvUsr;
    private javax.swing.JScrollPane ScrolListaResvUsr;
    private javax.swing.JTextField TF_NUSP_ListResvUsr;
    private javax.swing.JTable TabelaListaReserUsr;
    // End of variables declaration//GEN-END:variables
}
