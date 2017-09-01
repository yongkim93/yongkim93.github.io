package com.mygdx.components;

import com.mygdx.entity.Entity;
import com.mygdx.game.FishGame;

public class Body {
	
	private int health;
	private float x;
	private float y;
	private float size;
	private boolean died;
	
	private Entity entity;

	public Body(Entity entity){

		this.entity = entity;
		this.died = false;
		
		switch(entity.getType()){
		case Entity.PLAYER:
			this.x = FishGame.width / 2; 
			this.y = FishGame.height /2;
			this.size = 1;
			this.health = 100;
			break;
		case Entity.ENEMY:
			this.x = 1;
			this.y = 1;
			this.size = 1;
			this.health = 100;
			break;
		}
	}	
	public void addXY(float x, float y){
		this.x += x;
		this.y += y;
	}
	public void addSize(float size){
		this.size += size;
	}
	public boolean isDied() {
		return died;
	}
	public void setDied(boolean died) {
		this.died = died;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	

}
