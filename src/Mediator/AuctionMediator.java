package Mediator;

public interface AuctionMediator {
    void sendNewBidderMessage(Participants participants);
    void placeBid(Participants bidders, int bidAmount);
    Participants getBidder(String name);
    AuctionMediator addBidder(Participants bidder);
    void setLastBid(int lastBid);
    void removeBidderUpdate(Participants participants);
    void winAuction();
}
