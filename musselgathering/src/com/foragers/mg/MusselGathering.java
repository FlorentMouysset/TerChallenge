package com.foragers.mg;

import com.badlogic.gdx.Game;
import com.foragers.mg.screens.GameScreen;

public class MusselGathering extends Game {

	@Override
	public void create() {
		setScreen(new GameScreen());
	}

	@Override
	public void dispose() {
		super.dispose();
		getScreen().dispose();
	}
	
}
