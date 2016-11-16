package views;

import models.Animals;
import models.type.bird.*;
import services.AnimalFactory;
import services.Constants;
import services.SpeciesFactory;

public class Birdsview {
	public void birdsview() throws Throwable{
		AnimalFactory factory=new AnimalFactory();
		SpeciesFactory species = factory.getSpeciesFactory(Constants.Species.Bird);
		Animals a=species.getAnimal(Constants.Animals.Bird.Stork);
		Stork g = new Stork();
		a.getNume();
		a.getNrLegs();
		g.getMigrates();
		g.getAvgFlightAltitude();
		System.out.println(" ");
	}

}
