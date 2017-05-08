package unPackege;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
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
		int i = 0;
		int j = 1;	
		if (agMax != 0) {
			while (i < animales.length && j < animales.length) {
				if((animales[i].getAgresividad() - animales[animales.length-1].getAgresividad()) <= agMax ) {
					vagones++;
					agTot += animales[i].getAgresividad() - animales[animales.length-1].getAgresividad();
					break;
				} else if((animales[i].getAgresividad() - animales[j].getAgresividad()) > agMax) {
						i++;
//						vagones++;
//						j++;
					} else {
						agTot += animales[i].getAgresividad() - animales[j].getAgresividad();
//						vagones++;
//						j++;
					}
				j++;
				vagones++;
			}
		} else { 
			vagones = animales.length;
		}
	}


	private void ordenar() {
		Arrays.sort(animales,new Comparator<Animal>() {

			@Override
			public int compare(Animal a1, Animal a2) {
				if(a1.getAgresividad() < a2.getAgresividad()) {
					return 1;
				} else if(a1.getAgresividad() > a2.getAgresividad()) {
					return -1;
				}
				return 0;
			}

		});

	}

}
