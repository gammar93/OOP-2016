package services;

import models.Animals;
import models.type.insect.*;

public class InsectFactory extends SpeciesFactory {
	public Animals getAnimal(String type) throws Exception {
		if (Constants.Animals.Insect.Butterfly.equals(type)) {
			return new Butterfly();
		}

		else
			throw new Exception("Error!");
	}

}
