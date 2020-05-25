package behavioraldesignpatterns.mediator;


// Colleagues - defines an inteface for collegues concrete classes to communicate with each other

public abstract class User {
    private IChatRoom mediator;

    private String id;
    private String name;

    public User(IChatRoom room , String id , String name ){
        this.mediator= room;
        this.id=id;
        this.name=name;
    }

    public abstract void send(String msg , String userId);
    public abstract void recieve(String msg);

    public IChatRoom getMediator() {
        return mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
