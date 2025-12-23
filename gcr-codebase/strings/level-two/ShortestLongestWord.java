import java.util.Scanner;

class ShortestLongestWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        String[] words = splitUsingCharAt(text);
        String[][] wordLengthArray = createWordLengthArray(words);

        int[] result = findShortestAndLongest(wordLengthArray);

        System.out.println("\nShortest word: " + wordLengthArray[result[0]][0]);
        System.out.println("Longest word: " + wordLengthArray[result[1]][0]);
    }

    // Split text into words using charAt()
    public static String[] splitUsingCharAt(String str) {

        int len = findLength(str);
        int wordCount = 1;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        String word = "";

        for (int i=0; i<len; i++) {
            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
            } else {
                words[index++] = word;
                word = "";
            }
        }
        words[index] = word;

        return words;
    }

    // Find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
              str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    // Create 2D array of word and its length
    public static String[][] createWordLengthArray(String[] words) {

        String[][] arr= new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
          arr[i][0]= words[i];
          arr[i][1] = String.valueOf(findLength(words[i]));
        }
        return arr;
    }

    // Find shortest and longest word indexes
    public static int[] findShortestAndLongest(String[][] arr) {

        int minIndex = 0;
      int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            int currentLength = Integer.parseInt(arr[i][1]);
            int minLength = Integer.parseInt(arr[minIndex][1]);
          int maxLength = Integer.parseInt(arr[maxIndex][1]);

            if (currentLength < minLength) {
              minIndex = i;
            }
            if (currentLength > maxLength) {
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }
}
