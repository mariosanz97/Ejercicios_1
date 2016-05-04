package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.omg.Messaging.SyncScopeHelper;

public class ejercicio3 {

	public static void main(String args[]) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String newstr = "";
		char ch = ' ';

		System.out.println("Mete la palabra :");
		String str = br.readLine();

		/// {write your code here
		String charSt = "";
		LinkedList<String> list = new LinkedList<String>();
		for (int i = 0; i < str.length(); i++){
			list.add(str.substring(i, i + 1));
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			charSt = it.next();
			if (charSt.contains("a")) {
				it.remove();
			}
			if (charSt.equals("e")) {
				it.remove();
			}
			if (charSt.equals("i")) {
				it.remove();
			}
			if (charSt.equals("o")) {
				it.remove();
			}
			if (charSt.equals("u")) {
				it.remove();
			}
			for (String n : list) {
				newstr += n;
			}
		}
		}

		// code}
		System.out.println("Edited word :" + newstr);
	}

}

/// }
