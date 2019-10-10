package game1.entities.creatures;

import game1.entities.Entity;

public abstract class Creature extends Entity {
	
	protected int health;
	protected float speed;
	protected float xMove,yMove;
	public static final int Default_health=10;
	public static final float Default_speed  = 3.0f;
	public static final int DC_height = 170,DC_width = 260;

	public Creature(float x, float y , int width, int height) {
		super(x, y,width,height);
		health = Default_health;
		speed = Default_speed;
		
		
	}
	
	public void move()
	{
		x += xMove;
		y += yMove;
	}
//Getters and Setters
	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
}
