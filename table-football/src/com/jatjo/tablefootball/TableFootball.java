package com.jatjo.tablefootball;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TableFootball implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture background;
	private FirstTeam firstTeam;
	private SecondTeam secondTeam;
	
	@Override
	public void create() {		
		Texture.setEnforcePotImages(false);
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
		
		batch = new SpriteBatch();
		
		background = new Texture(Gdx.files.internal("data/pitch.png"));
		
		firstTeam = new FirstTeam();
		secondTeam = new SecondTeam();
	}

	@Override
	public void dispose() {
		batch.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		batch.draw(background, 0, 0);
		firstTeam.draw(batch);
		secondTeam.draw(batch);
		
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
