package LLD.Memento.OnlineLearning;

public class BrowsingCoursesState implements LearningState{
    @Override
    public void handleUserAction(LearningContext context) {
        System.out.println("User is browsing courses.");
    }
}