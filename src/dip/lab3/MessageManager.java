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
    private MessageReader reader;
    private MessageWriter writer;

    public MessageManager(MessageReader reader, MessageWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }
    
    public void copy(){
        writer.writeMessage(reader.readMessage());
    }
}
