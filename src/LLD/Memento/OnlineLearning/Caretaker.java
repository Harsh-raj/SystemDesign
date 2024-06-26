package LLD.Memento.OnlineLearning;

import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> mementoStack = new Stack<>();

    public void saveState(LearningContext context){
        System.out.println("Saving state: " + context);
        mementoStack.push(context.saveState());
    }

    public void undo(LearningContext context){
        if(!mementoStack.isEmpty()) {
            Memento memento = mementoStack.pop();
            System.out.println("Restoring previous state: " + memento.getState().toString());
            context.restoreState(memento);
        }
    }
}