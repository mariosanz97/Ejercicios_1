package ejercicios;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ejercicio4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int numeroCasos = sc.nextInt();
		for (int i = 0; i < numeroCasos; i++) {
			CasodePrueba();
		}
	}

	public static void CasodePrueba() {

		int num = sc.nextInt();
		int notas[] = new int[num];

		for (int i = 0; i < num; i++) {
			notas[i] = sc.nextInt();
		}

	}

}
