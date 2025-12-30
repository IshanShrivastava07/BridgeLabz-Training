import java.util.Scanner;

public class ParkingLotSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int capacity = 5;      // total parking slots
        int occupied = 0;      // current parked cars

        while (occupied < capacity) {
            System.out.println("1). Park Car");
System.out.println(); 
 System.out.println("2.) Exit Car");
   System.out.println("3.) Show Occupancy");
  System.out.println("4.) Exit System");
   System.out.print("Choose option: ");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    if (occupied < capacity) {
                        occupied++;
                      System.out.println("Car parked.");
                    } else {
                     System.out.println("Parking Full.");
                  }
                    break;

                case 2:
         if (occupied > 0) {
                        occupied--;
                   System.out.println("Car exited.");
                  } else {
            System.out.println("No cars to exit.");
                    }
                 break;

                case 3:
               System.out.println("Occupied Slots: " + occupied + "/" + capacity);
                 break;

                case 4:
                  System.out.println("System Closed.");
              sc.close();
              retur
             ault:
                  System.out.println("Invalid choice.")         }
        }
        System.out.println("Parking lot is full.");
        sc.close();
    }
}
