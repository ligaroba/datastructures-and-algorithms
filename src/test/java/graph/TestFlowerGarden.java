package test.java.graph;

import graphs.FlowerGarden;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestFlowerGarden {
    static FlowerGarden garden;
    @BeforeAll
    static void setUpAll(){
        garden= new FlowerGarden();
    }

    @BeforeEach
    void setUpTest(){

     int[][] reg_edges=new int[][] {{0,1},{1,2}};
     int[][] blue_edges=new int[][] {{0,1},{1,2}};





    }

    @Test
    void testCreateGardenGraph(){
     int [][] paths_connected = new int[][] {{1,2},{3,4}};
     Map<Integer,List<Integer>> graph = garden.createGraph(paths_connected);
     Iterator<Map.Entry<Integer, List<Integer>>> itr = graph.entrySet().iterator();
     while (itr.hasNext()){
         Map.Entry<Integer,List<Integer>> dta = itr.next();
         System.out.println(" Key " + dta.getKey());
         System.out.println(" Value " + dta.getValue());
     }
    }

    @Test
    void testFlowersPlantedGardenConnectedGraph(){
     int [][] paths_connected = new int[][] {{1,2},{2,3},{3,4},{4,1},{1,3},{2,4}};//{{1,2},{2,3},{3,1}};
     Map<Integer,List<Integer>> graph=garden.createGraph(paths_connected);
     List<Integer> plantedFlowers =garden.traverse(graph);
     List<Integer> expected = Arrays.asList(1,2,3,4);//(1,2.3);
     assertIterableEquals(expected,plantedFlowers);

    }

    @Test
    void testFlowersPlantedGardenDisConnectedGraph(){
        int [][] paths_disconnected = new int[][] {{1,2},{3,4}};
        Map<Integer,List<Integer>> graph=garden.createGraph(paths_disconnected);
        List<Integer> plantedFlowers =garden.traverse(graph);
        List<Integer> expected = Arrays.asList(1, 2, 1,2);
        assertIterableEquals(expected,plantedFlowers);
    }


}
