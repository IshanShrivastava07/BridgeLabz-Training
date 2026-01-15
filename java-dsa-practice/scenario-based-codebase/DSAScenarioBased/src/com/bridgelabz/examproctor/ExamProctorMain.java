package com.bridgelabz.examproctor;

public class ExamProctorMain {
	
	    public static void main(String[] args) {

	        ExamSession exam = new ExamSession(10);

	        exam.visitQuestion(1);
	        exam.visitQuestion(2);
	        exam.visitQuestion(3);

	        exam.submitAnswer(1, "A");
	        exam.submitAnswer(2, "B");
	        exam.submitAnswer(3, "C");

	        AnswerMap correct = new AnswerMap(10);
	        correct.put(1, "A");
	        correct.put(2, "C");
	        correct.put(3, "C");

	        exam.showLastVisited();
	        System.out.println("Final Score: " + exam.evaluateScore(correct));
	    }
	}

