package models.type;

import models.Animals;

public abstract class Mammal extends Animals {
	
	private float normalBodyTemp;
	private float percBodyHair;
	
	public void setBodyTemp(float normalBodyTemp){
		this.normalBodyTemp = normalBodyTemp;
	}
	public void getBodyTemp(){
		System.out.println("NormalBodyTemp: " + normalBodyTemp);
	}
	
	public void setBodyHair(float percBodyHair){
		this.percBodyHair = percBodyHair;
	}
	public void getBodyHair(){
		System.out.println("PercBodyHair: " + percBodyHair);
	}

}
