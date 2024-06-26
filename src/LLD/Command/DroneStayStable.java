package LLD.Command;

public class DroneStayStable implements Command{
    DronePrototype dronePrototype;

    public DroneStayStable(DronePrototype dronePrototype){
        this.dronePrototype = dronePrototype;
    }


    @Override
    public void execute() {
        dronePrototype.setStable();
    }
}
