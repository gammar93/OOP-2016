package views;

import models.Animals;
import models.type.mammal.*;
import services.AnimalFactory;
import services.Constants;
import services.SpeciesFactory;

public class Mammalsview {
	public void mammalsview() throws Throwable{
		AnimalFactory factory=new AnimalFactory();
		SpeciesFactory species = factory.getSpeciesFactory(Constants.Species.Mammal);
		Animals a=species.getAnimal(Constants.Animals.Mammal.Dog);
		Dog g = new Dog();
		a.getNume();
		a.getNrLegs();
		g.getBodyTemp();
		g.getBodyHair();
		System.out.println(" ");
		Animals a1=species.getAnimal(Constants.Animals.Mammal.Cat);
		Cat c= new Cat();
		a1.getNume();
		a1.getNrLegs();
		c.getBodyTemp();
		c.getBodyHair();
		System.out.println(" ");
		
		
	}
}
