package game1.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	public static BufferedImage[] player = new BufferedImage[6];
	public static BufferedImage[] horse = new BufferedImage[12];
	
	// Player Blue Ninja
	public static BufferedImage[] c2_a1 = new BufferedImage[5];
	public static BufferedImage[] c2_a2 = new BufferedImage[5];
	public static BufferedImage[] c2_a3 = new BufferedImage[5];
	public static BufferedImage[] c2_throw = new BufferedImage[3];
	public static BufferedImage[] c2_stand = new BufferedImage[5];
	public static BufferedImage[] c2_sit = new BufferedImage[2];
	public static BufferedImage[] c2_run = new BufferedImage[6];
	public static BufferedImage[] c2_spin = new BufferedImage[9];
	public static BufferedImage[] c2_jump = new BufferedImage[6];
	public static BufferedImage[] c2_hurt = new BufferedImage[4];
	public static BufferedImage[] c2_defeat = new BufferedImage[5];
	//////
	
	public static BufferedImage[] c5 = new BufferedImage[12];
	static int height = 1024/4;
	static int width = 1024/6;
	public static BufferedImage bg;
	
	public static void init()
	{	 
		//background
		bg = ImageLoader.loadImage("res/textures/area31.jpg");
		
		// Player c2
		SpriteSheet S2 = new SpriteSheet(ImageLoader.loadImage("res/textures/BlueNinja2.png"));
		c2_a1[0] = S2.crop(0,0,100,150);
		c2_a1[1] = S2.crop(210,0,150,150);
		c2_a1[2] = S2.crop(370,0,160,150);
		c2_a1[3] = S2.crop(570,0,140,150);
		c2_a1[4] = S2.crop(740,0,130,150);
		c2_a1[0] = S2.crop(0,300,100,150);
		c2_a2[1] = S2.crop(100,300,95,150);
		c2_a2[2] = S2.crop(200,300,260,150);
		c2_a2[3] = S2.crop(480,300,230,150);
		c2_a2[4] = S2.crop(720,300,160,150);
		c2_a3[0] = S2.crop(0,450,100,170);
		c2_a3[1] = S2.crop(100,450,160,170);
		c2_a3[2] = S2.crop(260,450,150,170);
		c2_a3[3] = S2.crop(410,450,120,170);
		c2_a3[4] = S2.crop(530,450,120,170);
		c2_throw[0] = S2.crop(650,450,100,150);
		c2_throw[1] = S2.crop(750,450,115,150);
		c2_throw[2] = S2.crop(860,450,115,150);
		
		SpriteSheet S21 = new SpriteSheet(ImageLoader.loadImage("res/textures/BlueNinja1.png"));
		c2_stand[0] = S21.crop(20,0,75,120);
		c2_stand[1] = S21.crop(95,0,75,120);
		c2_stand[2] = S21.crop(170,0,75,120);
		c2_stand[3] = S21.crop(245,0,75,120);
		c2_stand[4] = S21.crop(330,0,75,120);
		c2_sit[0] = S21.crop(405,0,81,120);
		c2_sit[1] = S21.crop(485,0,81,120);
		for(int i=0;i<6;i++)
		c2_run[i] = S21.crop(20+110*i,120,110,120);
		c2_spin[0] = S21.crop(30,250,80,170);
		c2_spin[1] = S21.crop(110,250,80,170);
		c2_spin[2] = S21.crop(200,250,85,170);
		c2_spin[3] = S21.crop(285,250,100,170);
		c2_spin[4] = S21.crop(385,250,80,170);
		c2_spin[5] = S21.crop(465,250,100,170);
		c2_spin[6] = S21.crop(568,250,90,170);
		c2_spin[7] = S21.crop(660,250,88,170);
		c2_spin[8] = S21.crop(751,250,90,170); 
		c2_jump[0] = S21.crop(30,250,80,170);
		c2_jump[1] = S21.crop(110,250,80,170);
		c2_jump[2] = S21.crop(200,250,85,170);
		c2_jump[3] = S21.crop(568,250,90,170);
		c2_jump[4] = S21.crop(660,250,88,170);
		c2_jump[5] = S21.crop(751,250,90,170);
		c2_hurt[0] = S21.crop(0,410,75,120);		
		c2_hurt[1] = S21.crop(75,410,90,120);	
		c2_hurt[2] = S21.crop(170,410,90,120);
		c2_hurt[3] = S21.crop(270,410,90,120);
		c2_defeat[0] = S21.crop(440,410,90,120);
		c2_defeat[1] = S21.crop(540,410,90,120);
		c2_defeat[2] = S21.crop(630,410,105,120);
		c2_defeat[3] = S21.crop(740,410,110,120);
		c2_defeat[4] = S21.crop(850,410,130,120);		

		
		
	}

}
