package com.jatjo.tablefootball;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FirstTeam {
	private Integer[][] position = {{40, 240}, // Keeper
									{75, 180}, // Upper 5 meter
									{75, 300}, // Lower 5 meter
									{150, 105}, // Upper 16 meter
									{176, 240}, // Middle 16 meter
									{150, 375}, // Lower 16 meter
									{390, 30}, // Upper wing
									{290, 240}, // Middle field
									{390, 230}, // Center 1
									{390, 250}, // Center 2
									{390, 450} // Lower wing
								   };
	
	private Texture[] playerTexture = new Texture[11];
	private Sprite[] playerSprite = new Sprite[11];
	
	public FirstTeam() {
		playerTexture[0] = new Texture(Gdx.files.internal("data/keeper_red.png"));
		playerSprite[0] = new Sprite(playerTexture[0]);
		playerSprite[0].setPosition(position[0][0], position[0][1]);
		
		for (int player = 1; player < 11; player++) {
			playerTexture[player] = new Texture(Gdx.files.internal("data/player_red.png"));
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
