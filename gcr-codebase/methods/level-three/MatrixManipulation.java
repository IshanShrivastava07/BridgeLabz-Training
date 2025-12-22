
//creting class MatrixManipulation to perform manipulative operation like transpose and determinant
public class MatrixManipulation {

    // Create random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] m = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                m[i][j] = 1 + (int) (Math.random() * 9);
        return m;
    }

    // Transpose of matrix
    public static double[][] transpose(double[][] m) {
        double[][] t = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                t[j][i] = m[i][j];
        return t;
    }

    // Determinant of 2x2 matrix
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;

        return new double[][]{
                { m[1][1] / det, -m[0][1] / det },
                { -m[1][0] / det, m[0][0] / det }
        };
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2]-m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2]-m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2]-m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2]-m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2]-m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2]-m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1]-m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1]-m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1]-m[0][1]*m[1][0]) / det;

        return inv;
    }

    // Display matrix
    public static void displayMatrix(double[][] m) {
        if (m == null) {
            System.out.println("Inverse not possible (Determinant = 0)");
            return;
        }
        for (double[] row : m) {
            for (double val : row)
                System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        double[][] matrix2x2 = createRandomMatrix(2, 2);
        double[][] matrix3x3 = createRandomMatrix(3, 3);

        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);

        System.out.println("Transpose:");
        displayMatrix(transpose(matrix2x2));

        System.out.println("Determinant (2x2): " + determinant2x2(matrix2x2));
        System.out.println("Inverse (2x2):");
        displayMatrix(inverse2x2(matrix2x2));

        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3x3);

        System.out.println("Transpose:");
        displayMatrix(transpose(matrix3x3));

        System.out.println("Determinant (3x3): " + determinant3x3(matrix3x3));
        System.out.println("Inverse (3x3):");
        displayMatrix(inverse3x3(matrix3x3));
    }
}
