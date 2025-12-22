import java.util.*;

// Creating class OperationsOnMatrix to perform addition, subtraction and multiplication on matrix
public class OperationsOnMatrix {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // 0–9
            }
        }
        return matrix;
    }
    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }
    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rows = 2, cols = 2;

        int[][] matrixA = createRandomMatrix(rows, cols);
        int[][] matrixB = createRandomMatrix(rows, cols);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("Matrix B:");
        displayMatrix(matrixB);
        System.out.println("Addition:");
        displayMatrix(addMatrices(matrixA, matrixB));
        System.out.println("Subtraction:");
        displayMatrix(subtractMatrices(matrixA, matrixB));
        System.out.println("Multiplication:");
        displayMatrix(multiplyMatrices(matrixA, matrixB));
    }
}
