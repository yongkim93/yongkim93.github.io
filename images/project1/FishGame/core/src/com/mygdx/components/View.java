package com.mygdx.components;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.entity.Enemy;
import com.mygdx.entity.Entity;

public class View {
	
	private Texture texture;
	private TextureRegion textureRegion;
	private String path;
	private float width;
	private float height;
	private int row;
	private int col;
	
	private Entity entity;

	public View(Entity entity){

		this.entity = entity;
		
		switch(entity.getType()){
		case Entity.PLAYER:
			path = "player_fish.png";
			row = 1;
			col = 1;
			break;
		case Entity.ENEMY:

			switch(entity.getViewType()){
			case Enemy.BLACK:
				path = "black_fish.png";
				break;
			case Enemy.BLUE:
				path = "blue_fish.png";
				break;
			case Enemy.BROWN:
				path = "brown_fish.png";
				break;
			case Enemy.GREEN:
				path = "green_fish.png";
				break;
			case Enemy.ORANGE:
				path = "orange_fish.png";
				break;
			}
			row = 1;
			col = 1;
			break;
		}
		
		texture = new Texture(Gdx.files.internal(path));
		width = texture.getWidth() / col;
		height = texture.getHeight() / row;
		textureRegion = new TextureRegion(texture, (int)width, (int)height);

	}
	public void setSize(float size){
		width = textureRegion.getRegionWidth() * size;
		height = textureRegion.getRegionHeight() * size;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public Texture getTexture() {
		return texture;
	}
	public void setTexture(Texture texture) {
		this.texture = texture;
	}
	public TextureRegion getTextureRegion() {
		return textureRegion;
	}
	public void setTextureRegion(TextureRegion textureRegion) {
		this.textureRegion = textureRegion;
	}
	

}
