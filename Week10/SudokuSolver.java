package Week10;

import java.util.Scanner;

public class SudokuSolver {
    
    // Validate if placing `num` in mat[i][j] is allowed by Sudoku rules
    static boolean check(int [][] mat, int i, int j, int n, int num) {
        // Check the row and column
        for (int k = 0; k < 9; k++) {
            if (mat[k][j] == num || mat[i][k] == num) {
                return false;
            }
        } 

        // Check the sub grid
        int root_n = (int) Math.sqrt(n); // n is 9, so root_n will be 3
        int ri = (i / root_n) * root_n;  // Starting row of the sub grid
        int rj = (j / root_n) * root_n;  // Starting column of the sub grid
        for (int x = ri; x < ri + root_n; x++) {
            for (int y = rj; y < rj + root_n; y++) {
                if (mat[x][y] == num) { // If `num` already exists in the sub grid
                    return false;
                }
            }
        }
        return true;
    }

    // Recursive function to solve Sudoku
    static boolean sudokuSolver(int[][] mat, int i, int j, int n) {
        // If we reach beyond the last row, the Sudoku is solved
        if (i == n) {
            return true;
        }

        // Move to the next row if we go beyond the last column
        if (j == n) {
            return sudokuSolver(mat, i + 1, 0, n);
        }

        // If the current cell is prefilled, move to the next column
        if (mat[i][j] != 0) {
            return sudokuSolver(mat, i, j + 1, n);
        }

        // Try placing numbers 1 to 9 in the current empty cell
        for (int num = 1; num <= 9; num++) {
            if (check(mat, i, j, n, num)) {
                mat[i][j] = num;  // Place the number

                // Recursively solve for the next cell
                if (sudokuSolver(mat, i, j + 1, n)) {
                    return true;
                }

                // Backtrack if the current placement doesn't lead to a solution
                mat[i][j] = 0;
            }
        }
        return false;  // If no number from 1 to 9 can be placed, return false
    }

    // Main function
    public static void main(String[] args) {
        int n = 9;
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[n][n];

        // Input Sudoku puzzle from user
        System.out.println("Enter the Sudoku puzzle");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Solve Sudoku 
        if (sudokuSolver(mat, 0, 0, n)) {
            // Display the solved Sudoku grid
            System.out.println("Solved Sudoku:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists.");
        }

        sc.close();
        
    }
}
