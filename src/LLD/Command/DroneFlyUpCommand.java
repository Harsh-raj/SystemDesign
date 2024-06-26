package LLD.Command;

public class DroneFlyUpCommand implements Command{
    DronePrototype dronePrototype;

    public DroneFlyUpCommand(DronePrototype dronePrototype){
        this.dronePrototype = dronePrototype;
    }
    @Override
    public void execute() {
        System.out.println("Up button pressed.");
        dronePrototype.setFlyingUp();
    }
}
