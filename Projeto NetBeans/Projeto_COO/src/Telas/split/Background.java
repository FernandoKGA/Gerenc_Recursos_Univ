package Telas.split;

import java.awt.Component;


public class Background extends javax.swing.JFrame {

    public Background() {
        initComponents();
    }
    
    CadastraReserva TelaCadastraReserva = new CadastraReserva();
    Menu TelaMenu = new Menu();
    CadastroRecurso TelaCadastroRecurso = new CadastroRecurso();
    CadastroUsuario TelaCadastroUsuario = new CadastroUsuario();
    DescadastrarRecurso TelaDescadastrarRecurso = new DescadastrarRecurso();
    DescadastrarSelecao TelaDescadastrarSelecao = new DescadastrarSelecao();
    DesmarcarReserva TelaDesmarcarReserva = new DesmarcarReserva();
    ListaSelecao TelaListaSelecao = new ListaSelecao();
    ListaReservasUsuarios TelaListaReservasUsuarios = new ListaReservasUsuarios();
    ListaUsuarios TelaListaUsuarios = new ListaUsuarios();
    ListaRecursos TelaListaRecursos = new ListaRecursos();
    RemoverUsuario TelaRemoverUsuario = new RemoverUsuario();
    SelecaoCadastro TelaSelecaoCadastro = new SelecaoCadastro();

     // - - - - - - - - - - - - - - - - - - - -
    // Tela Menu 
    public void desabilitaTelaMenu() {
        TelaMenu.setVisible(false);
        Component[] array = TelaMenu.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    public void habilitaTelaMenu() {
        TelaMenu.setVisible(true);
        Component[] array = TelaMenu.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Cadastra Reserva
    public void desabilitaTelaCadastraReserva() {
        TelaCadastraReserva.setVisible(false);
        Component[] array = TelaCadastraReserva.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    public void habilitaTelaCadastraReserva() {
        desabilitaComponentesCadResv();
        Component[] array = TelaCadastraReserva.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Cadastro Recurso
    public void desabilitaTelaCadastroRecurso() {
        TelaCadastroRecurso.setVisible(false);
        Component[] array = TelaCadastroRecurso.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    public void habilitaTelaCadastroRecurso() {
        TelaCadastroRecurso.setVisible(true);
        Component[] array = TelaCadastroRecurso.getComponents();
        CBCursoCadRec.setEnabled(false);
        LabelCursoCadRec.setEnabled(false);
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Cadastro Usuario
    public void desabilitaTelaCadastroUsuario() {
        TelaCadastroUsuario.setVisible(false);
        Component[] array = TelaCadastroUsuario.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    public void habilitaTelaCadastroUsuario() {
        TelaCadastroUsuario.setVisible(true);
        Component[] array = TelaCadastroUsuario.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Descadastrar Recurso
    public void desabilitaTelaDescadastrarRecurso() {
        TelaDescadastrarRecurso.setVisible(false);
        Component[] array = TelaDescadastrarRecurso.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    public void habilitaTelaDescadastrarRecurso() {
        TelaDescadastrarRecurso.setVisible(true);
        Component[] array = TelaDescadastrarRecurso.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Descadastrar Selecao
    public void desabilitaTelaDescadastrarSelecao() {
        TelaDescadastrarSelecao.setVisible(false);
        Component[] array = TelaDescadastrarSelecao.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    public void habilitaTelaDescadastrarSelecao() {
        TelaDescadastrarSelecao.setVisible(true);
        Component[] array = TelaDescadastrarSelecao.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Desmarcar Reserva
    public void desabilitaTelaDesmarcarReserva() {
        TelaDesmarcarReserva.setVisible(false);
        Component[] array = TelaDesmarcarReserva.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    public void habilitaTelaDesmarcarReserva() {
        TelaDesmarcarReserva.setVisible(true);
        Component[] array = TelaDesmarcarReserva.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Listagem
    public void desabilitaTelaListaSelecao() {
        TelaListaSelecao.setVisible(false);
        Component[] array = TelaListaSelecao.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    public void habilitaTelaListaSelecao() {
        TelaListaSelecao.setVisible(true);
        Component[] array = TelaListaSelecao.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Listagem Reservas por Usuario
    public void desabilitaTelaListaReservasUsuarios() {
        TelaListaReservasUsuarios.setVisible(false);
        Component[] array = TelaListaReservasUsuarios.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    public void habilitaTelaListaReservasUsuarios() {
        TelaListaReservasUsuarios.setVisible(true);
        Component[] array = TelaListaReservasUsuarios.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Listagem Usuarios
    public void desabilitaTelaListaUsuarios() {
        TelaListaUsuarios.setVisible(false);
        Component[] array = TelaListaUsuarios.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    public void habilitaTelaListaUsuarios() {
        TelaListaUsuarios.setVisible(true);
        Component[] array = TelaListaUsuarios.getComponents();
        listaUsuario(TabelaListaUsr);
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Listagem Recursos
    public void desabilitaTelaListaRecursos() {
        TelaListaRecursos.setVisible(false);
        Component[] array = TelaListaRecursos.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    public void habilitaTelaListaRecursos() {
        TelaListaRecursos.setVisible(true);
        Component[] array = TelaListaRecursos.getComponents();
        listaRecursos();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Remover Usuario
    public void desabilitaTelaRemoverUsuario() {
        TelaRemoverUsuario.setVisible(false);
        Component[] array = TelaRemoverUsuario.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    public void habilitaTelaRemoverUsuario() {
        TelaRemoverUsuario.setVisible(true);
        Component[] array = TelaRemoverUsuario.getComponents();
        listaUsuario(TabelaRemUsr);
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Selecao Cadastro
    public void desabilitaTelaSelecaoCadastro() {
        TelaSelecaoCadastro.setVisible(false);
        Component[] array = TelaSelecaoCadastro.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    public void habilitaTelaSelecaoCadastro() {
        TelaSelecaoCadastro.setVisible(true);
        //Temporário enquanto não existem as telas.
        TelaSelecaoCadastro.BotaoGoTelaCadPredio.setEnabled(false);
        BotaoGoTelaCadTipo.setEnabled(false);
        BotaoGoTelaCadCurso.setEnabled(false);
        Component[] array = TelaSelecaoCadastro.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    private void limpaCampos_CadUsuario() {
        TF_NomeCadUsr.setText("");
        TF_NUSPCadUsr.setText("");
        TF_EmailCadUsr.setText("");
        TF_TelfCadUsr.setText("");
        CBCursoCadUsr.setSelectedIndex(0);
        CBCargoCadUsr.setSelectedIndex(0);
    }

    private void limpaCampos_CadRecurso() {
        TF_NomeCadRec.setText("");
        CBTipoCadRec.setSelectedIndex(0);
        CBPredioCadRec.setSelectedIndex(0);
        CBCursoCadRec.setSelectedIndex(0);
    }

    private void limpaCampos_CadReserva() {
        TF_NUSPCadResv.setText("");
        FTF_DataCadResv.setText("");
        CBPredioCadResv.setSelectedIndex(0);
        CBTipoCadResv.setSelectedIndex(0);
        CBNomeCadResv.setSelectedIndex(0);
    }

    // - - - - - - - - - - - - - - - - - - - -
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
            java.util.logging.Logger.getLogger(Background.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Background.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Background.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Background.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Background().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
