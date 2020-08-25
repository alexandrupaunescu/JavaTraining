/*
 * Class One
 */
package multithreading;

/**
 * Class One
 * @author Dinamo
 */
public class ClassOne extends Thread {
    /*
    public void sayHello(){
    System.out.println("Hello$");
    } 
*/
    public void run(){
        
        System.out.println("Hello$");
            // write a message
        System.out.println("run method of ClassOne thread is done!");
    }
    
}
