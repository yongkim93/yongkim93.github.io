package com.mygdx.states;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.entity.Enemy;
import com.mygdx.entity.Player;

public class PlayState extends GameState{
	
	public Player player;
	public ArrayList<Enemy> enemyList;
	
	public PlayState(GameStateManager gsm){
		super(gsm);
		create();
	}
	public void create(){
		player = new Player();
		enemyList = new ArrayList<Enemy>();
		for(int i = 0; i <= 3; i++){
			enemyList.add(new Enemy());
		}
	}
	public void update(){
		handleInput();
		player.update();
		
		for(int i = 0; i < enemyList.size(); i++){
			if(player.collision(enemyList.get(i))){
				enemyList.remove(i);
				player.getBody().addSize(.005f);
				player.getView().setSize(player.getBody().getSize());
				enemyList.add(new Enemy());
			}
		}
	}
	public void render(SpriteBatch sb){
		
		player.render(sb);
		for(int i = 0; i < enemyList.size(); i++){
			enemyList.get(i).render(sb);
		}
		
	}
	public void handleInput(){
	}
}

