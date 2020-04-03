/*
 * 
 */
package regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Dinamo
 */
public class RegexDynamicExpressionChek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scannerRegex = new Scanner(System.in);
        System.out.println("Insert regex or pattern to be searched: ");
        // read the regular expresion
        String regex = scannerRegex.nextLine();
        // create apattern usic introduced regula expresion
        Pattern pattern  = Pattern.compile(regex);
        //read the source string usig a new Scanner objectiv
        Scanner scannerSoureceString = new Scanner(System.in);
        System.out.println("Insert source string ");
        String source= scannerSoureceString.nextLine();
        // create the matcher as a result of applying regex on source string
        Matcher matcher = pattern.matcher(source);
        boolean found = false;
        //if the regular expression or pattern  was faound
        while (matcher.find()) {
            String result;
            result = String.format(" I found text  \"%s\" starting at " +
                    "index %d until index %d. ",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
            System.out.println(result);
            found = true;
        }
        //if regular expression or pattern was not found in source string
        if (!found) {
        System.out.println("No match found :(");
        }
        }
    }  

