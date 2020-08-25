/*
 * Testing anonymus clsses usage
 */
package usinginstructions;

/**
 *
 * @author Dinamo
 */
public class TestAnonymousUsage {
    interface SayHello{
        public void sayHello();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      class SayHelloInEnglish implements SayHello{

            @Override
            public void sayHello() {
              System.out.println("Hello world!");
            }
        }
        SayHelloInEnglish englishObject = new SayHelloInEnglish();
        englishObject.sayHello();
        
        //SayHelloInEnglish englishObjectOne = new SayHelloInEnglish();
        // englishObjectOne.sayHello();
        
        // same code usig anonymous class 
        SayHello englishAnonymousObject = new SayHello(){
            @Override
            public void sayHello() {
              System.out.println("Hello world2!");
            }
      };  
        englishAnonymousObject.sayHello();
        // use anonymous code for German Language
        SayHello germanAnonymousObject = new SayHello(){
            @Override
            public void sayHello() {
              System.out.println("Hallo Welt!");
            }
      };  
        germanAnonymousObject.sayHello();
    
        // Say hello in Romanian
           SayHello romanianAnonymousObject = new SayHello(){
      
            @Override
            public void sayHello() {
              System.out.println("Salut Lume!");
            }
        };
       
        romanianAnonymousObject.sayHello();
    }
 }
