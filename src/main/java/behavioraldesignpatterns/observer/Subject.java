package behavioraldesignpatterns.observer;

import java.util.ArrayList;
import java.util.List;


// Observable / subject class
public abstract  class Subject {

    List<Observer> observers = new ArrayList<Observer>();
    abstract void setState(String state);
    abstract String getState();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void dettach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer: observers
             ) {
              observer.update();
        }
    }
}
