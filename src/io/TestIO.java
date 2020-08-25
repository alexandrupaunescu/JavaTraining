/*
 * Testing java.io package to read the content of a web page.
 */
package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Testing java.io package to read the content of a web page.
 * @author Dinamo
 */
public class TestIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Make URL to the web page
            URL webPageURL =  new URL("https://www.a-sti.ro/");
            // Get the input stream  through URL Connection
            URLConnection connectionToWebPage = webPageURL.openConnection();
            // create an InputStream to read the content
            InputStream is = connectionToWebPage.getInputStream();
            // Once you have the Input Stream, gett plain-text web page.
            // into BufferedReader object to read and write to console
            //line by line
            BufferedReader readerObject = new BufferedReader(new InputStreamReader(is));
            String line = null;
            // Use a reader and output the text content to System.out.
            // For binary content, it`s better to directly read the bytes from stream and write
            // to the target file.
            //read each line and write to System.out
            while((null !=(line= readerObject.readLine()))) {
                System.out.println(line);
            }
            
            //read each line and write to System.out
        } catch (MalformedURLException ex) {
            Logger.getLogger(TestIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestIO.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
        // because we opened a web connection witch use HTTP/HTTPS asynchronous connection
        // this cannot be closed in Java Program. HTTP  Server will close it after time out of server.
        }
    }
    
}
