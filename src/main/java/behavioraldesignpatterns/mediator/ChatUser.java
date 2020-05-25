package behavioraldesignpatterns.mediator;

// Concrete Collegues
public class ChatUser extends User {

    public ChatUser(IChatRoom room, String id,String name ){
       super(room,id,name);
    }

    @Override
    public void send(String msg, String userId) {
        System.out.println(this.getName() + " :: Sending Message : "  +msg);
        this.getMediator().sendMessage(msg,userId);

    }

    @Override
    public void recieve(String msg) {
        System.out.println(this.getName() + " :: Recieved Message : " + msg);
    }
}
