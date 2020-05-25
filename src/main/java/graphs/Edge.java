package graphs;

public class Edge {
    private int destination;
    private int weight;
    public Edge(int destination,int weight){
        this.destination=destination;
        this.weight=weight;
    }

    public int getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }
}
