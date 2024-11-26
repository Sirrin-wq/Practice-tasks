package books.JavaForImpatient.ch1;


import java.util.Scanner;

/*
Write a program that reads an integer and prints it in binary, octal, and hexadecimal.
Print the reciprocal as a hexadecimal floating-point number.
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int input = scan.nextInt();

        System.out.println("binary: " + Integer.toBinaryString(input));
        System.out.println("octal: " + Integer.toOctalString(input));
        System.out.println("hex: " + Integer.toHexString(input));

        // Calculate the reciprocal
        if (input != 0) {
            double reciprocal = 1.0 / input;
            // Print the reciprocal as a hexadecimal floating-point number
            System.out.printf("Reciprocal in hexadecimal: %A%n", reciprocal);
        } else {
            System.out.println("division by zero");
        }

        scan.close();
    }

}
