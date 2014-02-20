package com.foragers.mg.entities;

public class Diver extends Entity {
	
	public static final int DIVER_STATE_UP = 0;
	public static final int DIVER_STATE_DOWN = 1;
	
	int state;
	
	public Diver(float x, float y) {
		super(x, y);
		state = DIVER_STATE_UP;
	}
	
	public void update(float delta, float accelX) {
		state = accelX < 0 ? DIVER_STATE_UP : DIVER_STATE_DOWN;
	}

}
