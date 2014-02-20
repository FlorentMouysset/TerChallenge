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
		for (int i = 0; i < 10; i++) {
			float x = rand.nextFloat() * (WORLD_WIDTH - Mussel.MUSSEL_WIDTH) + Mussel.MUSSEL_WIDTH / 2;
			float y = rand.nextFloat() * (WORLD_HEIGHT - Mussel.MUSSEL_HEIGHT) + Mussel.MUSSEL_HEIGHT / 2;
			System.out.println(">" + x +" " + y);
			mussels.add(new Mussel(x, y));
		}
	}

}
