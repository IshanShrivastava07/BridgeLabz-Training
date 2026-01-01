import java.util.*;

public class BusRoutetracker {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int totalDistance = 0;
boolean journey = true;

while(journey) {
System.out.println("Enter distance of next stop in (km)");
int distance = sc.nextInt();

totalDistance += distance;
System.out.println("Total distance covered" + totalDistance+ "km");

System.out.println("Do you want to getOff: (yes/no)");
String exit = sc.next();

if(exit.equalsIgnoreCase("yes")){
	journey = false;
   }
}

System.out.println("Journey Ended! total distance " + totalDistance+ "km");
sc.close();
}
}


	