package Telas;

import bancodados.Log;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import java.awt.Dimension;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import java.lang.Character;
import negocio.*;
import objetos.Recurso;
import objetos.Reserva;
import objetos.Usuario;
import java.text.Normalizer;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Administrador
 */
public class Telas extends JFrame {

    /**
     * Creates new form Telas
     */
    public Telas() {
        initComponents();
        iniciaTelas();
    }

    private void iniciaTelas() {
        habilitaTelaMenu();
        desabilitaTelaCadastraReserva();
        desabilitaTelaCadastroRecurso();
        desabilitaTelaCadastroUsuario();
        desabilitaTelaDescadastrarRecurso();
        desabilitaTelaDescadastrarSelecao();
        desabilitaTelaDesmarcarReserva();
        desabilitaTelaListaSelecao();
        desabilitaTelaRemoverUsuario();
        desabilitaTelaSelecaoCadastro();
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Menu 
    private void desabilitaTelaMenu() {
        TelaMenu.setVisible(false);
        Component[] array = TelaMenu.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    private void habilitaTelaMenu() {
        TelaMenu.setVisible(true);
        Component[] array = TelaMenu.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Cadastra Reserva
    private void desabilitaTelaCadastraReserva() {
        TelaCadastraReserva.setVisible(false);
        Component[] array = TelaCadastraReserva.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    private void habilitaTelaCadastraReserva() {
        TelaCadastraReserva.setVisible(true);
        desabilitaComponentesCadResv();
        Component[] array = TelaCadastraReserva.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Cadastro Recurso
    private void desabilitaTelaCadastroRecurso() {
        TelaCadastroRecurso.setVisible(false);
        Component[] array = TelaCadastroRecurso.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    private void habilitaTelaCadastroRecurso() {
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
    private void desabilitaTelaCadastroUsuario() {
        TelaCadastroUsuario.setVisible(false);
        Component[] array = TelaCadastroUsuario.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    private void habilitaTelaCadastroUsuario() {
        TelaCadastroUsuario.setVisible(true);
        Component[] array = TelaCadastroUsuario.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Descadastrar Recurso
    private void desabilitaTelaDescadastrarRecurso() {
        TelaDescadastrarRecurso.setVisible(false);
        Component[] array = TelaDescadastrarRecurso.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    private void habilitaTelaDescadastrarRecurso() {
        TelaDescadastrarRecurso.setVisible(true);
        Component[] array = TelaDescadastrarRecurso.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Descadastrar Selecao
    private void desabilitaTelaDescadastrarSelecao() {
        TelaDescadastrarSelecao.setVisible(false);
        Component[] array = TelaDescadastrarSelecao.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    private void habilitaTelaDescadastrarSelecao() {
        TelaDescadastrarSelecao.setVisible(true);
        Component[] array = TelaDescadastrarSelecao.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Desmarcar Reserva
    private void desabilitaTelaDesmarcarReserva() {
        TelaDesmarcarReserva.setVisible(false);
        Component[] array = TelaDesmarcarReserva.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    private void habilitaTelaDesmarcarReserva() {
        TelaDesmarcarReserva.setVisible(true);
        Component[] array = TelaDesmarcarReserva.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Listagem
    private void desabilitaTelaListaSelecao() {
        TelaListaSelecao.setVisible(false);
        Component[] array = TelaListaSelecao.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    private void habilitaTelaListaSelecao() {
        TelaListaSelecao.setVisible(true);
        Component[] array = TelaListaSelecao.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Listagem Reservas por Usuario
    private void desabilitaTelaListaReservasUsuarios() {
        TelaListaReservasUsuarios.setVisible(false);
        Component[] array = TelaListaReservasUsuarios.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    private void habilitaTelaListaReservasUsuarios() {
        TelaListaReservasUsuarios.setVisible(true);
        Component[] array = TelaListaReservasUsuarios.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Listagem Usuarios
    private void desabilitaTelaListaUsuarios() {
        TelaListaUsuarios.setVisible(false);
        Component[] array = TelaListaUsuarios.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    private void habilitaTelaListaUsuarios() {
        TelaListaUsuarios.setVisible(true);
        Component[] array = TelaListaUsuarios.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Listagem Recursos
    private void desabilitaTelaListaRecursos() {
        TelaListaRecursos.setVisible(false);
        Component[] array = TelaListaRecursos.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    private void habilitaTelaListaRecursos() {
        TelaListaRecursos.setVisible(true);
        Component[] array = TelaListaRecursos.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Remover Usuario
    private void desabilitaTelaRemoverUsuario() {
        TelaRemoverUsuario.setVisible(false);
        Component[] array = TelaRemoverUsuario.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    private void habilitaTelaRemoverUsuario() {
        TelaRemoverUsuario.setVisible(true);
        Component[] array = TelaRemoverUsuario.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Tela Selecao Cadastro
    private void desabilitaTelaSelecaoCadastro() {
        TelaSelecaoCadastro.setVisible(false);
        Component[] array = TelaSelecaoCadastro.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }

    private void habilitaTelaSelecaoCadastro() {
        TelaSelecaoCadastro.setVisible(true);
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
    
    private void limpaCampos_CadRecurso(){
        TF_NomeCadRec.setText("");
        CBTipoCadRec.setSelectedIndex(0);
        CBPredioCadRec.setSelectedIndex(0);
        CBCursoCadRec.setSelectedIndex(0);
    }

    // - - - - - - - - - - - - - - - - - - - -
    // Validadores
    private boolean verificaNumero(String txt) {
        if (taVazio(txt)) {
            return false;
        }
        //for(int i=0;i<txt.length();i++){
        //  if(!Character.isDigit(txt.charAt(i))) return false;   
        //}
        if (txt.matches("[0-9]+")) {
            return true;
        }

        return false;
    }

    private boolean taVazio(String txt) {
        if (txt == null || txt.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean verificaTexto(String txt) {
        String s = txt.toLowerCase();
        s = s.replaceAll(" ", "");
        s = removeAcentos(s);

        return s.matches("[a-z]+");
    }

    private boolean verificaTextoNumeros(String txt){
        String s = txt.toLowerCase();
        s = s.replaceAll(" ","");
        s = removeAcentos(s);
        
        return s.matches("[0-z]+");
    }
    
    private String removeAcentos(String txt) {
        return Normalizer.normalize(txt, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

    private boolean verificaData(String s) {

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogConfExcUsr = new javax.swing.JDialog();
        LabelDiagConfExcUsr = new javax.swing.JLabel();
        LabelSubDiagConfExcUsr = new javax.swing.JLabel();
        LabelNomeDiagConfExcUsr = new javax.swing.JLabel();
        LabelNome_BDDiagConfExcUsr = new javax.swing.JLabel();
        LabelEmailDiagConfExcUsr = new javax.swing.JLabel();
        LabelEmail_BDDiagConfExcUsr = new javax.swing.JLabel();
        BotaoDescUsr = new javax.swing.JButton();
        BotaoRetFromDiagConfExcUsr = new javax.swing.JButton();
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
        TelaMenu = new javax.swing.JPanel();
        LabelTelaMenu = new javax.swing.JLabel();
        LabelSubTelaMenu = new javax.swing.JLabel();
        BotaoGoTelaCadSelc = new javax.swing.JButton();
        BotaoGoTelaListSelc = new javax.swing.JButton();
        BotaoGoTelaDescSelc = new javax.swing.JButton();
        TelaSelecaoCadastro = new javax.swing.JPanel();
        LabelTelaCadSelc = new javax.swing.JLabel();
        LabelSubTelaCadSelc = new javax.swing.JLabel();
        BotaoGoTelaCadResv = new javax.swing.JButton();
        BotaoGoTelaCadUsr = new javax.swing.JButton();
        BotaoGoTelaCadRec = new javax.swing.JButton();
        BotaoRetFromCadSelc = new javax.swing.JButton();
        TelaCadastraReserva = new javax.swing.JPanel();
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
        TelaCadastroRecurso = new javax.swing.JPanel();
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
        TelaCadastroUsuario = new javax.swing.JPanel();
        LabelTelaCadUsr = new javax.swing.JLabel();
        LabelNomeTelaCadUsr = new javax.swing.JLabel();
        LabelNUSPTelaCadUsr = new javax.swing.JLabel();
        LabelTelfTelaCadUsr = new javax.swing.JLabel();
        LabelEmailTelaCadUsr = new javax.swing.JLabel();
        LabelCargoTelaCadUsr = new javax.swing.JLabel();
        LabelCursoTelaCadUsr = new javax.swing.JLabel();
        CBCargoCadUsr = new javax.swing.JComboBox<>();
        CBCursoCadUsr = new javax.swing.JComboBox<>();
        TF_NomeCadUsr = new javax.swing.JTextField();
        TF_NUSPCadUsr = new javax.swing.JTextField();
        TF_TelfCadUsr = new javax.swing.JTextField();
        TF_EmailCadUsr = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        TelaListaSelecao = new javax.swing.JPanel();
        LabelNomeTelaListSelc = new javax.swing.JLabel();
        LabelSubTelaListSelc = new javax.swing.JLabel();
        BotaoGoTelaListResvUsr = new javax.swing.JButton();
        BotaoGoTelaListUsr = new javax.swing.JButton();
        BotaoGoTelaListRec = new javax.swing.JButton();
        BotaoRetFromTelaListSelc = new javax.swing.JButton();
        TelaListaRecursos = new javax.swing.JPanel();
        LabelNomeTelaListRec = new javax.swing.JLabel();
        LabelPredioTelaListRec = new javax.swing.JLabel();
        LabelTipoTelaListRec = new javax.swing.JLabel();
        BotaoRetFromTelaListRec = new javax.swing.JButton();
        BotaoListaRecursos = new javax.swing.JButton();
        CBTiposListaRec = new javax.swing.JComboBox<>();
        CBPredioListaRec = new javax.swing.JComboBox<>();
        ScrolListaRecursos = new javax.swing.JScrollPane();
        TabelaListaRec = new javax.swing.JTable();
        TelaListaReservasUsuarios = new javax.swing.JPanel();
        LabelNomeTelaListResvUsr = new javax.swing.JLabel();
        LabelUsuarioListResvUsr = new javax.swing.JLabel();
        BotaoRetFromTelaListResvUsr = new javax.swing.JButton();
        BotaoBusca_ListResvUsr = new javax.swing.JButton();
        ScrolListaResvUsr = new javax.swing.JScrollPane();
        TabelaListaReserUsr = new javax.swing.JTable();
        TF_NUSP_ListResvUsr = new javax.swing.JTextField();
        TelaListaUsuarios = new javax.swing.JPanel();
        LabelNomeTelaListUsr = new javax.swing.JLabel();
        LabelSubTelaListUsr = new javax.swing.JLabel();
        BotaoRetFromTelaListUsr = new javax.swing.JButton();
        BotaoListaTodosUsuarios = new javax.swing.JButton();
        ScrolListaUsr = new javax.swing.JScrollPane();
        TabelaListaUsr = new javax.swing.JTable();
        TelaDescadastrarSelecao = new javax.swing.JPanel();
        LabelNomeTelaDescSelc = new javax.swing.JLabel();
        LabelSubTelaDescSelc = new javax.swing.JLabel();
        BotaoGoTelaRemUsr = new javax.swing.JButton();
        BotaoGoTelaDescRec = new javax.swing.JButton();
        BotaoGoTelaDesmResv = new javax.swing.JButton();
        BotaoRetFromDescSelc = new javax.swing.JButton();
        TelaDesmarcarReserva = new javax.swing.JPanel();
        LabelNomeTelaDesmResv = new javax.swing.JLabel();
        BotaoRetFromDesmResv = new javax.swing.JButton();
        BotaoGoDiagConfResv = new javax.swing.JButton();
        TF_NUSP_DesmResv = new javax.swing.JTextField();
        LabelUsuarioTelaDesmResv = new javax.swing.JLabel();
        BotaoBusca_DesmResv = new javax.swing.JButton();
        ScrolDesmResv = new javax.swing.JScrollPane();
        TabelaDesmResv = new javax.swing.JTable();
        TelaDescadastrarRecurso = new javax.swing.JPanel();
        LabelNomeTelaDescRec = new javax.swing.JLabel();
        LabelSubTelaDescRec = new javax.swing.JLabel();
        LabelPredioTelaExcluirRec = new javax.swing.JLabel();
        LabelTipoTelaExcluirRec = new javax.swing.JLabel();
        BotaoRetFromDescRec = new javax.swing.JButton();
        BotaoGoDiagConfRec = new javax.swing.JButton();
        BotaoListaRecExcRec = new javax.swing.JButton();
        CBTiposExcluirRec = new javax.swing.JComboBox<>();
        CBPredioExcluirRec = new javax.swing.JComboBox<>();
        ScrolExcluirRec = new javax.swing.JScrollPane();
        TabelaExcluirRec = new javax.swing.JTable();
        TelaRemoverUsuario = new javax.swing.JPanel();
        LabelSubTelaRemUsr = new javax.swing.JLabel();
        LabelNomeTelaRemUsr = new javax.swing.JLabel();
        BotaoRetFromRemUsr = new javax.swing.JButton();
        BotaoGoDiagConfUsr = new javax.swing.JButton();
        ScrolRemUsr = new javax.swing.JScrollPane();
        TabelaRemUsr = new javax.swing.JTable();
        BotaoListUsrRemUsr = new javax.swing.JButton();

        DialogConfExcUsr.setMinimumSize(new java.awt.Dimension(250, 250));

        LabelDiagConfExcUsr.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelDiagConfExcUsr.setForeground(new java.awt.Color(255, 0, 0));
        LabelDiagConfExcUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDiagConfExcUsr.setText("Confirmar Ação");

        LabelSubDiagConfExcUsr.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        LabelSubDiagConfExcUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSubDiagConfExcUsr.setText("Deseja excluir o usuário?");

        LabelNomeDiagConfExcUsr.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LabelNomeDiagConfExcUsr.setText("Nome:");

        LabelNome_BDDiagConfExcUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelNome_BDDiagConfExcUsr.setText("Teste da Silva");

        LabelEmailDiagConfExcUsr.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LabelEmailDiagConfExcUsr.setText("E-mail:");

        LabelEmail_BDDiagConfExcUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelEmail_BDDiagConfExcUsr.setText("teste.silva@email.com");

        BotaoDescUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoDescUsr.setText("Confirmar");
        BotaoDescUsr.setActionCommand("Sim");
        BotaoDescUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDescUsrActionPerformed(evt);
            }
        });

        BotaoRetFromDiagConfExcUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromDiagConfExcUsr.setText("Cancelar");
        BotaoRetFromDiagConfExcUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromDiagConfExcUsrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogConfExcUsrLayout = new javax.swing.GroupLayout(DialogConfExcUsr.getContentPane());
        DialogConfExcUsr.getContentPane().setLayout(DialogConfExcUsrLayout);
        DialogConfExcUsrLayout.setHorizontalGroup(
            DialogConfExcUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelDiagConfExcUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabelSubDiagConfExcUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DialogConfExcUsrLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogConfExcUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogConfExcUsrLayout.createSequentialGroup()
                        .addGroup(DialogConfExcUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelEmailDiagConfExcUsr)
                            .addComponent(LabelNomeDiagConfExcUsr, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DialogConfExcUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelEmail_BDDiagConfExcUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelNome_BDDiagConfExcUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DialogConfExcUsrLayout.createSequentialGroup()
                        .addComponent(BotaoRetFromDiagConfExcUsr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoDescUsr)
                        .addContainerGap())))
        );
        DialogConfExcUsrLayout.setVerticalGroup(
            DialogConfExcUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogConfExcUsrLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelDiagConfExcUsr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSubDiagConfExcUsr)
                .addGap(27, 27, 27)
                .addGroup(DialogConfExcUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNomeDiagConfExcUsr)
                    .addComponent(LabelNome_BDDiagConfExcUsr))
                .addGap(14, 14, 14)
                .addGroup(DialogConfExcUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEmailDiagConfExcUsr)
                    .addComponent(LabelEmail_BDDiagConfExcUsr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(DialogConfExcUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoRetFromDiagConfExcUsr)
                    .addComponent(BotaoDescUsr))
                .addGap(23, 23, 23))
        );

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Dioniso");
        getContentPane().setLayout(new java.awt.CardLayout());

        TelaMenu.setMaximumSize(new java.awt.Dimension(400, 300));
        TelaMenu.setMinimumSize(new java.awt.Dimension(400, 300));
        TelaMenu.setPreferredSize(new java.awt.Dimension(400, 300));

        LabelTelaMenu.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelTelaMenu.setForeground(new java.awt.Color(250, 0, 0));
        LabelTelaMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTelaMenu.setText("  DIONISO");

        LabelSubTelaMenu.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelSubTelaMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSubTelaMenu.setText("Sistema de Alocação de Recursos");

        BotaoGoTelaCadSelc.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoTelaCadSelc.setText("Cadastro");
        BotaoGoTelaCadSelc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoTelaCadSelcActionPerformed(evt);
            }
        });

        BotaoGoTelaListSelc.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoTelaListSelc.setText("Listagem");
        BotaoGoTelaListSelc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoTelaListSelcActionPerformed(evt);
            }
        });

        BotaoGoTelaDescSelc.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoTelaDescSelc.setText("Excluir");
        BotaoGoTelaDescSelc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoTelaDescSelcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaMenuLayout = new javax.swing.GroupLayout(TelaMenu);
        TelaMenu.setLayout(TelaMenuLayout);
        TelaMenuLayout.setHorizontalGroup(
            TelaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaMenuLayout.createSequentialGroup()
                .addGroup(TelaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaMenuLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(TelaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoGoTelaDescSelc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoGoTelaCadSelc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoGoTelaListSelc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TelaMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TelaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelTelaMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelSubTelaMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TelaMenuLayout.setVerticalGroup(
            TelaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTelaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSubTelaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BotaoGoTelaCadSelc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoGoTelaListSelc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoGoTelaDescSelc)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        getContentPane().add(TelaMenu, "card9");

        TelaSelecaoCadastro.setPreferredSize(new java.awt.Dimension(400, 300));

        LabelTelaCadSelc.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelTelaCadSelc.setForeground(new java.awt.Color(255, 0, 0));
        LabelTelaCadSelc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTelaCadSelc.setText(" CADASTRO");
        LabelTelaCadSelc.setToolTipText("");

        LabelSubTelaCadSelc.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelSubTelaCadSelc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSubTelaCadSelc.setText("    Selecione a operação desejada:");

        BotaoGoTelaCadResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoTelaCadResv.setText("Nova Reserva");
        BotaoGoTelaCadResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoTelaCadResvActionPerformed(evt);
            }
        });

        BotaoGoTelaCadUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoTelaCadUsr.setText("Novo Usuário");
        BotaoGoTelaCadUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoTelaCadUsrActionPerformed(evt);
            }
        });

        BotaoGoTelaCadRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoTelaCadRec.setText("Novo Recurso");
        BotaoGoTelaCadRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoTelaCadRecActionPerformed(evt);
            }
        });

        BotaoRetFromCadSelc.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromCadSelc.setText("Voltar");
        BotaoRetFromCadSelc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromCadSelcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaSelecaoCadastroLayout = new javax.swing.GroupLayout(TelaSelecaoCadastro);
        TelaSelecaoCadastro.setLayout(TelaSelecaoCadastroLayout);
        TelaSelecaoCadastroLayout.setHorizontalGroup(
            TelaSelecaoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaSelecaoCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TelaSelecaoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BotaoGoTelaCadResv, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(BotaoGoTelaCadUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoGoTelaCadRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
            .addComponent(LabelTelaCadSelc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TelaSelecaoCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelSubTelaCadSelc, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(TelaSelecaoCadastroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(BotaoRetFromCadSelc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TelaSelecaoCadastroLayout.setVerticalGroup(
            TelaSelecaoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaSelecaoCadastroLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(LabelTelaCadSelc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSubTelaCadSelc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(BotaoGoTelaCadResv)
                .addGap(18, 18, 18)
                .addComponent(BotaoGoTelaCadUsr)
                .addGap(16, 16, 16)
                .addComponent(BotaoGoTelaCadRec)
                .addGap(50, 50, 50)
                .addComponent(BotaoRetFromCadSelc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(TelaSelecaoCadastro, "card11");

        TelaCadastraReserva.setPreferredSize(new java.awt.Dimension(400, 300));

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
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("09:00 - 10:00");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("10:00 - 11:00");

        jRadioButton4.setText("11:00 - 12:00");

        jRadioButton5.setText("12:00 - 13:00");

        jRadioButton6.setText("13:00 - 14:00");

        jRadioButton7.setText("14:00 - 15:00");

        jRadioButton8.setText("15:00 - 16:00");

        jRadioButton9.setText("16:00 - 17:00");

        jRadioButton10.setText("17:00 - 18:00");

        jRadioButton11.setText("18:00 - 19:00");

        jRadioButton12.setText("19:00 - 20:00");

        jRadioButton13.setText("20:00 - 21:00");

        jRadioButton14.setText("21:00 - 22:00");

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

        javax.swing.GroupLayout TelaCadastraReservaLayout = new javax.swing.GroupLayout(TelaCadastraReserva);
        TelaCadastraReserva.setLayout(TelaCadastraReservaLayout);
        TelaCadastraReservaLayout.setHorizontalGroup(
            TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(LabelTelaCadResv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                        .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                                .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBPredioCadResv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CBTipoCadResv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CBNomeCadResv, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                                        .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelNomeCadResv)
                                            .addComponent(LabelTipoCadResv)
                                            .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                                                .addComponent(LabelDataCadResv)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(FTF_DataCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(LabelPredioCadResv))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SeparadorCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                                        .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jRadioButton3)
                                                .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jRadioButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jRadioButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jRadioButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(jRadioButton2)
                                            .addComponent(jRadioButton1))
                                        .addGap(18, 18, 18)
                                        .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton9)
                                            .addComponent(jRadioButton10)
                                            .addComponent(jRadioButton8)
                                            .addComponent(jRadioButton11)
                                            .addComponent(jRadioButton12)
                                            .addComponent(jRadioButton13)
                                            .addComponent(jRadioButton14)))
                                    .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                                        .addComponent(LabelUsuarioCadResv)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TF_NUSPCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                                .addComponent(BotaoRetFromTelaCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotaoCadastraReserva)))
                        .addGap(18, 18, 18))))
        );
        TelaCadastraReservaLayout.setVerticalGroup(
            TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelTelaCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaCadastraReservaLayout.createSequentialGroup()
                        .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelUsuarioCadResv)
                            .addComponent(TF_NUSPCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton14)))
                    .addComponent(SeparadorCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaCadastraReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoRetFromTelaCadResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCadastraReserva))
                .addContainerGap())
        );

        getContentPane().add(TelaCadastraReserva, "card2");

        TelaCadastroRecurso.setMaximumSize(new java.awt.Dimension(400, 300));
        TelaCadastroRecurso.setPreferredSize(new java.awt.Dimension(400, 300));

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

        javax.swing.GroupLayout TelaCadastroRecursoLayout = new javax.swing.GroupLayout(TelaCadastroRecurso);
        TelaCadastroRecurso.setLayout(TelaCadastroRecursoLayout);
        TelaCadastroRecursoLayout.setHorizontalGroup(
            TelaCadastroRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelTelaCadRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TelaCadastroRecursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaCadastroRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TelaCadastroRecursoLayout.createSequentialGroup()
                        .addComponent(BotaoRetFromTelaCadRec)
                        .addGap(57, 57, 57))
                    .addComponent(LabelNomeCadRec, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTipoCadRec, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPredioCadRec, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCursoCadRec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(TelaCadastroRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaCadastroRecursoLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(BotaoCadastraRecurso)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaCadastroRecursoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(TelaCadastroRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CBCursoCadRec, 0, 184, Short.MAX_VALUE)
                            .addComponent(CBTipoCadRec, javax.swing.GroupLayout.Alignment.LEADING, 0, 184, Short.MAX_VALUE)
                            .addComponent(CBPredioCadRec, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TF_NomeCadRec))
                        .addGap(29, 29, 29))))
        );
        TelaCadastroRecursoLayout.setVerticalGroup(
            TelaCadastroRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroRecursoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LabelTelaCadRec)
                .addGap(47, 47, 47)
                .addGroup(TelaCadastroRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNomeCadRec)
                    .addComponent(TF_NomeCadRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaCadastroRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTipoCadRec)
                    .addComponent(CBTipoCadRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaCadastroRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPredioCadRec)
                    .addComponent(CBPredioCadRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaCadastroRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCursoCadRec, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBCursoCadRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(TelaCadastroRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoRetFromTelaCadRec)
                    .addComponent(BotaoCadastraRecurso))
                .addGap(20, 20, 20))
        );

        getContentPane().add(TelaCadastroRecurso, "card4");

        TelaCadastroUsuario.setMaximumSize(new java.awt.Dimension(400, 300));
        TelaCadastroUsuario.setMinimumSize(new java.awt.Dimension(400, 300));
        TelaCadastroUsuario.setPreferredSize(new java.awt.Dimension(400, 300));

        LabelTelaCadUsr.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelTelaCadUsr.setForeground(new java.awt.Color(255, 0, 0));
        LabelTelaCadUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTelaCadUsr.setText("CADASTRO DE USUÁRIO");

        LabelNomeTelaCadUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelNomeTelaCadUsr.setText("Nome");

        LabelNUSPTelaCadUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelNUSPTelaCadUsr.setText("Número USP");

        LabelTelfTelaCadUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelTelfTelaCadUsr.setText("Telefone");

        LabelEmailTelaCadUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelEmailTelaCadUsr.setText("E-mail");

        LabelCargoTelaCadUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelCargoTelaCadUsr.setText("Cargo");

        LabelCursoTelaCadUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelCursoTelaCadUsr.setText("Curso");

        CBCargoCadUsr.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CBCargoCadUsr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Aluno", "Coordenador", "Professor" }));

        CBCursoCadUsr.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CBCursoCadUsr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "BTC", "LCN", "EFS", "GER", "GA", "GPP", "LZT", "MKT", "OBS", "SI", "TM" }));
        CBCursoCadUsr.setToolTipText("");
        CBCursoCadUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCursoCadUsrActionPerformed(evt);
            }
        });

        TF_NomeCadUsr.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TF_NomeCadUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NomeCadUsrActionPerformed(evt);
            }
        });

        TF_NUSPCadUsr.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        TF_TelfCadUsr.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TF_TelfCadUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_TelfCadUsrActionPerformed(evt);
            }
        });

        TF_EmailCadUsr.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jButton5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton6.setText("Cadastrar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaCadastroUsuarioLayout = new javax.swing.GroupLayout(TelaCadastroUsuario);
        TelaCadastroUsuario.setLayout(TelaCadastroUsuarioLayout);
        TelaCadastroUsuarioLayout.setHorizontalGroup(
            TelaCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelNomeTelaCadUsr)
                    .addComponent(LabelNUSPTelaCadUsr)
                    .addComponent(LabelTelfTelaCadUsr)
                    .addComponent(LabelEmailTelaCadUsr)
                    .addComponent(LabelCargoTelaCadUsr)
                    .addComponent(LabelCursoTelaCadUsr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TelaCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TF_NomeCadUsr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_NUSPCadUsr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_TelfCadUsr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CBCargoCadUsr, 0, 200, Short.MAX_VALUE)
                    .addComponent(CBCursoCadUsr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TF_EmailCadUsr))
                .addContainerGap())
            .addGroup(TelaCadastroUsuarioLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(53, 53, 53))
            .addGroup(TelaCadastroUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTelaCadUsr, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        TelaCadastroUsuarioLayout.setVerticalGroup(
            TelaCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroUsuarioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LabelTelaCadUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_NomeCadUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNomeTelaCadUsr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_NUSPCadUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNUSPTelaCadUsr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTelfTelaCadUsr)
                    .addComponent(TF_TelfCadUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_EmailCadUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelEmailTelaCadUsr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCargoTelaCadUsr)
                    .addComponent(CBCargoCadUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCursoTelaCadUsr)
                    .addComponent(CBCursoCadUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(TelaCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(TelaCadastroUsuario, "card5");

        TelaListaSelecao.setMaximumSize(new java.awt.Dimension(400, 300));
        TelaListaSelecao.setMinimumSize(new java.awt.Dimension(400, 300));
        TelaListaSelecao.setPreferredSize(new java.awt.Dimension(400, 300));

        LabelNomeTelaListSelc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelNomeTelaListSelc.setForeground(new java.awt.Color(255, 0, 0));
        LabelNomeTelaListSelc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNomeTelaListSelc.setText(" LISTAGEM");
        LabelNomeTelaListSelc.setToolTipText("");

        LabelSubTelaListSelc.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelSubTelaListSelc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSubTelaListSelc.setText("   Selecione a operação desejada:");

        BotaoGoTelaListResvUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoTelaListResvUsr.setText("Lista de Reservas por Usuário");
        BotaoGoTelaListResvUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoTelaListResvUsrActionPerformed(evt);
            }
        });

        BotaoGoTelaListUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoTelaListUsr.setText("Lista de Usuários");
        BotaoGoTelaListUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoTelaListUsrActionPerformed(evt);
            }
        });

        BotaoGoTelaListRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoTelaListRec.setText("Lista de Recursos");
        BotaoGoTelaListRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoTelaListRecActionPerformed(evt);
            }
        });

        BotaoRetFromTelaListSelc.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromTelaListSelc.setText("Voltar");
        BotaoRetFromTelaListSelc.setMaximumSize(new java.awt.Dimension(113, 27));
        BotaoRetFromTelaListSelc.setMinimumSize(new java.awt.Dimension(113, 27));
        BotaoRetFromTelaListSelc.setPreferredSize(new java.awt.Dimension(113, 27));
        BotaoRetFromTelaListSelc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromTelaListSelcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaListaSelecaoLayout = new javax.swing.GroupLayout(TelaListaSelecao);
        TelaListaSelecao.setLayout(TelaListaSelecaoLayout);
        TelaListaSelecaoLayout.setHorizontalGroup(
            TelaListaSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaListaSelecaoLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(TelaListaSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BotaoGoTelaListRec, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(BotaoGoTelaListResvUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoGoTelaListUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addComponent(LabelNomeTelaListSelc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabelSubTelaListSelc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TelaListaSelecaoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(BotaoRetFromTelaListSelc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TelaListaSelecaoLayout.setVerticalGroup(
            TelaListaSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaListaSelecaoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LabelNomeTelaListSelc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSubTelaListSelc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(BotaoGoTelaListResvUsr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoGoTelaListUsr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoGoTelaListRec)
                .addGap(45, 45, 45)
                .addComponent(BotaoRetFromTelaListSelc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(TelaListaSelecao, "card6");

        TelaListaRecursos.setMaximumSize(new java.awt.Dimension(400, 300));
        TelaListaRecursos.setMinimumSize(new java.awt.Dimension(400, 300));
        TelaListaRecursos.setPreferredSize(new java.awt.Dimension(400, 300));

        LabelNomeTelaListRec.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelNomeTelaListRec.setForeground(new java.awt.Color(250, 0, 0));
        LabelNomeTelaListRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNomeTelaListRec.setText("LISTA DE RECURSOS");

        LabelPredioTelaListRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelPredioTelaListRec.setText("Prédio:");

        LabelTipoTelaListRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelTipoTelaListRec.setText("Tipo");

        BotaoRetFromTelaListRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromTelaListRec.setText("Voltar");
        BotaoRetFromTelaListRec.setMaximumSize(new java.awt.Dimension(113, 27));
        BotaoRetFromTelaListRec.setMinimumSize(new java.awt.Dimension(113, 27));
        BotaoRetFromTelaListRec.setPreferredSize(new java.awt.Dimension(113, 27));
        BotaoRetFromTelaListRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromTelaListRecActionPerformed(evt);
            }
        });

        BotaoListaRecursos.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoListaRecursos.setText("Listar");
        BotaoListaRecursos.setMaximumSize(new java.awt.Dimension(113, 27));
        BotaoListaRecursos.setMinimumSize(new java.awt.Dimension(113, 27));
        BotaoListaRecursos.setPreferredSize(new java.awt.Dimension(113, 27));
        BotaoListaRecursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoListaRecursosActionPerformed(evt);
            }
        });

        CBTiposListaRec.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CBTiposListaRec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Sala", "Laboratório", "Auditório", "Todos" }));
        CBTiposListaRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTiposListaRecActionPerformed(evt);
            }
        });

        CBPredioListaRec.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CBPredioListaRec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "I1", "I3", "I5", "A2", "A3", "CB", "INCUB" }));
        CBPredioListaRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPredioListaRecActionPerformed(evt);
            }
        });

        TabelaListaRec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrolListaRecursos.setViewportView(TabelaListaRec);

        javax.swing.GroupLayout TelaListaRecursosLayout = new javax.swing.GroupLayout(TelaListaRecursos);
        TelaListaRecursos.setLayout(TelaListaRecursosLayout);
        TelaListaRecursosLayout.setHorizontalGroup(
            TelaListaRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelNomeTelaListRec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TelaListaRecursosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaListaRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaListaRecursosLayout.createSequentialGroup()
                        .addGroup(TelaListaRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LabelPredioTelaListRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelTipoTelaListRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaListaRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CBTiposListaRec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBPredioListaRec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaListaRecursosLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(BotaoRetFromTelaListRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addComponent(BotaoListaRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(TelaListaRecursosLayout.createSequentialGroup()
                        .addComponent(ScrolListaRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        TelaListaRecursosLayout.setVerticalGroup(
            TelaListaRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaListaRecursosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelNomeTelaListRec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaListaRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPredioTelaListRec, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBPredioListaRec, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaListaRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBTiposListaRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTipoTelaListRec, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(ScrolListaRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TelaListaRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoRetFromTelaListRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoListaRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        getContentPane().add(TelaListaRecursos, "card8");

        TelaListaReservasUsuarios.setMaximumSize(new java.awt.Dimension(400, 300));
        TelaListaReservasUsuarios.setMinimumSize(new java.awt.Dimension(400, 300));

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

        javax.swing.GroupLayout TelaListaReservasUsuariosLayout = new javax.swing.GroupLayout(TelaListaReservasUsuarios);
        TelaListaReservasUsuarios.setLayout(TelaListaReservasUsuariosLayout);
        TelaListaReservasUsuariosLayout.setHorizontalGroup(
            TelaListaReservasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelNomeTelaListResvUsr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
            .addGroup(TelaListaReservasUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaListaReservasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaListaReservasUsuariosLayout.createSequentialGroup()
                        .addComponent(ScrolListaResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(TelaListaReservasUsuariosLayout.createSequentialGroup()
                        .addComponent(LabelUsuarioListResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_NUSP_ListResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoBusca_ListResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(TelaListaReservasUsuariosLayout.createSequentialGroup()
                        .addComponent(BotaoRetFromTelaListResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        TelaListaReservasUsuariosLayout.setVerticalGroup(
            TelaListaReservasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaListaReservasUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelNomeTelaListResvUsr)
                .addGap(11, 11, 11)
                .addGroup(TelaListaReservasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelUsuarioListResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TelaListaReservasUsuariosLayout.createSequentialGroup()
                        .addGroup(TelaListaReservasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoBusca_ListResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_NUSP_ListResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)))
                .addGap(11, 11, 11)
                .addComponent(ScrolListaResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoRetFromTelaListResvUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(TelaListaReservasUsuarios, "card8");

        TelaListaUsuarios.setMaximumSize(new java.awt.Dimension(400, 300));
        TelaListaUsuarios.setMinimumSize(new java.awt.Dimension(400, 300));
        TelaListaUsuarios.setPreferredSize(new java.awt.Dimension(400, 300));

        LabelNomeTelaListUsr.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelNomeTelaListUsr.setForeground(new java.awt.Color(250, 0, 0));
        LabelNomeTelaListUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNomeTelaListUsr.setText("LISTA DE USUÁRIOS");

        LabelSubTelaListUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelSubTelaListUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSubTelaListUsr.setText("Lista todos os usuários existentes:");

        BotaoRetFromTelaListUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromTelaListUsr.setText("Voltar");
        BotaoRetFromTelaListUsr.setMaximumSize(new java.awt.Dimension(113, 27));
        BotaoRetFromTelaListUsr.setMinimumSize(new java.awt.Dimension(113, 27));
        BotaoRetFromTelaListUsr.setPreferredSize(new java.awt.Dimension(113, 27));
        BotaoRetFromTelaListUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromTelaListUsrActionPerformed(evt);
            }
        });

        BotaoListaTodosUsuarios.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoListaTodosUsuarios.setText("Listar");
        BotaoListaTodosUsuarios.setMaximumSize(new java.awt.Dimension(113, 27));
        BotaoListaTodosUsuarios.setMinimumSize(new java.awt.Dimension(113, 27));
        BotaoListaTodosUsuarios.setPreferredSize(new java.awt.Dimension(113, 27));
        BotaoListaTodosUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoListaTodosUsuariosActionPerformed(evt);
            }
        });

        TabelaListaUsr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nUSP", "Nome", "E-mail", "Cargo", "Curso", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrolListaUsr.setViewportView(TabelaListaUsr);

        javax.swing.GroupLayout TelaListaUsuariosLayout = new javax.swing.GroupLayout(TelaListaUsuarios);
        TelaListaUsuarios.setLayout(TelaListaUsuariosLayout);
        TelaListaUsuariosLayout.setHorizontalGroup(
            TelaListaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelNomeTelaListUsr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TelaListaUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaListaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaListaUsuariosLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(LabelSubTelaListUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(TelaListaUsuariosLayout.createSequentialGroup()
                        .addGroup(TelaListaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ScrolListaUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(TelaListaUsuariosLayout.createSequentialGroup()
                                .addComponent(BotaoRetFromTelaListUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotaoListaTodosUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        TelaListaUsuariosLayout.setVerticalGroup(
            TelaListaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaListaUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelNomeTelaListUsr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSubTelaListUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ScrolListaUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(TelaListaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoRetFromTelaListUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoListaTodosUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(99, 99, 99))
        );

        getContentPane().add(TelaListaUsuarios, "card8");

        TelaDescadastrarSelecao.setMaximumSize(new java.awt.Dimension(400, 300));
        TelaDescadastrarSelecao.setMinimumSize(new java.awt.Dimension(400, 300));
        TelaDescadastrarSelecao.setPreferredSize(new java.awt.Dimension(400, 300));

        LabelNomeTelaDescSelc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelNomeTelaDescSelc.setForeground(new java.awt.Color(255, 0, 0));
        LabelNomeTelaDescSelc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNomeTelaDescSelc.setText(" EXCLUIR");
        LabelNomeTelaDescSelc.setToolTipText("");

        LabelSubTelaDescSelc.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelSubTelaDescSelc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSubTelaDescSelc.setText("   Selecione a operação desejada:");

        BotaoGoTelaRemUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoTelaRemUsr.setText("Excluir Usuário");
        BotaoGoTelaRemUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoTelaRemUsrActionPerformed(evt);
            }
        });

        BotaoGoTelaDescRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoTelaDescRec.setText("Excluir Recurso");
        BotaoGoTelaDescRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoTelaDescRecActionPerformed(evt);
            }
        });

        BotaoGoTelaDesmResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoTelaDesmResv.setText("Desmarcar Reserva");
        BotaoGoTelaDesmResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoTelaDesmResvActionPerformed(evt);
            }
        });

        BotaoRetFromDescSelc.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromDescSelc.setText("Voltar");
        BotaoRetFromDescSelc.setMaximumSize(new java.awt.Dimension(113, 27));
        BotaoRetFromDescSelc.setMinimumSize(new java.awt.Dimension(113, 27));
        BotaoRetFromDescSelc.setPreferredSize(new java.awt.Dimension(113, 27));
        BotaoRetFromDescSelc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromDescSelcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaDescadastrarSelecaoLayout = new javax.swing.GroupLayout(TelaDescadastrarSelecao);
        TelaDescadastrarSelecao.setLayout(TelaDescadastrarSelecaoLayout);
        TelaDescadastrarSelecaoLayout.setHorizontalGroup(
            TelaDescadastrarSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaDescadastrarSelecaoLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(TelaDescadastrarSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BotaoGoTelaDesmResv, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(BotaoGoTelaRemUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoGoTelaDescRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
            .addComponent(LabelNomeTelaDescSelc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabelSubTelaDescSelc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TelaDescadastrarSelecaoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(BotaoRetFromDescSelc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TelaDescadastrarSelecaoLayout.setVerticalGroup(
            TelaDescadastrarSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaDescadastrarSelecaoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LabelNomeTelaDescSelc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSubTelaDescSelc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(BotaoGoTelaRemUsr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoGoTelaDescRec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoGoTelaDesmResv)
                .addGap(45, 45, 45)
                .addComponent(BotaoRetFromDescSelc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(TelaDescadastrarSelecao, "card6");

        TelaDesmarcarReserva.setPreferredSize(new java.awt.Dimension(400, 300));

        LabelNomeTelaDesmResv.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelNomeTelaDesmResv.setForeground(new java.awt.Color(250, 0, 0));
        LabelNomeTelaDesmResv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNomeTelaDesmResv.setText("DESMARCAR RESERVA");

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

        BotaoGoDiagConfResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoDiagConfResv.setText("Desmarcar");
        BotaoGoDiagConfResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoDiagConfResvActionPerformed(evt);
            }
        });

        TF_NUSP_DesmResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NUSP_DesmResvActionPerformed(evt);
            }
        });

        LabelUsuarioTelaDesmResv.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        LabelUsuarioTelaDesmResv.setText("Usuário:");

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
        ScrolDesmResv.setViewportView(TabelaDesmResv);

        javax.swing.GroupLayout TelaDesmarcarReservaLayout = new javax.swing.GroupLayout(TelaDesmarcarReserva);
        TelaDesmarcarReserva.setLayout(TelaDesmarcarReservaLayout);
        TelaDesmarcarReservaLayout.setHorizontalGroup(
            TelaDesmarcarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelNomeTelaDesmResv, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(TelaDesmarcarReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoRetFromDesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoGoDiagConfResv)
                .addGap(18, 18, 18))
            .addGroup(TelaDesmarcarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TelaDesmarcarReservaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(TelaDesmarcarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ScrolDesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(TelaDesmarcarReservaLayout.createSequentialGroup()
                            .addComponent(LabelUsuarioTelaDesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TF_NUSP_DesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoBusca_DesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14)))
                    .addContainerGap()))
        );
        TelaDesmarcarReservaLayout.setVerticalGroup(
            TelaDesmarcarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaDesmarcarReservaLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(LabelNomeTelaDesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218)
                .addGroup(TelaDesmarcarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoRetFromDesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoGoDiagConfResv))
                .addContainerGap())
            .addGroup(TelaDesmarcarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TelaDesmarcarReservaLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(TelaDesmarcarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LabelUsuarioTelaDesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(TelaDesmarcarReservaLayout.createSequentialGroup()
                            .addGroup(TelaDesmarcarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BotaoBusca_DesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TF_NUSP_DesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(5, 5, 5)))
                    .addGap(11, 11, 11)
                    .addComponent(ScrolDesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(52, Short.MAX_VALUE)))
        );

        getContentPane().add(TelaDesmarcarReserva, "card7");

        TelaDescadastrarRecurso.setMaximumSize(new java.awt.Dimension(400, 300));
        TelaDescadastrarRecurso.setMinimumSize(new java.awt.Dimension(400, 300));
        TelaDescadastrarRecurso.setPreferredSize(new java.awt.Dimension(400, 300));

        LabelNomeTelaDescRec.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelNomeTelaDescRec.setForeground(new java.awt.Color(255, 0, 0));
        LabelNomeTelaDescRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNomeTelaDescRec.setText("EXCLUIR RECURSO");
        LabelNomeTelaDescRec.setToolTipText("");

        LabelSubTelaDescRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelSubTelaDescRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSubTelaDescRec.setText("Remoção de Recurso do Sistema Dioniso");

        LabelPredioTelaExcluirRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelPredioTelaExcluirRec.setText("Prédio:");

        LabelTipoTelaExcluirRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelTipoTelaExcluirRec.setText("Tipo:");

        BotaoRetFromDescRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromDescRec.setText("Cancelar");
        BotaoRetFromDescRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromDescRecActionPerformed(evt);
            }
        });

        BotaoGoDiagConfRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoDiagConfRec.setText("Buscar");
        BotaoGoDiagConfRec.setMaximumSize(new java.awt.Dimension(93, 27));
        BotaoGoDiagConfRec.setMinimumSize(new java.awt.Dimension(93, 27));
        BotaoGoDiagConfRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoDiagConfRecActionPerformed(evt);
            }
        });

        BotaoListaRecExcRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoListaRecExcRec.setText("Listar");
        BotaoListaRecExcRec.setMaximumSize(new java.awt.Dimension(113, 27));
        BotaoListaRecExcRec.setMinimumSize(new java.awt.Dimension(113, 27));
        BotaoListaRecExcRec.setPreferredSize(new java.awt.Dimension(113, 27));
        BotaoListaRecExcRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoListaRecExcRecActionPerformed(evt);
            }
        });

        CBTiposExcluirRec.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CBTiposExcluirRec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Sala", "Laboratório", "Auditório" }));
        CBTiposExcluirRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTiposExcluirRecActionPerformed(evt);
            }
        });

        CBPredioExcluirRec.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CBPredioExcluirRec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "I1", "I3", "I5", "A2", "A3", "CB", "INCUB" }));
        CBPredioExcluirRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPredioExcluirRecActionPerformed(evt);
            }
        });

        TabelaExcluirRec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrolExcluirRec.setViewportView(TabelaExcluirRec);

        javax.swing.GroupLayout TelaDescadastrarRecursoLayout = new javax.swing.GroupLayout(TelaDescadastrarRecurso);
        TelaDescadastrarRecurso.setLayout(TelaDescadastrarRecursoLayout);
        TelaDescadastrarRecursoLayout.setHorizontalGroup(
            TelaDescadastrarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelNomeTelaDescRec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabelSubTelaDescRec, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(TelaDescadastrarRecursoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LabelPredioTelaExcluirRec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CBPredioExcluirRec, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(LabelTipoTelaExcluirRec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CBTiposExcluirRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaDescadastrarRecursoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoRetFromDescRec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoListaRecExcRec, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(BotaoGoDiagConfRec, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(TelaDescadastrarRecursoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrolExcluirRec, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        TelaDescadastrarRecursoLayout.setVerticalGroup(
            TelaDescadastrarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaDescadastrarRecursoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LabelNomeTelaDescRec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSubTelaDescRec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaDescadastrarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBPredioExcluirRec)
                    .addComponent(CBTiposExcluirRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPredioTelaExcluirRec)
                    .addComponent(LabelTipoTelaExcluirRec))
                .addGap(13, 13, 13)
                .addComponent(ScrolExcluirRec, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(TelaDescadastrarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaDescadastrarRecursoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TelaDescadastrarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoGoDiagConfRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoListaRecExcRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaDescadastrarRecursoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(BotaoRetFromDescRec)))
                .addContainerGap())
        );

        getContentPane().add(TelaDescadastrarRecurso, "card5");

        TelaRemoverUsuario.setPreferredSize(new java.awt.Dimension(400, 300));

        LabelSubTelaRemUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelSubTelaRemUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSubTelaRemUsr.setText("Remoção de Usuário do Sistema Dioniso");

        LabelNomeTelaRemUsr.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelNomeTelaRemUsr.setForeground(new java.awt.Color(255, 0, 0));
        LabelNomeTelaRemUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNomeTelaRemUsr.setText("EXCLUIR USUÁRIO");
        LabelNomeTelaRemUsr.setToolTipText("");

        BotaoRetFromRemUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromRemUsr.setText("Cancelar");
        BotaoRetFromRemUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromRemUsrActionPerformed(evt);
            }
        });

        BotaoGoDiagConfUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoDiagConfUsr.setText("Excluir");
        BotaoGoDiagConfUsr.setMaximumSize(new java.awt.Dimension(89, 27));
        BotaoGoDiagConfUsr.setMinimumSize(new java.awt.Dimension(89, 27));
        BotaoGoDiagConfUsr.setPreferredSize(new java.awt.Dimension(89, 27));
        BotaoGoDiagConfUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoDiagConfUsrActionPerformed(evt);
            }
        });

        TabelaRemUsr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nUSP", "Nome", "E-mail", "Cargo", "Curso", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrolRemUsr.setViewportView(TabelaRemUsr);

        BotaoListUsrRemUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoListUsrRemUsr.setText("Listar");
        BotaoListUsrRemUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoListUsrRemUsrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaRemoverUsuarioLayout = new javax.swing.GroupLayout(TelaRemoverUsuario);
        TelaRemoverUsuario.setLayout(TelaRemoverUsuarioLayout);
        TelaRemoverUsuarioLayout.setHorizontalGroup(
            TelaRemoverUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelNomeTelaRemUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TelaRemoverUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaRemoverUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaRemoverUsuarioLayout.createSequentialGroup()
                        .addComponent(BotaoRetFromRemUsr)
                        .addGap(71, 71, 71)
                        .addComponent(BotaoListUsrRemUsr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoGoDiagConfUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ScrolRemUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(LabelSubTelaRemUsr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
        );
        TelaRemoverUsuarioLayout.setVerticalGroup(
            TelaRemoverUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaRemoverUsuarioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LabelNomeTelaRemUsr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSubTelaRemUsr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ScrolRemUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaRemoverUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoRetFromRemUsr)
                    .addComponent(BotaoGoDiagConfUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoListUsrRemUsr))
                .addGap(20, 20, 20))
        );

        getContentPane().add(TelaRemoverUsuario, "card10");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jRadioButton1ActionPerformed()");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jRadioButton10ActionPerformed()");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void CBNomeCadResvActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CBNomeCadResvActionPerformed
        // ComboBox Nome Cadastro Reserva
        System.out.println("Telas.Telas.jComboBox3ActionPerformed()");
        String tipo = CBNomeCadResv.getSelectedItem().toString();     
        if ((tipo.equalsIgnoreCase("SELECIONE"))) {
            desabilitaRadioButtonCadResv();
        } else {
            habilitaRadioButtonCadResv();
        }
    }//GEN-LAST:event_CBNomeCadResvActionPerformed

    private void CBTipoCadResvActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CBTipoCadResvActionPerformed
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
            try{
                RegrasNegocio r = new RegrasNegocio();
                List<Recurso> lista = r.listaRecursos(predio, tipo);
                String slc = CBNomeCadResv.getItemAt(0);
                
                if(lista.isEmpty()){
                    LabelNomeCadResv.setEnabled(false);
                    CBNomeCadResv.setEnabled(false);
                    JOptionPane.showMessageDialog(null,"Não há"
                        + " recursos com esses parâmetros.");
                    for(int i=1; i < CBNomeCadResv.getItemCount();i++)
                            CBNomeCadResv.removeItemAt(i);
                }
                else{
                    if(CBNomeCadResv.getItemCount() == 1){
                        for(Recurso rec : lista){
                            CBNomeCadResv.addItem(rec.getNome());
                        }
                    }
                    else{
                        for(int i=1; i <= CBNomeCadResv.getItemCount();i++)
                            CBNomeCadResv.removeItemAt(i);
                        for(Recurso rec : lista){
                            CBNomeCadResv.addItem(rec.getNome());
                        }
                    }
                }
            }
            catch(RegrasNegocioException e){
                Log.gravaLog(e);
            }
        }
    }//GEN-LAST:event_CBTipoCadResvActionPerformed
    private void habilitaRadioButtonCadResv() {
        Component[] array = TelaCadastraReserva.getComponents();
        TF_NUSPCadResv.setEnabled(true);
        LabelUsuarioCadResv.setEnabled(true);
        BotaoCadastraReserva.setEnabled(true);
        for (Component cp : array) {
            if (cp instanceof JRadioButton) {
                cp.setEnabled(true);
            }
        }
    }

    private void desabilitaRadioButtonCadResv() {
        Component[] array = TelaCadastraReserva.getComponents();
        TF_NUSPCadResv.setEnabled(false);
        LabelUsuarioCadResv.setEnabled(false);
        BotaoCadastraReserva.setEnabled(false);
        for (Component cp : array) {
            if (cp instanceof JRadioButton) {
                cp.setEnabled(false);
            }
        }
    }

    private void desabilitaComponentesCadResv() {
        Component[] array = TelaCadastraReserva.getComponents();
        TF_NUSPCadResv.setEnabled(false);
        LabelUsuarioCadResv.setEnabled(false);
        BotaoCadastraReserva.setEnabled(false);
        CBTipoCadResv.setEnabled(false);
        LabelTipoCadResv.setEnabled(false);
        CBNomeCadResv.setEnabled(false);
        LabelNomeCadResv.setEnabled(false);
        for (Component cp : array) {
            if (cp instanceof JRadioButton) {
                cp.setEnabled(false);
            }
        }
    }

    private void desabilitaComponentesExcRec() {
        CBTiposExcluirRec.setEnabled(false);
        LabelTipoTelaExcluirRec.setEnabled(false);
        TabelaExcluirRec.setEnabled(false);
        ScrolExcluirRec.setEnabled(false);
        BotaoListaRecExcRec.setEnabled(false);
        BotaoGoDiagConfRec.setEnabled(false);
    }


    private void CBPredioCadResvActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CBPredioCadResvActionPerformed
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

    private void BotaoGoTelaRemUsrActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoGoTelaRemUsrActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoGoTelaRemoverUsuario");
        habilitaTelaRemoverUsuario();
        desabilitaTelaDescadastrarSelecao();
    }//GEN-LAST:event_BotaoGoTelaRemUsrActionPerformed

    private void CBTiposListaRecActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CBTiposListaRecActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jComboBox13ActionPerformed()");
    }//GEN-LAST:event_CBTiposListaRecActionPerformed

    private void BotaoGoTelaDescSelcActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoGoTelaDescSelcActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoGoTelaDescadastrarSelecao");
        habilitaTelaDescadastrarSelecao();
        desabilitaTelaMenu();
    }//GEN-LAST:event_BotaoGoTelaDescSelcActionPerformed

    private void BotaoGoTelaListSelcActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoGoTelaListSelcActionPerformed
        //Butto2 - "Listagem": Abre TelaListaSelecao
        System.out.println("BotaoGoTelaListaSelecao");
        habilitaTelaListaSelecao();
        desabilitaTelaMenu();
    }//GEN-LAST:event_BotaoGoTelaListSelcActionPerformed

    private void BotaoGoTelaCadSelcActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoGoTelaCadSelcActionPerformed
        //Button  1 - "Cadastrar": Abre TelaSelecaoCadastro
        System.out.println("BotaoGoTelaSelecaoCadastro");
        habilitaTelaSelecaoCadastro();
        desabilitaTelaMenu();
    }//GEN-LAST:event_BotaoGoTelaCadSelcActionPerformed

    private void BotaoGoDiagConfUsrActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoGoDiagConfUsrActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jButton20ActionPerformed()");
        if (TabelaRemUsr.getSelectedRow() == (-1)) {
            JOptionPane.showMessageDialog(null, "Selecione um usuário para excluir.");
        } else {
            DialogConfExcUsr.setVisible(true);
            System.out.println(TabelaRemUsr.getSelectedRow());
            Object coluna_nome = TabelaRemUsr.getValueAt(TabelaRemUsr.getSelectedRow(), 1);
            String nome = (String) coluna_nome;
            Object coluna_email = TabelaRemUsr.getValueAt(TabelaRemUsr.getSelectedRow(), 2);
            String email = (String) coluna_email;
            LabelNome_BDDiagConfExcUsr.setText(nome);
            LabelEmail_BDDiagConfExcUsr.setText(email);
        }
    }//GEN-LAST:event_BotaoGoDiagConfUsrActionPerformed

    private void BotaoGoTelaCadUsrActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoGoTelaCadUsrActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoGoTelaCadastroUsuario");
        habilitaTelaCadastroUsuario();
        desabilitaTelaSelecaoCadastro();
    }//GEN-LAST:event_BotaoGoTelaCadUsrActionPerformed

    private void BotaoGoTelaCadResvActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoGoTelaCadResvActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoGoTelaCadastraReserva");
        habilitaTelaCadastraReserva();
        desabilitaTelaSelecaoCadastro();
    }//GEN-LAST:event_BotaoGoTelaCadResvActionPerformed

    private void BotaoGoTelaCadRecActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoGoTelaCadRecActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoGoTelaCadastroRecurso");
        habilitaTelaCadastroRecurso();
        desabilitaTelaSelecaoCadastro();
    }//GEN-LAST:event_BotaoGoTelaCadRecActionPerformed

    private void BotaoRetFromCadSelcActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromCadSelcActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoRetFromTelaSelecaoCadastro");
        habilitaTelaMenu();
        desabilitaTelaSelecaoCadastro();
    }//GEN-LAST:event_BotaoRetFromCadSelcActionPerformed

    private void BotaoRetFromTelaCadResvActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromTelaCadResvActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoRetFromTelaCadastraReserva");
        habilitaTelaSelecaoCadastro();
        desabilitaTelaCadastraReserva();
    }//GEN-LAST:event_BotaoRetFromTelaCadResvActionPerformed

    private void jButton5ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoRetFromTelaCadastraUsuario");
        limpaCampos_CadUsuario();
        habilitaTelaSelecaoCadastro();
        desabilitaTelaCadastroUsuario();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void BotaoRetFromTelaListRecActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromTelaListRecActionPerformed
        // TODO add your handling code here:
        desabilitaTelaListaRecursos();
        habilitaTelaListaSelecao();
    }//GEN-LAST:event_BotaoRetFromTelaListRecActionPerformed

    private void BotaoGoTelaDescRecActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoGoTelaDescRecActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoGoTelaDescadastrarRecurso");
        habilitaTelaDescadastrarRecurso();
        desabilitaComponentesExcRec();
        desabilitaTelaDescadastrarSelecao();
    }//GEN-LAST:event_BotaoGoTelaDescRecActionPerformed

    private void BotaoGoTelaDesmResvActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoGoTelaDesmResvActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoGoTelaDesmarcarReserva");
        habilitaTelaDesmarcarReserva();
        desabilitaTelaDescadastrarSelecao();
    }//GEN-LAST:event_BotaoGoTelaDesmResvActionPerformed

    private void BotaoRetFromDescSelcActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromDescSelcActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoRetFromTelaDescadastrarSelecao");
        habilitaTelaMenu();
        desabilitaTelaDescadastrarSelecao();
    }//GEN-LAST:event_BotaoRetFromDescSelcActionPerformed

    private void BotaoRetFromDescRecActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromDescRecActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoRetFromTelaDescadastrarRecurso");
        habilitaTelaDescadastrarSelecao();
        desabilitaTelaDescadastrarRecurso();
    }//GEN-LAST:event_BotaoRetFromDescRecActionPerformed

    private void BotaoRetFromDesmResvActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromDesmResvActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoRetFromTelaDesmarcarReserva");
        habilitaTelaDescadastrarSelecao();
        desabilitaTelaDesmarcarReserva();
    }//GEN-LAST:event_BotaoRetFromDesmResvActionPerformed

    private void BotaoRetFromRemUsrActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromRemUsrActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoRetFromTelaRemoverUsuario");
        habilitaTelaDescadastrarSelecao();
        desabilitaTelaRemoverUsuario();
    }//GEN-LAST:event_BotaoRetFromRemUsrActionPerformed

    private void BotaoRetFromTelaCadRecActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromTelaCadRecActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoRetFromTelaCadastroRecurso");
        habilitaTelaSelecaoCadastro();
        desabilitaTelaCadastroRecurso();
    }//GEN-LAST:event_BotaoRetFromTelaCadRecActionPerformed

    private void CBTipoCadRecActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CBTipoCadRecActionPerformed
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

    private void TF_NomeCadRecActionPerformed(ActionEvent evt) {//GEN-FIRST:event_TF_NomeCadRecActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jTextField1ActionPerformed()");
    }//GEN-LAST:event_TF_NomeCadRecActionPerformed

    private void BotaoRetFromDiagConfExcUsrActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromDiagConfExcUsrActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jButton26ActionPerformed()");
        DialogConfExcUsr.setVisible(false);
    }//GEN-LAST:event_BotaoRetFromDiagConfExcUsrActionPerformed

    private void BotaoGoDiagConfResvActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoGoDiagConfResvActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jButton14ActionPerformed()");
        DialogConfDesmResv.setVisible(true);
    }//GEN-LAST:event_BotaoGoDiagConfResvActionPerformed

    private void BotaoRetFromDiagConfDesmResvActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromDiagConfDesmResvActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jButton28ActionPerformed()");
        DialogConfDesmResv.setVisible(false);
    }//GEN-LAST:event_BotaoRetFromDiagConfDesmResvActionPerformed

    private void BotaoGoDiagConfRecActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoGoDiagConfRecActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jButton8ActionPerformed()");
        if(TabelaExcluirRec.getSelectedRow() == (-1)){
            JOptionPane.showMessageDialog(null,"Selecione um recurso para "
                    + "excluir.");
        }
        else{
            DialogConfExcRec.setVisible(true);
            System.out.println(TabelaExcluirRec.getSelectedRow());
            Object coluna_nome = TabelaExcluirRec.getValueAt(TabelaExcluirRec.getSelectedRow(), 0);
            String nome = (String) coluna_nome;
            LabelNome_BDDialogConfExcRec.setText(nome);
            LabelPredio_BDDialogConfExcRec.setText(CBPredioExcluirRec.getSelectedItem().toString());
            LabelTipo_BDDialogConfExcRec.setText(CBTiposExcluirRec.getSelectedItem().toString());
        }
    }//GEN-LAST:event_BotaoGoDiagConfRecActionPerformed

    private void BotaoRetFromDiagConfExcRecActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromDiagConfExcRecActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jButton31ActionPerformed()");
        DialogConfExcRec.setVisible(true);
    }//GEN-LAST:event_BotaoRetFromDiagConfExcRecActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try {
            RegrasNegocio r = new RegrasNegocio();
            System.out.println("BotaoCadastrarUsuario");
            String nome = TF_NomeCadUsr.getText();
            if (!verificaTexto(nome)) {
                JOptionPane.showMessageDialog(null, "Nome contém caracteres inválidos!");
                return;
            }

            String nUSP = TF_NUSPCadUsr.getText();
            if (!verificaNumero(nUSP)) {
                JOptionPane.showMessageDialog(null, "Número USP inválido!");
                return;
            } else if (nUSP.length() != 7 && nUSP.length() != 8) {
                JOptionPane.showMessageDialog(null, "Número USP inválido!\nDeve ter 7 ou 8 números.");
                return;
            }

            String email = TF_EmailCadUsr.getText();
            String telefone = TF_TelfCadUsr.getText();
            if (!verificaNumero(telefone)) {
                JOptionPane.showMessageDialog(null, "Telefone inválido!\nDeve ter 10 ou 11 números.");
                return;
            } else if (telefone.length() != 10 && telefone.length() != 11) {
                JOptionPane.showMessageDialog(null, "Telefone inválido!\nVerifique se digitou o DDD.");
                return;
            }

            String curso = CBCursoCadUsr.getSelectedItem().toString();
            String cargo = CBCargoCadUsr.getSelectedItem().toString();
            r.cadastraUsuario(nome, nUSP, email, telefone, curso, cargo);
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado com sucesso!");
            limpaCampos_CadUsuario();
        } catch (RegrasNegocioException e) {
            Log.gravaLog(e);

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void CBCursoCadUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCursoCadUsrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCursoCadUsrActionPerformed

    private void BotaoCadastraReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastraReservaActionPerformed
        //Botao Cadastra Reserva
        String data = FTF_DataCadResv.getText();
        String predio = CBPredioCadResv.getSelectedItem().toString();
        String tipo = CBTipoCadResv.getSelectedItem().toString();
        String nome = CBNomeCadResv.getSelectedItem().toString();
        String usuario = TF_NUSPCadResv.getText();
        Component[] array = TelaCadastraReserva.getComponents();
        int RBSelec = 0;  //RadioButtons Selecionados
        for (Component cp : array) {
            if (cp instanceof JRadioButton) {
                if(((JRadioButton) cp).isSelected()){
                    System.out.println(((JRadioButton)cp).getName());
                    RBSelec++;
                }
            }
        }
    }//GEN-LAST:event_BotaoCadastraReservaActionPerformed

    private void BotaoGoTelaListResvUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGoTelaListResvUsrActionPerformed

        System.out.println("BotaoGoTelaListResvUsr");
        habilitaTelaListaReservasUsuarios();
        desabilitaTelaListaSelecao();

    }//GEN-LAST:event_BotaoGoTelaListResvUsrActionPerformed

    private void BotaoGoTelaListUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGoTelaListUsrActionPerformed

        System.out.println("BotaoGoTelaListUsr");
        habilitaTelaListaUsuarios();
        desabilitaTelaListaSelecao();

    }//GEN-LAST:event_BotaoGoTelaListUsrActionPerformed

    private void BotaoGoTelaListRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGoTelaListRecActionPerformed

        System.out.println("BotaoGoTelaListRec");
        habilitaTelaListaRecursos();
        desabilitaTelaListaSelecao();
    }//GEN-LAST:event_BotaoGoTelaListRecActionPerformed

    private void BotaoRetFromTelaListSelcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromTelaListSelcActionPerformed
        // TODO add your handling code here:
        desabilitaTelaListaSelecao();
        habilitaTelaMenu();
    }//GEN-LAST:event_BotaoRetFromTelaListSelcActionPerformed

    private void CBPredioListaRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPredioListaRecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBPredioListaRecActionPerformed

    private void BotaoListaRecursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoListaRecursosActionPerformed
        try {
            RegrasNegocio r = new RegrasNegocio();
            List<Recurso> lista = r.listaRecursos();
            if (lista != null) {
                DefaultTableModel model = (DefaultTableModel) TabelaListaRec.getModel();
                //equivalente a clearTable();
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                for (Recurso rec : lista) {
                    model.addRow(new Object[]{rec.getNome()});
                }
            }
        } catch (RegrasNegocioException ex) {
            Logger.getLogger(Telas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BotaoListaRecursosActionPerformed

    private void BotaoListaTodosUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoListaTodosUsuariosActionPerformed
        try {
            RegrasNegocio r = new RegrasNegocio();
            List<Usuario> lista = r.listaUsuarios();
            DefaultTableModel model = (DefaultTableModel) TabelaListaUsr.getModel();
            //equivalente a clearTable();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            for (Usuario usu : lista) {
                model.addRow(new Object[]{usu.getNome(), usu.getNUSP(), usu.getTelefone(),
                    usu.getEmail(), usu.getCargo(), usu.getCurso()});
            }
        } catch (RegrasNegocioException ex) {
            Logger.getLogger(Telas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BotaoListaTodosUsuariosActionPerformed

    private void BotaoRetFromTelaListUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromTelaListUsrActionPerformed
        desabilitaTelaListaUsuarios();
        habilitaTelaListaSelecao();
    }//GEN-LAST:event_BotaoRetFromTelaListUsrActionPerformed

    private void BotaoRetFromTelaListResvUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromTelaListResvUsrActionPerformed
        desabilitaTelaListaReservasUsuarios();
        habilitaTelaListaSelecao();
    }//GEN-LAST:event_BotaoRetFromTelaListResvUsrActionPerformed

    private void BotaoBusca_ListResvUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBusca_ListResvUsrActionPerformed
        try {
            //Tenta criar uma List baseado no nUSP
            RegrasNegocio r = new RegrasNegocio();
            List<Reserva> lista = r.listaReservasDoUsuario(TF_NUSP_ListResvUsr.getText());
            DefaultTableModel model = (DefaultTableModel) TabelaListaReserUsr.getModel();
            //equivalente a clearTable();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            for (Reserva res : lista) {
                String horarios = res.getHoraInicio() + "~" + res.getHoraFim();
                Recurso rec = res.getRecurso();
                model.addRow(new Object[]{res.getData(), rec.getPredio(), rec.getTipo(), horarios});
            }
        } catch (RegrasNegocioException ex) {
            Log.gravaLog(ex);
        }
    }//GEN-LAST:event_BotaoBusca_ListResvUsrActionPerformed

    private void TF_NUSP_ListResvUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NUSP_ListResvUsrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_NUSP_ListResvUsrActionPerformed

    private void TF_NomeCadUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NomeCadUsrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_NomeCadUsrActionPerformed

    private void CBTiposExcluirRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTiposExcluirRecActionPerformed
        //ComboBox Tipo Excluir Recurso
        String campo = CBPredioExcluirRec.getSelectedItem().toString();
        if ((campo.equalsIgnoreCase("SELECIONE"))) {
            ScrolExcluirRec.setEnabled(false);
            TabelaExcluirRec.setEnabled(false);
            BotaoListaRecExcRec.setEnabled(false);
            BotaoGoDiagConfRec.setEnabled(false);
        } else {
            ScrolExcluirRec.setEnabled(true);
            TabelaExcluirRec.setEnabled(true);
            BotaoListaRecExcRec.setEnabled(true);
            BotaoGoDiagConfRec.setEnabled(true);
        }
    }//GEN-LAST:event_CBTiposExcluirRecActionPerformed

    private void CBPredioExcluirRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPredioExcluirRecActionPerformed
        //ComboBox Predio Excluir Recurso
        String campo = CBPredioExcluirRec.getSelectedItem().toString();
        if ((campo.equalsIgnoreCase("SELECIONE"))) {
            CBTiposExcluirRec.setEnabled(false);
            LabelTipoTelaExcluirRec.setEnabled(false);
            ScrolExcluirRec.setEnabled(false);
            TabelaExcluirRec.setEnabled(false);
        } else {
            CBTiposExcluirRec.setEnabled(true);
            LabelTipoTelaExcluirRec.setEnabled(true);
        }
    }//GEN-LAST:event_CBPredioExcluirRecActionPerformed

    private void TF_NUSP_DesmResvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NUSP_DesmResvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_NUSP_DesmResvActionPerformed

    private void BotaoBusca_DesmResvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBusca_DesmResvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoBusca_DesmResvActionPerformed

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
                if(curso.equalsIgnoreCase("SELECIONE")){
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

    private void BotaoListUsrRemUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoListUsrRemUsrActionPerformed
        // TODO add your handling code here:
        try {
            RegrasNegocio r = new RegrasNegocio();
            List<Usuario> lista = r.listaUsuarios();
            DefaultTableModel model = (DefaultTableModel) TabelaRemUsr.getModel();
            //equivalente a clearTable();
            TabelaRemUsr.setRowSorter(new TableRowSorter(model));
            model.setNumRows(0);
            if (lista.isEmpty()) JOptionPane.showMessageDialog(null,"Não há "
                    + "usuários a serem listados.");
            else{
                for (Usuario usu : lista) {
                    model.addRow(new Object[]{usu.getNome(), usu.getNUSP(),
                    usu.getTelefone(), usu.getEmail(),
                    usu.getCargo(), usu.getCurso()});
                }
            }
            
        } catch (RegrasNegocioException ex) {
            Logger.getLogger(Telas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoListUsrRemUsrActionPerformed

    private void CBCursoCadRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCursoCadRecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCursoCadRecActionPerformed

    private void CBPredioCadRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPredioCadRecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBPredioCadRecActionPerformed

    private void TF_TelfCadUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_TelfCadUsrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_TelfCadUsrActionPerformed

    private void BotaoListaRecExcRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoListaRecExcRecActionPerformed
        // Botao Lista Recursos para Excluir
        try {
            String predio = CBPredioExcluirRec.getSelectedItem().toString();
            String tipo = CBTiposExcluirRec.getSelectedItem().toString();
            RegrasNegocio r = new RegrasNegocio();
            List<Recurso> lista = r.listaRecursos(predio,tipo);
            if (lista.isEmpty()) {
                DefaultTableModel model = (DefaultTableModel) TabelaExcluirRec.getModel();
                model.setNumRows(0);
                JOptionPane.showMessageDialog(null, "Não há recursos para "
                        + "serem listados.");
            }
            else{
                DefaultTableModel model = (DefaultTableModel) TabelaExcluirRec.getModel();
                TabelaExcluirRec.setRowSorter(new TableRowSorter(model));
                //equivalente a clearTable();
                model.setNumRows(0);
                for (Recurso rec : lista) {
                    System.out.println(rec.getNome());
                    System.out.println(rec.getPredio());
                    System.out.println(rec.getTipo());
                    model.addRow(new Object[]{rec.getNome()});
                }
            }
        } catch (RegrasNegocioException ex) {
            Logger.getLogger(Telas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BotaoListaRecExcRecActionPerformed

    private void BotaoDescUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDescUsrActionPerformed
        // TODO add your handling code here:
        Object valor_nUSP = TabelaRemUsr.getValueAt(TabelaRemUsr.getSelectedRow(), 0);
        String nUSP = (String) valor_nUSP;
        try {
            RegrasNegocio r = new RegrasNegocio();
            System.out.println(nUSP);
            r.excluirUsuario(nUSP);
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
            DialogConfExcUsr.setVisible(false);
        } catch (RegrasNegocioException ex) {
            Log.gravaLog(ex);
            try {
                RegrasNegocio r = new RegrasNegocio();
                Usuario usr = r.buscaUsuario(nUSP);
                if (usr == null) {
                    JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
                }
            } catch (RegrasNegocioException e) {
                Logger.getLogger(Telas.class.getName()).log(Level.SEVERE, null, e);
            }
            Logger.getLogger(Telas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoDescUsrActionPerformed

    private void BotaoDescRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDescRecActionPerformed
        // Botao Descadastra Recurso
        try{
            RegrasNegocio r = new RegrasNegocio();
            Recurso rec = new Recurso();
            rec.setNome(LabelNome_BDDialogConfExcRec.getText());
            rec.setPredio(LabelPredio_BDDialogConfExcRec.getText());
            rec.setTipo(LabelTipo_BDDialogConfExcRec.getText());
            r.excluirRecurso(rec);
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
            DialogConfExcRec.setVisible(false);
        }
        catch(RegrasNegocioException e){
            Log.gravaLog(e);
            JOptionPane.showMessageDialog(null, "Recurso não encontrado!");
            Logger.getLogger(Telas.class.getName()).log(Level.SEVERE, null, e);        }
    }//GEN-LAST:event_BotaoDescRecActionPerformed

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Telas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBusca_DesmResv;
    private javax.swing.JButton BotaoBusca_ListResvUsr;
    private javax.swing.JButton BotaoCadastraRecurso;
    private javax.swing.JButton BotaoCadastraReserva;
    private javax.swing.JButton BotaoDescRec;
    private javax.swing.JButton BotaoDescUsr;
    private javax.swing.JButton BotaoDesmResv;
    private javax.swing.JButton BotaoGoDiagConfRec;
    private javax.swing.JButton BotaoGoDiagConfResv;
    private javax.swing.JButton BotaoGoDiagConfUsr;
    private javax.swing.JButton BotaoGoTelaCadRec;
    private javax.swing.JButton BotaoGoTelaCadResv;
    private javax.swing.JButton BotaoGoTelaCadSelc;
    private javax.swing.JButton BotaoGoTelaCadUsr;
    private javax.swing.JButton BotaoGoTelaDescRec;
    private javax.swing.JButton BotaoGoTelaDescSelc;
    private javax.swing.JButton BotaoGoTelaDesmResv;
    private javax.swing.JButton BotaoGoTelaListRec;
    private javax.swing.JButton BotaoGoTelaListResvUsr;
    private javax.swing.JButton BotaoGoTelaListSelc;
    private javax.swing.JButton BotaoGoTelaListUsr;
    private javax.swing.JButton BotaoGoTelaRemUsr;
    private javax.swing.JButton BotaoListUsrRemUsr;
    private javax.swing.JButton BotaoListaRecExcRec;
    private javax.swing.JButton BotaoListaRecursos;
    private javax.swing.JButton BotaoListaTodosUsuarios;
    private javax.swing.JButton BotaoRetFromCadSelc;
    private javax.swing.JButton BotaoRetFromDescRec;
    private javax.swing.JButton BotaoRetFromDescSelc;
    private javax.swing.JButton BotaoRetFromDesmResv;
    private javax.swing.JButton BotaoRetFromDiagConfDesmResv;
    private javax.swing.JButton BotaoRetFromDiagConfExcRec;
    private javax.swing.JButton BotaoRetFromDiagConfExcUsr;
    private javax.swing.JButton BotaoRetFromRemUsr;
    private javax.swing.JButton BotaoRetFromTelaCadRec;
    private javax.swing.JButton BotaoRetFromTelaCadResv;
    private javax.swing.JButton BotaoRetFromTelaListRec;
    private javax.swing.JButton BotaoRetFromTelaListResvUsr;
    private javax.swing.JButton BotaoRetFromTelaListSelc;
    private javax.swing.JButton BotaoRetFromTelaListUsr;
    private javax.swing.JComboBox<String> CBCargoCadUsr;
    private javax.swing.JComboBox<String> CBCursoCadRec;
    private javax.swing.JComboBox<String> CBCursoCadUsr;
    private javax.swing.JComboBox<String> CBNomeCadResv;
    private javax.swing.JComboBox<String> CBPredioCadRec;
    private javax.swing.JComboBox<String> CBPredioCadResv;
    private javax.swing.JComboBox<String> CBPredioExcluirRec;
    private javax.swing.JComboBox<String> CBPredioListaRec;
    private javax.swing.JComboBox<String> CBTipoCadRec;
    private javax.swing.JComboBox<String> CBTipoCadResv;
    private javax.swing.JComboBox<String> CBTiposExcluirRec;
    private javax.swing.JComboBox<String> CBTiposListaRec;
    private javax.swing.JDialog DialogConfDesmResv;
    private javax.swing.JDialog DialogConfExcRec;
    private javax.swing.JDialog DialogConfExcUsr;
    private javax.swing.JFormattedTextField FTF_DataCadResv;
    private javax.swing.JLabel LabelCargoTelaCadUsr;
    private javax.swing.JLabel LabelCursoCadRec;
    private javax.swing.JLabel LabelCursoTelaCadUsr;
    private javax.swing.JLabel LabelDataCadResv;
    private javax.swing.JLabel LabelDataDiagConfDesmResv;
    private javax.swing.JLabel LabelData_BDDiagConfDesmResv;
    private javax.swing.JLabel LabelDiagConfDesmResv;
    private javax.swing.JLabel LabelDiagConfExcUsr;
    private javax.swing.JLabel LabelDialogConfExcRec;
    private javax.swing.JLabel LabelEmailDiagConfExcUsr;
    private javax.swing.JLabel LabelEmailTelaCadUsr;
    private javax.swing.JLabel LabelEmail_BDDiagConfExcUsr;
    private javax.swing.JLabel LabelHoraDiagConfDesmResv;
    private javax.swing.JLabel LabelHora_BDDiagConfDesmResv;
    private javax.swing.JLabel LabelNUSPTelaCadUsr;
    private javax.swing.JLabel LabelNomeCadRec;
    private javax.swing.JLabel LabelNomeCadResv;
    private javax.swing.JLabel LabelNomeDiagConfExcUsr;
    private javax.swing.JLabel LabelNomeDialogConfExcRec;
    private javax.swing.JLabel LabelNomeTelaCadUsr;
    private javax.swing.JLabel LabelNomeTelaDescRec;
    private javax.swing.JLabel LabelNomeTelaDescSelc;
    private javax.swing.JLabel LabelNomeTelaDesmResv;
    private javax.swing.JLabel LabelNomeTelaListRec;
    private javax.swing.JLabel LabelNomeTelaListResvUsr;
    private javax.swing.JLabel LabelNomeTelaListSelc;
    private javax.swing.JLabel LabelNomeTelaListUsr;
    private javax.swing.JLabel LabelNomeTelaRemUsr;
    private javax.swing.JLabel LabelNome_BDDiagConfExcUsr;
    private javax.swing.JLabel LabelNome_BDDialogConfExcRec;
    private javax.swing.JLabel LabelPredioCadRec;
    private javax.swing.JLabel LabelPredioCadResv;
    private javax.swing.JLabel LabelPredioDiagConfDesmResv;
    private javax.swing.JLabel LabelPredioDialogConfExcRec;
    private javax.swing.JLabel LabelPredioTelaExcluirRec;
    private javax.swing.JLabel LabelPredioTelaListRec;
    private javax.swing.JLabel LabelPredio_BDDiagConfDesmResv;
    private javax.swing.JLabel LabelPredio_BDDialogConfExcRec;
    private javax.swing.JLabel LabelRecDiagConfDesmResv;
    private javax.swing.JLabel LabelRec_BDDiagConfDesmResv;
    private javax.swing.JLabel LabelSubDiagConfDesmResv;
    private javax.swing.JLabel LabelSubDiagConfExcUsr;
    private javax.swing.JLabel LabelSubDialogConfExcRec;
    private javax.swing.JLabel LabelSubTelaCadSelc;
    private javax.swing.JLabel LabelSubTelaDescRec;
    private javax.swing.JLabel LabelSubTelaDescSelc;
    private javax.swing.JLabel LabelSubTelaListSelc;
    private javax.swing.JLabel LabelSubTelaListUsr;
    private javax.swing.JLabel LabelSubTelaMenu;
    private javax.swing.JLabel LabelSubTelaRemUsr;
    private javax.swing.JLabel LabelTelaCadRec;
    private javax.swing.JLabel LabelTelaCadResv;
    private javax.swing.JLabel LabelTelaCadSelc;
    private javax.swing.JLabel LabelTelaCadUsr;
    private javax.swing.JLabel LabelTelaMenu;
    private javax.swing.JLabel LabelTelfTelaCadUsr;
    private javax.swing.JLabel LabelTipoCadRec;
    private javax.swing.JLabel LabelTipoCadResv;
    private javax.swing.JLabel LabelTipoDiagConfDesmResv;
    private javax.swing.JLabel LabelTipoDialogConfExcRec;
    private javax.swing.JLabel LabelTipoTelaExcluirRec;
    private javax.swing.JLabel LabelTipoTelaListRec;
    private javax.swing.JLabel LabelTipo_BDDiagConfDesmResv;
    private javax.swing.JLabel LabelTipo_BDDialogConfExcRec;
    private javax.swing.JLabel LabelUsuarioCadResv;
    private javax.swing.JLabel LabelUsuarioListResvUsr;
    private javax.swing.JLabel LabelUsuarioTelaDesmResv;
    private javax.swing.JScrollPane ScrolDesmResv;
    private javax.swing.JScrollPane ScrolExcluirRec;
    private javax.swing.JScrollPane ScrolListaRecursos;
    private javax.swing.JScrollPane ScrolListaResvUsr;
    private javax.swing.JScrollPane ScrolListaUsr;
    private javax.swing.JScrollPane ScrolRemUsr;
    private javax.swing.JSeparator SeparadorCadResv;
    private javax.swing.JTextField TF_EmailCadUsr;
    private javax.swing.JTextField TF_NUSPCadResv;
    private javax.swing.JTextField TF_NUSPCadUsr;
    private javax.swing.JTextField TF_NUSP_DesmResv;
    private javax.swing.JTextField TF_NUSP_ListResvUsr;
    private javax.swing.JTextField TF_NomeCadRec;
    private javax.swing.JTextField TF_NomeCadUsr;
    private javax.swing.JTextField TF_TelfCadUsr;
    private javax.swing.JTable TabelaDesmResv;
    private javax.swing.JTable TabelaExcluirRec;
    private javax.swing.JTable TabelaListaRec;
    private javax.swing.JTable TabelaListaReserUsr;
    private javax.swing.JTable TabelaListaUsr;
    private javax.swing.JTable TabelaRemUsr;
    private javax.swing.JPanel TelaCadastraReserva;
    private javax.swing.JPanel TelaCadastroRecurso;
    private javax.swing.JPanel TelaCadastroUsuario;
    private javax.swing.JPanel TelaDescadastrarRecurso;
    private javax.swing.JPanel TelaDescadastrarSelecao;
    private javax.swing.JPanel TelaDesmarcarReserva;
    private javax.swing.JPanel TelaListaRecursos;
    private javax.swing.JPanel TelaListaReservasUsuarios;
    private javax.swing.JPanel TelaListaSelecao;
    private javax.swing.JPanel TelaListaUsuarios;
    private javax.swing.JPanel TelaMenu;
    private javax.swing.JPanel TelaRemoverUsuario;
    private javax.swing.JPanel TelaSelecaoCadastro;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
