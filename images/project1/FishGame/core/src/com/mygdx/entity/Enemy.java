package com.mygdx.entity;

import java.util.Random;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Enemy extends Entity {
	
	public static final int BLACK = 1;
	public static final int BLUE = 2;
	public static final int BROWN = 3;
	public static final int GREEN = 4;
	public static final int ORANGE = 5;
	
	private Random rng = new Random();
	private int viewType = rng.nextInt(5) + 1;

	public Enemy(){
		create(this);
		getBody().setX(rng.nextInt(350));
		getBody().setY(rng.nextInt(350));
	}
	
	public int getViewType() {
		return viewType;
	}

	public void setViewType(int viewType) {
		this.viewType = viewType;
	}

	public void create(){
		
	}
	
	public void update(){
		
	}
	
	public void render(SpriteBatch sb){
		sb.draw(getView().getTexture(), getBody().getX() - getView().getWidth() /2, getBody().getY() - getView().getHeight() /2);
	}

}
