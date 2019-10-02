package game1.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	public static BufferedImage[] player = new BufferedImage[6];
	public static BufferedImage[] horse = new BufferedImage[12];
	static int height = 1024/4;
	static int width = 1024/6;
	public static BufferedImage bg;
	
	public static void init()
	{
		//player
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("res/textures/Run.jpg"));
		player[0] = sheet.crop(0, 30, width, height);
		player[1] = sheet.crop(width, 30, width, height);
		player[2] = sheet.crop(2*width, 30, width, height);
		player[3] = sheet.crop(3*width, 30, width, height);
		player[4] = sheet.crop(4*width, 30, width, height);
		player[5] = sheet.crop(5*width, 30, width, height);
		
		SpriteSheet s2 = new SpriteSheet(ImageLoader.loadImage("res/textures/horse.png"));
		for(int i =0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				horse[(3*i)+j] = s2.crop(252*(j), 181*(i), 252, 181);
			}
		}
		
		bg = ImageLoader.loadImage("res/textures/bg.jpg");
		
		
	}

}
