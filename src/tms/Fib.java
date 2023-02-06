package tms;

/*
 * Shows a certain element from the fibonacci sequence
 */
public class Fib {
	  public static long fib(long n) {
		  if(n <= 1) {
			  return n;
		  } else {
			  return fib(n - 1) + fib(n - 2);
		  }
	  }
	  
	  public static void main(String[] args) {
		  System.out.println(Fib.fib(3));
	  }
}