package Memento.OnlineLearning;

import java.util.HashMap;
import java.util.Map;

public class LearningContext {
    private LearningState state;
    private String userId;
    private Map<String, String> userData;

    public LearningContext(String userId){
        this.userId = userId;
        this.userData = new HashMap<>();
        this.state = new BrowsingCoursesState();
    }

    public void setState(LearningState state){
        this.state = state;
    }

    public void addUserData(String key, String value){
        userData.put(key, value);
    }

    public Map<String, String> getUserData(){
        return userData;
    }

    public void handleUserAction(){
        state.handleUserAction(this);
    }

    public Memento saveState(){
        return new Memento(userData, state);
    }

    public void restoreState(Memento memento){
        userData = memento.getUserData();
        state = memento.getState();
    }
}