package structuraldesignpatterns.proxy;

public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeline(String screenName) {
        return "Testing testing";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
