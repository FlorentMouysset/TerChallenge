package com.foragers.terchallange.logic;

public class Breath {

	private Oxygen oxygen;
	
	public Breath(Oxygen oxygen){
		this.oxygen = oxygen;
	}
	
	public void diveUp() {
		oxygen.resetOxygenLevel();
	}
	
}
