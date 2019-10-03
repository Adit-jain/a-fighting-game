package game1.entities.creatures;

import java.awt.Graphics;

import game1.gfx.Assets;
import game1.gfx.ImageLoader;
import game1.game;


public class Horse extends Creature
{
	private game g;
	
	public Horse(game g,float x, float y) {
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
		
		if(game.getKeyManager().up2&&y>500)
			yMove = -speed;
		if(game.getKeyManager().down2&&y<635)
			yMove = speed;
		if(game.getKeyManager().right2&&x<1650)
			xMove = speed;
		if(game.getKeyManager().left2&&x>20)
			xMove = -speed;
	}

	
	public void render(Graphics g) 
	{
		int c_h = game.counthor;
		//int pos = game.x;
		g.drawImage(Assets.horse[c_h], (int) x, (int) y, null);
		//g.drawImage(ImageLoader.loadImage("res/textures/test.png"), (int) x, (int) y, null);
			
	}
		
	}

