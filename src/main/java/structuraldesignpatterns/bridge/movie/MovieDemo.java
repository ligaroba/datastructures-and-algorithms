package structuraldesignpatterns.bridge.movie;


public class MovieDemo {
    public static void main(String[] args) {
        Movie movie =new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2019");


        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printMaterial = moviePrinter.print(printFormatter);

        System.out.println(printMaterial);


        Formatter htmlFormatter = new HtmlFormatter();
        String htmlMaterial = moviePrinter.print(htmlFormatter);

        System.out.println(htmlMaterial);


    }
}

