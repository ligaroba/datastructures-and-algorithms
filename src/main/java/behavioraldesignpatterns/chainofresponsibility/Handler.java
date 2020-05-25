package behavioraldesignpatterns.chainofresponsibility;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    abstract void handlerRequest(Request request);
}
