package Proxy;

public class Member implements ChatGroupMember{
    @Override
    public void post() {
        System.out.println("Hi, this is group member.");
    }

    @Override
    public void react() {
        System.out.println("Glad to join your group!");
    }

    public void poll(){
        System.out.println("Poll created, Please do vote.");
    }

    @Override
    public void delete() {
        System.out.println("Post redacted");
    }
}
