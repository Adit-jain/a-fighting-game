package game1;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import game1.display.display;
import game1.gfx.Assets;
import game1.gfx.ImageLoader;
import game1.gfx.SpriteSheet;
import game1.input.KeyManager;
import game1.states.GameState;
import game1.states.State;

public class game implements Runnable
{

	private display display;
	public static int width;
	public static int height;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferedImage test;
	private SpriteSheet sheet;
	
	private BufferStrategy bs;
	public static Graphics g;
	
	//states
	private State gameState;
	
	//Input
	private static KeyManager keyManager;
	
	public game() {
		
	}
	
	public game(String title,int width,int height) 
	{
		this.width= width;
		this.height= height;
		this.title = title;
		keyManager = new KeyManager();
	}
	private void init()
	{
		display = new display(title,width,height);
		display.getFrame().addKeyListener(keyManager);
		Assets.init();
		
		gameState = new GameState(this);
		State.setState(gameState);
	}
	
	public static int x = 0;
	public static int count_c2 = 0;
	public static int count_c21 = 0;

	
	public void run() 
	{
		init();
		int fps = 60;
		double timePerTick = 1000000000/ fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		int c_count = 0;
		
		
		
		while(running)
		{
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer +=now-lastTime;
			lastTime = now;
			
			if(delta>1)
			{
			tick();
			render();
			ticks++;
			delta--;
			c_count++;
		
			
				if(c_count==9)
					{
						
						count_c2++;
						count_c21++;
						c_count=0;
					}
			}
			if(timer>=1000000000)
			{
				//System.out.println("ticks and frames:" + ticks);
				ticks = 0;
				timer = 0;
			}
		}
		stop();
	}
	
	public static KeyManager getKeyManager() {
		return keyManager;
	}
	
	private void render() 
	{
		  bs = display.getCanvas().getBufferStrategy();
		  if(bs==null)
		  {
			   display.getCanvas().createBufferStrategy(3);
			   return;
		  }
		  g=bs.getDrawGraphics();
		  g.clearRect(0, 0, width, height);
		  //Start drawing
		  
		  
		 if(State.getState() != null)
			State.getState().render(g);
		  
		  //End drawing
		  bs.show();
		  g.dispose();
		  
		  if(count_c2==4)
		  {
			  count_c2 = 0;
		  }

		  if(count_c21==6)
		  {
			  count_c21 = 2;
		  }
		  
	}
	
	
	private void tick() 
	{
		
		//x += 1;
		keyManager.tick();
		if(State.getState() != null)
			State.getState().tick();
		
	}
	public synchronized void start()
	{	if(running)
		return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	public synchronized void stop()
	{	
		if(!running)
			return;
		running=false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
}
