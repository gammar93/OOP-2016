package views;

import models.Animals;
import models.type.insect.*;
import services.AnimalFactory;
import services.Constants;
import services.SpeciesFactory;

public class Insectsview {
	public void insectsview() throws Throwable {
		AnimalFactory factory = new AnimalFactory();
		SpeciesFactory species = factory.getSpeciesFactory(Constants.Species.Insect);
		Animals a = species.getAnimal(Constants.Animals.Insect.Butterfly);
		Butterfly b = new Butterfly();
		a.getNume();
		a.getNrLegs();
		b.isCanFly();
		b.isDangerous();
		System.out.println(" ");
	}
}
