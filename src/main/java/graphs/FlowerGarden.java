package graphs;

import java.util.*;

/*

You have N gardens, labelled 1 to N.  In each garden, you want to plant one of 4 types of flowers.

paths[i] = [x, y] describes the existence of a bidirectional path from garden x to garden y.

Also, there is no garden that has more than 3 paths coming into or leaving it.

Your task is to choose a flower type for each garden such that, for any two gardens connected by a path, they have different types of flowers.

Return any such a choice as an array answer, where answer[i] is the type of flower planted in the (i+1)-th garden.
The flower types are denoted 1, 2, 3, or 4.  It is guaranteed an answer exists.

Example 1:

Input: N = 3, paths = [[1,2],[2,3],[3,1]]
Output: [1,2,3]
Example 2:

Input: N = 4, paths = [[1,2],[3,4]]
Output: [1,2,1,2]
Example 3:

Input: N = 4, paths = [[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]
Output: [1,2,3,4]

 */

public class FlowerGarden {

    public Map<Integer, List<Integer>> createGraph(int[][] paths){
        Map<Integer, List<Integer>> graph = new HashMap<>();
        List<Integer> destn_vertices;

        for(int[] path : paths){
            destn_vertices=new ArrayList<>();
            if(graph.containsKey(path[0])){
                List<Integer> val = graph.get(path[0]);
                val.add(path[1]);
                graph.put(path[0],val);
            }else{
                destn_vertices.add(path[1]);
                graph.put(path[0],destn_vertices);
            }

        }

     return graph;
    }

    public List<Integer> traverse(Map<Integer, List<Integer>> graph) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> ans= new ArrayList<>();
        HashSet<Integer> visited = new HashSet<>();

        Iterator<Map.Entry<Integer, List<Integer>>> itr = graph.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry<Integer,List<Integer>> graph_data=itr.next();
            if(!visited.contains(graph_data)){
              ans=dfs(graph_data.getKey(),graph,visited,ans,stack);
            }

        }
    return ans;
    }

    private List<Integer> dfs(int key, Map<Integer, List<Integer>> graph, HashSet<Integer> visited, List<Integer> ans, Stack<Integer> stack) {
    if(!visited.contains(key)){
        stack.push(key);
    }
    int flowers=0;
    while(!stack.empty()){

        ans.add(++flowers);
        int curr_node=stack.pop();
        if(graph.get(curr_node)!=null){
            for(int val : graph.get(curr_node)){
                if(!visited.contains(val)){
                    stack.push(val);
                }
            }
        }
        visited.add(curr_node);

       }
        System.out.println(" and " + ans.toString());
    return ans;
    }
}
