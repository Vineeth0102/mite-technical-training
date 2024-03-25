/*

 Write a program that takes two sizes of two different matrices. Check if matrix multiplication is possible or not for
 the given sizes. If matrix multiplication is possible then return the product matrix as result.

 */

import java.util.Scanner;

public class tech28 {

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible with the given sizes.");
            return new int[0][0];
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of matrix 1 (rows columns):");
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter the elements of matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the size of matrix 2 (rows columns):");
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter the elements of matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] result = multiplyMatrices(matrix1, matrix2);
        if (result.length > 0) {
            System.out.println("Product matrix:");
            printMatrix(result);
        }
        sc.close();
    }
}
