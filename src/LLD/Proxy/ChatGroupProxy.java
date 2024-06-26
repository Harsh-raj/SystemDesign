package LLD.Proxy;

public class ChatGroupProxy implements ChatGroupMember{

    ChatGroupMember chatGroupMember;
    public ChatGroupProxy(ChatGroupMember chatGroupMember){
        this.chatGroupMember = chatGroupMember;
    }
    @Override
    public void post() {
        if(chatGroupMember instanceof Admin)
            chatGroupMember.post();
        else{
            System.out.println("Post privilage not available");
        }
    }

    @Override
    public void react() {
        chatGroupMember.react();
    }

    @Override
    public void poll(){
        if(chatGroupMember instanceof Admin)
            System.out.println("Poll privilage not available");
        else chatGroupMember.poll();
    }

    @Override
    public void delete() {
        System.out.println("Delete privilage not available");
    }

    public void delete(int a){
        System.out.println("Post Redacted.");
    }
}
