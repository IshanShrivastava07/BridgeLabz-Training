import java.util.*;
class CelsiusToFarenhite{
	public static void main(String args[]) 
	{
	Scanner sc = new Scanner(System.in); 
	int n = sc.nextInt();
	int farenhite = (n * 9/5) + 32;
	System.out.print(farenhite);
   }
}