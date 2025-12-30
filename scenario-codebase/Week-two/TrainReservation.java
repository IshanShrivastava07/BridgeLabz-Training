import java.util.*;

public class TrainReservation {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Enter the number of total seats: ");
		int totalSeats = sc.nextInt();
		int option = 0;
		
		while(true) {
			System.out.println("\n---------Train Reservation menu-----------");
			System.out.println("1.) Reserve Seats");
			System.out.println("2.) Check Available Seats");
			System.out.println("3.) Exit");
			System.out.print("Enter Options: ");
			
			option = sc.nextInt();
			
			if (option == 3) {
				System.out.println("Thankyou for using Train Reservation System");
				break;
			}
			
			switch(option) {
				case 1: 
				if(totalSeats == 0){
					System.out.println("No Seats Available");
					break;
				}
					totalSeats--;
					System.out.println("Seat Reserved Successfully");
					break;
				
				case 2: 
				System.out.println("Available Seats: "+ totalSeats);
				break;
				
				default:
				System.out.println("Invalid Option");
				break;
				
			}
				if(totalSeats == 0) {
					System.out.println("All Seats Reserved...Train is full!!");
				}
			
		}
	}
}