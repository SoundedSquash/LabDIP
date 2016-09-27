/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author wboyer
 */
public class ConsoleReader implements Reader {
    
    public String readMessage(){
    Scanner kb = new Scanner(System.in);
    
        System.out.print("Enter message: ");
        return kb.nextLine();
    }
}
