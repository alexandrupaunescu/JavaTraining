/*
 * Counter object is used to add or substract values
 */
package multithreading;

/**
 * Counter object is used to add or substract values
 *
 * @author GAP
 */
public final class Counter {

    private volatile int counter = 0;

    // add method adds one to counter
    public synchronized void add() {
        for (int i = 0; i < 50000; i++) {
        }
        counter++;
    }

    // substract substracts one from counter
    public synchronized void substract() {
        for (int i = 0; i < 50000; i++) {
        }
        counter--;
    }

    // gets counter value
    public int getCounter() {
        return (counter);
    }
}
