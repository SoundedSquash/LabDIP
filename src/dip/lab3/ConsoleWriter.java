/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author wboyer
 */
public class ConsoleWriter implements MessageWriter {
    
    public void writeMessage(String message){
        System.out.println(message);
    }
}
