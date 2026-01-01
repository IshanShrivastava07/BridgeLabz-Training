import java.util.*;

public class DigitalWatchSimulation{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int  hrs = 0; hrs < 24; hrs++) {
			for(int  minutes = 0; minutes < 60; minutes++) {
				
				if(hrs == 13 && minutes == 0) {
					System.out.println("Power cut! Watch stopped at 13:00");
					break;
				}
			  System.out.printf("%02d:%02d\n",hrs,minutes);
			}
			if(hrs == 13) {
				break;
			}
		}
	}
}
				