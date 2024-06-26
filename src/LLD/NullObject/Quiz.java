package LLD.NullObject;

import java.util.EnumSet;
import java.util.Scanner;

public class Quiz {
    private Question question;
    private int score;

    public Quiz(EnumSet<Options> correctOptions){
        this.question = new Question("Question",correctOptions);
        this.score = 0;
    }

    public void start() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your options for answer[A as 1, B as 2, C as 3, D as 4, none as <empty input>]: ");
            String[] input = scanner.nextLine().split(",");
            EnumSet<Options> userAnswer = null ;
            if (input.length == 0) {
                userAnswer = NullOption.INSTANCE;
            } else {
                userAnswer = EnumSet.noneOf(Options.class);

                for (String s : input) {
                    int optionIndex = Integer.parseInt(s.trim()) - 1;
                    if (optionIndex >= 0 && optionIndex < Options.values().length) {
                        userAnswer.add(Options.values()[optionIndex]);
                    } else {
                        throw new IllegalArgumentException("Invalid option number: " + (optionIndex + 1));
                    }
                }
            }
            if (question.checkAnswer(userAnswer)) {
                System.out.println("Correct Answer\n");
                ++score;
            } else {
                if(userAnswer.isEmpty()) {
                    System.out.println("You didn't select any from given options, the Correct answer is "+question.getCorrectAnswers()+"\n");
                }else {
                    System.out.println("Wrong Answer, the Correct answer is "+question.getCorrectAnswers()+"\n");
                    --score;
                }
            }
        }catch(IllegalArgumentException e){
            System.out.println("Invalid Input");
        }

        System.out.println("Your score is: " + this.score);
    }

    public void start(EnumSet<Options> userOptions){
        EnumSet<Options> answerToCheck = (userOptions == null || userOptions.isEmpty()) ? NullOption.INSTANCE : userOptions;

        if (question.checkAnswer(answerToCheck)) {
            System.out.println("Correct Answer\n");
            ++score;
        } else {
            if(userOptions == null ||userOptions.isEmpty()) {
                System.out.println("You didn't select any from given options, the Correct answer is "+question.getCorrectAnswers()+"\n");
            }else {
                System.out.println("Wrong Answer, the Correct answer is "+question.getCorrectAnswers()+"\n");
                --score;
            }
        }

        System.out.println("Your score is: " + this.score);
    }
}