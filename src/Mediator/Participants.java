package Mediator;

public interface Participants {
    void placeBid(int bidAmount);
    void receiveBidUpdate(int bidAmount);
    String getName();
}
