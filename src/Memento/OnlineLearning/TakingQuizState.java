package Memento.OnlineLearning;

public class TakingQuizState implements LearningState{
    @Override
    public void handleUserAction(LearningContext context) {
        System.out.println("User is taking a quiz.");
    }
}