package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();

		System.out.println("Introduce el numero de elementos del array: ");
		int size = scanner.nextInt();

		System.out.println("Introduce los numeros de el array: ");
		while (size-- > 0) {
			// To add an element to the ArrayList
			al.add(scanner.nextInt());
		}
		int max = Integer.MIN_VALUE;

		/// {write your code here

		for (Integer n : al) {
			max=Collections.max(al);
		}

		/// }

		System.out.println("El valor maximo es: " + max);
	}

}
