package behavioraldesignpatterns.iterator;

import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        BikeRepossitory repo = new BikeRepossitory();
        repo.addBike("Carvelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");

        Iterator<String> bikeIterator =repo.iterator();
        while(bikeIterator.hasNext()){
            System.out.println(bikeIterator.next());
        }

        for (String bike : repo
             ) {
            System.out.println(" Foreach " + bike);
        }

    }
}
