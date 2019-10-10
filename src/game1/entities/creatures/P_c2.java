package game1.entities.creatures;

import java.awt.Graphics;

import game1.gfx.Assets;
import game1.game;


public class P_c2 extends Creature
{
	private game g;
	public String flagship="stand";
	private int count=0;
	
	public P_c2(game g,float x, float y) {
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
		
		if(game.getKeyManager().up2&&y>600)
			yMove = -speed;
		if(game.getKeyManager().down2&&y<700)
			yMove = speed;
		if(game.getKeyManager().right2&&x<1650)
			xMove = speed;
		if(game.getKeyManager().left2&&x>20)
			xMove = -speed;
		if(game.getKeyManager().atk2_1)
				flagship = "p2a1";
		if(game.getKeyManager().atk2_2)
		{
			flagship = "p2a2";
			xMove = speed;
		}
		if(game.getKeyManager().atk2_3)
			flagship = "p2a3";
	}

	
	public void render(Graphics g) 
	{
		int c_c2 = game.count_c2;
		//int pos = game.x;
		if(flagship == "stand")
		{
			g.drawImage(Assets.c2_stand[c_c2], (int) x, (int) y, null);
		}
		else if(flagship == "p2a1")
		{
			g.drawImage(Assets.c2_a1[c_c2], (int) x, (int) y, null);
			flagship = "stand";
		}
		else if(flagship == "p2a2")
		{
			g.drawImage(Assets.c2_a2[c_c2], (int) x, (int) y, null);
			flagship = "stand";
		}
		else if(flagship == "p2a3")
		{
			g.drawImage(Assets.c2_a3[c_c2], (int) x, (int) y, null);
			flagship = "stand";
		}
	
			
	}
		
	}

