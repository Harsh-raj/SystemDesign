package Command;

import java.util.Scanner;

public class DroneDirectionCommand implements Command{

    DronePrototype dronePrototype;

    public DroneDirectionCommand(DronePrototype dronePrototype){
        this.dronePrototype = dronePrototype;
    }

    @Override
    public void execute() {
        System.out.println("Driection joystick is moved");
        int degree;
        Scanner sc = new Scanner(System.in);
        degree = sc.nextInt();
        dronePrototype.setDirectionDegree(degree);
    }
}
