package test.java.graph;

import graphs.Edge;
import graphs.NetworkNodes;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNetworkNode {
    static NetworkNodes network;
    @BeforeAll
    static void setUpAll(){
        network = new NetworkNodes();
    }

    @BeforeEach
    void setUpTest(){

    }

    @Test
    void testBuildDirectedWeightedGraph(){
        int [][] graph_arr =new int[][]{{2,1,1},{2,3,1},{3,4,1}};
        Map<Integer,List<Edge>>  graph =network.createGraph(graph_arr);
        Iterator<Map.Entry<Integer, List<Edge>>> itr = graph.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<Integer,List<Edge>> dta = itr.next();
            System.out.println(" Key " + dta.getKey());
            for(Edge edge : dta.getValue() ){
                System.out.println(" Destination " + edge.getDestination());
                System.out.println(" Weight " + edge.getWeight());
            }

        }
    }
    @Test
    void testNetworkSignalMovementFromNodeK(){
        int [][] graph_arr =new int[][]{{2,1,1},{2,3,1},{3,4,1}};
        int k=2;
        Map<Integer,List<Edge>>  graph =network.createGraph(graph_arr);
        int res = network.traverse(graph,k);
        int expected = 2;
        assertEquals(expected,res);
    }

}
