package models;

public abstract class Animals {
	private int nrLegs;
	private String nume;

	public void getNrLegs() {
		System.out.println("NrOfLegs: " + nrLegs);
	}

	public void setNrLegs(int nrLegs) {
		this.nrLegs = nrLegs;
	}

	public void getNume() {
		System.out.println("Name: " + nume);
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

}
