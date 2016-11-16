package services;

import models.Animals;

public abstract class SpeciesFactory {
	public abstract Animals getAnimal(String type)throws Throwable;

}
