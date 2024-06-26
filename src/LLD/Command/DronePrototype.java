package LLD.Command;

public class DronePrototype{
    int FlyingUp;
    int moveForward;
    int directionDegree;

    void setFlyingUp(){
        FlyingUp = 1;
        System.out.println("Drone flying up now");
    }

    void setFlyingDown(){
        FlyingUp = -1;
        System.out.println("Drone flying down now");
    }

    void setMoveForward(){
        moveForward = 1;
        System.out.println("Drone moving forward");
    }

    void setMoveDownward(){
        moveForward = -1;
        System.out.println("Drone moving downward");
    }

    void setStable(){
        moveForward = 0;
        FlyingUp = 0;
        System.out.println("Drone is kept stable");
    }

    void setDirectionDegree(int directionDegree){
        this.directionDegree = directionDegree;
        System.out.println("Drone turned to "+directionDegree+" direction from its orientation");
    }
}
