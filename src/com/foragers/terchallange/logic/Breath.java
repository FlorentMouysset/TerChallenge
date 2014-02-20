package com.foragers.terchallange.logic;

public class Breath {

	private Oxygen oxygen;
	private float breathLevel;
	
	public Breath(Oxygen oxygen){
		this.oxygen = oxygen;
	}
	
	public float getBreathLevel(float deltaTime){
		breathLevel = breathLevel - deltaTime*0.1f;
		return breathLevel;
	}
	
	
	public void takeABreath(){
		this.oxygen.takeABreath();
		breathLevel = 10;
	}
	
}
