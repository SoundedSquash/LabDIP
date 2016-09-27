/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Random;

/**
 *
 * @author wboyer
 */
public class RandomReader implements MessageReader {
    
    public String readMessage(){
        Random rand = new Random();
        String[] messages = {
            "Hello! Welcome to Advanced Java.",
            "This is a sample message.",
            "Hello world.",
            "This message will self destruct."
        };
    
    return messages[rand.nextInt(messages.length)];
    }
}
