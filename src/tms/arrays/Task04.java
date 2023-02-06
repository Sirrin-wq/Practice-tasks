package tms.arrays;

import java.util.Scanner;

/*
Calculate the sum of even elements above the side diagonal(inclusive).
 */
public class Task04 {
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
        System.out.println("----------------------");

        //Solution
        int sum = 0;
        for (int i = 0, k = arr.length; i < arr.length; i++, k--) {
            for (int j = 0; j < k; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("The sum of the side diagonal elements and above is " + sum);

    }
}
