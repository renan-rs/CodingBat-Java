package warmup1;

/**
 * Given two non-negative int values, return true 
 * if they have the same last digit, such as with 27 and 57.
 * Note that the % "mod" operator computes remainders, 
 * so 17 % 10 is 7.
 * 
 * lastDigit(7, 17) = true
 * lastDigit(6, 17) = false
 * lastDigit(3, 113) = true
 * 
 *  
 *
 */

public class LastDigit {
	
	public static void main(String[] args) {
		System.out.println(lastDigit(7,17));

	}
	
	public static boolean lastDigit(int a, int b) {
		  return(a % 10 == b % 10);
		}

}
