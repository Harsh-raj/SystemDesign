package Memento.OnlineLearning;

public class User {
    private String userId;
    private LearningContext learningContext;
    private Caretaker caretaker;

    public User(String userId){
        this.userId = userId;
        this.learningContext = new LearningContext(userId);
        this.caretaker = new Caretaker();
    }

    public void watchVideo(String video){
        learningContext.addUserData("watching", video);
        caretaker.saveState(learningContext);
        learningContext.setState(new WatchVideoState());
        learningContext.handleUserAction();
    }

    public void takeQuiz(String quiz){
        learningContext.addUserData("quiz", quiz);
        caretaker.saveState(learningContext);
        learningContext.setState(new TakingQuizState());
        learningContext.handleUserAction();
    }

    public void browseCourse(){
        caretaker.saveState(learningContext);
        learningContext.setState(new BrowsingCoursesState());
        learningContext.handleUserAction();
    }

    public void undoAction(){
        caretaker.undo(learningContext);
        learningContext.handleUserAction();
    }
}
