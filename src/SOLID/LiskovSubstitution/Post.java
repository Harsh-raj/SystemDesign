package SOLID.LiskovSubstitution;

public class Post implements Upload{
    public Post(){
        System.out.println("Creating Post");
        this.addImage();
        this.addLocation();
        this.addVideo();
        this.tagPeople();
    }
    @Override
    public void addImage() {
        System.out.println("Image added");
    }

    @Override
    public void addLocation() {
        System.out.println("Location added");
    }

    public void addVideo() {
        System.out.println("Video added");
    }

    public void tagPeople() {
        System.out.println("Peope Tagged");
    }
}
