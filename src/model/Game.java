package model;

import java.util.Objects;

public class Game {
	//game class
	private static int idCounter = 1;
	private int GameID;
	private Square[][] board = new Square[8][8];
	private Player player;
	private Queen queen;
	private King king;
	private int rank;
	private String whoPlay;
	private int[] points = new int[4];
	private int time;
	public Game(Square[][] board, Player player, Queen queen, King king, int rank, String whoPlay,
			int[] points, int time) {
		super();
		GameID = idCounter++;
		this.board = board;
		this.player = player;
		this.queen = queen;
		this.king = king;
		this.rank = rank;
		this.whoPlay = whoPlay;
		this.points = points;
		this.time = time;
	}
	@Override
	public int hashCode() {
		return Objects.hash(GameID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return GameID == other.GameID;
	}
	public int getGameID() {
		return GameID;
	}
	public void setGameID(int gameID) {
		GameID = gameID;
	}
	public Square[][] getBoard() {
		return board;
	}
	public void setBoard(Square[][] board) {
		this.board = board;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Queen getQueen() {
		return queen;
	}
	public void setQueen(Queen queen) {
		this.queen = queen;
	}
	public King getKing() {
		return king;
	}
	public void setKing(King king) {
		this.king = king;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getWhoPlay() {
		return whoPlay;
	}
	public void setWhoPlay(String whoPlay) {
		this.whoPlay = whoPlay;
	}
	public int[] getPoints() {
		return points;
	}
	public void setPoints(int[] points) {
		this.points = points;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	

}
