package com.foragers.mg.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.GLCommon;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.TimeUtils;
import com.foragers.mg.Assets;

public class MainMenuScreen implements Screen {
	Game game;

	OrthographicCamera camera;
	SpriteBatch batcher;
	Rectangle playBounds;
	Rectangle quitBounds;
	Vector3 touchPoint;

	public MainMenuScreen (Game game) {
		this.game = game;
		camera = new OrthographicCamera(320, 480);
		camera.position.set(320 / 2, 480 / 2, 0);
		batcher = new SpriteBatch();
		playBounds = new Rectangle(130, 165, 75, 30);
		quitBounds = new Rectangle(130, 110, 75, 30);
		touchPoint = new Vector3();
	}

	public void update () {
		if (Gdx.input.justTouched()) {
			camera.unproject(touchPoint.set(Gdx.input.getX(), Gdx.input.getY(), 0));
			Gdx.app.log("abcdef", touchPoint.toString());

			if (playBounds.contains(touchPoint.x, touchPoint.y)) {
				game.setScreen(new GameScreen(game));
				return;
			}
			
			if (quitBounds.contains(touchPoint.x, touchPoint.y)) {
				Gdx.app.exit();
				return;
			}
		}
	}

	long last = TimeUtils.nanoTime();

	public void draw () {
		GLCommon gl = Gdx.gl;
		gl.glClearColor(1, 0, 0, 1);
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		camera.update();
		batcher.setProjectionMatrix(camera.combined);

		batcher.enableBlending();
		batcher.begin();
		batcher.draw(Assets.menuRegion, 0, 0, 320, 480);
		batcher.end();

		if (TimeUtils.nanoTime() - last > 2000000000) {
			last = TimeUtils.nanoTime();
		}
	}

	@Override
	public void render (float delta) {
		update();
		draw();
	}

	@Override
	public void resize (int width, int height) {
	}

	@Override
	public void show () {
	}

	@Override
	public void hide () {
	}

	@Override
	public void pause () {
	}

	@Override
	public void resume () {
	}

	@Override
	public void dispose () {
	}
}
