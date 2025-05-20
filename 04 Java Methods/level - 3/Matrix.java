import java.util.Random;

public class Matrix {
    public static double[][] genMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    public static double[][] add(double[][] A, double[][] B) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static double[][] subtract(double[][] A, double[][] B) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public static double[][] multiply(double[][] A, double[][] B) {
        int rowsA = A.length, colsA = A[0].length, colsB = B[0].length;
        double[][] result = new double[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static double[][] transpose(double[][] A) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }

    public static double det2x2(double[][] A) {
        return (A[0][0] * A[1][1]) - (A[0][1] * A[1][0]);
    }

    public static double det3x3(double[][] A) {
        return A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
             - A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
             + A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
    }

    public static double[][] inverse2x2(double[][] A) {
        double det = det2x2(A);
        if (det == 0) {
            System.out.println("Matrix is singular, no inverse exists");
            return null;
        }
        double[][] inverse = {
            {A[1][1] / det, -A[0][1] / det},
            {-A[1][0] / det, A[0][0] / det}
        };
        return inverse;
    }

    public static double[][] inverse3x3(double[][] A) {
        double det = det3x3(A);
        if (det == 0) {
            System.out.println("Matrix is singular, no inverse exists");
            return null;
        }

        double[][] adj = new double[3][3];

        adj[0][0] = (A[1][1] * A[2][2] - A[1][2] * A[2][1]) / det;
        adj[0][1] = (A[0][2] * A[2][1] - A[0][1] * A[2][2]) / det;
        adj[0][2] = (A[0][1] * A[1][2] - A[0][2] * A[1][1]) / det;

        adj[1][0] = (A[1][2] * A[2][0] - A[1][0] * A[2][2]) / det;
        adj[1][1] = (A[0][0] * A[2][2] - A[0][2] * A[2][0]) / det;
        adj[1][2] = (A[0][2] * A[1][0] - A[0][0] * A[1][2]) / det;

        adj[2][0] = (A[1][0] * A[2][1] - A[1][1] * A[2][0]) / det;
        adj[2][1] = (A[0][1] * A[2][0] - A[0][0] * A[2][1]) / det;
        adj[2][2] = (A[0][0] * A[1][1] - A[0][1] * A[1][0]) / det;

        return adj;
    }

    public static void disMat(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f ", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[][] matrixA = genMatrix(3, 3);
        double[][] matrixB = genMatrix(3, 3);

        System.out.println("Matrix A:");
        disMat(matrixA);

        System.out.println("Matrix B:");
        disMat(matrixB);

        System.out.println("A + B:");
        disMat(add(matrixA, matrixB));

        System.out.println("A - B:");
        disMat(subtract(matrixA, matrixB));

        System.out.println("A * B:");
        disMat(multiply(matrixA, matrixB));

        System.out.println("Transpose of A:");
        disMat(transpose(matrixA));

        double detA = det3x3(matrixA);
        System.out.println("Determinant of A: " + detA);

        if (detA != 0) {
            System.out.println("Inverse of A:");
            disMat(inverse3x3(matrixA));
        } else {
            System.out.println("A is singular");
        }
    }
}
