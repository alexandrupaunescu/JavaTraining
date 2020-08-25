/*
 * Testing classes derived fromm Number, String and Calendar
 */
package numbersstringcalendars;

import java.time.DayOfWeek;
import java.time.Duration  ;
import java.time.Instant  ;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;     
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.HashSet;
import java.util.Locale;
        
        
/**
 * Testing classes derived fromm Number, String and Calendar
 * @author Dinamo
 */
public class TestNumbersSringAndCalendars {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Conversion from String to Number
/* Am comentat partea asta de cond pemntru ca mu mergea sa rulez programul(am incercat sa il fortez dar nu am reusit) !!!    
        String aFloatNumber = (String) "12,3f";
        float f = (Float.valueOf(aFloatNumber));     
         System.out.println("Convert String " + aFloatNumber + "is the float number "+f);
        // or you can use parseXXXX
        float ff = Float.parseFloat(aFloatNumber);
        System.out.println("Convert String " + aFloatNumber + "is the float number "+ff);
*/
        // converst from Number to String
        Float fObject = 23.4f;
        Short sObject = 210;
        System.out.println("The numbers converted  to strings are: " + fObject.toString()+ "and " + sObject.toString());
        // Getting Caracters adn Bubstrings by index
        String thisIsAString = "This is a string";
        Character chInPosition3 = thisIsAString.charAt(3);
        String substringFrom5to8 = thisIsAString.substring(5, 8);
        System.out.println("Char from idex 3 of String"+ thisIsAString+"is; " +chInPosition3);
        System.out.println("Substracting from index 5 to index 8 of String "+ thisIsAString+"is "+substringFrom5to8);
        // Processing String
        System.out.println("String "+ thisIsAString+"whitout whitespace is  " +thisIsAString.trim());
        System.out.println("String "+ thisIsAString+" in lowercase is " + thisIsAString.toLowerCase());
        System.out.println("String "+ thisIsAString+" in uppercase is " + thisIsAString.toUpperCase());
        //Searching in string
        System.out.println("String"+thisIsAString+ "contains substring is starting whit index"+thisIsAString.indexOf("is"));
        //Replace a character whit another in a String
        System.out.println("In String "+thisIsAString+ "replacing i whit t results "+thisIsAString.replace("i", "t"));
        //Compare Strings
        String thisIsAnotherString = "This is a string!"; // another String object whit the same contenet
        System.out.println("Between two String objects whit the same content there are no difference"+thisIsAString.compareTo(thisIsAnotherString));
        System.out.println("If two String objects have the same content these are equals?: "+thisIsAString.equals(thisIsAnotherString));
        StringBuilder sb = new  StringBuilder(); // creates  empty builder capacity 16!
        System.out.println("Initial StringBuilder is: "+sb);
        // adds 9 character string at beginning
        sb.append("Appeended string! ");
        System.out.println("After apped StringBuilder content is: " +sb);
        sb.ensureCapacity(255);//Ensures thah the camacity is at least equal to the specified
        sb.append(25);
        System.out.println("After append  25 contentis: "+sb);
        sb.delete(17, 19);
        System.out.println("After deleting from index 17 19 contents is : "+sb);
//DayOfWeek  and Month Enums
        DayOfWeek dow = DayOfWeek.MONDAY;
        Month month = Month.MAY;
        Locale locale = Locale.getDefault();
        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
        System.out.println(month.getDisplayName(TextStyle.FULL, locale));
//LocalDate, Year, Month classes
        LocalDate date = LocalDate.of(2000, Month.MAY, 15);
        LocalDate nextWed = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println(nextWed);
        YearMonth dateOne = YearMonth.now();
        System.out.printf("%s: %d%n", date, date.lengthOfMonth());
        MonthDay deteTwo = MonthDay.of(Month.MAY, 15);
        System.out.println(deteTwo);
// LocalTime, LocalDateTime classes
        LocalTime thisSec = LocalTime.now();
        System.out.println("Local time; "+thisSec.getHour()+"H "+thisSec.getMinute()+"M "+thisSec.getSecond()+"S");
// ZoneId and ZoneOffset classes
        HashSet<String> zones = (HashSet<String>) ZoneId.getAvailableZoneIds();
        for (String zone: zones){
            System.out.println("Zone:"+zone);
        }
// Zone DataTime
        LocalDateTime leaving = LocalDateTime.of(2013, Month.JULY, 20, 19, 30);
        ZoneId leavingZone = ZoneId.of("Europe/Bucharest");    
        ZonedDateTime departure = ZonedDateTime.of(leaving, leavingZone);
        ZoneId arrivingZone = ZoneId.of("Europe/Paris");
        ZonedDateTime arrival = departure.withZoneSameInstant(arrivingZone).plusMinutes(210);
        System.out.println("Fling from "+departure+"to "+arrival);
// Instant class of Timestamp of machine
        Instant timestamp = Instant.now();
        System.out.println("Timestamp is: "+ timestamp);
// Duration between 2 Instances
        Instant t1 = Instant.now();
        // Generate a daly
        for (String zone : zones){
            System.out.println("Zone:" +zone);
        }
        Instant t2 = Instant.now();
        long ns = Duration.between(t1, t2).toNanos();
        System.out.println("Duration: "+ns);
// Period
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1968, Month.MAY, 7);
        Period p = Period.between(birthday, today);
        long p2 = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("You are "+ p.getYears() + " years, "+p.getMonths() +
                "months, and "+ p.getDays() +
                "days old. ("+ p2 + "days total)");
        }
        
        
        
        
        
        
        
        
        
  
    
}
