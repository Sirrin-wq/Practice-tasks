package books.JavaForImpatient.ch1;

import java.util.Scanner;

/*
Write a program that reads a string and prints all of its nonempty substrings.
 */
public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] words = input.trim().split("\\s+");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
