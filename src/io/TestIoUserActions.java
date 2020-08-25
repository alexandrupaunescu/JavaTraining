/*
 * Read data from keyboard and write it to console as text and error
*/
package io;

import java.util.Scanner;

/**
 *Read data from keyboard and write it to console as text and error
 * @author Dinamo
 */
public class TestIoUserActions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Read data from keyboard
    Scanner reader= new Scanner(System.in);
    System.out.println("Please introduce a text: ");
    String newLine = "";
    newLine = reader.nextLine();
    System.out.println("Message: " +newLine);
    System.err.println("Error: " +newLine);
    
    }
    
}
