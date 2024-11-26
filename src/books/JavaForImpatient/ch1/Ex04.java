package books.JavaForImpatient.ch1;

/*
Write a program that prints the smallest and largest positive double values.
Hint: Look up Math.nextUp in the Java API.
 */
public class Ex04 {

    public static void main(String[] args) {
        double smallestPositiveDouble = Math.nextUp(0.0);
        double largestPositiveDouble = Double.MAX_VALUE;

        System.out.println("Smallest positive double value: " + smallestPositiveDouble);
        System.out.println("Largest positive double value: " + largestPositiveDouble);
    }
}
