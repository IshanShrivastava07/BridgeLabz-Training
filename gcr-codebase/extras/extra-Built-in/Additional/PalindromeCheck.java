import java.util.Scanner;


 // Creating class PalindromeCheck to check if a string is a palindrome
 
public class PalindromeCheck {

    static boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        if (isPalindrome(text))
            System.out.println("It is a Palindrome.");
        else
            System.out.println("It is not a Palindrome.");
    }
}
