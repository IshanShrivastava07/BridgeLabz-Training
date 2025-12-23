class NullPointerExc {

    // Creating main method
    public static void main(String[] args) {

        // Calling method that generates NullPointerException
        try {
            generateException();
        } catch (java.lang.NullPointerException e) {
            System.out.println("Exception caught in main");
        }

        // Calling method that handles NullPointerException
        handleException();
    }

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // This line will throw NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (java.lang.NullPointerException e) {
            System.out.println("NullPointerException handled using try-catch");
        }
    }
}
