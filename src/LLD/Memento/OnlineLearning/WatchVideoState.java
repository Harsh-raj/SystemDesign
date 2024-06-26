package LLD.Memento.OnlineLearning;

public class WatchVideoState implements  LearningState{
    @Override
    public void handleUserAction(LearningContext context) {
        System.out.println("User is watching a video.");
    }
}