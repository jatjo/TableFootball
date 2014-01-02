package com.jatjo.tablefootball;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SecondTeam {
	private Integer[][] position= {{760, 240}, // Keeper
								   {725, 180}, // Upper 5 meter
								   {725, 300}, // Lower 5 meter
								   {650, 105}, // Upper 16 meter
								   {624, 240}, // Middle 16 meter
								   {650, 375}, // Lower 16 meter
								   {500, 70}, // Upper wing
								   {540, 240}, // Middle field
								   {410, 170}, // Center 1
								   {410, 310}, // Center 2
								   {500, 410} // Lower wing
								  };
	
	private Texture[] playerTexture = new Texture[11];
	private Sprite[] playerSprite = new Sprite[11];
	
	public SecondTeam() {
		playerTexture[0] = new Texture(Gdx.files.internal("data/keeper_blue.png"));
		playerSprite[0] = new Sprite(playerTexture[0]);
		playerSprite[0].setPosition(position[0][0], position[0][1]);
		
		for (int player = 1; player < 11; player++) {
			playerTexture[player] = new Texture(Gdx.files.internal("data/player_blue.png"));
			playerSprite[player] = new Sprite(playerTexture[player]);
			playerSprite[player].setPosition(position[player][0], position[player][1]);
		}	
	}

	public void draw(SpriteBatch batch) {
		for (Sprite sprite : playerSprite) {
			sprite.draw(batch);
		}
	}
}
