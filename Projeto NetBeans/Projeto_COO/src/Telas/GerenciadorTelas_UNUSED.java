/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import javax.swing.JFrame;

/**
 *
 * @author Lucas
 */
public class GerenciadorTelas_UNUSED extends JFrame{
    public static void main(String[] args) {
        
    }
    public static void trocarTela(JFrame atual, JFrame nova){
        nova.setVisible(true);
        atual.setVisible(false);
    }
}
