package test.java.graph;

import graphs.CoursesTaken;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class TestCoursesTaken {
    static CoursesTaken courses;
    @BeforeAll
    static void setUpAll(){
        courses= new CoursesTaken();
    }
    @BeforeEach
    void setUpTest(){

    }

    @Test
    void testBuildTopologicalGraph(){
        int [][] courseGraph  = new int[][] {{1,0},{2,0},{3,1},{3,2}};
        Map<Integer, List<Integer>> graph = courses.createGraph(courseGraph);
        Iterator<Map.Entry<Integer, List<Integer>>> itr = graph.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<Integer,List<Integer>> dta = itr.next();
            System.out.println(" Key " + dta.getKey());
            System.out.println(" Value " + dta.getValue());
        }
    }

    @Test
    void testCoursesDependancies(){
        int [][] courseGraph = new int[][] {{1,0},{2,0},{3,1},{3,2}};
        Map<Integer,List<Integer>> graph=courses.createGraph(courseGraph);
        List<Integer> courseCatalog =courses.traverse(graph);
        List<Integer> expected = Arrays.asList(0,1,2,3);//(0,2,1,3);
        System.out.println(courseCatalog.toString());
        assertEquals(expected,courseCatalog);



    }

}
