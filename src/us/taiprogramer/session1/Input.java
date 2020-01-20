package us.taiprogramer.session1;

import java.util.Scanner;

public class Input {

	public static final Scanner kbd = new Scanner(System.in);

	public static int getInt(String prompt) {
		int output = Integer.MAX_VALUE;
		while (output == Integer.MAX_VALUE) {
			System.out.print(prompt);
			try {
				output = Integer.parseInt(kbd.nextLine());
			} catch (Exception ex) {
			}
		}
		return output;
	}

	public static double getDouble(String prompt) {
		double output = Double.MAX_VALUE;
		while (output == Double.MAX_VALUE) {
			System.out.print(prompt);
			try {
				output = Double.parseDouble(kbd.nextLine());
			} catch (Exception ex) {
			}
		}
		return output;
	}

	public static String getString(String prompt) {
		System.out.print(prompt);
		return kbd.nextLine();
	}

}
