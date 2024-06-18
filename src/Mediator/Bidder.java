package Mediator;

public class Bidder implements Participants{

    String bidderName;

    AuctionMediator auctionMediator;

    public Bidder(String bidderName, AuctionMediator auctionMediator){
        this.bidderName = bidderName;
        this.auctionMediator = auctionMediator;
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void leaveAuction(){
        auctionMediator.removeBidderUpdate(this);
    }

    @Override
    public void receiveBidUpdate(int bidAmount) {
        System.out.println("Bidder \""+this.getName()+"\" places a bid amount of "+bidAmount);
    }



    @Override
    public String getName() {
        return bidderName;
    }
}
