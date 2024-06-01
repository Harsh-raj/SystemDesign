package SOLID.LiskovSubstitution;

public class Reel implements Upload{

    public Reel(){
        System.out.println("Creating Reel");
        this.addLocation();
        this.addVideo();
        this.tagPeople();
        this.addImage();
    }
    @Override
    public void addImage() {
        throw new AssertionError("Reels only have video");
    }

    @Override
    public void addLocation() {
        System.out.println("Location added");
    }

    public void addVideo() {
        System.out.println("Video added");
    }

    public void tagPeople() {
        System.out.println("People Tagged");
    }
}
