package game1.states;
import game1.World;
import game1.game;
import game1.entities.creatures.P_c2;

import java.awt.Color;
import java.awt.Graphics;

import game1.gfx.Assets;


public class GameState extends State {


private World world;
private P_c2 P_2;
	
	public GameState(game game){
		super(game);
		world = new World();
		P_2 = new P_c2(game,300,600);
	}
	
	@Override
	public void tick() 
	{
		world.tick();
		P_2.tick();
	}
	

	@Override
	public void render(Graphics g) 
	{
		world.render(g);
		P_2.render(g);
	}

}
