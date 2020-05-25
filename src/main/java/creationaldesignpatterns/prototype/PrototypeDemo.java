package creationaldesignpatterns.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie =(Movie) registry.createItem("Movie");
        movie.setTitle("Creational Pattern in Java");

        System.out.println(movie);
        System.out.println(movie.getRunTime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotheMovie =(Movie) registry.createItem("Movie");
        anotheMovie.setTitle("Going For");

        System.out.println(anotheMovie);
        System.out.println(anotheMovie.getRunTime());
        System.out.println(anotheMovie.getTitle());
        System.out.println(anotheMovie.getUrl());




    }
}
