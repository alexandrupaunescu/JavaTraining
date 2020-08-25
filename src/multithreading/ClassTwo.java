/*
 * Class Two
 */
package multithreading;

/**
 * Class Two
 * @author Dinamo
 */
public class ClassTwo implements Runnable {

    @Override
    public void run() {
        System.out.println("Salut$");
        // write a message
        System.out.println("run method of ClassTwo thread is done!");
    }
    /*
    public void sayHello(){
    System.out.println("Salut$");
    }
*/
    
}
