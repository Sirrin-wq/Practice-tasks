package books.JavaForImpatient.ch1;

import java.util.Random;

/*
Write a program that produces a random string of letters and digits by generating
a random long value and printing it in base 36.
 */
public class Ex10 {
    public static void main(String[] args) {
        Random random = new Random();
        long randomLong = random.nextLong();
        String randomString = Long.toString(randomLong, 36);

        System.out.println("Random String: " + randomString);
    }
}
