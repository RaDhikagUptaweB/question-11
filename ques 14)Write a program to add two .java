/*ques 14)Write a program to add two matrices.
	 	For example:
Input
Input elements in 3x3 matrix1:*/

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] sumMatrix = new int[rows][columns];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input elements in 3x3 matrix1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Input elements in 3x3 matrix2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Adding the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Printing the sum matrix
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
