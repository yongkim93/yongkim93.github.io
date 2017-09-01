package com.mygdx.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameStateManager {

	private GameState[] gameStates;
	private int currentState;
	
	private PauseState pauseState;
	private boolean paused;
	
	public static final int NUM_OF_GAME_STATE = 5;
	public static final int MENU = 1;
	public static final int PLAY = 2;
	public static final int TANK = 3;
	public static final int SETTING = 4; 
	public static final int CREDIT = 0;

	public GameStateManager(){
		gameStates = new GameState[NUM_OF_GAME_STATE];
		pauseState = new PauseState(this);
		paused = false;
		
		currentState = CREDIT;
		loadState(currentState);
	}

	private void loadState(int state){
		if(state == MENU)
			gameStates[state] = new MenuState(this);
		else if(state == PLAY)
			gameStates[state] = new PlayState(this);
		else if(state == TANK)
			gameStates[state] = new TankState(this);
		else if(state == SETTING)
			gameStates[state] = new SettingState(this);
		else if(state == CREDIT)
			gameStates[state] = new CreditState(this);
	}
	
	public void unloadState(int state){
		gameStates[state] = null;
	}
	
	public void setState(int state){
		unloadState(currentState);
		currentState = state;
		loadState(currentState);
	}
	
	public void setPaused(boolean b) {paused = b;}
	
	public void update(){
		if(paused){
			pauseState.update();
		}else if(gameStates[currentState] != null){
			gameStates[currentState].update();
		}
	}
	
	public void render(SpriteBatch sb){
		if(paused){
			pauseState.render(sb);
		}else if(gameStates[currentState] != null){
			gameStates[currentState].render(sb);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}