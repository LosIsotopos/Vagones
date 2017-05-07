package unPackege;

import java.util.LinkedList;

public class Vagon {
	private LinkedList<Animal> animals = new LinkedList<Animal>();
	private int agVagon = 0;
	
	public Vagon(Animal a, int agresividad) { 
		animals.add(a);
		agVagon += agresividad;
	}

	public LinkedList<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(LinkedList<Animal> animals) {
		this.animals = animals;
	}

	public int getAgVagon() {
		return agVagon;
	}

	public void setAgVagon(int agVagon) {
		this.agVagon = agVagon;
	}
	
	
}
