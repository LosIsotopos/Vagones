package unPackege;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Tren {
	private Animal[] animales;
	private int vagones;
	private int agMax;
	private int agTot;
	
	public Tren(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		
		this.animales = new Animal[sc.nextInt()];
		this.agMax = sc.nextInt();
		this.agTot = 0;
		this.vagones = 0;
		for (int i = 0; i < animales.length; i++) {
			this.animales[i] = new Animal(sc.next(),sc.nextInt(),sc.nextInt());
		}
		sc.close();
		
	}



	public Animal[] getAnimales() {
		return animales;
	}

	public void setAnimales(Animal[] animales) {
		this.animales = animales;
	}

	public int getVagones() {
		return vagones;
	}

	public void setVagones(int vagones) {
		this.vagones = vagones;
	}

	public int getAgMax() {
		return agMax;
	}

	public void setAgMax(int agMax) {
		this.agMax = agMax;
	}

	public int getAgTot() {
		return agTot;
	}

	public void setAgrTot(int agTot) {
		this.agTot = agTot;
	}
	
	public void resolver() {
		ordenar();
	}



	private void ordenar() {
		
		for (int i = 0; i < animales.length; i++) {
			for (int j = 0; j < animales.length; j++) {
				
			}
		}
		
	}
	
}
