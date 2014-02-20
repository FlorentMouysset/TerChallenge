package com.foragers.mg;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Assets {
	
	public static Texture background;

	public static Texture diver;
	public static Texture mussel;
	
	public static Texture loadTexture(String file) {
		return new Texture(Gdx.files.internal(file));
	}
	
	public static void load() {
		background = loadTexture("data/background.png");
		
		diver = loadTexture("data/diver.png");
		mussel = loadTexture("data/mussel.png");
	}

}
