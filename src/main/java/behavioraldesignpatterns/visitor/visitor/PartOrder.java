package behavioraldesignpatterns.visitor.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartOrder implements AtvParts {

    private List<AtvParts> parts= new ArrayList<>();
    public PartOrder(){

    }

    public void addParts(AtvParts atvParts){
        parts.add(atvParts);
    }

    public List<AtvParts> getParts(){
        return Collections.unmodifiableList(parts);
    }



    @Override
    public void accept(AtvPartVisitor visitor) {
        for (AtvParts atvpart: parts) {
            atvpart.accept(visitor);
        }
        visitor.visit(this);
    }
}
