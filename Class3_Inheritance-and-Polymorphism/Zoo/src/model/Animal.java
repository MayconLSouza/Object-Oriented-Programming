package model;

public class Animal {

	private String name;
	private String color;
	private String environment;
	private int length;
	private int numberPaws = 4;
	private float speed;
	
	public Animal() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void changeName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void changeColor(String color) {
		this.color = color;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	public void changeEnvironment(String environment) {
		this.environment = environment;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public void changeLength(int length) {
		this.length = length;
	}

	public int getNumberPaws() {
		return numberPaws;
	}

	public void setNumberPaws(int numberPaws) {
		if (numberPaws < 0) {
			this.numberPaws = 4;
		} else {
			this.numberPaws = numberPaws;
		}
	}

	public void changeNumberPaws(int numberPaws) {
		if (numberPaws < 0) {
			this.numberPaws = getNumberPaws();
		} else {
			this.numberPaws = numberPaws;
		}
	}
	
	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	public void changeSpeed(float speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Name = " + name + "\nColor = " + color + "\nEnvironment = " + environment + "\nLength = " + length
				+ " cm" + "\nNumber of paws = " + numberPaws + "\nSpeed = " + speed + " m/s";
	}
	
	

}
