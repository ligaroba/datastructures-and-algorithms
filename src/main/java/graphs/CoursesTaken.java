package graphs;

import java.util.*;



/*
There are a total of n courses you have to take, labeled from 0 to n-1.

Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]

Given the total number of courses and a list of prerequisite pairs, return the ordering of courses you should take to finish all courses.

There may be multiple correct orders, you just need to return one of them. If it is impossible to finish all courses, return an empty array.

Example 1:

Input: 2, [[1,0]]
Output: [0,1]
Explanation: There are a total of 2 courses to take. To take course 1 you should have finished
             course 0. So the correct course order is [0,1] .
Example 2:

Input: 4, [[1,0],[2,0],[3,1],[3,2]]
Output: [0,1,2,3] or [0,2,1,3]
Explanation: There are a total of 4 courses to take. To take course 3 you should have finished both
             courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0.
             So one correct course order is [0,1,2,3]. Another correct ordering is [0,2,1,3] .
Note:
The input prerequisites is a graph represented by a list of edges, not adjacency matrices. Read more about how a graph is represented.
You may assume that there are no duplicate edges in the input prerequisites.
     */

public class CoursesTaken {

    public Map<Integer, List<Integer>> createGraph(int[][] courseGraph) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        List<Integer> nextCourse= new ArrayList<>();
        Queue<Integer> qCourses= new LinkedList<>();
        for (int[] nodes : courseGraph){
            nextCourse=new ArrayList<>();
            if(graph.containsKey(nodes[1])){
                List<Integer> val = graph.get(nodes[1]);
                val.add(nodes[0]);
                graph.put(nodes[1],val);
            }else{
                nextCourse.add(nodes[0]);
                graph.put(nodes[1],nextCourse);
            }
        }

        return graph;
    }


    public List<Integer>  traverse(Map<Integer, List<Integer>> graph) {
        List<Integer> res = new ArrayList<>();
        Queue<Integer> qCourses= new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        Iterator<Map.Entry<Integer, List<Integer>>> itr = graph.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer, List<Integer>> values= itr.next();
           if(!visited.contains(values.getKey())) {
               qCourses.add(values.getKey());
               res=bfs(qCourses,graph,visited,res);
           }
        }
        return res;
    }

    private List<Integer> bfs(Queue<Integer> qCourses, Map<Integer, List<Integer>> graph, HashSet<Integer> visited, List<Integer> res) {

        while(!qCourses.isEmpty()){
            int curr_node=qCourses.poll();
             visited.add(curr_node);
            if(graph.get(curr_node)!=null){
                for(int nextNode : graph.get(curr_node) ){
                   if(!visited.contains(nextNode)) {
                       qCourses.add(nextNode);
                       System.out.println(" qCourses " + qCourses.toString()) ;
                   }
                }
            }
            if(!res.contains(curr_node)) {
                res.add(curr_node);
            }
            visited.add(curr_node);

        }
        System.out.println("Visited " + visited.toString() + " res " + res.toString());
      return  res;
    }
}
