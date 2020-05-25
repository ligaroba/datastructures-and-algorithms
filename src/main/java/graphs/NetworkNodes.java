package graphs;


/*

There are N network nodes, labelled 1 to N.

Given times, a list of travel times as directed edges times[i] = (u, v, w),
where u is the source node, v is the target node,
and w is the time it takes for a signal to travel from source to target.

Now, we send a signal from a certain node K. How long will it take for all nodes
to receive the signal? If it is impossible, return -1.


Example 1

Input: times = [[2,1,1],[2,3,1],[3,4,1]], N = 4, K = 2
Output: 2
 */

import java.util.*;

public class NetworkNodes {


    public Map<Integer, List<Edge>> createGraph(int[][] graph_arr) {
        Map<Integer,List<Edge>> graph = new HashMap<>();
        List<Edge> desn= new ArrayList<>();

        for(int[] node : graph_arr) {
            if (graph.containsKey(node[0])) {
                List<Edge> edge = graph.get(node[0]);
                edge.add(new Edge(node[1], node[2]));
                graph.put(node[0], edge);
            } else {
                desn.add(new Edge(node[1], node[2]));
                graph.put(node[0], desn);
            }
        }

     return graph;
    }

    public int traverse(Map<Integer, List<Edge>> graph, int k) {
        Queue<Integer> qnodes = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int res=0;
        if(graph.containsKey(k)){
            qnodes.add(k);
            res=bfs(qnodes,graph,visited,res);


        }else{
            return -1;
        }
        return res;
    }

    private int bfs(Queue<Integer> qnodes, Map<Integer, List<Edge>> graph, HashSet<Integer> visited, int res) {

        while(!qnodes.isEmpty()){
            int curen_node= qnodes.poll();
             visited.add(curen_node);

                if(graph.get(curen_node)!=null) {
                    /* Between child nodes take the max time since total time take
                    is equal to the longest distance  the signal travelled
                    maxTime(localTimeTaken,edge.getWeight());
                     */
                    int localTimeTaken=0;
                    for (Edge edge : graph.get(curen_node)) {
                        if (!visited.contains(edge.getDestination())) {
                            qnodes.add(edge.getDestination());
                            localTimeTaken = maxTime(localTimeTaken,edge.getWeight());
                        }
                    }
                    res+=localTimeTaken;
                }

            }



        // check if there are unvisited nodes
        Iterator<Map.Entry<Integer,List<Edge>>> itr = graph.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer,List<Edge>> data =itr.next();
            if(!visited.contains(data.getKey()))
                return -1;
        }

        System.out.println(" res " + res);
        return res;

    }

    private int maxTime(int localTimeTaken, int weight) {
        if(localTimeTaken>weight)
            return localTimeTaken;
        return weight;
    }
}
