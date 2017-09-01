package com.mygdx.states;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MenuState extends GameState {

	BitmapFont font = new BitmapFont();
	private int elapsed;
	
	public MenuState(GameStateManager gsm){
		super(gsm);
	}
	public void create(){
		
	}
	public void update(){
		handleInput();
	}
	public void render(SpriteBatch sb){
		font.setColor(1,1,0,1);
		font.draw(sb,"" + System.currentTimeMillis(), 250, 250);
	}
	public void handleInput(){
	}
}
