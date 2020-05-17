/**
 * This program use to calculate the sum of 2 integers
 * that get from keyboard.
 * 
 */

package us.taiprogramer.session1;

/**
 * @author taiprogramer
 *
 */
public class SumInteger {

	/**
	 * @param args Unused
	 * @return Nothing
	 */
	public static void main(String[] args) {
		int a = Keyboard.getInt("Enter #1 number: ");
		int b = Keyboard.getInt("Enter #2 number: ");
		System.out.println("sum = " + sum(a, b));
	}

	/**
	 * This method use to calculate sum of 2 integers.
	 * 
	 * @param a First integer
	 * @param b Second integer
	 * @return Sum of 2 integers
	 */
	public static int sum(int a, int b) {
		return a + b;
	}

}
