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
        MessageReader reader = new RandomReader();
        MessageWriter writer = new GUIWriter();
        
        MessageManager mm = new MessageManager(reader, writer);
        
        mm.copy();
    }
}
