package com.mygdx.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player extends Entity{
	
	private float maxSpeed;
	private float dt;
	private float chs;
	private float cvs;
	private float as;
	private float ds;

	public Player(){
		create(this);
		maxSpeed = 290;
	}
	
	public void create(){
		
	}
	
	public void update(){
		dt = Gdx.graphics.getDeltaTime();
		chs = getPhysics().getCurrentHorizontalSpeed();
		cvs = getPhysics().getCurrentVerticalSpeed();
		as = getPhysics().getAccelSpeed();
		ds = getPhysics().getDecelSpeed();
		
		//System.out.println(Gdx.input.isKeyPressed(Keys.LEFT));
		if(Gdx.input.isKeyPressed(Keys.RIGHT)){
			chs += as * dt;
			if(chs >= maxSpeed)
				chs = maxSpeed;
		}
		else if(Gdx.input.isKeyPressed(Keys.LEFT)){
			chs -= as * dt;
			if(chs <= maxSpeed * -1)
				chs = maxSpeed * -1;
		}else if(!Gdx.input.isKeyPressed(Keys.RIGHT) && !Gdx.input.isKeyPressed(Keys.LEFT)){
			
			if(chs > 2)
				chs -= ds * dt;
			else if(chs < -2)
				chs += ds * dt;
			else
				chs = 0f;
		}

		if(Gdx.input.isKeyPressed(Keys.UP)){
			cvs += as * dt;
			if(cvs >= maxSpeed)
				cvs = maxSpeed;
		}else if(Gdx.input.isKeyPressed(Keys.DOWN)){
			cvs -= as * dt;
			if(cvs <= maxSpeed * -1)
				cvs = maxSpeed * -1;
		}else if(!Gdx.input.isKeyPressed(Keys.DOWN) && !Gdx.input.isKeyPressed(Keys.UP)){
			
			if(cvs > 2)
				cvs -= ds * dt;
			else if(cvs < -2)
				cvs += ds * dt;
			else
				cvs = 0f;
		}
		
		//System.out.println(currentVerticalSpeed);
		//System.out.println(currentHorizontalSpeed);
		getPhysics().setCurrentHorizontalSpeed(chs);
		getPhysics().setCurrentVerticalSpeed(cvs);
		getBody().addXY(chs * dt, cvs * dt);

		
		wrap();
	}
	
	public void render(SpriteBatch sb){
		sb.draw(getView().getTexture(), getBody().getX() - getView().getWidth()/2, getBody().getY() - getView().getHeight()/2,
				getView().getWidth(), getView().getHeight());
	}

}
