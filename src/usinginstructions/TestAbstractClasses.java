/*
 * Test abstract Classes    
 */
package usinginstructions;

/**
 *
 * @author Dinamo
 */
public class TestAbstractClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create 3 objet for 3 language
        SayHelloInEnglish english = new SayHelloInEnglish();
        SayHelloInGerman german = new SayHelloInGerman();
        SayHelloInRomanian romanian = new SayHelloInRomanian();
       // call methods
       english.sayHello();
       german.sayHello();
       romanian.sayHello();
        
    }
    
}
