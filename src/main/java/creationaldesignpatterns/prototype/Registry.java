package creationaldesignpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String,Item> items = new HashMap<String, Item>();

    public Registry(){
        loadItems();
    }
    public Item createItem(String type){
       Item item=null;
       try{
         item=(Item)(items.get(type)).clone();

       }catch (CloneNotSupportedException e){
           e.printStackTrace();
       }
       return item;
    }

    private void loadItems() {
        Movie movie= new Movie();
        movie.setTitle("Money Heist");
        movie.setPrice(20);
        movie.setRunTime("2 hrs");
        items.put("Movie",movie);

        Book book = new Book();
        book.setNumberOfPage(200);
        book.setTitle(" Kings of Kings");
        book.setPrice(129.23);
        items.put("Book " , book);

    }

}
