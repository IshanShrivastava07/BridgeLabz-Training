import java.util.*;

 //Creating class SpringSeason checks whether the given date falls in the Spring Season.
 public class SpringSeason {

    // Method to check spring season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) ||
            (month == 4) ||
            (month == 5) ||
            (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // Reading input from command line
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Checking if  month, day are in spring season
        if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
