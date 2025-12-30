public class FitnessTracker {
    public static void main(String[] args) {

        int[] pushUps = {20, 30, 0, 40, 50, 0, 60}; // 0 = rest day
        int total = 0, days = 0;

        // for-each loop
        for (int count : pushUps) {

            if (count == 0)
			// skip rest day
                continue; 
            total += count;
            days++;
        }

        double average = total / (double) days;

        System.out.println("Total Push-ups: " + total);
        System.out.println("Average per active day: " + average);
    }
}
