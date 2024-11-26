package books.JavaForImpatient.ch1;

import java.util.Scanner;

/*
Using only the conditional operator,
write a program that reads three integers and prints the largest.
Repeat with Math.max.
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 3 integers:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is max");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is max");
        } else {
            System.out.println(n3 + " is max");
        }

        System.out.println("using Math.max: " + Math.max(n1, Math.max(n2, n3)));
    }
}
