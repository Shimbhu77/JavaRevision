package com.java.day1;

import java.util.Scanner;

public class JavaInterviewQuiz {
    public static void main(String[] args) {
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        // Array of questions and their corresponding answers
        String[][] questions = {
                {"What is the output of the following code?\nint x = 5;\nSystem.out.println(x++);\nSystem.out.println(++x);", 
                    "A. 5, 6", "B. 5, 5", "C. 6, 6", "D. 6, 5", "C"},
                {"Which of the following is NOT a primitive data type in Java?", 
                    "A. int", "B. boolean", "C. String", "D. char", "C"},
                {"What is the purpose of the 'final' keyword in Java?", 
                    "A. It indicates that a class cannot be inherited.", 
                    "B. It indicates that a method cannot be overridden.",
                    "C. It indicates that a variable's value cannot be changed.",
                    "D. All of the above.", "D"},
                // Add more questions here
        };

        // Loop through the questions
        for (int i = 0; i < questions.length; i++) {
            String[] question = questions[i];
            System.out.println("Question " + (i + 1) + ": " + question[0]);
            for (int j = 1; j < question.length - 1; j++) {
                System.out.println(question[j]);
            }
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().toUpperCase();

            if (answer.equals(question[question.length - 1])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
            System.out.println();
        }

        System.out.println("Quiz completed! Your score is: " + score + " out of " + questions.length);
    }
}
