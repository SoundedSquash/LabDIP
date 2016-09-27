/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author wboyer
 */
public class GUIWriter implements Writer {
    
    public void writeMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
}
