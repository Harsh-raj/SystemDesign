package Mediator;

public interface Participants {
    void placeBid(int bidAmount);

    void leaveAuction();
    void receiveBidUpdate(int bidAmount);
    String getName();
}
