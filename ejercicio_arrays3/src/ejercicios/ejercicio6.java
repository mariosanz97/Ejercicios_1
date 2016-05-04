package ejercicios;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ejercicio6 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int rnum = 0;

		System.out.println("Enter the number:");
		int num = scan.nextInt();

		/// {write you code here

		Stack<Character> cola = new Stack<Character>();

		String stri = String.valueOf(num);
		String rstri= "";
		for (int i = 0; i < stri.length(); i++)
			cola.push(stri.charAt(i));

		Iterator<Character> resultado = cola.iterator();
		while (resultado.hasNext())

			 rstri += cola.pop();

		rnum = Integer.parseInt(rstri);

		/// }

		System.out.println("Reverse is :" + rnum);
	}
}
