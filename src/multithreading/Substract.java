/*
 * Xlass Substract
 */
package multithreading;

/**
 * class Substract
 * @author GAP
 */
public class Substract extends Thread{
    //variable to keep counter object
    private Counter ct;
    // setCounter
    public void setCt(Counter ct) {
        this.ct = ct;
    }
    @Override
    public void run(){
        for(int i=0;i<500;i++){
            ct.substract();
            System.out.println(ct.getCounter());
        }
    }
}
