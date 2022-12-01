package model;

import java.util.Objects;
//class answer which describes an answer to a specific question 
public class Answer {
	private static int idCounter = 1;
	private int AnswerID;
	private String textOfAnswer;
	private boolean isCorrect;
	public int getAnswerID() {
		return AnswerID;
	}
	public void setAnswerID(int answerID) {
		AnswerID = answerID;
	}
	public String getTextOfAnswer() {
		return textOfAnswer;
	}
	public void setTextOfAnswer(String textOfAnswer) {
		this.textOfAnswer = textOfAnswer;
	}
	public boolean isCorrect() {
		return isCorrect;
	}
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	@Override
	public int hashCode() {
		return Objects.hash(AnswerID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Answer other = (Answer) obj;
		return AnswerID == other.AnswerID;
	}
	public Answer(String textOfAnswer, boolean isCorrect) {
		super();
		AnswerID = idCounter++;
		this.textOfAnswer = textOfAnswer;
		this.isCorrect = isCorrect;
	}
	public Answer(String textOfAnswer) {
		super();
		this.textOfAnswer = textOfAnswer;
	}
	@Override
	public String toString() {
		return "Answer [textOfAnswer=" + textOfAnswer + "]";
	}
	

}
