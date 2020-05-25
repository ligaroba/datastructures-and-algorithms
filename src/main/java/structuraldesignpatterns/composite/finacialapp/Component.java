package structuraldesignpatterns.composite.finacialapp;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    AccountStatement accStatement;
    protected List<Component> list =new ArrayList<>();
    public abstract float getBalance();
    public abstract AccountStatement getStatement();

    public void add(Component g){
        list.add(g);
    }
    public void remove(Component g){
        list.add(g);
    }

    public Component getChild(int i){
        return list.get(i);
    }
}
