package NullObject;

import java.util.EnumSet;

public class Question {
    private String question;
    private EnumSet<Options> correctAnswers;

    public Question(String question, EnumSet<Options> correctAnswers){
        this.question = question;
        this.correctAnswers = correctAnswers;
    }

    public String getQuestion() {
        return question;
    }

    public EnumSet<Options> getCorrectAnswers(){
        return correctAnswers;
    }

    public boolean checkAnswer(EnumSet<Options> userAnswer){
        return correctAnswers.equals(userAnswer);
    }
}
