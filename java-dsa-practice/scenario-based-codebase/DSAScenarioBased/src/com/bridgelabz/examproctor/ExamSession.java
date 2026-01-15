package com.bridgelabz.examproctor;


public class ExamSession {

    QuestionStack navigation;
    AnswerMap studentAnswers;

    public ExamSession(int maxQuestions) {
        navigation = new QuestionStack(maxQuestions);
        studentAnswers = new AnswerMap(maxQuestions);
    }

    public void visitQuestion(int qId) {
        navigation.push(qId);
    }

    public void submitAnswer(int qId, String ans) {
        studentAnswers.put(qId, ans);
    }

    public int evaluateScore(AnswerMap correctAnswers) {
        int score = 0;

        for (int i = 0; i < correctAnswers.getSize(); i++) {
            int qId = correctAnswers.getKeyAt(i);
            String correct = correctAnswers.get(qId);
            String given = studentAnswers.get(qId);

            if (correct != null && correct.equals(given))
                score++;
        }
        return score;
    }

    public void showLastVisited() {
        System.out.println("Last visited question: " + navigation.peek());
    }
}
