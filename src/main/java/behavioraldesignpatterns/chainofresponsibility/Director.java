package behavioraldesignpatterns.chainofresponsibility;

public class Director extends Handler{

    @Override
    void handlerRequest(Request request) {
        if(request.getRequestType()==RequestType.CONFERENCE){
            System.out.println("Directors can Approve conferences");
        }else{
            successor.handlerRequest(request);
        }
    }
}
