package com.foragers.mg;

import com.badlogic.gdx.Game;
import com.foragers.mg.screens.MainMenuScreen;

public class MusselGathering extends Game {

	@Override
	public void create() {
		Assets.load();
		setScreen(new MainMenuScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		getScreen().dispose();
	}
	
}
