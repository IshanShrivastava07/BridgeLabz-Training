import java.util.*;

public class TemperatureLogger {
	
	
	public static int AverageTemp(int[] temperature){
		int sum = 0;
		for(int i = 0; i < 7; i++){
			sum += temperature[i];
	}
	return sum/7;
	}
	
	public static int MaxTemp(int[] temperature){
		int max = temperature[0];
		for(int i = 1; i < 7; i++){
			if(temperature[i] > max){
				max = temperature[i];
			}
	}
	return max;
	}
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] temperature = new int[7];
		
		for(int i =0; i < 7; i++) {
			System.out.println(" Enter temperature for day " + (i + 1) + ":");
			temperature[i] = sc.nextInt();
		}
		int avg = AverageTemp(temperature);
		int maxTmp = MaxTemp(temperature);
		
		System.out.println("Average temperature: " + avg);
		System.out.println("Maximum Temperature: " + maxTmp);
	}
}
			