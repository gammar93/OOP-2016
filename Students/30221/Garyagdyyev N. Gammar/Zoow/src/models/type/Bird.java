package models.type;

import models.Animals;

public abstract class Bird extends Animals {
	private boolean migrates;
	private int avgFlightAltitude;
	
	public void getMigrates(){
		System.out.println("Migrates: " + migrates);
	}
	public void setMigrates(boolean migrates){
		this.migrates = migrates;
	}
	
	public void getAvgFlightAltitude(){
		System.out.println("AvgFlightAltitude: " + avgFlightAltitude);
	}
	public void setAvgFlightAltitude(int avgFlightAltitude){
		this.avgFlightAltitude = avgFlightAltitude;
	}

}
