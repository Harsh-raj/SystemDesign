package Mediator;

import java.util.*;

public class Auction implements AuctionMediator{

    private Map<Participants, Boolean> bidders;
    private int highestBid;
    private Participants highestBidder;

    public Auction(){
        bidders = new HashMap<>();
        highestBid = 0;
    }

    public void removeBidderUpdate(Participants bidder){
        bidders.put(bidder, false);
        for (Participants participant :
                bidders.keySet())
            if (!participant.getName().equals(bidder.getName())) {
                System.out.println("To Bidder \"" + participant.getName() + "\": Bidder \"" + bidder.getName() + "\" bailed out!");
            }
        winAuction();
    }

    @Override
    public void winAuction() {
        if(bidders.values().stream().filter(isActive -> isActive).count() == 1)
            for (Participants participants: bidders.keySet())
                if(participants != highestBidder)
                    System.out.println("To Bidder \""+participants.getName()+"\": Auction is over... \""+this.bidders.entrySet().stream().filter(Map.Entry::getValue).map(entry ->entry.getKey().getName()).findFirst().get()+"\" won the Auction!");
                else
                    System.out.println("To Bidder \""+participants.getName()+"\": Auction is over... You won the Auction!");
    }

    @Override
    public void sendNewBidderMessage(Participants participant) {
        System.out.println("New Bidder named "+participant.getName()+" added to Bidding.");
    }

    @Override
    public void sendNewBidMessage(Participants participants, int curBid) {
        for(Participants bidder: bidders.keySet()){
            if(bidder != participants){
                bidder.receiveBidUpdate(curBid);
            }
        }
    }

    @Override
    public void placeBid(Participants bidder, int bidAmount) {
        if(bidAmount > highestBid){
            highestBid = bidAmount;
            highestBidder = bidder;
            sendNewBidMessage(bidder, bidAmount);
        }else{
            System.out.println("To Bidder \""+bidder.getName()+"\": Set bid amount higher!");
        }
    }

    @Override
    public AuctionMediator addBidder(Participants bidder) {
        bidders.put(bidder, true);
        sendNewBidderMessage(bidder);
        return this;
    }

    @Override
    public Participants getBidder(String name){
        if (name != null) {
            for (Participants participants : bidders.keySet()) {
                if (Objects.equals(participants.getName(), name))
                    return participants;
            }
        }
        return null;
    }
}