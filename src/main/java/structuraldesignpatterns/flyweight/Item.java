package structuraldesignpatterns.flyweight;

public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String toString() {
        return name;
    }
}

