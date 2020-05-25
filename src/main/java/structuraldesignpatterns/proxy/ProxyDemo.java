package structuraldesignpatterns.proxy;

import structuraldesignpatterns.proxy.TwitterService;
import structuraldesignpatterns.proxy.SecurityProxy;
import structuraldesignpatterns.proxy.TwitterServiceStub;

public class ProxyDemo {
    public static void main(String[] args) {
        TwitterService service=(TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());

        System.out.println(service.getTimeline("bkas"));
    }
}
