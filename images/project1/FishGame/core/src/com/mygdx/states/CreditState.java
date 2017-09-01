package com.mygdx.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class CreditState extends GameState {
	
	private Texture bg;
	private ShapeRenderer sr;

	public CreditState(GameStateManager gsm){
		super(gsm);
		create();
	}
	public void create(){
		bg = new Texture(Gdx.files.internal("states/credit.png"));
		sr = new ShapeRenderer();
	}
	public void update(){
		handleInput();
	}
	public void render(SpriteBatch sb){
		sb.enableBlending();
		sb.draw(bg, 0, 0);
		sb.disableBlending();
		sr.setColor(1,0,0,1);
		sr.begin(ShapeType.Line);
		sr.rect(100, 100,300,100);
		sr.end();
	}
	public void handleInput(){
		System.out.println("x: " + Gdx.input.getX() + "\n y: " + Gdx.input.getY());
		if((Gdx.input.getX() >= 100 && Gdx.input.getX() <=400)
				&&(Gdx.input.getY() >= 300 && Gdx.input.getY() <= 400)
				&& (Gdx.input.isButtonPressed(Input.Buttons.LEFT)
						|| Gdx.input.isTouched())){
			gsm.setState(GameStateManager.PLAY);
		}
	}
}
