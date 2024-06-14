package Command;

public class DroneMoveForward implements Command{
    DronePrototype dronePrototype;

    public DroneMoveForward(DronePrototype dronePrototype){
        this.dronePrototype = dronePrototype;
    }
    @Override
    public void execute() {
        System.out.println("Forward button pressed");
        dronePrototype.setMoveForward();
    }
}
