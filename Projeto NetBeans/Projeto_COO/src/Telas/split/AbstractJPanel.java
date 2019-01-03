/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.split;

import java.awt.Component;

/**
 *
 * @author Fernando
 */
public abstract class AbstractJPanel extends javax.swing.JPanel{
    
    protected boolean modified;
    
    public AbstractJPanel(){
        modified = true;
    }
    
    public void desabilitaVisibilidade(){
        this.setVisible(false);
        Component[] array = this.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }
    
    public void habilitaVisibilidade(){
        this.setVisible(true);
        Component[] array = this.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }
}
