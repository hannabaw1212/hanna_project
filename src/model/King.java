package model;

public class King {
	//king class
	private static int idCounter = 1;
	private int kingID;
	//square of the king (on it now on the game)
	private Square onSquare;
	private int speed;
	public int getKingID() {
		return kingID;
	}
	public void setKingID(int kingID) {
		this.kingID = kingID;
	}
	public Square getOnSquare() {
		return onSquare;
	}
	public void setOnSquare(Square onSquare) {
		this.onSquare = onSquare;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public King(Square onSquare, int speed) {
		super();
		this.kingID = idCounter++;
		this.onSquare = onSquare;
		this.speed = speed;
	}

	
}
