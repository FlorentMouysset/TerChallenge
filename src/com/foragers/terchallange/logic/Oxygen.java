package com.foragers.terchallange.logic;

public class Oxygen {

	private float oxygenLevel;
	
	public float getDioxygenLevel() {
		return this.oxygenLevel;
	}
	
	public void resetOxygenLevel(){
		this.oxygenLevel = 100;
	}

	public float takeABreath() {
		this.oxygenLevel -= 10;
		if(this.oxygenLevel<0){
			this.oxygenLevel=0;
		}
		return this.oxygenLevel;
	}
	
}
