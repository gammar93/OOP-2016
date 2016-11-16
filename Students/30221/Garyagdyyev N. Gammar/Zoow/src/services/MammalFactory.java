package services;

import models.Animals;
import models.type.mammal.*;

public class MammalFactory extends SpeciesFactory {
	public Animals getAnimal(String type) throws Exception {
		if (Constants.Animals.Mammal.Dog.equals(type)) {
			return new Dog();
		}else if(Constants.Animals.Mammal.Cat.equals(type)){
			return new Cat();
	}
		else
			throw new Exception("Error!");
	}

}
