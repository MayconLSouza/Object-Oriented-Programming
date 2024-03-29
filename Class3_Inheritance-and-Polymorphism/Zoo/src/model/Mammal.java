package model;

public class Mammal extends Animal {

	private String food; 
	
	public Mammal() {
		setEnvironment("Land");
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}
	
	public void changeFood(String food) {
		this.food = food;
	}
	
	@Override
	public String toString() {
		return "Name = " + getName() + "\nColor = " + getColor() + "\nLength = " + getLength()
				+ " cm" + "\nNumber of paws = " + getNumberPaws() + "\nSpeed = " + getSpeed() + " m/s" 
				+ "\nFood = " + food;
	}

}
