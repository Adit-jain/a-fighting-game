package game1.entities.creatures;

import java.awt.Graphics;

import game1.gfx.Assets;
import game1.game;


public class Player extends Creature
{
	private game g;
	
	public Player(game g,float x, float y) {
		super(x, y,Creature.DC_width,Creature.DC_height);
		this.g=g;
	}
	
	

	@Override
	public void tick() 
	{
		getInput();
		move();
		
	}
	public void getInput()
	{
		xMove = 0;
		yMove = 0;
		
		
		
		if(game.getKeyManager().up&&y>400)
			yMove = -speed;
		if(game.getKeyManager().down&&y<560)
			yMove = speed;
		if(game.getKeyManager().right&&x<1750)
			xMove = speed;
		if(game.getKeyManager().left&&x>20)
			xMove = -speed;
	}

	
	public void render(Graphics g) 
	{
		int c_c = game.countrun;
		//int pos = game.x;
		g.drawImage(Assets.player[c_c], (int) x, (int) y, null);
		
			
	}
		
	}

