package com.mygdx.components;

import com.mygdx.entity.Entity;

public class Physics {
	
	private float currentHorizontalSpeed;
	private float currentVerticalSpeed;
	private float accelSpeed;
	private float decelSpeed;
	private Entity entity;
	
	public Physics(Entity entity){
		
		this.entity = entity;

		switch(entity.getType()){
		case Entity.PLAYER:
			this.currentHorizontalSpeed = 0;
			this.currentVerticalSpeed = 0;
			this.accelSpeed = 290;
			this.decelSpeed = 100;
			break;
		case Entity.ENEMY:
			this.currentHorizontalSpeed = 0;
			this.currentVerticalSpeed = 0;
			this.accelSpeed = 210;
			this.decelSpeed = 100;
			break;
		}
	}
	public float getCurrentHorizontalSpeed() {
		return currentHorizontalSpeed;
	}
	public void setCurrentHorizontalSpeed(float currentHorizontalSpeed) {
		this.currentHorizontalSpeed = currentHorizontalSpeed;
	}
	public float getCurrentVerticalSpeed() {
		return currentVerticalSpeed;
	}
	public void setCurrentVerticalSpeed(float currentVerticalSpeed) {
		this.currentVerticalSpeed = currentVerticalSpeed;
	}
	public float getAccelSpeed() {
		return accelSpeed;
	}
	public void setAccelSpeed(float accelSpeed) {
		this.accelSpeed = accelSpeed;
	}
	public float getDecelSpeed() {
		return decelSpeed;
	}
	public void setDecelSpeed(float decelSpeed) {
		this.decelSpeed = decelSpeed;
	}
	

}
