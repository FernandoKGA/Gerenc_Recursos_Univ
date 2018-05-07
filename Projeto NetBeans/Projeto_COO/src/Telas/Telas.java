package Telas;

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
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

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
        desabilitaTelaListagem();
        desabilitaTelaRemoverUsuario();
        desabilitaTelaSelecaoCadastro();
    }
    
    // - - - - - Tela Menu - - - - - 
    private void desabilitaTelaMenu() {
        TelaMenu.setVisible(false);
        Component[] array = TelaMenu.getComponents();
        for (Component array1 : array)
            array1.setVisible(false);
    }
    
    private void habilitaTelaMenu() {
        TelaMenu.setVisible(true);
        Component[] array = TelaMenu.getComponents();
        for (Component array1 : array)
            array1.setVisible(true);
    }
    // - - - - - - - - - - - - - - - -
    
    // - - - - - Tela Cadastra Reserva - - - - - 
    private void desabilitaTelaCadastraReserva() {
        TelaCadastraReserva.setVisible(false);
        Component[] array = TelaCadastraReserva.getComponents();
        for (Component array1 : array)
            array1.setVisible(false);
    }
    
    private void habilitaTelaCadastraReserva() {
        TelaCadastraReserva.setVisible(true);
        Component[] array = TelaCadastraReserva.getComponents();
        for (Component array1 : array)
            array1.setVisible(true);
    }
    // - - - - - - - - - - - - - - - - - - - - -
    
    // - - - - - Tela Cadastro Recurso - - - - - 
    private void desabilitaTelaCadastroRecurso() {
        TelaCadastroRecurso.setVisible(false);
        Component[] array = TelaCadastroRecurso.getComponents();
        for (Component array1 : array)
            array1.setVisible(false);
    }
    
    private void habilitaTelaCadastroRecurso() {
        TelaCadastroRecurso.setVisible(true);
        Component[] array = TelaCadastroRecurso.getComponents();
        for (Component array1 : array)
            array1.setVisible(true);
    }
    // - - - - - - - - - - - - - - - - - - - - -
    
    // - - - - - Tela Cadastro Usuario - - - - - 
    private void desabilitaTelaCadastroUsuario() {
        TelaCadastroUsuario.setVisible(false);
        Component[] array = TelaCadastroUsuario.getComponents();
        for (Component array1 : array)
            array1.setVisible(false);
    }
    
    private void habilitaTelaCadastroUsuario() {
        TelaCadastroUsuario.setVisible(true);
        Component[] array = TelaCadastroUsuario.getComponents();
        for (Component array1 : array)
            array1.setVisible(true);
    }
    // - - - - - - - - - - - - - - - - - - - - -
    
    // - - - - - Tela Descadastrar Recurso - - - - -
    private void desabilitaTelaDescadastrarRecurso() {
        TelaDescadastrarRecurso.setVisible(false);
        Component[] array = TelaDescadastrarRecurso.getComponents();
        for (Component array1 : array)
            array1.setVisible(false);
    }
    
    private void habilitaTelaDescadastrarRecurso() {
        TelaDescadastrarRecurso.setVisible(true);
        Component[] array = TelaDescadastrarRecurso.getComponents();
        for (Component array1 : array)
            array1.setVisible(true);
    }
    // - - - - - - - - - - - - - - - - - - - - - - -
    
    // - - - - - Tela Descadastrar Selecao - - - - - 
    private void desabilitaTelaDescadastrarSelecao() {
        TelaDescadastrarSelecao.setVisible(false);
        Component[] array = TelaDescadastrarSelecao.getComponents();
        for (Component array1 : array)
            array1.setVisible(false);
    }
    
    private void habilitaTelaDescadastrarSelecao() {
        TelaDescadastrarSelecao.setVisible(true);
        Component[] array = TelaDescadastrarSelecao.getComponents();
        for (Component array1 : array)
            array1.setVisible(true);
    }
    // - - - - - - - - - - - - - - - - - - - - - - -
    
    // - - - - - Tela Desmarcar Reserva - - - - - 
    private void desabilitaTelaDesmarcarReserva() {
        TelaDesmarcarReserva.setVisible(false);
        Component[] array = TelaDesmarcarReserva.getComponents();
        for (Component array1 : array)
            array1.setVisible(false);
    }
    
    private void habilitaTelaDesmarcarReserva() {
        TelaDesmarcarReserva.setVisible(true);
        Component[] array = TelaDesmarcarReserva.getComponents();
        for (Component array1 : array)
            array1.setVisible(true);
    }
    // - - - - - - - - - - - - - - - - - - - - -
    
    // - - - - - Tela Listagem - - - - - 
    private void desabilitaTelaListagem() {
        TelaListagem.setVisible(false);
        Component[] array = TelaListagem.getComponents();
        for (Component array1 : array)
            array1.setVisible(false);
    }
    
    private void habilitaTelaListagem() {
        TelaListagem.setVisible(true);
        Component[] array = TelaListagem.getComponents();
        for (Component array1 : array)
            array1.setVisible(true);
    }
    // - - - - - - - - - - - - - - - - -
    
    // - - - - - Tela Remover Usuario - - - - - 
    private void desabilitaTelaRemoverUsuario() {
        TelaRemoverUsuario.setVisible(false);
        Component[] array = TelaRemoverUsuario.getComponents();
        for (Component array1 : array)
            array1.setVisible(false);
    }
    
    private void habilitaTelaRemoverUsuario() {
        TelaRemoverUsuario.setVisible(true);
        Component[] array = TelaRemoverUsuario.getComponents();
        for (Component array1 : array)
            array1.setVisible(true);
    }
    // - - - - - - - - - - - - - - - - - - - -
    
    // - - - - - Tela Selecao Cadastro - - - - - 
    private void desabilitaTelaSelecaoCadastro() {
        TelaSelecaoCadastro.setVisible(false);
        Component[] array = TelaSelecaoCadastro.getComponents();
        for (Component array1 : array)
            array1.setVisible(false);
    }
    
    private void habilitaTelaSelecaoCadastro() {
        TelaSelecaoCadastro.setVisible(true);
        TelaSelecaoCadastro.setVisible(true);
        Component[] array = TelaSelecaoCadastro.getComponents();
        for (Component array1 : array)
            array1.setVisible(true);
    }
    // - - - - - - - - - - - - - - - - - - - - -
    
    private boolean verificaData( String s ) {
    	
    	// Primeiro digito do dia errado
    	if(  s.charAt(0) != '0' && s.charAt(0) != '1' && s.charAt(0) != '2' && s.charAt(0) != '3')
    		return false;

    	// Dias maiores que 31
		if( s.charAt(0) == '3' ) {
			if( s.charAt(1) != '0' && s.charAt(1) != '1' ) {
				return false;
			}
		}

		// Dia 00
		if( s.charAt(0) == '0' ) {
			if( s.charAt(1) == '0' )
				return false;
		}

		// Primeiro digito do mes incorreto
		if( s.charAt(3) != '0' && s.charAt(3) != '1' )
			return false;

		// Mes maiores que 12
		if( s.charAt(3) == '1' ) {
			if( s.charAt(4) != '0' && s.charAt(4) != '1' && s.charAt(4) != '2' )
				return false;
		}

		// Mes 00
		if( s.charAt(3) == '0' ) {
			if( s.charAt(4) == '0' )
				return false;
		}

		// Dia maior que 29 para o mes 02 (Fevereiro)
		if( s.charAt(3) == '0' && s.charAt(4) == '2' ) {
			if( s.charAt(0) == '3' ) {
				return false;
			}
		}

		// Dia 31 para os meses 04 (Abril), 06 (Junho), 09 (Setembro) e 11 (Novembro)
		if( (s.charAt(3) == '0' && (s.charAt(4) == '4' || s.charAt(4) == '6' || s.charAt(4) == '9')) || 
				( s.charAt(3) == '1' && s.charAt(4) == '1' )) {
			if( s.charAt(0) == '3' && s.charAt(1) == '1' ) {
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

        jDialog1 = new JDialog();
        jLabel42 = new JLabel();
        jLabel43 = new JLabel();
        jLabel44 = new JLabel();
        jLabel45 = new JLabel();
        jLabel46 = new JLabel();
        jButton25 = new JButton();
        jLabel47 = new JLabel();
        jButton26 = new JButton();
        jDialog2 = new JDialog();
        jLabel48 = new JLabel();
        jLabel49 = new JLabel();
        jLabel50 = new JLabel();
        jLabel51 = new JLabel();
        jButton27 = new JButton();
        jLabel52 = new JLabel();
        jButton28 = new JButton();
        jLabel53 = new JLabel();
        jLabel54 = new JLabel();
        jLabel55 = new JLabel();
        jLabel56 = new JLabel();
        jLabel57 = new JLabel();
        jLabel58 = new JLabel();
        jLabel59 = new JLabel();
        jDialog3 = new JDialog();
        jLabel60 = new JLabel();
        jLabel61 = new JLabel();
        jLabel62 = new JLabel();
        jLabel63 = new JLabel();
        jLabel64 = new JLabel();
        jLabel65 = new JLabel();
        jButton31 = new JButton();
        jButton32 = new JButton();
        TelaMenu = new JPanel();
        jButton16 = new JButton();
        jButton16.setBounds(106, 196, 190, 27);
        jButton17 = new JButton();
        jButton17.setBounds(106, 151, 190, 27);
        jLabel34 = new JLabel();
        jLabel34.setBounds(0, 47, 400, 30);
        jLabel35 = new JLabel();
        jLabel35.setVerticalAlignment(SwingConstants.BOTTOM);
        jLabel35.setBounds(0, 0, 400, 50);
        jButton18 = new JButton();
        jButton18.setBounds(106, 106, 190, 27);
        TelaSelecaoCadastro = new JPanel();
        jButton21 = new JButton();
        jButton21.setBounds(6, 245, 90, 27);
        jLabel39 = new JLabel();
        jLabel39.setBounds(0, 47, 400, 30);
        jLabel40 = new JLabel();
        jLabel40.setVerticalAlignment(SwingConstants.BOTTOM);
        jLabel40.setBounds(0, 0, 400, 50);
        jButton22 = new JButton();
        jButton22.setBounds(106, 151, 190, 27);
        jButton23 = new JButton();
        jButton23.setBounds(106, 196, 190, 27);
        jButton24 = new JButton();
        jButton24.setBounds(106, 106, 190, 27);
        TelaCadastraReserva = new JPanel();
        jLabel5 = new JLabel();
        jLabel5.setBounds(10, 155, 59, 17);
        jSeparator1 = new JSeparator();
        jSeparator1.setBounds(123, 71, 12, 201);
        jButton2 = new JButton();
        jButton2.setBounds(269, 245, 110, 30);
        jButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		// Verifica a data
        		if( verificaData(jFormattedTextField1.getText()) == true ) {
        			
        			// Verifica o recurso / predio / numero / horario
        			// if( ) {
        				
        			// }
        			
        		} else {
        			// Abrir msg de erro
        		}
        		
        	}
        });
        jComboBox1 = new JComboBox<>();
        jComboBox1.setBounds(6, 120, 110, 25);
        jComboBox2 = new JComboBox<>();
        jComboBox2.setBounds(6, 175, 110, 25);
        jComboBox3 = new JComboBox<>();
        jComboBox3.setBounds(6, 230, 110, 25);
        jRadioButton9 = new JRadioButton();
        jRadioButton9.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        jRadioButton9.setBounds(259, 140, 120, 16);
        jRadioButton11 = new JRadioButton();
        jRadioButton11.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        jRadioButton11.setBounds(259, 160, 120, 16);
        jRadioButton10 = new JRadioButton();
        jRadioButton10.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        jRadioButton10.setBounds(138, 120, 120, 16);
        jRadioButton12 = new JRadioButton();
        jRadioButton12.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        jRadioButton12.setBounds(138, 220, 120, 16);
        jRadioButton13 = new JRadioButton();
        jRadioButton13.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        jRadioButton13.setBounds(259, 180, 120, 16);
        jRadioButton14 = new JRadioButton();
        jRadioButton14.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        jRadioButton14.setBounds(259, 200, 120, 16);
        jRadioButton15 = new JRadioButton();
        jRadioButton15.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        jRadioButton15.setBounds(259, 220, 120, 16);
        jButton1 = new JButton();
        jButton1.setBounds(147, 245, 110, 30);
        jLabel3 = new JLabel();
        jLabel3.setBounds(10, 71, 35, 17);
        jFormattedTextField1 = new JFormattedTextField();
        jFormattedTextField1.setBounds(51, 67, 45, 26);
        jLabel1 = new JLabel();
        jLabel1.setVerticalAlignment(SwingConstants.BOTTOM);
        jLabel1.setBounds(0, 0, 400, 50);
        jRadioButton1 = new JRadioButton();
        jRadioButton1.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        jRadioButton1.setBounds(138, 100, 120, 16);
        jRadioButton2 = new JRadioButton();
        jRadioButton2.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        jRadioButton2.setBounds(138, 140, 120, 16);
        jRadioButton3 = new JRadioButton();
        jRadioButton3.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        jRadioButton3.setBounds(138, 160, 120, 16);
        jRadioButton4 = new JRadioButton();
        jRadioButton4.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        jRadioButton4.setBounds(138, 180, 120, 16);
        jRadioButton5 = new JRadioButton();
        jRadioButton5.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        jRadioButton5.setBounds(138, 200, 120, 16);
        jRadioButton7 = new JRadioButton();
        jRadioButton7.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        jRadioButton7.setBounds(259, 100, 120, 16);
        jRadioButton8 = new JRadioButton();
        jRadioButton8.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        jRadioButton8.setBounds(259, 120, 120, 16);
        jLabel2 = new JLabel();
        jLabel2.setBounds(10, 210, 59, 17);
        jLabel4 = new JLabel();
        jLabel4.setBounds(10, 100, 48, 17);
        TelaCadastroRecurso = new JPanel();
        jLabel6 = new JLabel();
        jLabel6.setVerticalAlignment(SwingConstants.BOTTOM);
        jLabel6.setBounds(0, 0, 400, 50);
        jLabel7 = new JLabel();
        jLabel7.setBounds(20, 85, 121, 25);
        jTextField1 = new JTextField();
        jTextField1.setBounds(200, 85, 180, 25);
        jLabel8 = new JLabel();
        jLabel8.setBounds(20, 120, 111, 25);
        jComboBox4 = new JComboBox<>();
        jComboBox4.setBounds(200, 120, 180, 25);
        jLabel9 = new JLabel();
        jLabel9.setBounds(20, 155, 157, 25);
        jComboBox5 = new JComboBox<>();
        jComboBox5.setBounds(200, 155, 180, 25);
        jButton3 = new JButton();
        jButton3.setBounds(80, 243, 115, 30);
        jButton4 = new JButton();
        jButton4.setBounds(205, 243, 115, 30);
        jLabel41 = new JLabel();
        jLabel41.setBounds(20, 190, 199, 25);
        jComboBox17 = new JComboBox<>();
        jComboBox17.setBounds(200, 190, 180, 25);
        TelaCadastroUsuario = new JPanel();
        jLabel10 = new JLabel();
        jLabel10.setVerticalAlignment(SwingConstants.BOTTOM);
        jLabel10.setBounds(0, 0, 400, 50);
        jTextField2 = new JTextField();
        jTextField2.setBounds(160, 62, 220, 25);
        jTextField3 = new JTextField();
        jTextField3.setBounds(160, 92, 220, 25);
        jTextField4 = new JTextField();
        jTextField4.setBounds(160, 122, 220, 25);
        jComboBox6 = new JComboBox<>();
        jComboBox6.setBounds(160, 182, 220, 25);
        jLabel11 = new JLabel();
        jLabel11.setBounds(20, 62, 40, 25);
        jLabel12 = new JLabel();
        jLabel12.setBounds(20, 92, 85, 25);
        jLabel13 = new JLabel();
        jLabel13.setBounds(20, 122, 60, 25);
        jLabel14 = new JLabel();
        jLabel14.setBounds(20, 182, 42, 25);
        jLabel15 = new JLabel();
        jLabel15.setBounds(20, 212, 41, 25);
        jComboBox7 = new JComboBox<>();
        jComboBox7.setBounds(160, 212, 220, 25);
        jLabel16 = new JLabel();
        jLabel16.setBounds(20, 152, 45, 25);
        jTextField5 = new JTextField();
        jTextField5.setBounds(160, 152, 220, 25);
        jButton5 = new JButton();
        jButton5.setBounds(80, 243, 115, 30);
        jButton6 = new JButton();
        jButton6.setBounds(205, 243, 115, 30);
        TelaListagem = new JPanel();
        jButton15 = new JButton();
        jButton15.setBounds(6, 280, 85, 29);
        jFormattedTextField3 = new JFormattedTextField();
        jFormattedTextField3.setBounds(63, 53, 64, 27);
        jComboBox13 = new JComboBox<>();
        jComboBox13.setBounds(98, 87, 122, 27);
        jLabel29 = new JLabel();
        jLabel29.setBounds(20, 90, 66, 17);
        jComboBox14 = new JComboBox<>();
        jComboBox14.setBounds(98, 114, 122, 27);
        jScrollPane1 = new JScrollPane();
        jScrollPane1.setBounds(20, 182, 360, 86);
        jList1 = new JList<>();
        jLabel30 = new JLabel();
        jLabel30.setBounds(20, 123, 48, 17);
        jLabel31 = new JLabel();
        jLabel31.setBounds(265, 90, 59, 17);
        jRadioButton29 = new JRadioButton();
        jRadioButton29.setBounds(60, 153, 110, 23);
        jComboBox15 = new JComboBox<>();
        jComboBox15.setBounds(260, 113, 122, 27);
        jRadioButton30 = new JRadioButton();
        jRadioButton30.setBounds(210, 153, 110, 23);
        jLabel32 = new JLabel();
        jLabel32.setVerticalAlignment(SwingConstants.BOTTOM);
        jLabel32.setBounds(0, 0, 400, 50);
        jLabel33 = new JLabel();
        jLabel33.setBounds(20, 60, 51, 17);
        TelaDescadastrarSelecao = new JPanel();
        jLabel22 = new JLabel();
        jLabel22.setBounds(0, 47, 400, 30);
        jLabel23 = new JLabel();
        jLabel23.setVerticalAlignment(SwingConstants.BOTTOM);
        jLabel23.setBounds(0, 0, 400, 50);
        jButton9 = new JButton();
        jButton9.setBounds(106, 106, 190, 27);
        jButton10 = new JButton();
        jButton10.setBounds(106, 151, 190, 27);
        jButton11 = new JButton();
        jButton11.setBounds(106, 196, 190, 27);
        jButton12 = new JButton();
        jButton12.setBounds(6, 245, 90, 30);
        TelaDesmarcarReserva = new JPanel();
        jButton13 = new JButton();
        jButton13.setBounds(147, 245, 110, 30);
        jButton14 = new JButton();
        jButton14.setBounds(269, 245, 110, 30);
        TelaDescadastrarRecurso = new JPanel();
        jTextField6 = new JTextField();
        jTextField6.setBounds(160, 170, 220, 25);
        jLabel17 = new JLabel();
        jLabel17.setBounds(0, 47, 400, 30);
        jLabel18 = new JLabel();
        jLabel18.setBounds(20, 110, 213, 25);
        jLabel19 = new JLabel();
        jLabel19.setBounds(20, 140, 195, 25);
        jComboBox8 = new JComboBox<>();
        jComboBox8.setBounds(160, 110, 220, 25);
        jComboBox9 = new JComboBox<>();
        jComboBox9.setBounds(160, 140, 220, 25);
        jLabel20 = new JLabel();
        jLabel20.setBounds(0, 0, 400, 50);
        jLabel20.setVerticalAlignment(SwingConstants.BOTTOM);
        jLabel21 = new JLabel();
        jLabel21.setBounds(20, 170, 182, 25);
        jButton7 = new JButton();
        jButton7.setBounds(80, 243, 115, 30);
        jButton8 = new JButton();
        jButton8.setBounds(205, 243, 115, 30);
        TelaRemoverUsuario = new JPanel();
        jLabel36 = new JLabel();
        jLabel36.setBounds(0, 47, 400, 30);
        jLabel37 = new JLabel();
        jLabel37.setVerticalAlignment(SwingConstants.BOTTOM);
        jLabel37.setBounds(0, 0, 400, 50);
        jLabel38 = new JLabel();
        jLabel38.setBounds(20, 140, 174, 25);
        jButton19 = new JButton();
        jButton19.setBounds(80, 243, 115, 30);
        jButton20 = new JButton();
        jButton20.setBounds(205, 243, 115, 30);
        jTextField7 = new JTextField();
        jTextField7.setBounds(180, 140, 200, 25);

        jDialog1.setMinimumSize(new Dimension(250, 250));

        jLabel42.setFont(new Font("SansSerif", 0, 24)); // NOI18N
        jLabel42.setForeground(new Color(255, 0, 0));
        jLabel42.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel42.setText("Confirmar Ação");

        jLabel43.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        jLabel43.setText("Nome:");

        jLabel44.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        jLabel44.setText("E-mail:");

        jLabel45.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel45.setText("Teste da Silva");

        jLabel46.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel46.setText("teste.silva@email.com");

        jButton25.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton25.setText("Confirmar");
        jButton25.setActionCommand("Sim");

        jLabel47.setFont(new Font("SansSerif", 0, 12)); // NOI18N
        jLabel47.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel47.setText("Deseja excluir o usuário?");

        jButton26.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton26.setText("Cancelar");
        jButton26.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        GroupLayout jDialog1Layout = new GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel47, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(jLabel43, GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel46, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel45, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(jButton26)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton25)
                        .addContainerGap())))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addGap(27, 27, 27)
                .addGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel45))
                .addGap(14, 14, 14)
                .addGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel46))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton26)
                    .addComponent(jButton25))
                .addGap(23, 23, 23))
        );

        jDialog2.setMinimumSize(new Dimension(250, 300));

        jLabel48.setFont(new Font("SansSerif", 0, 24)); // NOI18N
        jLabel48.setForeground(new Color(255, 0, 0));
        jLabel48.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel48.setText("Confirmar Ação");

        jLabel49.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        jLabel49.setText("Data:");

        jLabel50.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        jLabel50.setText("Recurso:");

        jLabel51.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel51.setText("15/04");

        jButton27.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton27.setText("Confirmar");
        jButton27.setActionCommand("Sim");

        jLabel52.setFont(new Font("SansSerif", 0, 12)); // NOI18N
        jLabel52.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel52.setText("Deseja desmarcar o horário?");

        jButton28.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton28.setText("Cancelar");
        jButton28.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jLabel53.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel53.setText("Sala");

        jLabel54.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        jLabel54.setText("Prédio:");

        jLabel55.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel55.setText("I1");

        jLabel56.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        jLabel56.setText("Número:");

        jLabel57.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel57.setText("219");

        jLabel58.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        jLabel58.setText("Horário:");

        jLabel59.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel59.setText("10:00 - 11:00");

        GroupLayout jDialog2Layout = new GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel52, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addComponent(jButton28)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jButton27))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel51))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel53))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel55))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel57))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel59)))
                .addContainerGap())
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel51))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel53))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jLabel59))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jDialog2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton28)
                    .addComponent(jButton27))
                .addGap(11, 11, 11))
        );

        jDialog3.setMinimumSize(new Dimension(250, 250));

        jLabel60.setFont(new Font("SansSerif", 0, 24)); // NOI18N
        jLabel60.setForeground(new Color(255, 0, 0));
        jLabel60.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel60.setText("Confirmar Ação");

        jLabel61.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        jLabel61.setText("Nome:");

        jLabel62.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        jLabel62.setText("Localização:");

        jLabel63.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel63.setText("I1-TESTE");

        jLabel64.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel64.setText("I1");

        jLabel65.setFont(new Font("SansSerif", 0, 12)); // NOI18N
        jLabel65.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel65.setText("Deseja excluir este recurso?");

        jButton31.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton31.setText("Cancelar");
        jButton31.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton32.setText("Confirmar");
        jButton32.setActionCommand("Sim");

        GroupLayout jDialog3Layout = new GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel60, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel65, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(jLabel61))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel64, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel63, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)))
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton31)
                .addGap(18, 18, 18)
                .addComponent(jButton32)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65)
                .addGap(34, 34, 34)
                .addGroup(jDialog3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jLabel63))
                .addGap(14, 14, 14)
                .addGroup(jDialog3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jLabel64))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jDialog3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton31)
                    .addComponent(jButton32))
                .addGap(14, 14, 14))
        );

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300));
        getContentPane().setLayout(new CardLayout());

        TelaMenu.setPreferredSize(new Dimension(400, 300));

        jButton16.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton16.setText("Excluir");
        jButton16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton17.setText("Listagem");
        jButton17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel34.setText("Sistema de Alocação de Recursos");

        jLabel35.setFont(new Font("SansSerif", 0, 24)); // NOI18N
        jLabel35.setForeground(new Color(250, 0, 0));
        jLabel35.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel35.setText(" DIONISO");

        jButton18.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton18.setText("Cadastro");
        jButton18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        getContentPane().add(TelaMenu, "card9");
        TelaMenu.setLayout(null);
        TelaMenu.add(jLabel35);
        TelaMenu.add(jLabel34);
        TelaMenu.add(jButton18);
        TelaMenu.add(jButton17);
        TelaMenu.add(jButton16);

        TelaSelecaoCadastro.setPreferredSize(new Dimension(400, 300));

        jButton21.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton21.setText("Voltar");
        jButton21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel39.setText("    Selecione a operação desejada:");

        jLabel40.setFont(new Font("SansSerif", 0, 24)); // NOI18N
        jLabel40.setForeground(new Color(255, 0, 0));
        jLabel40.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel40.setText(" CADASTRO");
        jLabel40.setToolTipText("");

        jButton22.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton22.setText("Novo Usuário");
        jButton22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton23.setText("Novo Recurso");
        jButton23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton24.setText("Reservar Recurso");
        jButton24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        getContentPane().add(TelaSelecaoCadastro, "card11");
        TelaSelecaoCadastro.setLayout(null);
        TelaSelecaoCadastro.add(jButton24);
        TelaSelecaoCadastro.add(jButton22);
        TelaSelecaoCadastro.add(jButton23);
        TelaSelecaoCadastro.add(jLabel40);
        TelaSelecaoCadastro.add(jLabel39);
        TelaSelecaoCadastro.add(jButton21);

        TelaCadastraReserva.setPreferredSize(new Dimension(400, 300));

        jLabel5.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Tipo");

        jSeparator1.setOrientation(SwingConstants.VERTICAL);

        jButton2.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton2.setText("Cadastrar");

        jComboBox1.setPreferredSize(new Dimension(70, 20));
        jComboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setPreferredSize(new Dimension(70, 20));
        jComboBox2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setPreferredSize(new Dimension(70, 20));
        jComboBox3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jRadioButton9.setText("17:00 - 18:00");

        jRadioButton11.setText("18:00 - 19:00");

        jRadioButton10.setText("09:00 - 10:00");
        jRadioButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        jRadioButton12.setText("14:00 - 15:00");

        jRadioButton13.setText("19:00 - 20:00");

        jRadioButton14.setText("20:00 - 21:00");

        jRadioButton15.setText("21:00 - 22:00");

        jButton1.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Data");

        try {
            jFormattedTextField1.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##")));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setHorizontalAlignment(JTextField.CENTER);

        jLabel1.setFont(new Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setForeground(new Color(250, 0, 0));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE RESERVA");

        jRadioButton1.setText("08:00 - 09:00");
        jRadioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("10:00 - 11:00");

        jRadioButton3.setText("11:00 - 12:00");

        jRadioButton4.setText("12:00 - 13:00");

        jRadioButton5.setText("13:00 - 14:00");

        jRadioButton7.setText("15:00 - 16:00");

        jRadioButton8.setText("16:00 - 17:00");

        jLabel2.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Recurso");

        jLabel4.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Prédio");

        getContentPane().add(TelaCadastraReserva, "card2");
        TelaCadastraReserva.setLayout(null);
        TelaCadastraReserva.add(jLabel1);
        TelaCadastraReserva.add(jLabel5);
        TelaCadastraReserva.add(jLabel3);
        TelaCadastraReserva.add(jFormattedTextField1);
        TelaCadastraReserva.add(jLabel2);
        TelaCadastraReserva.add(jLabel4);
        TelaCadastraReserva.add(jComboBox1);
        TelaCadastraReserva.add(jComboBox2);
        TelaCadastraReserva.add(jComboBox3);
        TelaCadastraReserva.add(jSeparator1);
        TelaCadastraReserva.add(jRadioButton2);
        TelaCadastraReserva.add(jRadioButton5);
        TelaCadastraReserva.add(jRadioButton3);
        TelaCadastraReserva.add(jRadioButton4);
        TelaCadastraReserva.add(jRadioButton12);
        TelaCadastraReserva.add(jRadioButton1);
        TelaCadastraReserva.add(jRadioButton10);
        TelaCadastraReserva.add(jRadioButton8);
        TelaCadastraReserva.add(jRadioButton9);
        TelaCadastraReserva.add(jRadioButton7);
        TelaCadastraReserva.add(jRadioButton11);
        TelaCadastraReserva.add(jRadioButton13);
        TelaCadastraReserva.add(jRadioButton14);
        TelaCadastraReserva.add(jRadioButton15);
        TelaCadastraReserva.add(jButton1);
        TelaCadastraReserva.add(jButton2);
        
        lblUsurio = new JLabel();
        lblUsurio.setText("Usuário");
        lblUsurio.setFont(new Font("SansSerif", Font.PLAIN, 14));
        lblUsurio.setBounds(147, 71, 59, 17);
        TelaCadastraReserva.add(lblUsurio);
        
        textField = new JTextField();
        textField.setBounds(213, 65, 166, 26);
        TelaCadastraReserva.add(textField);
        textField.setColumns(10);

        TelaCadastroRecurso.setPreferredSize(new Dimension(400, 300));

        jLabel6.setFont(new Font("SansSerif", 0, 24)); // NOI18N
        jLabel6.setForeground(new Color(250, 0, 0));
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setText("CADASTRO DE RECURSO");

        jLabel7.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Nome do Recurso");

        jTextField1.setFont(new Font("SansSerif", 0, 12)); // NOI18N
        jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText("Tipo de Recurso");

        jComboBox4.setFont(new Font("SansSerif", 0, 12)); // NOI18N
        jComboBox4.setModel(new DefaultComboBoxModel<>(new String[] { "Sala", "Laboratório", "Auditório" }));
        jComboBox4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("Identificador do Prédio");

        jComboBox5.setFont(new Font("SansSerif", 0, 12)); // NOI18N
        jComboBox5.setModel(new DefaultComboBoxModel<>(new String[] { "I1" }));

        jButton3.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton4.setText("Cadastrar");

        jLabel41.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel41.setText("Espec. Curso");

        jComboBox17.setFont(new Font("SansSerif", 0, 12)); // NOI18N
        jComboBox17.setModel(new DefaultComboBoxModel<>(new String[] { "SI" }));

        getContentPane().add(TelaCadastroRecurso, "card4");
        TelaCadastroRecurso.setLayout(null);
        TelaCadastroRecurso.add(jLabel6);
        TelaCadastroRecurso.add(jButton3);
        TelaCadastroRecurso.add(jLabel7);
        TelaCadastroRecurso.add(jLabel8);
        TelaCadastroRecurso.add(jLabel9);
        TelaCadastroRecurso.add(jLabel41);
        TelaCadastroRecurso.add(jButton4);
        TelaCadastroRecurso.add(jTextField1);
        TelaCadastroRecurso.add(jComboBox4);
        TelaCadastroRecurso.add(jComboBox5);
        TelaCadastroRecurso.add(jComboBox17);

        TelaCadastroUsuario.setPreferredSize(new Dimension(400, 300));

        jLabel10.setFont(new Font("SansSerif", 0, 24)); // NOI18N
        jLabel10.setForeground(new Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel10.setText("CADASTRO DE USUÁRIO");

        jTextField2.setFont(new Font("SansSerif", 0, 12)); // NOI18N

        jTextField3.setFont(new Font("SansSerif", 0, 12)); // NOI18N

        jTextField4.setFont(new Font("SansSerif", 0, 12)); // NOI18N

        jComboBox6.setFont(new Font("SansSerif", 0, 12)); // NOI18N
        jComboBox6.setModel(new DefaultComboBoxModel<>(new String[] { "Aluno Graduação", "Professor", "Coordenador de Curso" }));

        jLabel11.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setText("Nome");

        jLabel12.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setText("Número USP");

        jLabel13.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel13.setText("Telefone");

        jLabel14.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel14.setText("Cargo");

        jLabel15.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel15.setText("Curso");

        jComboBox7.setFont(new Font("SansSerif", 0, 12)); // NOI18N
        jComboBox7.setModel(new DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jLabel16.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel16.setText("E-mail");

        jTextField5.setFont(new Font("SansSerif", 0, 12)); // NOI18N

        jButton5.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton5.setText("Cancelar");
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton6.setText("Cadastrar");

        getContentPane().add(TelaCadastroUsuario, "card5");
        TelaCadastroUsuario.setLayout(null);
        TelaCadastroUsuario.add(jLabel10);
        TelaCadastroUsuario.add(jLabel11);
        TelaCadastroUsuario.add(jLabel12);
        TelaCadastroUsuario.add(jLabel13);
        TelaCadastroUsuario.add(jLabel16);
        TelaCadastroUsuario.add(jLabel14);
        TelaCadastroUsuario.add(jLabel15);
        TelaCadastroUsuario.add(jTextField2);
        TelaCadastroUsuario.add(jTextField3);
        TelaCadastroUsuario.add(jTextField4);
        TelaCadastroUsuario.add(jComboBox6);
        TelaCadastroUsuario.add(jComboBox7);
        TelaCadastroUsuario.add(jTextField5);
        TelaCadastroUsuario.add(jButton5);
        TelaCadastroUsuario.add(jButton6);

        TelaListagem.setPreferredSize(new Dimension(400, 300));

        jButton15.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton15.setText("Voltar");
        jButton15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        try {
            jFormattedTextField3.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##")));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField3.setHorizontalAlignment(JTextField.CENTER);
        jFormattedTextField3.setFont(new Font("SansSerif", 0, 14)); // NOI18N

        jComboBox13.setFont(new Font("SansSerif", 0, 12)); // NOI18N
        jComboBox13.setModel(new DefaultComboBoxModel<>(new String[] { "Sala", "Laboratório", "Auditório" }));
        jComboBox13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox13ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel29.setText("Recurso");

        jComboBox14.setFont(new Font("SansSerif", 0, 12)); // NOI18N
        jComboBox14.setModel(new DefaultComboBoxModel<>(new String[] { "I1", "CB" }));

        jList1.setFont(new Font("SansSerif", 0, 12)); // NOI18N
        jList1.setModel(new AbstractListModel<String>() {
            String[] strings = { "08:00 - 09:00", "09:00 - 10:00", "10:00 - 11:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00", "20:00 - 21:00", "21:00 - 22:00" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setMaximumSize(new Dimension(71, 200));
        jList1.setMinimumSize(new Dimension(71, 200));
        jScrollPane1.setRowHeaderView(jList1);

        jLabel30.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel30.setText("Prédio");

        jLabel31.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel31.setText("Número");

        jRadioButton29.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jRadioButton29.setText("Reservados");
        jRadioButton29.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton29ActionPerformed(evt);
            }
        });

        jComboBox15.setFont(new Font("SansSerif", 0, 12)); // NOI18N
        jComboBox15.setModel(new DefaultComboBoxModel<>(new String[] { "219", "111" }));

        jRadioButton30.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jRadioButton30.setText("Disponíveis");
        jRadioButton30.setMaximumSize(new Dimension(200, 27));
        jRadioButton30.setMinimumSize(new Dimension(200, 27));
        jRadioButton30.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton30ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new Font("SansSerif", 0, 24)); // NOI18N
        jLabel32.setForeground(new Color(250, 0, 0));
        jLabel32.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel32.setText("LISTAGEM");

        jLabel33.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel33.setText("Data:");

        getContentPane().add(TelaListagem, "card8");
        TelaListagem.setLayout(null);
        TelaListagem.add(jButton15);
        TelaListagem.add(jScrollPane1);
        TelaListagem.add(jLabel33);
        TelaListagem.add(jFormattedTextField3);
        TelaListagem.add(jRadioButton29);
        TelaListagem.add(jLabel29);
        TelaListagem.add(jLabel30);
        TelaListagem.add(jComboBox14);
        TelaListagem.add(jComboBox13);
        TelaListagem.add(jRadioButton30);
        TelaListagem.add(jLabel31);
        TelaListagem.add(jComboBox15);
        TelaListagem.add(jLabel32);

        TelaDescadastrarSelecao.setPreferredSize(new Dimension(400, 300));

        jLabel22.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel22.setText("   Selecione a operação desejada:");

        jLabel23.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setForeground(new Color(255, 0, 0));
        jLabel23.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel23.setText(" EXCLUIR");
        jLabel23.setToolTipText("");

        jButton9.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton9.setText("Excluir Usuário");
        jButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton10.setText("Excluir Recurso");
        jButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton11.setText("Desmarcar Reserva");
        jButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton12.setText("Voltar");
        jButton12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        getContentPane().add(TelaDescadastrarSelecao, "card6");
        TelaDescadastrarSelecao.setLayout(null);
        TelaDescadastrarSelecao.add(jButton11);
        TelaDescadastrarSelecao.add(jButton9);
        TelaDescadastrarSelecao.add(jButton10);
        TelaDescadastrarSelecao.add(jLabel23);
        TelaDescadastrarSelecao.add(jLabel22);
        TelaDescadastrarSelecao.add(jButton12);

        TelaDesmarcarReserva.setPreferredSize(new Dimension(400, 300));

        jButton13.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton13.setText("Voltar");
        jButton13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton14.setText("Desmarcar");
        jButton14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        getContentPane().add(TelaDesmarcarReserva, "card7");
        TelaDesmarcarReserva.setLayout(null);
        TelaDesmarcarReserva.add(jButton13);
        TelaDesmarcarReserva.add(jButton14);
        
        JLabel label = new JLabel();
        label.setText("Número:");
        label.setFont(new Font("SansSerif", Font.PLAIN, 14));
        label.setBounds(10, 210, 59, 17);
        TelaDesmarcarReserva.add(label);
        
        JLabel label_1 = new JLabel();
        label_1.setText("Data:");
        label_1.setFont(new Font("SansSerif", Font.PLAIN, 14));
        label_1.setBounds(10, 71, 35, 17);
        TelaDesmarcarReserva.add(label_1);
        
        JFormattedTextField formattedTextField = new JFormattedTextField();
        formattedTextField.setHorizontalAlignment(SwingConstants.CENTER);
        formattedTextField.setBounds(51, 67, 45, 26);
        TelaDesmarcarReserva.add(formattedTextField);
        try {
            formattedTextField.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##")));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        
        JLabel label_2 = new JLabel();
        label_2.setText("Recurso:");
        label_2.setFont(new Font("SansSerif", Font.PLAIN, 14));
        label_2.setBounds(10, 100, 59, 17);
        TelaDesmarcarReserva.add(label_2);
        
        JLabel label_3 = new JLabel();
        label_3.setText("Prédio:");
        label_3.setFont(new Font("SansSerif", Font.PLAIN, 14));
        label_3.setBounds(10, 155, 48, 17);
        TelaDesmarcarReserva.add(label_3);
        
        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.setPreferredSize(new Dimension(70, 20));
        comboBox.setBounds(6, 120, 110, 25);
        TelaDesmarcarReserva.add(comboBox);
        
        JComboBox<String> comboBox_1 = new JComboBox<String>();
        comboBox_1.setPreferredSize(new Dimension(70, 20));
        comboBox_1.setBounds(6, 175, 110, 25);
        TelaDesmarcarReserva.add(comboBox_1);
        
        JRadioButton radioButton = new JRadioButton();
        radioButton.setText("10:00 - 11:00");
        radioButton.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        radioButton.setBounds(138, 140, 120, 16);
        TelaDesmarcarReserva.add(radioButton);
        
        JRadioButton radioButton_1 = new JRadioButton();
        radioButton_1.setText("13:00 - 14:00");
        radioButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        radioButton_1.setBounds(138, 200, 120, 16);
        TelaDesmarcarReserva.add(radioButton_1);
        
        JRadioButton radioButton_2 = new JRadioButton();
        radioButton_2.setText("11:00 - 12:00");
        radioButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        radioButton_2.setBounds(138, 160, 120, 16);
        TelaDesmarcarReserva.add(radioButton_2);
        
        JRadioButton radioButton_3 = new JRadioButton();
        radioButton_3.setText("12:00 - 13:00");
        radioButton_3.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        radioButton_3.setBounds(138, 180, 120, 16);
        TelaDesmarcarReserva.add(radioButton_3);
        
        JRadioButton radioButton_4 = new JRadioButton();
        radioButton_4.setText("14:00 - 15:00");
        radioButton_4.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        radioButton_4.setBounds(138, 220, 120, 16);
        TelaDesmarcarReserva.add(radioButton_4);
        
        JRadioButton radioButton_5 = new JRadioButton();
        radioButton_5.setText("08:00 - 09:00");
        radioButton_5.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        radioButton_5.setBounds(138, 100, 120, 16);
        TelaDesmarcarReserva.add(radioButton_5);
        
        JRadioButton radioButton_6 = new JRadioButton();
        radioButton_6.setText("09:00 - 10:00");
        radioButton_6.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        radioButton_6.setBounds(138, 120, 120, 16);
        TelaDesmarcarReserva.add(radioButton_6);
        
        JRadioButton radioButton_7 = new JRadioButton();
        radioButton_7.setText("16:00 - 17:00");
        radioButton_7.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        radioButton_7.setBounds(259, 120, 120, 16);
        TelaDesmarcarReserva.add(radioButton_7);
        
        JRadioButton radioButton_8 = new JRadioButton();
        radioButton_8.setText("17:00 - 18:00");
        radioButton_8.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        radioButton_8.setBounds(259, 140, 120, 16);
        TelaDesmarcarReserva.add(radioButton_8);
        
        JRadioButton radioButton_9 = new JRadioButton();
        radioButton_9.setText("15:00 - 16:00");
        radioButton_9.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        radioButton_9.setBounds(259, 100, 120, 16);
        TelaDesmarcarReserva.add(radioButton_9);
        
        JRadioButton radioButton_10 = new JRadioButton();
        radioButton_10.setText("18:00 - 19:00");
        radioButton_10.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        radioButton_10.setBounds(259, 160, 120, 16);
        TelaDesmarcarReserva.add(radioButton_10);
        
        JRadioButton radioButton_11 = new JRadioButton();
        radioButton_11.setText("19:00 - 20:00");
        radioButton_11.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        radioButton_11.setBounds(259, 180, 120, 16);
        TelaDesmarcarReserva.add(radioButton_11);
        
        JRadioButton radioButton_12 = new JRadioButton();
        radioButton_12.setText("20:00 - 21:00");
        radioButton_12.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        radioButton_12.setBounds(259, 200, 120, 16);
        TelaDesmarcarReserva.add(radioButton_12);
        
        JRadioButton radioButton_13 = new JRadioButton();
        radioButton_13.setText("21:00 - 22:00");
        radioButton_13.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        radioButton_13.setBounds(259, 220, 120, 16);
        TelaDesmarcarReserva.add(radioButton_13);
        
        JComboBox<String> comboBox_2 = new JComboBox<String>();
        comboBox_2.setPreferredSize(new Dimension(70, 20));
        comboBox_2.setBounds(6, 230, 110, 25);
        TelaDesmarcarReserva.add(comboBox_2);
        
        JSeparator separator = new JSeparator();
        separator.setOrientation(SwingConstants.VERTICAL);
        separator.setBounds(123, 71, 12, 201);
        TelaDesmarcarReserva.add(separator);
        
        JLabel lblDesmarcarReserva = new JLabel();
        lblDesmarcarReserva.setVerticalAlignment(SwingConstants.BOTTOM);
        lblDesmarcarReserva.setText("DESMARCAR RESERVA");
        lblDesmarcarReserva.setHorizontalAlignment(SwingConstants.CENTER);
        lblDesmarcarReserva.setForeground(new Color(250, 0, 0));
        lblDesmarcarReserva.setFont(new Font("SansSerif", Font.PLAIN, 24));
        lblDesmarcarReserva.setBounds(0, 0, 400, 50);
        TelaDesmarcarReserva.add(lblDesmarcarReserva);
        
        label_4 = new JLabel();
        label_4.setText("Usuário");
        label_4.setFont(new Font("SansSerif", Font.PLAIN, 14));
        label_4.setBounds(147, 71, 59, 17);
        TelaDesmarcarReserva.add(label_4);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(213, 65, 166, 26);
        TelaDesmarcarReserva.add(textField_1);

        TelaDescadastrarRecurso.setPreferredSize(new Dimension(400, 300));

        jTextField6.setFont(new Font("SansSerif", 0, 12)); // NOI18N

        jLabel17.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel17.setText("Remoção de Recurso do Sistema Dioniso");

        jLabel18.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel18.setText("Predio");

        jLabel19.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel19.setText("Tipo");

        jComboBox8.setFont(new Font("SansSerif", 0, 12)); // NOI18N
        jComboBox8.setModel(new DefaultComboBoxModel<>(new String[] { "I1" }));
        jComboBox8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });

        jComboBox9.setFont(new Font("SansSerif", 0, 12)); // NOI18N
        jComboBox9.setModel(new DefaultComboBoxModel<>(new String[] { "Sala" }));

        jLabel20.setFont(new Font("SansSerif", 0, 24)); // NOI18N
        jLabel20.setForeground(new Color(255, 0, 0));
        jLabel20.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel20.setText("EXCLUIR RECURSO");
        jLabel20.setToolTipText("");

        jLabel21.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel21.setText("Recurso");

        jButton7.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton7.setText("Cancelar");
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton8.setText("Buscar");
        jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        getContentPane().add(TelaDescadastrarRecurso, "card5");
        TelaDescadastrarRecurso.setLayout(null);
        TelaDescadastrarRecurso.add(jLabel20);
        TelaDescadastrarRecurso.add(jLabel17);
        TelaDescadastrarRecurso.add(jLabel21);
        TelaDescadastrarRecurso.add(jLabel18);
        TelaDescadastrarRecurso.add(jLabel19);
        TelaDescadastrarRecurso.add(jTextField6);
        TelaDescadastrarRecurso.add(jComboBox8);
        TelaDescadastrarRecurso.add(jComboBox9);
        TelaDescadastrarRecurso.add(jButton7);
        TelaDescadastrarRecurso.add(jButton8);

        TelaRemoverUsuario.setPreferredSize(new Dimension(400, 300));

        jLabel36.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel36.setText("Remoção de Usuário do Sistema Dioniso");

        jLabel37.setFont(new Font("SansSerif", 0, 24)); // NOI18N
        jLabel37.setForeground(new Color(255, 0, 0));
        jLabel37.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel37.setText("EXCLUIR USUÁRIO");
        jLabel37.setToolTipText("");

        jLabel38.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel38.setText("nUSP do usuário");

        jButton19.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton19.setText("Cancelar");
        jButton19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton20.setText("Buscar");
        jButton20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jTextField7.setFont(new Font("SansSerif", 0, 12));

        getContentPane().add(TelaRemoverUsuario, "card10");
        TelaRemoverUsuario.setLayout(null);
        TelaRemoverUsuario.add(jLabel37);
        TelaRemoverUsuario.add(jLabel36);
        TelaRemoverUsuario.add(jLabel38);
        TelaRemoverUsuario.add(jTextField7);
        TelaRemoverUsuario.add(jButton19);
        TelaRemoverUsuario.add(jButton20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton10ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jComboBox3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton9ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        habilitaTelaRemoverUsuario();
        desabilitaTelaDescadastrarSelecao();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox13ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jComboBox13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox13ActionPerformed

    private void jRadioButton29ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jRadioButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton29ActionPerformed

    private void jRadioButton30ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jRadioButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton30ActionPerformed

    private void jButton16ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        habilitaTelaDescadastrarSelecao();
        desabilitaTelaMenu();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        //Butto2 - "Listagem": Abre TelaListagem
        habilitaTelaListagem();
        desabilitaTelaMenu();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        //Button  1 - "Cadastrar": Abre TelaSelecaoCadastro
        habilitaTelaSelecaoCadastro();
        desabilitaTelaMenu();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton20ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton22ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        habilitaTelaCadastroUsuario();
        desabilitaTelaSelecaoCadastro();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton24ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        habilitaTelaCadastraReserva();
        desabilitaTelaSelecaoCadastro();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton23ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        habilitaTelaCadastroRecurso();
        desabilitaTelaSelecaoCadastro();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton21ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        habilitaTelaMenu();
        desabilitaTelaSelecaoCadastro();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        habilitaTelaSelecaoCadastro();
        desabilitaTelaCadastraReserva();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        habilitaTelaSelecaoCadastro();
        desabilitaTelaCadastroUsuario();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton15ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        habilitaTelaMenu();
        desabilitaTelaListagem();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton10ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        habilitaTelaDescadastrarRecurso();
        desabilitaTelaDescadastrarSelecao();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        habilitaTelaDesmarcarReserva();
        desabilitaTelaDescadastrarSelecao();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        habilitaTelaMenu();
        desabilitaTelaDescadastrarSelecao();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        habilitaTelaDescadastrarSelecao();
        desabilitaTelaDescadastrarRecurso();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton13ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        habilitaTelaDescadastrarSelecao();
        desabilitaTelaDesmarcarReserva();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton19ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        habilitaTelaDescadastrarSelecao();
        desabilitaTelaRemoverUsuario();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jComboBox8ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jButton3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        habilitaTelaSelecaoCadastro();
        desabilitaTelaCadastroRecurso();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton26ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton14ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        jDialog2.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton28ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        jDialog2.setVisible(false);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton8ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jDialog3.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton31ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        jDialog3.setVisible(false);
    }//GEN-LAST:event_jButton31ActionPerformed

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
    private JPanel TelaCadastraReserva;
    private JPanel TelaCadastroRecurso;
    private JPanel TelaCadastroUsuario;
    private JPanel TelaDescadastrarRecurso;
    private JPanel TelaDescadastrarSelecao;
    private JPanel TelaDesmarcarReserva;
    private JPanel TelaListagem;
    private JPanel TelaMenu;
    private JPanel TelaRemoverUsuario;
    private JPanel TelaSelecaoCadastro;
    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton15;
    private JButton jButton16;
    private JButton jButton17;
    private JButton jButton18;
    private JButton jButton19;
    private JButton jButton2;
    private JButton jButton20;
    private JButton jButton21;
    private JButton jButton22;
    private JButton jButton23;
    private JButton jButton24;
    private JButton jButton25;
    private JButton jButton26;
    private JButton jButton27;
    private JButton jButton28;
    private JButton jButton3;
    private JButton jButton31;
    private JButton jButton32;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JComboBox<String> jComboBox1;
    private JComboBox<String> jComboBox13;
    private JComboBox<String> jComboBox14;
    private JComboBox<String> jComboBox15;
    private JComboBox<String> jComboBox17;
    private JComboBox<String> jComboBox2;
    private JComboBox<String> jComboBox3;
    private JComboBox<String> jComboBox4;
    private JComboBox<String> jComboBox5;
    private JComboBox<String> jComboBox6;
    private JComboBox<String> jComboBox7;
    private JComboBox<String> jComboBox8;
    private JComboBox<String> jComboBox9;
    private JDialog jDialog1;
    private JDialog jDialog2;
    private JDialog jDialog3;
    private JFormattedTextField jFormattedTextField1;
    private JFormattedTextField jFormattedTextField3;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel37;
    private JLabel jLabel38;
    private JLabel jLabel39;
    private JLabel jLabel4;
    private JLabel jLabel40;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JLabel jLabel44;
    private JLabel jLabel45;
    private JLabel jLabel46;
    private JLabel jLabel47;
    private JLabel jLabel48;
    private JLabel jLabel49;
    private JLabel jLabel5;
    private JLabel jLabel50;
    private JLabel jLabel51;
    private JLabel jLabel52;
    private JLabel jLabel53;
    private JLabel jLabel54;
    private JLabel jLabel55;
    private JLabel jLabel56;
    private JLabel jLabel57;
    private JLabel jLabel58;
    private JLabel jLabel59;
    private JLabel jLabel6;
    private JLabel jLabel60;
    private JLabel jLabel61;
    private JLabel jLabel62;
    private JLabel jLabel63;
    private JLabel jLabel64;
    private JLabel jLabel65;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JList<String> jList1;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton10;
    private JRadioButton jRadioButton11;
    private JRadioButton jRadioButton12;
    private JRadioButton jRadioButton13;
    private JRadioButton jRadioButton14;
    private JRadioButton jRadioButton15;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton29;
    private JRadioButton jRadioButton3;
    private JRadioButton jRadioButton30;
    private JRadioButton jRadioButton4;
    private JRadioButton jRadioButton5;
    private JRadioButton jRadioButton7;
    private JRadioButton jRadioButton8;
    private JRadioButton jRadioButton9;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;
    private JLabel lblUsurio;
    private JTextField textField;
    private JLabel label_4;
    private JTextField textField_1;
    // End of variables declaration//GEN-END:variables
}