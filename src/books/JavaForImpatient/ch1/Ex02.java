package books.JavaForImpatient.ch1;

import java.util.Scanner;

/*
Write a program that reads an integer angle (which may be positive or negative)
and normalizes it to a value between 0 and 359 degrees.
Try it first with the % operator, then with floorMod.
 */
public class Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer angle
        System.out.print("Enter an integer angle: ");
        int angle = scanner.nextInt();

        System.out.println("test input % 360 = " + (angle % 360));
        // Normalize using the % operator
        int normalizedWithModulo = (angle % 360 + 360) % 360;
        System.out.println("Normalized angle using % operator: " + normalizedWithModulo + " degrees");

        // Normalize using Math.floorMod
        int normalizedWithFloorMod = Math.floorMod(angle, 360);
        System.out.println("Normalized angle using Math.floorMod: " + normalizedWithFloorMod + " degrees");

        // Close the scanner
        scanner.close();
    }
}
