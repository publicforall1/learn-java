/**
 * This program use to get the sum & max value of double that
 * passed from command-line arguments.
 * 
 * In: app.exe 1.0 2.0 3.0 s 4.0
 * Out: sum = 10.0, max = 4.0
 *
 */
package us.taiprogramer.session1;

/**
 * @author taiprogramer
 *
 */
public class SumArgument {

	/**
	 * 
	 * @param args Unused
	 * @return Nothing
	 */
	public static void main(String[] args) {
		double sum = 0, d, max = Double.MIN_VALUE;
		for (String s : args) {
			d = safeStringToDouble(s);
			sum += d;
			max = d > max ? d : max;
		}
		System.out.println("sum = " + sum + ", max = " + max);
	}

	/**
	 * This method is used to convert string to double.
	 * 
	 * @param s This is a string want to convert
	 * @return double This returns result after convert
	 * @exception NumberFormatException When string is not a number
	 * @see NumberFormatException
	 */
	public static double safeStringToDouble(String s) {
		double d;
		try {
			d = Double.parseDouble(s);
		} catch (Exception ex) {
			d = 0;
		}
		return d;
	}

}
