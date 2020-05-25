package behavioraldesignpatterns.mediator;

// Mediator Interface
public interface IChatRoom {
     void sendMessage(String msg, String userId);
     void addUser(User user);

}
