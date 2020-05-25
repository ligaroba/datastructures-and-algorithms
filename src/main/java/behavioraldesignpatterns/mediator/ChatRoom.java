package behavioraldesignpatterns.mediator;

import java.util.HashMap;
import java.util.Map;

// concrete Mediator
public class ChatRoom implements IChatRoom {

    private Map<String,User> usersMap = new HashMap<String,User>();

    @Override
    public void sendMessage(String msg, String userId) {
        User u = usersMap.get(userId);
        u.recieve(msg);

    }

    @Override
    public void addUser(User user) {
        if(this.usersMap.get(user.getId())==null)
            this.usersMap.put(user.getId(),user);

    }
}
