package Mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Auction implements AuctionMediator{

    private List<Participants> bidders;
    private int lastBid;
    private int activeBidders;

    public Auction(){
        bidders = new ArrayList<>();
        lastBid = 0;
        activeBidders = 0;
    }

    public void removeBidderUpdate(Participants bidder){
        --activeBidders;
        for (Participants participant :
                bidders)
            if (!participant.getName().equals(bidder.getName())) {
                System.out.println("To Bidder \"" + participant.getName() + "\": Bidder \"" + bidder.getName() + "\" bailed out!");
            }
    }

    @Override
    public void winAuction() {
        if(activeBidders == 1)
            for (Participants participants: bidders)
                if(participants != this.bidders.get(0))
                    System.out.println("To Bidder \""+participants.getName()+"\" Auction is over... \""+this.bidders.getFirst().getName()+"\" won the Auction!");
                else
                    System.out.println("To Bidder \""+participants.getName()+"\" Auction is over... You won the Auction!");
    }

    @Override
    public void sendNewBidderMessage(Participants participant) {
        System.out.println("New Bidder named "+participant.getName()+" added to Bidding.");
    }

    @Override
    public void placeBid(Participants bidder, int bidAmount) {
        bidder.placeBid(bidAmount);
        if(bidAmount!=-1) {
            for (Participants participant :
                    bidders)
                if (!participant.getName().equals(bidder.getName())) {
                    System.out.print("To Bidder \"" + participant.getName() + "\": ");
                    bidder.receiveBidUpdate(bidAmount);
                }
        }
        winAuction();
    }

    @Override
    public AuctionMediator addBidder(Participants bidder) {
        bidders.add(bidder);
        sendNewBidderMessage(bidder);
        ++activeBidders;
        return this;
    }

    @Override
    public void setLastBid(int lastBid) {
        this.lastBid = lastBid;
    }

    @Override
    public Participants getBidder(String name){
        if (name != null) {
            for (Participants participants : bidders) {
                if (Objects.equals(participants.getName(), name))
                    return participants;
            }
        }
        return null;
    }


}
