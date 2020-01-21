/**
 * Get the firstName from fullName.
 *  
 */

package us.taiprogramer.session1;

/**
 * @author taiprogramer
 *
 */
public class SplitName {

	public static void main(String[] args) {
		String fullName = Input.getString("Enter your fullname: ");
		System.out.println("Your first name: " + splitName(fullName));
	}

	/**
	 * Get firstName from fullName.
	 * 
	 * fullName format: lastName firstName
	 * 
	 * @param fullName
	 * @return firstName
	 */
	public static String splitName(String fullName) {
		// Trim & split fullName by multiple whitespace
		String arr[] = fullName.trim().split("\\s+");
		String firstName = arr[arr.length - 1];
		return firstName;
	}

}
