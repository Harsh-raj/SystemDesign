package LLD.Memento.OnlineLearning;

import java.util.HashMap;
import java.util.Map;

public class Memento {
    private final Map<String, String> userData;
    private final LearningState state;

    public Memento(Map<String, String> userData, LearningState state) {
        this.userData = new HashMap<>(userData);
        this.state = state;

    }

    public Map<String, String> getUserData(){
        return userData;
    }

    public LearningState getState(){
        return state;
    }
}
