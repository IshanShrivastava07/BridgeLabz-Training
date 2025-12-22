// creating class OTP to generate 6-digit OTPs and check uniqueness

class OTP {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class OTPGenerator {
    public static void main(String[] args) {

        int[] otps = new int[10];

        // Generate OTPs 10 times
        for (int i = 0; i < otps.length; i++) {
            otps[i] = OTP.generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // Validate uniqueness
        boolean unique = OTP.areOTPsUnique(otps);

        if (unique) {
            System.out.println("All generated OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}
