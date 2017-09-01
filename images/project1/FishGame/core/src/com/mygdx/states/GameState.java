package com.mygdx.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class GameState {
	
	protected GameStateManager gsm;
	
	public GameState(GameStateManager gsm){
		this.gsm = gsm;
	}
	
	public abstract void create();
	public abstract void update();
	public abstract void render(SpriteBatch sb);
	public abstract void handleInput();
}
