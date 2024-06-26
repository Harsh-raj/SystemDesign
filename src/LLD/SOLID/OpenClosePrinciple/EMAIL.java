package LLD.SOLID.OpenClosePrinciple;

public class EMAIL implements SendMessage{
    @Override
    public void send() {
        System.out.println("Sent message via e-mail");
    }
}
