package chapter07.practice;

import java.util.Arrays;

public class Zoo {
	static final int COUNT = 5;
	String name;
	String location;
	String[] animals;
	int animalCount;
	
	public Zoo() {
		this.animals = new String[COUNT];
		this.animalCount = 0;
	}

	public Zoo(String zooName, String zoolocation) {
		this.name = zooName;
		this.location = zoolocation;
		this.animals = new String[COUNT];
		this.animalCount = 0;
//		this.animal = animal;
//		this.animalCount = animalCount;
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String[] getAnimals() {
		return animals;
	}

	public void setAnimals(String[] animals) {
		this.animals = animals;
	}

	public void setAnimalCount(int animalCount) {
		this.animalCount = animalCount;
	}

	public int getAnimalCount() {
		return animalCount;
	}

	public int addAnimal(String animalName) {
		if(animalCount >= 5) {
			System.out.println();
			return -1;
		}
		animals[animalCount++] = animalName;
		
		return animalCount;
	}
	
	public void showZooInfo() {
		
	}

	@Override
	public String toString() {
		return "Zoo [name=" + name + ", location=" + location + ", animals=" + Arrays.toString(animals) + "]";
	}
	
}
