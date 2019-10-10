package game1.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{
	
	private boolean[] keys;
	public boolean up,down,left,right,up2,down2,left2,right2,atk2_1,atk2_2,atk2_3;
	
	public KeyManager() 
	{
		keys = new boolean[256];
	}
	
	public void tick()
	{
		//player1
		up = keys[KeyEvent.VK_W];
		right = keys[KeyEvent.VK_D];
		left = keys[KeyEvent.VK_A];
		down = keys[KeyEvent.VK_S];
		
		//player 2
		up2 = keys[KeyEvent.VK_UP];
		right2 = keys[KeyEvent.VK_RIGHT];
		left2 = keys[KeyEvent.VK_LEFT];
		down2 = keys[KeyEvent.VK_DOWN];
		atk2_1 = keys[KeyEvent.VK_4];
		atk2_2 = keys[KeyEvent.VK_5];
		atk2_3 = keys[KeyEvent.VK_6];
		
	}
	@Override
	public void keyTyped(KeyEvent e) 
	{
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		keys[e.getKeyCode()] = true;
		
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		keys[e.getKeyCode()] = false;
		
	}

}
