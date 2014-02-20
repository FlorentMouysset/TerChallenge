package com.foragers.mg.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {

	public static final float WORLD_WIDTH = 10;
	public static final float WORLD_HEIGHT = 15 * 20;
	public static final int WORLD_STATE_RUNNING = 0;
	public static final int WORLD_STATE_GAME_OVER = 1;
	
	public final List<Mussel> mussels;
	public final Random rand;
	
	public int state;

	public World() {
		mussels = new ArrayList<Mussel>();
		rand = new Random();
		generateLevel();
		
		state = WORLD_STATE_RUNNING;
	}

	private void generateLevel() {
		float y = Mussel.MUSSEL_HEIGHT / 2;
		while (y < WORLD_HEIGHT) {
			float x = rand.nextFloat() * (WORLD_WIDTH - Mussel.MUSSEL_WIDTH) + Mussel.MUSSEL_WIDTH / 2;
			
			Mussel mussel = new Mussel(x, y);
			mussels.add(mussel);
			
			y += rand.nextFloat();
		}
	}

}
