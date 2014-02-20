package com.foragers.mg.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.foragers.mg.entities.World;
import com.foragers.mg.entities.WorldRenderer;

public class GameScreen implements Screen {
	
	OrthographicCamera camera;
	SpriteBatch batch;
	World world;
	WorldRenderer renderer;
	
	public GameScreen() {
		camera = new OrthographicCamera(320, 480);
		camera.position.set(320 / 2, 480 / 2, 0);
		batch = new SpriteBatch();
		world = new World();
		renderer = new WorldRenderer(batch, world);
	}
	
	@Override
	public void render(float delta) {
		if (delta > 0.1f) {
			delta = 0.1f;
		}
		
		world.update(delta, Gdx.input.getAccelerometerX(), Gdx.input.getAccelerometerY());
		
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		renderer.render();
		
		camera.update();
		batch.setProjectionMatrix(camera.combined);
		batch.enableBlending();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void show() {
	}

	@Override
	public void hide() {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void dispose() {
	}

}
