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
public class MessageManager {
    private Reader reader;
    private Writer writer;

    public MessageManager(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }
    
    public void copy(){
        String message;
        
        message = reader.readMessage();
        writer.writeMessage(message);
    }
}
