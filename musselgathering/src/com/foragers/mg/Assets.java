package com.foragers.mg;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets {
	
	public static Texture background;
	public static TextureRegion backgroundRegion;
	
	public static Texture title;
	
	public static Texture items;
	public static Animation bubbles;
	public static Texture mussel;
	
	public static Texture loadTexture(String file) {
		return new Texture(Gdx.files.internal(file));
	}
	
	public static void load() {
		background = loadTexture("data/background.png");
		backgroundRegion = new TextureRegion(background, 0, 0, 320, 480);
		
		title = loadTexture("data/title.png");
		
		items = loadTexture("data/bubbles.png");
		bubbles = new Animation(0.2f, new TextureRegion(items, 0, 0, 8, 8), new TextureRegion(items, 8, 0, 8, 8), new TextureRegion(items, 24, 0, 8, 8), new TextureRegion(items, 8, 0, 8, 8));
		mussel = loadTexture("data/mussel.png");
	}

}
