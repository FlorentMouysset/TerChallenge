package com.foragers.mg.entities;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Entity {

	public final Vector2 position;
	public final Rectangle bounds;
	
	public Entity(float x, float y, float width, float height) {
		position = new Vector2(x, y);
		bounds = new Rectangle(x - width / 2, y - height / 2, width, height);
	}
	
}
