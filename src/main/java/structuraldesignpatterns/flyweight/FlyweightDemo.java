package structuraldesignpatterns.flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        InventorySystem ims = new InventorySystem();
        ims.takeOrder("Roomba" , 221);
        ims.takeOrder("Bose Headphones" , 431);
        ims.takeOrder("Sumsung TV" , 432);
        ims.takeOrder("Sumsung TV" , 433);
        ims.takeOrder("Roomba" , 543);
        ims.takeOrder("Sumsung TV" , 455);
        ims.takeOrder("Bose Headphones" , 556);
        ims.takeOrder("Roomba" , 667);

        ims.process();
        System.out.println(ims.report() );
    }
}
