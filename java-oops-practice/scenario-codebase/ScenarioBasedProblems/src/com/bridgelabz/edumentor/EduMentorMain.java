package com.bridgelabz.edumentor;

public class EduMentorMain {
    public static void main(String[] args) {

        Learner learner = new Learner(101, "Aarav", "aarav@edumentor.com");
        learner.printProfile();

        String[] questions = {
                "Java is OOP based?",
                "Interface supports multiple inheritance?"
        };

        int[] correctAnswers = {1, 1}; // 1 = true, 0 = false

        Quiz quiz = new Quiz(questions, correctAnswers, 2);

        int[] userAnswers = {1, 0};

        quiz.evaluate(userAnswers);
        double percentage = quiz.getPercentage();

        System.out.println("Score Percentage: " + percentage);

        ICertifiable certificate;

        if (percentage < 70) {
            certificate = new ShortCourseCertificate();
        } else {
            certificate = new FullTimeCourseCertificate();
        }

        System.out.println(certificate.generateCertificate(percentage));
    }
}
