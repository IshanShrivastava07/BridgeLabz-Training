import java.util.Scanner;

//Creating class Handshakes to calculate maximum number of possible handshakes
class Handshakes {
    public static void main(String[] args) {

        //Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
        //Taking number of students from user
        int numberOfStudents = input.nextInt();

        // Calculating maximum number of handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        //Displaying the result
        System.out.println(
            "The maximum number of possible handshakes among " + numberOfStudents + " students is " + handshakes
        );
    }
}
