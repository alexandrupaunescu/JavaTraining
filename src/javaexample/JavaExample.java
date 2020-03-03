 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;

/**
 *
 * @author Dinamo
 */
public class JavaExample  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a car object
        Car m11B210 = new Car();
        
        m11B210.setName("MERCEDS");
        m11B210.setColor(Car.Color.RED);
        m11B210.setSpeed((short )230);
        // display price  
        System.out.println("Price of car is: "+ m11B210.getSalePrice());
        // dysplay car description
        System.out.println("Car model is: "+m11B210.getName());
        System.out.println("Car color is: "+m11B210.getColor());
        System.out.println("Car top speed is: "+m11B210.getSpeed());
        System.out.println("---------------------------------");
        
        // create a second car object
        SecondCar m1PH234 = new SecondCar();
        
        m1PH234.setName("RENAULT");
        m1PH234.setColor(SecondCar.Color.GREEN);
        m1PH234.setSpeed((short )180);
          // display price of second car 
        System.out.println("Price of car is: "+ m1PH234.getSalePrice());
        // dysplay car description
        System.out.println("Car model is: "+m1PH234.getName());
        System.out.println("Car color is: "+m1PH234.getColor());
        System.out.println("Car top speed is: "+m1PH234.getSpeed());
        System.out.println("---------------------------------");
        
        // create third car object
        ThirdCar m1B211 = new ThirdCar();
        m1B211.setName("DACIA");
        m1B211.setColor(ThirdCar.Color.BLACK);
        m1B211.setSpeed((short )160);
        //display price of third car
        System.out.println("Price of car is: "+ m1B211.getSalePrice());
         // dysplay car description
        System.out.println("Car model is: "+m1B211.getName());
        System.out.println("Car color is: "+m1B211.getColor());
        System.out.println("Car top speed is: "+m1B211.getSpeed());
        System.out.println("---------------------------------");
        
         // create a new Salami  
        Salami primulSalam = new Salami();  
        primulSalam.setGust(Salami.Taste.MILD);
        System.out.println("Price of salami is: "+primulSalam.getSalePrice());
        System.out.println("Salami taste is: "+primulSalam.getGust());
        System.out.println("-------------END-----------------");
         
    }
    
}
