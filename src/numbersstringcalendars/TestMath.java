/*
 *Testing Math Class methods
 */
package numbersstringcalendars;

/**
 * Testing Math Class methods
 * @author Dinamo
 */
public class TestMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create 4 numbers, 2 double and 2 integers
        double a = -191.632;
        double b = 43.74;
        int c = 16; int d = 45;
        //Apply absolute value, celing of, floor, max and min methods
        System.out.printf("The absolute value " + "of %.3f is %.3f%n", a, Math.abs(a) );
        System.out.printf("The ceiling of " + "%.2f is %.0f%n", b, Math.ceil(b));
        System.out.printf("The floor of " + "%.2f is %.0f%n", b, Math.floor(b));
        System.out.printf("the rint of %.2f" + "is %.0f%n", b, Math.rint(b));
        System.out.printf("The max of %d and " + "%d is %d%n", c, d, Math.max(c, d));
        System.out.printf("The min of %d " + "and %d is %d%n", c, d, Math.min(c, d));
        // exponential demo
        double x = 11.635;
        double y = 2.76;
        System.out.printf("The value of " + "e is %4f%n", Math.E);
        System.out.printf("exp(%.3f) " + "is %.3f%n", x, Math.exp(x));
        System.out.printf("log(%.3f) is " + "%.3f%n", x, Math.log(x));
        System.out.printf("pow(%.3f, %.3f) " + "is %.3f%n", x, y, Math.pow(x, y));
        System.out.printf("sqrt(5.3f) is " + "%.3f%n", x, Math.sqrt(x));
        // trigonometric demo
        double degree = 45.0;
        double radians = Math.toRadians(degree);
        System.out.format("The value of pi " + "is %.4f%n",Math.PI); // constant PI=3.1415...
        System.out.format("The sine of %.1f " + "degrees is  %.4f%n",degree, Math.sin(radians));
        System.out.format("The cosine of  %.1f " + "degrees is %.4f%n",degree, Math.cos(radians));
        System.out.format("The tangent of %.1f " + "degrees is %.4f%n",degree, Math.tan(radians));
        System.out.format("The arcsine of %.4f " + "is %.4f degrees %n", Math.sin(radians), Math.toDegrees(Math.asin(radians)) );
        // random number  generated between 0.0 and 0.1 and multiplied whit 10
        int randomNumber = (int) (Math.random()* 100);
        System.out.println(randomNumber +" is a random number");
        randomNumber = (int) (Math.random()* 10);
        System.out.println(randomNumber +" is a random number");
        randomNumber = (int) (Math.random()* 10);    
        System.out.println(randomNumber +" is a random number");
        
    }
    
}
