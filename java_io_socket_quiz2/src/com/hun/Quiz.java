package com.hun;
/**mySQL의  quiz_db 중 quiz_table 내에 있는
 * 문제와 정보를 하나의 객체로 묶어주기 위한  클래스
 * (각 레코드를 하나의 객체로...)
 * QuizDB 객체의 ArrayList<Quiz> quiz_list에 저장(add())
 * */
public class Quiz {
	private int quizNO=0;
	private String quizQuestion=null;
	private String quizAnswer=null;

	public int getQuizNO() {
		return quizNO;
	}

	public void setQuizNO(int quizNO) {
		this.quizNO = quizNO;
	}

	public String getQuizQuestion() {
		return quizQuestion;
	}

	public void setQuizQuestion(String quizQuestion) {
		this.quizQuestion = quizQuestion;
	}

	public String getQuizAnswer() {
		return quizAnswer;
	}

	public void setQuizAnswer(String quizAnswer) {
		this.quizAnswer = quizAnswer;
	}

	public Quiz() {

	}

}
