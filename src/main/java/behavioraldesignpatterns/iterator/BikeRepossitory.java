package behavioraldesignpatterns.iterator;

import java.util.Iterator;

public class BikeRepossitory implements Iterable<String>{

    private String [] bikes;
    private int index ;

    public BikeRepossitory(){
        this.bikes=new String[10];
        this.index=0;
    }

    public void addBike(String bike){
        if(index ==bikes.length){
            String [] largerBikes = new String[bikes.length+5];
            System.arraycopy(bikes,0,largerBikes,0,bikes.length);
            bikes=largerBikes;
            largerBikes=null;
        }
        bikes[index]=bike;
        index++;
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<String>() {
            private int currentIndex=0;
            @Override
            public boolean hasNext() {
                return currentIndex<bikes.length && bikes[currentIndex]!=null;
            }

            @Override
            public String next() {
                return bikes[currentIndex++];
            }

            @Override
            public void remove() {
              // To implemented
            }
        };
        return it;
    }
}
