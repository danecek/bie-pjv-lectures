/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 *
 * @author danecek
 */
public class Triangle {

    static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int i = 0; i < row.length - 1; i++) {
                System.out.print(row[i] + ", ");
            }
            System.out.println(row[row.length - 1]);
        }
    }

    public static void main(String[] args) {
        int[][] triangle = {{1, 2, 3}, {4, 5}, {6} };
        // System.out.println(Arrays.toString(triangle));
        printMatrix(triangle);
    }

}
