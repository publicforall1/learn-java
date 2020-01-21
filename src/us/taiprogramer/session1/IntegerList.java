/**
 * Receive an integer list.
 * Count how many X element in list.
 * Sort list in ascending order.
 * 
 */

package us.taiprogramer.session1;

import java.util.Arrays;

/**
 * @author taiprogramer
 *
 */
public class IntegerList {

	private int arr[];
	private int length;

	/**
	 * @param capacity Max length of list
	 */
	public IntegerList(int capacity) {
		this.arr = new int[capacity];
		this.length = 0;
	}

	/**
	 * Append value to end of list.
	 * 
	 * @param value
	 */
	public void append(int value) {
		int capacity = this.arr.length;
		if (this.length == capacity) {
			this.arr = Arrays.copyOf(this.arr, capacity + 1);
		}
		this.arr[this.length++] = value;
	}

	/**
	 * Display all elements of list.
	 */
	public void show() {
		System.out.print("[ ");
		for (int x : this.arr) {
			System.out.print(x);
			System.out.print(" ");
		}
		System.out.print("]");
	}

	/**
	 * Sort list in ascending order.
	 */
	public void sort() {
		Arrays.sort(this.arr);
	}

	/**
	 * Count how many X element in list.
	 * 
	 * @param x
	 * @return Number of x element in list
	 */
	public int countX(int x) {
		int count = 0;
		for (int i = 0; i < this.arr.length; ++i) {
			if (arr[i] == x) {
				++count;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int n = Input.getInt("Enter number of element: ");
		IntegerList list = new IntegerList(n);

		for (int i = 0; i < n; ++i) {
			int value = Input.getInt("Enter #" + (i + 1) + " number: ");
			list.append(value);
		}

		int x = Input.getInt("Enter x: ");

		System.out.println("Number of x: " + list.countX(x));
		System.out.print("Origin list: ");
		list.show();
		System.out.println();

		System.out.print("Sorted list: ");
		list.sort();
		list.show();
	}

}
