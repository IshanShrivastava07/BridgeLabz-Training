import java.util.*;

public class MovieTicketBooking{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int customers = 3;
		
		for(int i = 1; i <= customers; i++) {
			
			System.out.println("\n Customer " + i);
			
				System.out.println("Enter Movie Type: (1- Regular, 2- 3D)");
				int movieType = sc.nextInt();
				
					System.out.println("Enter seat type: (gold/silver) ");
					String seatType = sc.next();
					
						System.out.println("Want snacks: (yes/no)");
						String snacks = sc.next();
		               
					   int price = 0;
					   
					   //switch case
					   switch (movieType){
						   case 1: 
						   price = 200;
						   break;
						   
						   case 2: 
						   price = 300;
						   break;
						   
						   default: 
						   System.out.println("Invalid type");
						  continue;
					   }
					   
					   //if else
					   if(seatType.equalsIgnoreCase("gold")){
						   price += 100;
					   }else if(seatType.equalsIgnoreCase("silver")){
						   price += 50;
					   }
					   
					   if(snacks.equalsIgnoreCase("yes")){
						   price += 80;
					   }
					   	System.out.println("Toal Ticket Price: "+ price);
		}
			sc.close();
	}
}
						   
		