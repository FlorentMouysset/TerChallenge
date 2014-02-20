package com.foragers.mg.logic;

public class Breath {

	private Oxygen oxygen;
	private float breathLevel;

	public Breath(Oxygen oxygen) {
		this.oxygen = oxygen;
	}

	public float getBreathLevel(float deltaTime) {
		this.breathLevel = this.breathLevel - deltaTime * 0.1f;
		return this.breathLevel;
	}

	public void takeABreath() {
		this.breathLevel = this.oxygen.takeABreath();
	}

}
