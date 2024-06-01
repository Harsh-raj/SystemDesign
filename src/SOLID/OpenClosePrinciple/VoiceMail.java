package SOLID.OpenClosePrinciple;

public class VoiceMail implements SendMessage{
    public void send(){
        System.out.println("Sent message via Voice mail");
    }
}
