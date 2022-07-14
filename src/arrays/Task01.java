package arrays;

import java.util.Random;
import java.util.Scanner;

/*
Calculate the sum of the even elements on the main diagonal.
 */
public class Task01 {
    public static void main(String[] args) {

        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("Set the size of the square matrix:");
        size = scan.nextInt();
        int[][] arr = new int[size][size];
        scan.close();

        randValueToFifty(arr);

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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] % 2 == 0) {
                sum += arr[i][i];
            }
        }
        System.out.println("The sum of the even elements on the main diagonal is " + sum);
    }

    public static void randValueToFifty(int[][] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(51);
            }
        }

    }

}

