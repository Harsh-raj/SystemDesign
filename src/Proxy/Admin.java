package Proxy;

public class Admin implements ChatGroupMember{
    @Override
    public void post() {
        System.out.println("Hi, this is group Admin.");
    }

    @Override
    public void react() {
        System.out.println("You are welcome in this group!");
    }

    @Override
    public void poll(){
        System.out.println("Poll created, Please do vote.");
    }

    @Override
    public void delete() {
        System.out.println("Post redacted");
    }
}
