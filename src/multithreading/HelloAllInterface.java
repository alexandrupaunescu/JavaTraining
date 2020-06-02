/*
 * a-sti.ro
 */
package multithreading;

/**
 *
 * @author Dinamo
 */
public class HelloAllInterface implements Runnable {

    @Override
    public void run() {
       System.out.println("hello all");
       //System.out.println("My priority is:" + this.getPriority());
       //System.out.println("My thread ID is:" + this.getId);
       //System.out.println("My name is:" + this.getName());
       //System.out.printLn("My group of threads is:" +this .getThreadGroup);
       
    }
    public static void main(String args[]){
    (new Thread(new HelloAllInterface())).start();
    }
}
