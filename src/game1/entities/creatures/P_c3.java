package game1.entities.creatures;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import game1.gfx.Assets;
import game1.game;

public class P_c3 extends Creature
{
	private game g;
	static int count=0;
	public static BufferedImage[] c3;
	
	public P_c3(game g,float x, float y) {
		super(x, y,Creature.DC_width,Creature.DC_height);
		this.g=g;
	}
	

	@Override
	public void tick() 
	{
		getInput();
	//	move();
		
	}
	public void getInput(){
		xMove = 0;
		yMove = 0;
		if(y<=600 && count==0)
		{
		
				yMove = 6;
				xMove = 1;
		}
	}
	
	public void render(Graphics g) 
	{
		int c_c3 = 0;
		
		//int pos = game.x;
		
		c3 = Assets.c3_stand; 
		game.arrSize2 = c3.length-1;
		game.checkCount2();
		c_c3 = game.count_c3;
		g.drawImage(c3[c_c3], (int) x, (int) y, null);
	}
}
