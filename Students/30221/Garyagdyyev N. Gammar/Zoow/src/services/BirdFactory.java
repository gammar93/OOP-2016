package services;

import models.Animals;
import models.type.bird.Stork;

public class BirdFactory extends SpeciesFactory {
	public Animals getAnimal(String type) throws Exception {
		if (Constants.Animals.Bird.Stork.equals(type)) {
			return new Stork();
		}
		else
			throw new Exception("Error!");
	}
}
