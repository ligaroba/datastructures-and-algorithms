package behavioraldesignpatterns.chainofresponsibility;

public class VP extends Handler{

    @Override
    void handlerRequest(Request request) {
        if(request.getRequestType()==RequestType.PURCHASE && request.getRequestValue()<1500){
              System.out.println("VPs can approve the request below 1500");

        }else {
            successor.handlerRequest(request);
        }
    }
}
