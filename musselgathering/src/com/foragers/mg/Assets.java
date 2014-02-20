package com.foragers.mg;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Assets {
	
	public static Texture background;

	public static Texture diverUp;
	public static Texture diverDown;
	public static Texture mussel;
	
	public static Texture loadTexture(String file) {
		return new Texture(Gdx.files.internal(file));
	}
	
	public static void load() {
		background = loadTexture("data/background.png");
		
		diverUp = loadTexture("data/diverUp.png");
		diverDown = loadTexture("data/diverDown.png");
		mussel = loadTexture("data/mussel.png");
	}

}
