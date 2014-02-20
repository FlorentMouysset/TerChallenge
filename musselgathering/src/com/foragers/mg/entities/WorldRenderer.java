package com.foragers.mg.entities;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.foragers.mg.Assets;

public class WorldRenderer {

	static final float FRUSTUM_WIDTH = 10;
	static final float FRUSTUM_HEIGHT = 15;
	
	World world;
	OrthographicCamera camera;
	SpriteBatch batch;
	TextureRegion background;
	
	public WorldRenderer(SpriteBatch batch, World world) {
		this.batch = batch;
		this.world = world;
		camera = new OrthographicCamera(FRUSTUM_WIDTH, FRUSTUM_HEIGHT);
		camera.position.set(FRUSTUM_WIDTH / 2, FRUSTUM_HEIGHT / 2, 0);
	}
	
	public void render() {
		camera.update();
		batch.setProjectionMatrix(camera.combined);
		renderBackground();
		renderEntities();
	}
	
	public void renderBackground() {
		batch.disableBlending();
		batch.begin();
		batch.draw(Assets.backgroundRegion, camera.position.x - FRUSTUM_WIDTH / 2, camera.position.y - FRUSTUM_HEIGHT / 2, FRUSTUM_WIDTH, FRUSTUM_HEIGHT);
		batch.end();
	}
	
	public void renderEntities() {
		batch.enableBlending();
		batch.begin();
		renderMussels();
		batch.end();
	}
	
	private void renderMussels() {
		int length = world.mussels.size();
		for (int i = 0; i < length; i++) {
			Mussel mussel = world.mussels.get(i);
			batch.draw(Assets.mussel, mussel.position.x, mussel.position.y, 0.5f, 1);
		}
	}
	
}
