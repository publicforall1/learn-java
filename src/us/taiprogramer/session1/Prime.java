/**
 * Check if number is prime & print it
 * to screen in binary format.
 * 
 */

package us.taiprogramer.session1;

/**
 * @author taiprogramer
 *
 */
public class Prime {

	public static void main(String[] args) {
		int n = Input.getInt("Enter a number: ");
		System.out.println("Is prime: " + isPrime(n));
		System.out.println("In base2: " + "\"" + Integer.toBinaryString(n) + "\"");
	}

	/**
	 * Check if number if prime or not.
	 * 
	 * @param number
	 * @return If number is prime, return true. Otherwise, false
	 */
	public static boolean isPrime(int number) {
		boolean prime = number < 2 ? false : true;
		for (int i = 2; i <= Math.sqrt(number); ++i) {
			if ((number % i) == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}

}
