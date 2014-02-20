package com.foragers.terchallange.logic;

public class Oxygen {

	private float oxygenLevel;
	
	public float getDioxygenDelayRest(float deltaTime) {
		oxygenLevel = oxygenLevel - deltaTime*0.1f;
		return oxygenLevel;
	}
	
	public void resetOxygenLevel(){
		oxygenLevel = 100;
	}
	
}
