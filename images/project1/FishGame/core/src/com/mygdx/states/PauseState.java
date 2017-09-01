package com.mygdx.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PauseState extends GameState{
	
	public PauseState(GameStateManager gsm){
		super(gsm);
	}
	public void create(){
		
	}
	public void update(){
		handleInput();
	}
	public void render(SpriteBatch sb){
		
	}
	public void handleInput(){
		//if resume, return to game
		//if main, goto main
		//if setting, goto setting
		
	}

}
