package tms.arrays;

import java.util.Scanner;

/*
Transpose matrix.
 */
public class Task05 {
    public static void main(String[] args) {
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("Set the size of the square matrix:");
        size = scan.nextInt();
        int[][] arr = new int[size][size];
        scan.close();

        Task01.randValueToFifty(arr);

        System.out.println("Original matrix");
        for (int[] a : arr) {
            for (int b : a) {
                System.out.printf("%3d", b);
            }
            System.out.println();
        }

        //Solution
        System.out.println("______________________\nTransposed Matrix");
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int[] a : arr) {
            for (int b : a) {
                System.out.printf("%3d", b);
            }
            System.out.println();
        }
    }
}
