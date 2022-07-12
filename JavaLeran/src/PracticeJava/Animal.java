package PracticeJava;

public class Animal {

	private float height;
	private int weight;
	private String animalType;
	private String bloodType;
	
	public Animal() {
		this.height = 12.5F;
		this.weight = 30;
		this.animalType = "birds";
		this.bloodType = "B";
	}

	public Animal(float height, int weight, String animalType, String bloodType) {
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}
	
	
}
