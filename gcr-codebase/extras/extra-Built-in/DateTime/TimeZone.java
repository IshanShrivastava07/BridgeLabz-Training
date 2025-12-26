// Creating  class TimeZone to display current time in different time zones
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZonesDemo {
    public static void main(String[] args) {

        // Get current date-time in GMT
       ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));

        // Get current date-time in IST
       ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // Get current date-time in PST
       ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Display all time zones
        System.out.println("GMT : " + gmtTime);
        System.out.println("IST : " + istTime);
        System.out.println("PST : " + pstTime);
    }
}
