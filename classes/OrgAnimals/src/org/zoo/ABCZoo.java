package org.zoo;

//below, we use * to import all classes from org.animals
import org.animals.*;

public class ABCZoo {

	public static void main(String[] args) {
		Lion lion=new Lion("yellow-gold", 135.50, 5);
		Tiger tiger=new Tiger("orange", 195.50, 5);
		Deer deer=new Deer("brown", 150, 7);
		Elephant elephant=new Elephant("grey", 250, 13);
		Monkey monkey=new Monkey("black", 5.80, 2);
	
	
		lion.informationString();
		lion.soundType();
		lion.colorWeightAndAge();
		lion.isVegetarian();
		lion.canClimb();
		
		System.out.println("===================");
		
		tiger.informationString();
		tiger.soundType();
		tiger.colorWeightAndAge();
		tiger.isVegetarian();
		tiger.canClimb();
		
		System.out.println("===================");
		
		deer.informationString();
		deer.soundType();
		deer.colorWeightAndAge();
		deer.isVegetarian();
		deer.canClimb();
		
		System.out.println("===================");
		
		elephant.informationString();
		elephant.soundType();
		elephant.colorWeightAndAge();
		elephant.isVegetarian();
		elephant.canClimb();
		
		System.out.println("===================");
		
		monkey.informationString();
		monkey.soundType();
		monkey.colorWeightAndAge();
		monkey.isVegetarian();
		monkey.canClimb();
		
	}
}

/*create objects for the animals that are existing in zoo 
 * and print the characteristic of each animal.
 */