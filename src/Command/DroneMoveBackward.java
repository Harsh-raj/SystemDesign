package Command;

public class DroneMoveBackward implements Command{
    DronePrototype dronePrototype;

    public DroneMoveBackward(DronePrototype dronePrototype){
        this.dronePrototype = dronePrototype;
    }


    @Override
    public void execute() {
        System.out.println("Back button pressed");
        dronePrototype.setMoveDownward();
    }
}