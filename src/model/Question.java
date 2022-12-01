package model;

import java.util.ArrayList;
//question class
import java.util.Objects;

public class Question {
	
	private int questionID;
	private String questionText;
	private String diffuclty;
	private int correctAnswer;
	// points to add and points to delete will be update depends on the diffuclty
	// will build a function to that on the next itertation when we start to develop the game
	private int pointsToDelelete = 0;
	private int pointsToAdd = 0;
	private String team;
	//answers of the Question
	private ArrayList<Answer> answers;
	public int getQuestionID() {
		return questionID;
	}
	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public String getDiffuclty() {
		return diffuclty;
	}
	public void setDiffuclty(String diffuclty) {
		this.diffuclty = diffuclty;
	}
	public int getPointsToDelelete() {
		return pointsToDelelete;
	}
	public void setPointsToDelelete(int pointsToDelelete) {
		this.pointsToDelelete = pointsToDelelete;
	}
	public int getPointsToAdd() {
		return pointsToAdd;
	}
	public void setPointsToAdd(int pointsToAdd) {
		this.pointsToAdd = pointsToAdd;
	}
	public ArrayList<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(ArrayList<Answer> answers) {
		this.answers = answers;
	}
	@Override
	public int hashCode() {
		return Objects.hash(questionID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		return questionID == other.questionID;
	}

	public Question( String questionText,int correctAnswer, String diffuclty, String team, ArrayList<Answer> answers) {
		super();
		this.questionText = questionText;
		this.correctAnswer=correctAnswer;
		this.diffuclty = diffuclty;

		this.team = team;
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Question [questionText=" + questionText + ", diffuclty=" + diffuclty + ", correctAnswer="
				+ correctAnswer + ", team=" + team + ", answers=" + answers + "]";
	}
	
	
	

	

}
