package com.foragers.mg.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {

	public static final float WORLD_WIDTH = 9.5f;
	public static final float WORLD_HEIGHT = 14;
	public static final int WORLD_STATE_RUNNING = 0;
	public static final int WORLD_STATE_GAME_OVER = 1;
	
	public final Diver diver;
	public final List<Mussel> mussels;
	public final Random rand;
	
	public int state;

	public World() {
		diver = new Diver(WORLD_WIDTH / 2, WORLD_HEIGHT / 2);
		mussels = new ArrayList<Mussel>();
		rand = new Random();
		generateLevel();
		
		state = WORLD_STATE_RUNNING;
	}

	private void generateLevel() {
		for (int i = 0; i < 10; i++) {
			float x = rand.nextFloat() * WORLD_WIDTH;
			float y = rand.nextFloat() * WORLD_HEIGHT;
			mussels.add(new Mussel(x, y));
		}
	}
	
	public void update(float delta, float accelX) {
		updateDiver(delta, accelX);
	}
	
	private void updateDiver(float delta, float accelX) {
		diver.update(delta, accelX);
	}

}
