//creating class DividingPen to equally divide pens among students
 class DividingPen {
    public static void main(String args[]) {

        // Total number of pens
        int totalPens = 14;

        // Total number of students
        int students = 3;

        // Pens each student will get 
        int pensPerStudent = totalPens / students;

        // Remaining pens after equal distribution 
        int remainingPens = totalPens % students;

        // Displaying output
        System.out.println(
            "The Pen Per Student is " + pensPerStudent +
            " and the remaining pen not distributed is " + remainingPens);
    }
}