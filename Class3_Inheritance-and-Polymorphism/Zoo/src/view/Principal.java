package view;

import java.util.ArrayList;
import java.util.List;

import model.Animal;
import model.Fish;
import model.Mammal;

public class Principal {

	public static void main(String[] args) {
		List<Animal> zoo = new ArrayList<Animal>();
		
		Mammal camel = new Mammal();
		camel.setName("Camel");
		camel.setLength(150);
		camel.setColor("Yellow");
		camel.setSpeed(2.0f);
		camel.setFood("Cactus");
		
		Fish shark = new Fish();
		shark.setName("Shark");
		shark.setLength(300);
		shark.setSpeed(1.5f);

		Mammal grizzlyBear = new Mammal();
		grizzlyBear.setName("Grizzly Bear");
		grizzlyBear.setLength(180);
		grizzlyBear.setColor("Red");
		grizzlyBear.setSpeed(0.5f);
		grizzlyBear.setFood("Honey");
		
		zoo.add(camel);
		zoo.add(shark);
		zoo.add(grizzlyBear);
		
		for(Animal zooAnimal : zoo) {
			System.out.println(zooAnimal);
			System.out.println("************************************");
		}
	}

}
