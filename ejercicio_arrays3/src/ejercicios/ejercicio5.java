package ejercicios;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class ejercicio5 {

	public static void main(String a[]) throws Exception {

		int[] arr = new int[8];
		int countOccurrence = 0;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 8; i++) {
			System.out.println("Enter Number [" + i + "]:");
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter a number which exist in the array:");
		int number = scan.nextInt();
		// write your logic here

		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				countOccurrence++;

			}

			map.put(arr[i], 1);
		}

		// end
		System.out.println("Occurrence of " + number + " :");
		System.out.println(countOccurrence);

	}

}
