package behavioraldesignpatterns.mediator;

public class MediatorMainDemo {
    public static void main(String[] args) {
        IChatRoom chatRoom = new ChatRoom();
        User user1 = new ChatUser(chatRoom,"1","Alex");
        User user2 = new ChatUser(chatRoom,"2","Brian");
        User user3 = new ChatUser(chatRoom,"3","Charles");
        User user4 = new ChatUser(chatRoom,"4","David");
        User user5 = new ChatUser(chatRoom,"5","Robert");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);
        chatRoom.addUser(user5);

        user1.send("Hello Brian" , "2");
        user2.send("Hey Buddy" , "1");

    }
}
