package Telas.split;

import java.awt.Container;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Background extends javax.swing.JFrame {
    
    private Container background;

    public Background() {
        initComponents();
        iniciaTelas();
    }
    
    private void iniciaTelas() {
        background.add(TelaMenu);
        habilitaTelaMenu();
        desabilitaTelaSelecaoCadastro();
        desabilitaTelaCadastraReserva();
        desabilitaTelaCadastroRecurso();
        desabilitaTelaCadastroUsuario();
        desabilitaTelaListaSelecao();
        desabilitaTelaDescadastrarRecurso();
        desabilitaTelaDescadastrarSelecao();
        desabilitaTelaDescadastrarUsuario();
        desabilitaTelaDesmarcarReserva();
    }
    
    Menu TelaMenu = new Menu(this);
    
    SelecaoCadastro TelaSelecaoCadastro = new SelecaoCadastro(this);
    CadastraReserva TelaCadastraReserva = new CadastraReserva(this);
    CadastroRecurso TelaCadastroRecurso = new CadastroRecurso(this);
    CadastroUsuario TelaCadastroUsuario = new CadastroUsuario(this);
    
    DescadastrarSelecao TelaDescadastrarSelecao = new DescadastrarSelecao(this);
    DescadastrarRecurso TelaDescadastrarRecurso = new DescadastrarRecurso(this);
    DesmarcarReserva TelaDesmarcarReserva = new DesmarcarReserva(this);
    DescadastrarUsuario TelaDescadastraUsuario = new DescadastrarUsuario(this);
    
    ListaSelecao TelaListaSelecao = new ListaSelecao(this);
    ListaReservasUsuarios TelaListaReservasUsuarios = new ListaReservasUsuarios(this);
    ListaUsuarios TelaListaUsuarios = new ListaUsuarios(this);
    ListaRecursos TelaListaRecursos = new ListaRecursos(this);
    
    
    //-------------------------
    //Validadores
    public boolean taVazio(String txt) {
        if (txt == null || txt.length() == 0) {
            JOptionPane.showMessageDialog(null,"Campo não preenchido.");
            return true;
        } else {
            return false;
        }
    }

    public boolean verificaNumero(String txt) {
        if (taVazio(txt)) {
            return false;
        }
        //for(int i=0;i<txt.length();i++){
        //  if(!Character.isDigit(txt.charAt(i))) return false;   
        //}
        if (!txt.matches("[0-9]+")) {
            return false;
        }

        return true;
    }

    public boolean verificaNUSP(String nUSP) {
        if (taVazio(nUSP)) {
            return false;
        }
        //for(int i=0;i<txt.length();i++){
        //  if(!Character.isDigit(txt.charAt(i))) return false;   
        //}
        if (nUSP.length() != 7 && nUSP.length() != 8) {
            JOptionPane.showMessageDialog(null, "Número USP inválido!\nDeve ter 7 ou 8 números.");
            return false;
        }
        if (!nUSP.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Número USP inválido!");
            return false;
        }
        return true;
    }

    public boolean verificaTexto(String txt) {
        String s = txt.toLowerCase();
        s = s.replaceAll(" ", "");
        s = removeAcentos(s);

        return s.matches("[a-z]+");
    }

    public boolean verificaTextoNumeros(String txt) {
        String s = txt.toLowerCase();
        s = s.replaceAll(" ", "");
        s = removeAcentos(s);

        return s.matches("[0-z]+");
    }

    public String removeAcentos(String txt) {
        return Normalizer.normalize(txt, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

    public boolean verificaData(String s) {
        // Primeiro digito do dia errado
        if (s.charAt(0) != '0' && s.charAt(0) != '1' && s.charAt(0) != '2' && s.charAt(0) != '3') {
            return false;
        }

        // Dias maiores que 31
        if (s.charAt(0) == '3') {
            if (s.charAt(1) != '0' && s.charAt(1) != '1') {
                return false;
            }
        }

        // Dia 00
        if (s.charAt(0) == '0') {
            if (s.charAt(1) == '0') {
                return false;
            }
        }

        // Primeiro digito do mes incorreto
        if (s.charAt(3) != '0' && s.charAt(3) != '1') {
            return false;
        }

        // Mes maiores que 12
        if (s.charAt(3) == '1') {
            if (s.charAt(4) != '0' && s.charAt(4) != '1' && s.charAt(4) != '2') {
                return false;
            }
        }

        // Mes 00
        if (s.charAt(3) == '0') {
            if (s.charAt(4) == '0') {
                return false;
            }
        }

        // Dia maior que 29 para o mes 02 (Fevereiro)
        if (s.charAt(3) == '0' && s.charAt(4) == '2') {
            if (s.charAt(0) == '3') {
                return false;
            }
        }

        // Dia 31 para os meses 04 (Abril), 06 (Junho), 09 (Setembro) e 11 (Novembro)
        if ((s.charAt(3) == '0' && (s.charAt(4) == '4' || s.charAt(4) == '6' || s.charAt(4) == '9'))
                || (s.charAt(3) == '1' && s.charAt(4) == '1')) {
            if (s.charAt(0) == '3' && s.charAt(1) == '1') {
                return false;
            }
        }

        return true;
    }

    public boolean comparaDataAtual(String data, String data_ftf) {
        if (((int) data_ftf.charAt(3)) < ((int) data.charAt(3))) {
            return false;
        }
        if (((int) data_ftf.charAt(4)) < ((int) data.charAt(4))) {
            return false;
        } else {
            if (((int) data_ftf.charAt(4)) == ((int) data.charAt(4))) {
                if (((int) data_ftf.charAt(0)) < ((int) data.charAt(0))) {
                    return false;
                }
                if (((int) data_ftf.charAt(1)) < ((int) data.charAt(1))) {
                    return false;
                }
            }
        }
        return true;
    }

    public String transformaData(String data_ftf) {
        String mes = data_ftf.substring(3, 5); //string do mes
        String dia = data_ftf.substring(0, 2); //string do dia
        Date agora = new Date();
        String ano = (String) new SimpleDateFormat("yyyy-").format(agora);
        ano = ano.concat(mes) + "-"; //concatena
        ano = ano.concat(dia);  //concatena
        data_ftf = ano;  //coloca em data_ftf
        return data_ftf;
    }
    
    
    // - - - - - - - - - - - - - - - - - - - -
    // Tela Menu 
    public void desabilitaTelaMenu() {
        TelaMenu.desabilitaVisibilidadeTelaMenu();
    }

    public void habilitaTelaMenu() {
        TelaMenu.habilitaVisibilidadeTelaMenu();
    }
    
    // - - - - - - - - - - - - - - - - - - - -
    //Metodos auxiliares
    
    // - - - - - - - - - - - - - - - - - - - -
    // Tela Selecao Cadastro
    public void desabilitaTelaSelecaoCadastro() {
        TelaSelecaoCadastro.desabilitaVisibilidadeTelaSelecaoCadastro();
    }

    public void habilitaTelaSelecaoCadastro() {
        TelaSelecaoCadastro.habilitaVisibilidadeTelaSelecaoCadastro();
    }
    
    // - - - - - - - - - - - - - - - - - - - -
    // Tela Cadastra Reserva
    public void desabilitaTelaCadastraReserva() {
        TelaCadastraReserva.desabilitaVisibilidadeTelaCadResv();
    }

    public void habilitaTelaCadastraReserva() {
        TelaCadastraReserva.habilitaVisibilidadeTelaCadResv();
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Cadastro Recurso
    public void desabilitaTelaCadastroRecurso() {
        TelaCadastroRecurso.desabilitaVisibilidadeTelaCadRec();
    }

    public void habilitaTelaCadastroRecurso() {
        TelaCadastroRecurso.habilitaVisibilidadeTelaCadRec();
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Cadastro Usuario
    public void desabilitaTelaCadastroUsuario() {
        TelaCadastroUsuario.desabilitaVisibilidadeTelaCadUsr();
    }

    public void habilitaTelaCadastroUsuario() {
        TelaCadastroUsuario.habilitaVisibilidadeTelaCadUsr();
    }
    
    // - - - - - - - - - - - - - - - - - - - -
    // Tela Descadastrar Selecao
    public void desabilitaTelaDescadastrarSelecao() {
        TelaDescadastrarSelecao.desabilitaVisibilidadeTelaDescSelecao();
    }

    public void habilitaTelaDescadastrarSelecao() {
        TelaDescadastrarSelecao.habilitaVisibilidadeTelaDescSelecao();
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Descadastrar Recurso
    public void desabilitaTelaDescadastrarRecurso() {
        TelaDescadastrarRecurso.desabilitaVisibilidadeTelaDescRec();
    }

    public void habilitaTelaDescadastrarRecurso() {
        TelaDescadastrarRecurso.habilitaVisibilidadeTelaDescRec();
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Descadastra Usuario
    public void desabilitaTelaDescadastrarUsuario() {
        TelaDescadastraUsuario.desabilitaVisibilidadeTelaDescUsr();
    }

    public void habilitaTelaDescadastrarUsuario() {
        TelaDescadastraUsuario.habilitaVisibilidadeTelaDescUsr();
    }
    
    // - - - - - - - - - - - - - - - - - - - -
    // Tela Desmarcar Reserva
    public void desabilitaTelaDesmarcarReserva() {
        TelaDesmarcarReserva.desabilitaVisibilidadeTelaDesmResv();
    }

    public void habilitaTelaDesmarcarReserva() {
        TelaDesmarcarReserva.habilitaVisibilidadeTelaDesmResv();
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Listagem
    public void desabilitaTelaListaSelecao() {
        TelaListaSelecao.desabilitaVisibilidadeTelaListaSelecao();
    }

    public void habilitaTelaListaSelecao() {
        TelaListaSelecao.habilitaVisibilidadeTelaListaSelecao();
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Listagem Reservas por Usuario
    public void desabilitaTelaListaReservasUsuarios() {
        TelaListaReservasUsuarios.desabilitaVisibilidadeTelaListaResvUsr();
    }

    public void habilitaTelaListaReservasUsuarios() {
        TelaListaReservasUsuarios.habilitaVisibilidadeTelaListaResvUsr();
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Listagem Usuarios
    public void desabilitaTelaListaUsuarios() {
        TelaListaUsuarios.desabilitaVisibilidadeTelaListaUsuarios();
    }

    public void habilitaTelaListaUsuarios() {
        TelaListaUsuarios.habilitaVisibilidadeTelaListaUsuarios();
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Listagem Recursos
    public void desabilitaTelaListaRecursos() {
        TelaListaRecursos.desabilitaVisibilidadeTelaListaRecursos();
    }

    public void habilitaTelaListaRecursos() {
        TelaListaRecursos.habilitaVisibilidadeTelaListaRecursos();
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
