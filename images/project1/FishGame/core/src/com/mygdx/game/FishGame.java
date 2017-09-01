package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.states.GameStateManager;

public class FishGame extends ApplicationAdapter {

	SpriteBatch batch;
	public static int width;
	public static int height;
	
	public static OrthographicCamera cam;
	public static GameStateManager gsm;

	@Override
	public void create () {
		cam = new OrthographicCamera(100,100);

		batch = new SpriteBatch();
		width = Gdx.graphics.getWidth();
		height = Gdx.graphics.getHeight();
		
		gsm = new GameStateManager();
	}

	@Override
	public void render () {

		gsm.update();
		
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		
		gsm.render(batch);
		batch.end();
	}
}
