package behavioraldesignpatterns.chainofresponsibility;

public class CEO extends Handler {
    @Override
    void handlerRequest(Request request) {
        System.out.println("Can approve everyting he wants");
    }
}
