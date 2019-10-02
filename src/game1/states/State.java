package game1.states;

import java.awt.Graphics;

import game1.game;


public abstract class State {

	private static State currentState = null;
	
	public static void setState(State state){
		currentState = state;
	}
	
	public static State getState(){
		return currentState;
	}
	
	//CLASS
	
	protected game game;
	
	public State(game game)
	{
		this.game=game;
	}
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
}
