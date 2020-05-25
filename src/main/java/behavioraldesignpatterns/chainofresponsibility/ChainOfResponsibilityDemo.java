package behavioraldesignpatterns.chainofresponsibility;

public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        Director brayan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        brayan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);


        Request request = new Request(RequestType.CONFERENCE,5000);
        brayan.handlerRequest(request);

        request = new Request(RequestType.PURCHASE,1000);
        brayan.handlerRequest(request);

        request = new Request(RequestType.PURCHASE,2000);
        brayan.handlerRequest(request);




    }
}
