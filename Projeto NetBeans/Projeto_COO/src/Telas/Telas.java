/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        jButton17 = new JButton();
        jLabel34 = new JLabel();
        jLabel35 = new JLabel();
        jButton18 = new JButton();
        TelaSelecaoCadastro = new JPanel();
        jButton21 = new JButton();
        jLabel39 = new JLabel();
        jLabel40 = new JLabel();
        jButton22 = new JButton();
        jButton23 = new JButton();
        jButton24 = new JButton();
        TelaCadastraReserva = new JPanel();
        jLabel5 = new JLabel();
        jSeparator1 = new JSeparator();
        jButton2 = new JButton();
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
        jComboBox2 = new JComboBox<>();
        jComboBox3 = new JComboBox<>();
        jRadioButton9 = new JRadioButton();
        jRadioButton11 = new JRadioButton();
        jRadioButton10 = new JRadioButton();
        jRadioButton12 = new JRadioButton();
        jRadioButton13 = new JRadioButton();
        jRadioButton14 = new JRadioButton();
        jRadioButton15 = new JRadioButton();
        jButton1 = new JButton();
        jLabel3 = new JLabel();
        jFormattedTextField1 = new JFormattedTextField();
        jLabel1 = new JLabel();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        jRadioButton5 = new JRadioButton();
        jRadioButton7 = new JRadioButton();
        jRadioButton8 = new JRadioButton();
        jLabel2 = new JLabel();
        jLabel4 = new JLabel();
        TelaCadastroRecurso = new JPanel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jTextField1 = new JTextField();
        jLabel8 = new JLabel();
        jComboBox4 = new JComboBox<>();
        jLabel9 = new JLabel();
        jComboBox5 = new JComboBox<>();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jLabel41 = new JLabel();
        jComboBox17 = new JComboBox<>();
        TelaCadastroUsuario = new JPanel();
        jLabel10 = new JLabel();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jComboBox6 = new JComboBox<>();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jComboBox7 = new JComboBox<>();
        jLabel16 = new JLabel();
        jTextField5 = new JTextField();
        jButton5 = new JButton();
        jButton6 = new JButton();
        TelaListagem = new JPanel();
        jButton15 = new JButton();
        jFormattedTextField3 = new JFormattedTextField();
        jComboBox13 = new JComboBox<>();
        jLabel29 = new JLabel();
        jComboBox14 = new JComboBox<>();
        jScrollPane1 = new JScrollPane();
        jList1 = new JList<>();
        jLabel30 = new JLabel();
        jLabel31 = new JLabel();
        jRadioButton29 = new JRadioButton();
        jComboBox15 = new JComboBox<>();
        jRadioButton30 = new JRadioButton();
        jLabel32 = new JLabel();
        jLabel33 = new JLabel();
        TelaDescadastrarSelecao = new JPanel();
        jLabel22 = new JLabel();
        jLabel23 = new JLabel();
        jButton9 = new JButton();
        jButton10 = new JButton();
        jButton11 = new JButton();
        jButton12 = new JButton();
        TelaDesmarcarReserva = new JPanel();
        jLabel24 = new JLabel();
        jRadioButton6 = new JRadioButton();
        jRadioButton16 = new JRadioButton();
        jRadioButton17 = new JRadioButton();
        jRadioButton18 = new JRadioButton();
        jButton13 = new JButton();
        jLabel25 = new JLabel();
        jFormattedTextField2 = new JFormattedTextField();
        jLabel26 = new JLabel();
        jLabel27 = new JLabel();
        jLabel28 = new JLabel();
        jSeparator2 = new JSeparator();
        jButton14 = new JButton();
        jComboBox10 = new JComboBox<>();
        jComboBox11 = new JComboBox<>();
        jComboBox12 = new JComboBox<>();
        jRadioButton19 = new JRadioButton();
        jRadioButton20 = new JRadioButton();
        jRadioButton21 = new JRadioButton();
        jRadioButton22 = new JRadioButton();
        jRadioButton23 = new JRadioButton();
        jRadioButton24 = new JRadioButton();
        jRadioButton25 = new JRadioButton();
        jRadioButton26 = new JRadioButton();
        jRadioButton27 = new JRadioButton();
        jRadioButton28 = new JRadioButton();
        TelaDescadastrarRecurso = new JPanel();
        jTextField6 = new JTextField();
        jLabel17 = new JLabel();
        jLabel18 = new JLabel();
        jLabel19 = new JLabel();
        jComboBox8 = new JComboBox<>();
        jComboBox9 = new JComboBox<>();
        jLabel20 = new JLabel();
        jLabel21 = new JLabel();
        jButton7 = new JButton();
        jButton8 = new JButton();
        TelaRemoverUsuario = new JPanel();
        jLabel36 = new JLabel();
        jLabel37 = new JLabel();
        jLabel38 = new JLabel();
        jButton19 = new JButton();
        jButton20 = new JButton();
        jTextField7 = new JTextField();

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
        setPreferredSize(new Dimension(430, 360));
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

        GroupLayout TelaMenuLayout = new GroupLayout(TelaMenu);
        TelaMenu.setLayout(TelaMenuLayout);
        TelaMenuLayout.setHorizontalGroup(
            TelaMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(TelaMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                    .addGroup(TelaMenuLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(TelaMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jButton18, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton17, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)))
                .addContainerGap())
        );
        TelaMenuLayout.setVerticalGroup(
            TelaMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(TelaMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton18, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton17, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton16)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        getContentPane().add(TelaMenu, "card9");

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

        GroupLayout TelaSelecaoCadastroLayout = new GroupLayout(TelaSelecaoCadastro);
        TelaSelecaoCadastro.setLayout(TelaSelecaoCadastroLayout);
        TelaSelecaoCadastroLayout.setHorizontalGroup(
            TelaSelecaoCadastroLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, TelaSelecaoCadastroLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TelaSelecaoCadastroLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton24, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jButton22, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton23, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
            .addComponent(jLabel40, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TelaSelecaoCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(TelaSelecaoCadastroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton21, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TelaSelecaoCadastroLayout.setVerticalGroup(
            TelaSelecaoCadastroLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(TelaSelecaoCadastroLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel40)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton24)
                .addGap(18, 18, 18)
                .addComponent(jButton22)
                .addGap(16, 16, 16)
                .addComponent(jButton23)
                .addGap(30, 30, 30)
                .addComponent(jButton21, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(TelaSelecaoCadastro, "card11");

        TelaCadastraReserva.setPreferredSize(new Dimension(400, 300));

        jLabel5.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Número:");

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
        jLabel3.setText("Data:");

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
        jLabel2.setText("Recurso:");

        jLabel4.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Prédio:");

        GroupLayout TelaCadastraReservaLayout = new GroupLayout(TelaCadastraReserva);
        TelaCadastraReserva.setLayout(TelaCadastraReservaLayout);
        TelaCadastraReservaLayout.setHorizontalGroup(
            TelaCadastraReservaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaCadastraReservaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                        .addGroup(TelaCadastraReservaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                                .addGroup(TelaCadastraReservaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(0, 79, Short.MAX_VALUE))
                            .addComponent(jComboBox1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, GroupLayout.Alignment.TRAILING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(TelaCadastraReservaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addGroup(TelaCadastraReservaLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jRadioButton5, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton3, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton12, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton10, GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addGroup(TelaCadastraReservaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton8)
                            .addComponent(jRadioButton9)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton11)
                            .addComponent(jRadioButton13)
                            .addComponent(jRadioButton14)
                            .addComponent(jRadioButton15)))
                    .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18))
        );
        TelaCadastraReservaLayout.setVerticalGroup(
            TelaCadastraReservaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaCadastraReservaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                        .addGroup(TelaCadastraReservaLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jFormattedTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                    .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                        .addComponent(jRadioButton7)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton8)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton9)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton11)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton13)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton14)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton15))
                    .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                        .addGroup(TelaCadastraReservaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jRadioButton3))
                            .addGroup(TelaCadastraReservaLayout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton10)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton12))
                    .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaCadastraReservaLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        getContentPane().add(TelaCadastraReserva, "card2");

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

        GroupLayout TelaCadastroRecursoLayout = new GroupLayout(TelaCadastroRecurso);
        TelaCadastroRecurso.setLayout(TelaCadastroRecursoLayout);
        TelaCadastroRecursoLayout.setHorizontalGroup(
            TelaCadastroRecursoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TelaCadastroRecursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaCadastroRecursoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(TelaCadastroRecursoLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(57, 57, 57))
                    .addComponent(jLabel7, GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
                .addGroup(TelaCadastroRecursoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(TelaCadastroRecursoLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButton4)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, TelaCadastroRecursoLayout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(TelaCadastroRecursoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jComboBox4, 0, 201, Short.MAX_VALUE)
                            .addComponent(jComboBox5, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(GroupLayout.Alignment.TRAILING, TelaCadastroRecursoLayout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox17, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        TelaCadastroRecursoLayout.setVerticalGroup(
            TelaCadastroRecursoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroRecursoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(47, 47, 47)
                .addGroup(TelaCadastroRecursoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaCadastroRecursoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaCadastroRecursoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaCadastroRecursoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(TelaCadastroRecursoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(20, 20, 20))
        );

        getContentPane().add(TelaCadastroRecurso, "card4");

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

        GroupLayout TelaCadastroUsuarioLayout = new GroupLayout(TelaCadastroUsuario);
        TelaCadastroUsuario.setLayout(TelaCadastroUsuarioLayout);
        TelaCadastroUsuarioLayout.setHorizontalGroup(
            TelaCadastroUsuarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TelaCadastroUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaCadastroUsuarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TelaCadastroUsuarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField3, GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField4, GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox6, 0, 200, Short.MAX_VALUE)
                    .addComponent(jComboBox7, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField5))
                .addContainerGap())
            .addGroup(TelaCadastroUsuarioLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton5)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(50, 50, 50))
        );
        TelaCadastroUsuarioLayout.setVerticalGroup(
            TelaCadastroUsuarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroUsuarioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(TelaCadastroUsuarioLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaCadastroUsuarioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaCadastroUsuarioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaCadastroUsuarioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaCadastroUsuarioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBox6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaCadastroUsuarioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBox7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TelaCadastroUsuarioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        getContentPane().add(TelaCadastroUsuario, "card5");

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
        jLabel29.setText("Recursos:");

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
        jScrollPane1.setViewportView(jList1);

        jLabel30.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel30.setText("Prédio:");

        jLabel31.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel31.setText("Número:");

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

        GroupLayout TelaListagemLayout = new GroupLayout(TelaListagem);
        TelaListagem.setLayout(TelaListagemLayout);
        TelaListagemLayout.setHorizontalGroup(
            TelaListagemLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, TelaListagemLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(TelaListagemLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 371, GroupLayout.PREFERRED_SIZE)
                    .addGroup(TelaListagemLayout.createSequentialGroup()
                        .addComponent(jLabel33, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField3, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                    .addGroup(TelaListagemLayout.createSequentialGroup()
                        .addGroup(TelaListagemLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(TelaListagemLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jRadioButton29))
                            .addGroup(TelaListagemLayout.createSequentialGroup()
                                .addGroup(TelaListagemLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel30))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(TelaListagemLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox14, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                        .addGroup(TelaListagemLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(TelaListagemLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jRadioButton30, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(TelaListagemLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel31)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(jLabel32, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TelaListagemLayout.setVerticalGroup(
            TelaListagemLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(TelaListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaListagemLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jFormattedTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TelaListagemLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jComboBox13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jComboBox15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaListagemLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TelaListagemLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton29)
                    .addComponent(jRadioButton30, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15)
                .addGap(6, 6, 6))
        );

        getContentPane().add(TelaListagem, "card8");

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

        GroupLayout TelaDescadastrarSelecaoLayout = new GroupLayout(TelaDescadastrarSelecao);
        TelaDescadastrarSelecao.setLayout(TelaDescadastrarSelecaoLayout);
        TelaDescadastrarSelecaoLayout.setHorizontalGroup(
            TelaDescadastrarSelecaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, TelaDescadastrarSelecaoLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(TelaDescadastrarSelecaoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton11, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jButton9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
            .addComponent(jLabel23, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel22, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TelaDescadastrarSelecaoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TelaDescadastrarSelecaoLayout.setVerticalGroup(
            TelaDescadastrarSelecaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(TelaDescadastrarSelecaoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel23)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton11)
                .addGap(45, 45, 45)
                .addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(TelaDescadastrarSelecao, "card6");

        TelaDesmarcarReserva.setPreferredSize(new Dimension(400, 300));

        jLabel24.setFont(new Font("SansSerif", 0, 24)); // NOI18N
        jLabel24.setForeground(new Color(250, 0, 0));
        jLabel24.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel24.setText("DESMARCAR RESERVA");

        jRadioButton6.setText("08:00 - 09:00");
        jRadioButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jRadioButton16.setText("10:00 - 11:00");

        jRadioButton17.setText("11:00 - 12:00");

        jRadioButton18.setText("12:00 - 13:00");

        jButton13.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton13.setText("Voltar");
        jButton13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel25.setText("Data:");

        try {
            jFormattedTextField2.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##")));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField2.setHorizontalAlignment(JTextField.CENTER);

        jLabel26.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel26.setText("Recurso:");

        jLabel27.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel27.setText("Prédio:");

        jLabel28.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel28.setText("Número:");

        jSeparator2.setOrientation(SwingConstants.VERTICAL);

        jButton14.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jButton14.setText("Desmarcar");
        jButton14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jRadioButton19.setText("13:00 - 14:00");

        jRadioButton20.setText("15:00 - 16:00");

        jRadioButton21.setText("16:00 - 17:00");

        jRadioButton22.setText("17:00 - 18:00");

        jRadioButton23.setText("18:00 - 19:00");

        jRadioButton24.setText("09:00 - 10:00");
        jRadioButton24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton24ActionPerformed(evt);
            }
        });

        jRadioButton25.setText("14:00 - 15:00");

        jRadioButton26.setText("19:00 - 20:00");

        jRadioButton27.setText("20:00 - 21:00");

        jRadioButton28.setText("21:00 - 22:00");

        GroupLayout TelaDesmarcarReservaLayout = new GroupLayout(TelaDesmarcarReserva);
        TelaDesmarcarReserva.setLayout(TelaDesmarcarReservaLayout);
        TelaDesmarcarReservaLayout.setHorizontalGroup(
            TelaDesmarcarReservaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TelaDesmarcarReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaDesmarcarReservaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(TelaDesmarcarReservaLayout.createSequentialGroup()
                        .addGroup(TelaDesmarcarReservaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(TelaDesmarcarReservaLayout.createSequentialGroup()
                                .addGroup(TelaDesmarcarReservaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addGroup(TelaDesmarcarReservaLayout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27))
                                .addGap(0, 55, Short.MAX_VALUE))
                            .addComponent(jComboBox10, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox11, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox12, GroupLayout.Alignment.TRAILING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(TelaDesmarcarReservaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton16)
                            .addGroup(TelaDesmarcarReservaLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jRadioButton19, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton17, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton18, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton25, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton6, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton24, GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addGroup(TelaDesmarcarReservaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton21)
                            .addComponent(jRadioButton22)
                            .addComponent(jRadioButton20)
                            .addComponent(jRadioButton23)
                            .addComponent(jRadioButton26)
                            .addComponent(jRadioButton27)
                            .addComponent(jRadioButton28)))
                    .addGroup(TelaDesmarcarReservaLayout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton14)))
                .addGap(18, 18, 18))
        );
        TelaDesmarcarReservaLayout.setVerticalGroup(
            TelaDesmarcarReservaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(TelaDesmarcarReservaLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel24, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaDesmarcarReservaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(TelaDesmarcarReservaLayout.createSequentialGroup()
                        .addGroup(TelaDesmarcarReservaLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jFormattedTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox10, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox11, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addGap(3, 3, 3)
                        .addComponent(jComboBox12, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                    .addGroup(TelaDesmarcarReservaLayout.createSequentialGroup()
                        .addComponent(jRadioButton20)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton21)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton22)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton23)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton26)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton27)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton28))
                    .addGroup(TelaDesmarcarReservaLayout.createSequentialGroup()
                        .addGroup(TelaDesmarcarReservaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(TelaDesmarcarReservaLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jRadioButton17))
                            .addGroup(TelaDesmarcarReservaLayout.createSequentialGroup()
                                .addComponent(jRadioButton6)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton24)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton16)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton18)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton19)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton25))
                    .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaDesmarcarReservaLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addContainerGap())
        );

        getContentPane().add(TelaDesmarcarReserva, "card7");

        TelaDescadastrarRecurso.setPreferredSize(new Dimension(400, 300));

        jTextField6.setFont(new Font("SansSerif", 0, 12)); // NOI18N

        jLabel17.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel17.setText("Remoção de Recurso do Sistema Dioniso");

        jLabel18.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel18.setText("Selecione o prédio do recurso: ");

        jLabel19.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel19.setText("Selecione o tipo do recurso: ");

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
        jLabel21.setText("Digite o nome do recurso: ");

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

        GroupLayout TelaDescadastrarRecursoLayout = new GroupLayout(TelaDescadastrarRecurso);
        TelaDescadastrarRecurso.setLayout(TelaDescadastrarRecursoLayout);
        TelaDescadastrarRecursoLayout.setHorizontalGroup(
            TelaDescadastrarRecursoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GroupLayout.Alignment.TRAILING, TelaDescadastrarRecursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaDescadastrarRecursoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(TelaDescadastrarRecursoLayout.createSequentialGroup()
                        .addGroup(TelaDescadastrarRecursoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(TelaDescadastrarRecursoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField6)
                            .addComponent(jComboBox8, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox9, 0, 200, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(TelaDescadastrarRecursoLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton7)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addComponent(jButton8)
                        .addGap(65, 65, 65))))
        );
        TelaDescadastrarRecursoLayout.setVerticalGroup(
            TelaDescadastrarRecursoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(TelaDescadastrarRecursoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel20)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(41, 41, 41)
                .addGroup(TelaDescadastrarRecursoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBox8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(TelaDescadastrarRecursoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jComboBox9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaDescadastrarRecursoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(TelaDescadastrarRecursoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(TelaDescadastrarRecurso, "card5");

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
        jLabel38.setText("Digite o nUSP do usuário:");

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

        jTextField7.setFont(new Font("SansSerif", 0, 12)); // NOI18N

        GroupLayout TelaRemoverUsuarioLayout = new GroupLayout(TelaRemoverUsuario);
        TelaRemoverUsuario.setLayout(TelaRemoverUsuarioLayout);
        TelaRemoverUsuarioLayout.setHorizontalGroup(
            TelaRemoverUsuarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TelaRemoverUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaRemoverUsuarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(TelaRemoverUsuarioLayout.createSequentialGroup()
                        .addGroup(TelaRemoverUsuarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                            .addGroup(TelaRemoverUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(23, 23, 23)
                                .addComponent(jTextField7)))
                        .addContainerGap())
                    .addGroup(GroupLayout.Alignment.TRAILING, TelaRemoverUsuarioLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton19)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton20)
                        .addGap(59, 59, 59))))
        );
        TelaRemoverUsuarioLayout.setVerticalGroup(
            TelaRemoverUsuarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(TelaRemoverUsuarioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel37)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addGap(74, 74, 74)
                .addGroup(TelaRemoverUsuarioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(TelaRemoverUsuarioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19)
                    .addComponent(jButton20))
                .addGap(20, 20, 20))
        );

        getContentPane().add(TelaRemoverUsuario, "card10");

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

    private void jRadioButton6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton24ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jRadioButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton24ActionPerformed

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
    private JComboBox<String> jComboBox10;
    private JComboBox<String> jComboBox11;
    private JComboBox<String> jComboBox12;
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
    private JFormattedTextField jFormattedTextField2;
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
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
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
    private JRadioButton jRadioButton16;
    private JRadioButton jRadioButton17;
    private JRadioButton jRadioButton18;
    private JRadioButton jRadioButton19;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton20;
    private JRadioButton jRadioButton21;
    private JRadioButton jRadioButton22;
    private JRadioButton jRadioButton23;
    private JRadioButton jRadioButton24;
    private JRadioButton jRadioButton25;
    private JRadioButton jRadioButton26;
    private JRadioButton jRadioButton27;
    private JRadioButton jRadioButton28;
    private JRadioButton jRadioButton29;
    private JRadioButton jRadioButton3;
    private JRadioButton jRadioButton30;
    private JRadioButton jRadioButton4;
    private JRadioButton jRadioButton5;
    private JRadioButton jRadioButton6;
    private JRadioButton jRadioButton7;
    private JRadioButton jRadioButton8;
    private JRadioButton jRadioButton9;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
