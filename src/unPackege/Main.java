package unPackege;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Tren t1 = new Tren("animales6.in");
		t1.resolver();
		System.out.println(t1.getVagones() + " " + t1.getAgTot());

	}

}
