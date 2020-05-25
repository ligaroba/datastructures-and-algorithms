package behavioraldesignpatterns.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("Here is a message ");
        tabletClient.addMessage("Check out this new gig");


    }
}
