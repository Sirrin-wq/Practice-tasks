package arrays;

import java.util.Scanner;

/*
Display odd elements under the main diagonal(inclusive).
 */
public class Task02 {
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
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j <= i) {
                    if (arr[i][j] % 2 == 1) {
                        System.out.printf("%d ", arr[i][j]);
                    }
                }
            }
        }

    }
}
