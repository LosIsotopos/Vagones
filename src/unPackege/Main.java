package unPackege;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Tren t1 = new Tren("animales.in");
		t1.resolver();
		Animal[] a = t1.getAnimales();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].toString());
		}

	}

}
