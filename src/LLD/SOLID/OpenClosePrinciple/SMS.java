package LLD.SOLID.OpenClosePrinciple;

public class SMS implements SendMessage{
    @Override
    public void send() {
        System.out.println("Sent message via SMS");
    }
}
