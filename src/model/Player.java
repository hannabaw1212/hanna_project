package model;

import java.util.Objects;
import java.util.Stack;
//player Class
public class Player {
	private static int idCounter = 1;
	private int playerID;
	private String name;
	private int points;
	// a stack that saves the steps of the player (used on forget square)
	// the values will be the last points the player lost/won
	private Stack<Integer>steps;
	public Player(String name, int points, Stack<Integer> steps) {
		super();
		this.playerID = idCounter++;
		this.name = name;
		this.points = points;
		this.steps = steps;
	}
	@Override
	public int hashCode() {
		return Objects.hash(playerID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return playerID == other.playerID;
	}
	public int getPlayerID() {
		return playerID;
	}
	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public Stack<Integer> getSteps() {
		return steps;
	}
	public void setSteps(Stack<Integer> steps) {
		this.steps = steps;
	}
	
	
}
