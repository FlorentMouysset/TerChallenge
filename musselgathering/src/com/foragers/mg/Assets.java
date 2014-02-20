package com.foragers.mg;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets {
	public static Texture background;
	public static Texture titre;
	public static TextureRegion backgroundRegion;

	public static Texture items;
	public static Animation bubblesAnim;
	public static BitmapFont font;

	public static Texture loadTexture (String file) {
		return new Texture(Gdx.files.internal(file));
	}

	public static void load () {
		//background = loadTexture("data/g.png");
		//backgroundRegion = new TextureRegion(background, 0, 0, 512, 512);

		items = loadTexture("data/bubbles.png");

		bubblesAnim = new Animation(0.2f, new TextureRegion(items, 0, 0, 8, 8), new TextureRegion(items, 8, 0, 8, 8),
			new TextureRegion(items, 24, 0, 8, 8), new TextureRegion(items, 8, 0, 8, 8));
	
		titre = loadTexture("data/title.png");

	}

}
