package structuraldesignpatterns.proxy;

public interface TwitterService {
    String getTimeline(String screenName);
    void postToTimeline(String screenName, String message);
}
