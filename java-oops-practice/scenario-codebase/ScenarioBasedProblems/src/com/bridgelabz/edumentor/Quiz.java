package com.bridgelabz.edumentor;

public class Quiz {

    private String[] questions;      
    private int[] correctAnswers;   
    private int difficultyLevel;
    private int score;

    
    public Quiz(String[] questions, int[] correctAnswers, int difficultyLevel) {
        this.questions = questions;
        this.correctAnswers = correctAnswers;
        this.difficultyLevel = difficultyLevel;
    }

    
    public int evaluate(int[] userAnswers) {
        score = 0;
        for (int i = 0; i < userAnswers.length; i++) {
            if (userAnswers[i] == correctAnswers[i]) {
                score++;
            }
        }
        return score;
    }

    public double getPercentage() {
        return (score * 100.0) / questions.length; // operators used
    }
}

