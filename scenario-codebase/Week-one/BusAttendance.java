import java.util.Scanner;

public class BusAttendance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] students = {
            "Amit", "Ravi", "Neha", "Priya", "Rahul",
            "Anita", "Karan", "Sita", "Vikas", "Pooja"
        };

        int present = 0, absent = 0;

        // for-each loop
        for (String name : students) {
            System.out.print(name + " (P/A): ");
            char status = sc.next().charAt(0);

     if (status == 'P' || status == 'p')
       present++;
   
      else absent++;
        }

 System.out.println("Present: " + present);
 System.out.println("Absent: " + absent);
 sc.close();
    }
}
