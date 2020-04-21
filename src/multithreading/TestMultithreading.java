/*
 * Testing multithreading 
 */
package multithreading;

/**
 * Testing multithreading
 * @author GAP
 */
public class TestMultithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creeaza un obiect de tip contor
        Counter c = new Counter();
        // creeaza un obiect de tip Add
        Add ad = new Add();
        // creeaza un obiect de tip Substract
        Substract su = new Substract();
        // seteaza counter in obiectul Add
        ad.setCt(c);
        // seteaza counter in obicetul Substract
        su.setCt(c);
        //porneste threadul Add
        ad.start();
        // porneste theadul substract
        su.start();
        //afiseaza contorul
        System.out.println("Counter = "+c.getCounter());
    }
    
}
