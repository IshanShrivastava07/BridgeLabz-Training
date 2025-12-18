import java.util.*;
class VolumeOfCylinder{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		double volume = 3.14 * n * n * h;
		System.out.println(volume);
	}
}