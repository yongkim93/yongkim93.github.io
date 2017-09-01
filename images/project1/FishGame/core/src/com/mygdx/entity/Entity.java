package com.mygdx.entity;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.components.Body;
import com.mygdx.components.Physics;
import com.mygdx.components.View;
import com.mygdx.game.FishGame;

public abstract class Entity {
	
	public static final int PLAYER = 1;
	public static final int ENEMY = 2;

	private int type;
	private int viewType;
	private Body body;
	private Physics physics;
	private View view;
	private ArrayList<Entity> group;
	
	public void create(Entity entity){
		if(entity instanceof Player) type = PLAYER;
		if(entity instanceof Enemy) type = ENEMY;
		this.setBody(new Body(entity));
		this.setPhysics(new Physics(entity));
		this.setView(new View(entity));
	}
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Body getBody(){
		return body;
	}
	
	public void setBody(Body body){
		this.body = body;
	}
	
	public void setPhysics(Physics physics){
		this.physics = physics;
	}
	
	public Physics getPhysics(){
		return physics;
	}
	
	public void setView(View view){
		this.view = view;
	}
	
	public View getView(){
		return view;
	}
	
	public void setGroup(ArrayList<Entity> group){
		this.group = group;
	}
	
	public ArrayList<Entity> getGroup(){
		return group;
	}
	
	public abstract void create();
	public abstract void update();
	public abstract void render(SpriteBatch sb);
	
	protected void wrap() {
		if (body.getX() < 0)
			body.setX(FishGame.width);
		if (body.getX() > FishGame.width)
			body.setX(0);
		if (body.getY() < 0)
			body.setY(FishGame.height);
		if (body.getY() > FishGame.height)
			body.setY(0);
	}
	
	public int getViewType() {
		return viewType;
	}

	public void setViewType(int viewType) {
		this.viewType = viewType;
	}

	public boolean collision(Entity entity){
		boolean flag = false;
		float lengthOne = body.getX() - entity.getBody().getX();
		float lengthTwo = entity.getBody().getX() - body.getX();
		float gapOne = lengthOne  - view.getWidth()/2 - entity.getView().getWidth()/2;
		float gapTwo = lengthTwo - view.getWidth()/2 - entity.getView().getWidth()/2;
		
		float heightOne = body.getY() - entity.getBody().getY();
		float heightTwo = entity.getBody().getY() - body.getY();
		float gapThree = heightOne - view.getHeight()/2 - entity.getView().getHeight()/2;
		float gapFour = heightTwo - view.getHeight()/2 - entity.getView().getHeight()/2;
		
		if((gapOne <= 0 && gapTwo <=0) && (gapThree <=0 && gapFour <=0)){
			flag = true;
		}
		
//		if(gapOne <= 0 && gapTwo <= 0)
//			flag = true;
//		System.out.println(body.getX());
//		System.out.println(entity.getBody().getX());
//		System.out.println(body.getY());
//		System.out.println(entity.getBody().getY());
//		System.out.println(body.getX());
//		System.out.println(entity.getBody().getX() + entity.getView().getWidth());
//		System.out.println(body.getX() - (entity.getBody().getX() + entity.getView().getWidth()));

//		if((body.getX() - (entity.getBody().getX() + entity.getView().getWidth()) <= 0 &&
//			entity.getBody().getX() - (body.getX() + view.getWidth()) <=0) &&	
//			(body.getY() - entity.getBody().getY() - entity.getView().getHeight() <= 0 &&
//			entity.getBody().getY() - body.getY() - view.getHeight() <=0))
//			flag = true;
		
		return flag;
	}
}
