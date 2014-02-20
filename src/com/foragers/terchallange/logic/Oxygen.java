package com.foragers.terchallange.logic;

public class Oxygen {

	private float oxygenLevel;
	
	public float getDioxygenLevel() {
		return oxygenLevel;
	}
	
	public void resetOxygenLevel(){
		oxygenLevel = 100;
	}

	public void takeABreath() {
		oxygenLevel -= 10;
	}
	
}
