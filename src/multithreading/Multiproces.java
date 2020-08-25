/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dinamo
 */
public class Multiproces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            ProcessBuilder pb;
// Use process builder to start 2 processes multithreading.SayHello with parameter
            pb = new ProcessBuilder("\"C:\\Program Files\\Windows NT\\Accessories\\wordpad.exe\"");
            
            Process p1 = pb.start();

            Process p2 = pb.start();
            
            Process p3 = pb.start();

        } catch (IOException ex) {
            Logger.getLogger(Multiproces.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
        }
    }
}
