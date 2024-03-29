package model;

public class Fish extends Animal {

	private String characteristic = "Fins and Tail";
	
	public Fish() {
		setNumberPaws(0);
		setEnvironment("Sea");
		setColor("Gray");
	}

	public String getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}
	
	public void changeCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}

	@Override
	public String toString() {
		return "Name = " + getName() + "\nColor = " + getColor() + "\nLength = " + getLength() + " cm"  
				+ "\nSpeed = " + getSpeed() + " m/s" + "\nCharacteristic = " + characteristic;
	}
	
	

}
