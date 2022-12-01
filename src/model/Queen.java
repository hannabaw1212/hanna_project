package model;
// queen class
public class Queen {
	private static int idCounter = 1;
	private int queenID;
	//the square the queen steps on it now
	private Square onsquare;
	public int getQueenID() {
		return queenID;
	}
	public void setQueenID(int queenID) {
		this.queenID = queenID;
	}
	public Square getOnsquare() {
		return onsquare;
	}
	public void setOnsquare(Square onsquare) {
		this.onsquare = onsquare;
	}
	public Queen(Square onsquare) {
		super();
		this.queenID = idCounter++;
		this.onsquare = onsquare;
	}
	
}	

