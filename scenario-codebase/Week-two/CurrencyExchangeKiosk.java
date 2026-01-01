import java.util.*;

public class CurrencyExchangeKiosk{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char choice = 'n';
		
		do{
			System.out.println("Enter amount in INR: ");
			double inr  = sc.nextDouble();
			
			System.out.println("Convert to currency: (USD/EUR/JPY)");
			String currency = sc.next().toUpperCase();
			
			double convertedAmount = 0;
			
			switch (currency) {
				case "USD": 
				convertedAmount = inr * 0.012;
				break;
				
				case "EUR": 
				convertedAmount = inr * 0.011;
				break;
				
				case "JPY":
				convertedAmount = inr * 1.78;
				break;
				
				default: 
				System.out.println("Invaid currency");
				continue;
			}
			
			System.out.println("Converted Amount: " + convertedAmount + " " + currency);

            System.out.print("Do you want another conversion? (y/n): ");
			 choice = sc.next().toLowerCase().charAt(0);
		}
		while(choice == 'y');
	}
}
			
				