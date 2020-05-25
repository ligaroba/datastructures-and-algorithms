package structuraldesignpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

//Catalog acts as  a factory and cache for item flyweight objects
public class Catalog {
    private Map<String,Item> items = new HashMap<>();

    //factory Method
    public Item lookUp(String itemName){
        if(!items.containsKey(itemName)){
            items.put(itemName,new Item(itemName));
        }

        return items.get(itemName);

    }

    public int totalItemMode(){
        return items.size();
    }
}
