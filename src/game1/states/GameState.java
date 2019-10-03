package game1.states;
import game1.World;
import game1.game;
import game1.entities.creatures.Horse;
import game1.entities.creatures.Player;

import java.awt.Color;
import java.awt.Graphics;

import game1.gfx.Assets;


public class GameState extends State {

private Player player;
private Horse horse;
private World world;
	
	public GameState(game game){
		super(game);
		player = new Player(game , 200, 560);
		horse = new Horse(game,1600,635);
		world = new World();
	}
	
	@Override
	public void tick() 
	{
		world.tick();
		player.tick();
		horse.tick();
	}
	

	@Override
	public void render(Graphics g) 
	{
		world.render(g);
		player.render(g);
		horse.render(g);
		
	}

}
