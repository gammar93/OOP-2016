package models.type;

import models.Animals;

public abstract class Insect extends Animals {
	private boolean canFly;
	private boolean isDangerous;
	
	public void isCanFly() {
		System.out.println("IsCanFly: " + canFly);
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public void isDangerous() {
		System.out.println("IsDagerous: " + isDangerous);
	}
	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	
	
	

}
