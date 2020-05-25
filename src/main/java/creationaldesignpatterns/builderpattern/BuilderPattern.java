package creationaldesignpatterns.builderpattern;

public class BuilderPattern {

    /**
     * 1. Flexible over telescoping Constructors ( constructors with each parameter variation)
     * Builders handles that with an object rather than parameters
     * 2. Written Static inner Class, reason it returns an instance of the object its building
     * 3. Negates the need for exposing setters for every parameter
     *
     * Example: String Builder
     *
     *
     *
     */
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Moyo").meat("Turkey");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());

    }
}
