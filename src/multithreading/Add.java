/*
 * Xlass Add
 */
package multithreading;

/**
 * class Add
 * @author GAP
 */
public class Add extends Thread{
    //variable to keep counter object
    private Counter ct;
    // setCounter
    public void setCt(Counter ct) {
        this.ct = ct;
    }
    @Override
    public void run(){
        for(int i=0;i<500;i++){
            ct.add();
            System.out.println(ct.getCounter());
        }
    }
}
