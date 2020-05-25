package behavioraldesignpatterns.visitor.visitorbad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartOrder implements AtvParts{

    private List<AtvParts> parts= new ArrayList<>();
    public PartOrder(){

    }

    public void addParts(AtvParts atvParts){
        parts.add(atvParts);
    }

    public List<AtvParts> getParts(){
        return Collections.unmodifiableList(parts);
    }


    public double calculateShipping() {
        double shippingCost =0;
        for (AtvParts atvparts:parts
             ) {
            shippingCost+=atvparts.calculateShipping();
        }
        return shippingCost;
    }
}
