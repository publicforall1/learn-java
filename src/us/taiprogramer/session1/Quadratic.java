package us.taiprogramer.session1;

/**
 * @author taiprogramer
 *
 */

public class Quadratic {

	public static void main(String[] args) {
		solveQuadraticEquation(0, 2, 4); // x = -2.0
		solveQuadraticEquation(1, 4, -5); // x1 = 1.0, x2 = -5.0
	}

	/**
	 * Solve linear equation & display result onto screen.
	 * 
	 * Linear equation form: ax + b = 0
	 * 
	 * @param a
	 * @param b
	 * @return Nothing
	 */
	public static void solveLinearEquation(double a, double b) {
		if (a == 0) {
			System.out.println("The equation has no solution.");
			return;
		}

		System.out.println("x = " + (-b / a));
	}

	/**
	 * Solve quadratic equation & display result onto screen.
	 * 
	 * Quadratic equation form: ax^2 + bx + c = 0
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void solveQuadraticEquation(double a, double b, double c) {
		if (a == 0) {
			solveLinearEquation(b, c);
			return;
		}

		double delta = Math.pow(b, 2) - 4 * a * c;

		if (delta < 0) {
			System.out.println("The equation has no solution.");
			return;
		}

		if (delta == 0) {
			System.out.println("x = " + (-b / (2 * a)));
			return;
		}

		if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("x1 = " + x1 + ", x2 = " + x2);
		}
	}

}
