package arrays;

import java.util.Scanner;

/*
Check the product of the elements of which diagonal is greater
 */
public class Task03 {
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
        int mainDiag = 1;
        int sideDiag = 1;
        for (int i = 0, d = 0, k = arr.length - 1; i < arr.length; i++, d++, k--) {
            mainDiag *= arr[i][d];
            sideDiag *= arr[i][k];
        }
        if (mainDiag > sideDiag) {
            System.out.println("The product of the main diagonal is greater");
        } else if (mainDiag < sideDiag) {
            System.out.println("The product of the side diagonal is greater");
        } else {
            System.out.println("The products of both diagonals are equal");
        }
    }
}