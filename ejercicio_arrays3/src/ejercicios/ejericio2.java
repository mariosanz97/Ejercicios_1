package ejercicios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter the number of integers that will be inserted: ");
		int size = scanner.nextInt();
		System.out.println("Enter some integers to insert to the ArrayList: ");
		while (size-- > 0) {
			// To add an element to the ArrayList
			al.add(scanner.nextInt());
		}
		int max = Integer.MIN_VALUE;
		int maxindex = 0;
		// System.out.println(max);
		/// {write your code here

		for (Integer i : al) {
			if (i > max) {
				max = i;
				maxindex++;

			}

		}
		maxindex--;

		/// }

		System.out.println("The largest value is " + max + "; which is in slot " + maxindex);
	}

}
