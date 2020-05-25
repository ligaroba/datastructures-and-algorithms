package structuraldesignpatterns.composite.menu;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    protected String name;
    protected String url;

    List<MenuComponent> menuComponents =new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
    public MenuComponent add(MenuComponent menuComponent){
        throw  new UnsupportedOperationException("Feature Not Implemented at this level");
    }

    public MenuComponent remove(MenuComponent menuComponent){
        throw  new UnsupportedOperationException("Feature Not Implemented at this level");
    }
    public abstract String toString();

    String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(name);
        builder.append(":");
        builder.append(url);
        builder.append("\n");

        return builder.toString();
    }

}
