import java.util.Scanner;

public class TallestAndYoungest {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take Input for Amar
        System.out.println("Enter Amar's age and height:");
        int ageAmar = sc.nextInt();
        double heightAmar = sc.nextDouble();

        // Take Input for Akbar
        System.out.println("Enter Akbar's age and height:");
        int ageAkbar = sc.nextInt();
        double heightAkbar = sc.nextDouble();

        // Take Input for Anthony
        System.out.println("Enter Anthony's age and height:");
        int ageAnthony = sc.nextInt();
        double heightAnthony = sc.nextDouble();

        // Finding Youngest (Minimum Age)
        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        System.out.print("Youngest Friend(s): ");
        if (minAge == ageAmar) System.out.print("Amar ");
        if (minAge == ageAkbar) System.out.print("Akbar ");
        if (minAge == ageAnthony) System.out.print("Anthony ");
        System.out.println(); // New line

        // Finding Tallest (Maximum Height)
        double maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        System.out.print("Tallest Friend(s): ");
        if (maxHeight == heightAmar) System.out.print("Amar ");
        if (maxHeight == heightAkbar) System.out.print("Akbar ");
        if (maxHeight == heightAnthony) System.out.print("Anthony ");
        System.out.println();

        // Close the scanner
        sc.close();
    }
}