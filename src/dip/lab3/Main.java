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
public class Main {
    public static void main(String[] args) {
        Reader reader = new RandomReader();
        Writer writer = new GUIWriter();
        
        MessageManager mm = new MessageManager(reader, writer);
        
        mm.copy();
    }
}
