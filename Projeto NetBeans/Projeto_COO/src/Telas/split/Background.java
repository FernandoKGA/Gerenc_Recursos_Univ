package Telas.split;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Background extends JFrame {
    
    private Container background;
    private final Dimension tamanhoJanela = new java.awt.Dimension(420,340);
    Validador valida = new Validador();

    public Background() {
        initComponents();
        iniciaTelas();
    }
    
    private void iniciaTelas() {
        
        //Opcoes do Container
        background = getContentPane();
        background.setPreferredSize(tamanhoJanela);
        background.setMaximumSize(tamanhoJanela);
        background.setMinimumSize(tamanhoJanela);
        background.setLayout(new java.awt.CardLayout());
        
        //Opcoes do JFrame
        this.setPreferredSize(tamanhoJanela);
        this.setMinimumSize(tamanhoJanela);
        this.setMaximumSize(tamanhoJanela);
        this.setResizable(false);
        this.setTitle("Dioniso");
        
        //Colocando as telas.
        background.add(TelaMenu);
        
        background.add(TelaSelecaoCadastro);
        background.add(TelaCadastroUsuario);
        background.add(TelaCadastroRecurso);
        background.add(TelaCadastraReserva);
        
        background.add(TelaListaSelecao);
        background.add(TelaListaUsuarios);
        background.add(TelaListaReservasUsuarios);
        background.add(TelaListaRecursos);
        
        background.add(TelaDescadastrarSelecao);
        background.add(TelaDescadastraUsuario);
        background.add(TelaDescadastrarRecurso);
        background.add(TelaDesmarcarReserva);
        
        habilitaTelaMenu();
        desabilitaTelaSelecaoCadastro();
        desabilitaTelaCadastraReserva();
        desabilitaTelaCadastroRecurso();
        desabilitaTelaCadastroUsuario();
        desabilitaTelaListaSelecao();
        desabilitaTelaListaRecursos();
        desabilitaTelaListaReservasUsuarios();
        desabilitaTelaListaUsuarios();
        desabilitaTelaDescadastrarRecurso();
        desabilitaTelaDescadastrarSelecao();
        desabilitaTelaDescadastrarUsuario();
        desabilitaTelaDesmarcarReserva();
    }
    
    //Menu
    Menu TelaMenu = new Menu(this);
    
    //Cadastro
    SelecaoCadastro TelaSelecaoCadastro = new SelecaoCadastro(this);
    CadastraReserva TelaCadastraReserva = new CadastraReserva(this);
    CadastroRecurso TelaCadastroRecurso = new CadastroRecurso(this);
    CadastroUsuario TelaCadastroUsuario = new CadastroUsuario(this);
    
    //Descadastro
    DescadastrarSelecao TelaDescadastrarSelecao = new DescadastrarSelecao(this);
    DescadastrarRecurso TelaDescadastrarRecurso = new DescadastrarRecurso(this);
    DesmarcarReserva TelaDesmarcarReserva = new DesmarcarReserva(this);
    DescadastrarUsuario TelaDescadastraUsuario = new DescadastrarUsuario(this);
    
    //Listagem
    ListaSelecao TelaListaSelecao = new ListaSelecao(this);
    ListaReservasUsuarios TelaListaReservasUsuarios = new ListaReservasUsuarios(this);
    ListaUsuarios TelaListaUsuarios = new ListaUsuarios(this);
    ListaRecursos TelaListaRecursos = new ListaRecursos(this);
    
    
    // - - - - - - - - - - - - - - - - - - - -
    //Metodos auxiliares
    
    //-------------------------
    // Tela Menu 
    public void desabilitaTelaMenu() {
        TelaMenu.desabilitaVisibilidade();
    }

    public void habilitaTelaMenu() {
        TelaMenu.habilitaVisibilidade();
    }
    
    // - - - - - - - - - - - - - - - - - - - -
    // Tela Selecao Cadastro
    public void desabilitaTelaSelecaoCadastro() {
        TelaSelecaoCadastro.desabilitaVisibilidade();
    }

    public void habilitaTelaSelecaoCadastro() {
        TelaSelecaoCadastro.habilitaVisibilidade();
    }
    
    // - - - - - - - - - - - - - - - - - - - -
    // Tela Cadastra Reserva
    public void desabilitaTelaCadastraReserva() {
        TelaCadastraReserva.desabilitaVisibilidade();
    }

    public void habilitaTelaCadastraReserva() {
        TelaCadastraReserva.habilitaVisibilidade();
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Cadastro Recurso
    public void desabilitaTelaCadastroRecurso() {
        TelaCadastroRecurso.desabilitaVisibilidade();
    }

    public void habilitaTelaCadastroRecurso() {
        TelaCadastroRecurso.habilitaVisibilidade();
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Cadastro Usuario
    public void desabilitaTelaCadastroUsuario() {
        TelaCadastroUsuario.desabilitaVisibilidade();
    }

    public void habilitaTelaCadastroUsuario() {
        TelaCadastroUsuario.habilitaVisibilidade();
    }
    
    // - - - - - - - - - - - - - - - - - - - -
    // Tela Descadastrar Selecao
    public void desabilitaTelaDescadastrarSelecao() {
        TelaDescadastrarSelecao.desabilitaVisibilidade();
    }

    public void habilitaTelaDescadastrarSelecao() {
        TelaDescadastrarSelecao.habilitaVisibilidade();
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Descadastrar Recurso
    public void desabilitaTelaDescadastrarRecurso() {
        TelaDescadastrarRecurso.desabilitaVisibilidade();
    }

    public void habilitaTelaDescadastrarRecurso() {
        TelaDescadastrarRecurso.habilitaVisibilidade();
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Descadastra Usuario
    public void desabilitaTelaDescadastrarUsuario() {
        TelaDescadastraUsuario.desabilitaVisibilidade();
    }

    public void habilitaTelaDescadastrarUsuario() {
        TelaDescadastraUsuario.habilitaVisibilidade();
    }
    
    // - - - - - - - - - - - - - - - - - - - -
    // Tela Desmarcar Reserva
    public void desabilitaTelaDesmarcarReserva() {
        TelaDesmarcarReserva.desabilitaVisibilidade();
    }

    public void habilitaTelaDesmarcarReserva() {
        TelaDesmarcarReserva.habilitaVisibilidade();
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Listagem
    public void desabilitaTelaListaSelecao() {
        TelaListaSelecao.desabilitaVisibilidade();
    }

    public void habilitaTelaListaSelecao() {
        TelaListaSelecao.habilitaVisibilidade();
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Listagem Reservas por Usuario
    public void desabilitaTelaListaReservasUsuarios() {
        TelaListaReservasUsuarios.desabilitaVisibilidade();
    }

    public void habilitaTelaListaReservasUsuarios() {
        TelaListaReservasUsuarios.habilitaVisibilidade();
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Listagem Usuarios
    public void desabilitaTelaListaUsuarios() {
        TelaListaUsuarios.desabilitaVisibilidade();
    }

    public void habilitaTelaListaUsuarios() {
        TelaListaUsuarios.habilitaVisibilidade();
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Listagem Recursos
    public void desabilitaTelaListaRecursos() {
        TelaListaRecursos.desabilitaVisibilidade();
    }

    public void habilitaTelaListaRecursos() {
        TelaListaRecursos.habilitaVisibilidade();
    }

    // - - - - - - - - - - - - - - - - - - - -
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

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
