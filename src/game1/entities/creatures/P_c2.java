package game1.entities.creatures;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import game1.gfx.Assets;
import game1.game;


public class P_c2 extends Creature
{
	private game g;
	public String flagship="stand";
	static int count=0;
	public static BufferedImage[] c2;
//	public static int arrSize;
	
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
		if(y<=600 && count ==0)
		{
		
				yMove = 6;
				xMove = 1;
		}
		if(game.getKeyManager().up2&&y>600)
			yMove = -speed;
		if(game.getKeyManager().down2&&y<800)
			yMove = speed;
		if(game.getKeyManager().right2&&x<1650)
			xMove = speed;
		if(game.getKeyManager().left2&&x>20)
			xMove = -speed;
		if(game.getKeyManager().atk2_1)
				flagship = "p2a1";
		if(game.getKeyManager().atk2_2&&x<1650)
		{
			flagship = "p2a2";
			xMove = speed;
		}
		if(game.getKeyManager().atk2_3&&x<1650)
		{
			flagship = "p2a3";
			xMove = 2*speed;
		}
		if(game.getKeyManager().jump2&&y>=600&&x<1350)
		{
			flagship = "jump";
			count = 1;
		}
		if(flagship == "jump" && count ==1 )
		{
			yMove = -6;
			xMove = 1;
					if(y<350)
						count=0;
		}
	}

	public void render(Graphics g) 
	{
		int c_c2 = 0;
		
		//int pos = game.x;
		int ty = (int) (y-200);
		
		
		if(flagship == "stand")
		{
			c2 = Assets.c2_stand; 
			game.arrSize = c2.length-1;
			game.checkCount();
			c_c2 = game.count_c2;
			g.drawImage(c2[c_c2], (int) x, (int) y,DC_width,DC_height, null);
		}
		else if(flagship == "p2a1")
		{
			c2 = Assets.c2_a1; 
			game.arrSize = c2.length-1;
			game.checkCount();
			c_c2 = game.count_c2;
			g.drawImage(c2[c_c2], (int) x, (int) y,300,DC_height, null);
			flagship = "stand";
			if(y<600)
				y=600;
		}
		else if(flagship == "p2a2")
		{
			c2 = Assets.c2_a2; 
			game.arrSize = c2.length-1;
			game.checkCount();
			c_c2 = game.count_c2;
			g.drawImage(c2[c_c2], (int) x, (int) y,300,DC_height, null);
			flagship = "stand";
			if(y<600)
				y=600;
		}
		else if(flagship == "p2a3")
		{
			c2 = Assets.c2_a3; 
			game.arrSize = c2.length-1;
			game.checkCount();
			c_c2 = game.count_c2;
			g.drawImage(c2[c_c2], (int) x, (int) y,300,DC_height, null);
			flagship = "stand";
			if(y<600)
				y=600;
		}
		else if(flagship == "jump")
		{
			c2 = Assets.c2_spin; 
			game.arrSize = c2.length-1;
			game.checkCount();
			c_c2 = game.count_c2;
			g.drawImage(c2[c_c2], (int) x, (int) y,250,DC_height, null);
			if(y>600&&count==0)
			{
				flagship="stand";
			}
			
		}
	
	
			
	}
		
	}

