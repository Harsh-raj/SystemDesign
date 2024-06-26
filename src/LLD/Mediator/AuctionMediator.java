package LLD.Mediator;

public interface AuctionMediator {
    void sendNewBidderMessage(Participants participants);
    void sendNewBidMessage(Participants participants, int curBid);
    void placeBid(Participants bidders, int bidAmount);
    Participants getBidder(String name);
    AuctionMediator addBidder(Participants bidder);
    void removeBidderUpdate(Participants participants);
    void winAuction();
}
