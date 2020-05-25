package behavioraldesignpatterns.chainofresponsibility;

public class Request {
    private RequestType requestType;
    private double requestValue;
    public Request(RequestType requestType, double requestValue){
        this.requestType=requestType;
        this.requestValue=requestValue;

    }

    public RequestType getRequestType() {
        return requestType;
    }


    public double getRequestValue() {
        return requestValue;
    }

}
