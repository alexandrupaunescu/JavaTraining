/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author Dinamo
 */
public class HelloWorldInterface implements Runnable  {
    
    @Override
    public void run() {
       System.out.println("hello all");
       //System.out.println("My priority is:" + this.getPriority());
       //System.out.println("My thread ID is:" + this.getId);
       //System.out.println("My name is:" + this.getName());
       //System.out.printLn("My group of threads is:" +this .getThreadGroup);
       
    }
    public static void main(String args[]){
    (new Thread(new HelloWorldInterface())).start();
}
}