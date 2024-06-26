package LLD.Command;

public class DroneFlyDownCommand implements Command{
    DronePrototype dronePrototype;

    public DroneFlyDownCommand(DronePrototype dronePrototype){
        this.dronePrototype = dronePrototype;
    }
    @Override
    public void execute() {
        System.out.println("Down button pressed.");
        dronePrototype.setFlyingDown();
    }
}
