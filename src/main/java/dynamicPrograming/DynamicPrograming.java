package dynamicPrograming;
import utils.UtilsFunctions;

import java.util.*;

public class DynamicPrograming extends UtilsFunctions {



    public static List<Integer> longest_increasing_subsequence(List<Integer> sequence) {
        // Write your solution here
        List<Integer> longestseq=new ArrayList<Integer>();
        int n = sequence.size();
        int i=1;
        int k = 0 ;
        int j=0;
        if (n==1)
            return sequence;
        if (sequence.isEmpty())
            throw new EmptyStackException();


        // Create a memo to store the computations
        int [] mem = new int[n];
        int [] indexSubSq = new int[n];
        // Initialize the n size array  with 1 since a single number qualifies to be a subsequence
        while (k<mem.length){
            mem[k] =1;
            k++;
        }
        // Fill up the mem with respective values of max of i and j
       while (i<n){
            while(j<i) {
                if (sequence.get(i) > sequence.get(j)) {
                    if (mem[i]< mem[j]+1){
                        indexSubSq[i]=j;
                    }
                    mem[i] = max(mem[i], mem[j] + 1);


                    j++;
                }else {
                    j++;
                }
            }
            j=0;
            i++;

        }
       i =1;
       int longestSeqLen=0; //Stores the length of the sequence
       int maxIndex =0; // stores the index of longestSeqLen inside the memo array
       // Loop through memo to get the length and index(of the longest sequence) in the memo array

       while (i <n ){
          if (mem[i]>=mem[i-1]){
               if(longestSeqLen<mem[i]) {
                   maxIndex = i;
                   longestSeqLen=mem[i];
               }
          }
          i++;
       }
       // create an arrayList response that will store the actual sequence based on the size of  longestSeqLen from memo
       List<Integer> res = new ArrayList<Integer>() ;
       // create a local variable that we will use to loop through as we position the sequence items in the response array
       int r=longestSeqLen;
       // using the maxindex get the value stored at that index from the original sequence list
       // decrement r after adding the 1st number to the sequence  arrayList res to avoid overwriting
       res.add(sequence.get(maxIndex));
       r-=1;
       while (r!=0){
            maxIndex = indexSubSq[maxIndex];
            --r;
            res.add(sequence.get(maxIndex));
       }
       Collections.sort(res);
       return res;

    }


    public static int count_the_paths(List<List<String>> grid) {
        // Write your solution here
        int row = grid.size();
        int col = grid.get(0).size();
        System.out.println(" https://www.hiredintech.com/classrooms/algorithm-design/lesson/12/task/15");

        // Create a stack to store the nodes to be visited
        Stack<String> stack = new Stack<>();
        Queue<Integer> q = new LinkedList<>() ;


        // Create List to Store visited nodes
        Map<String,Integer> visited = new HashMap<String,Integer>();
        // Complete path will store coordinates we seen before that leads us to the destination we want
        Map<String,Integer> completePath = new HashMap<String,Integer>();
        //Starting Cell Coordinates
        int start_row=row-1;
        int start_col = 0;
        // Destination cell coordinates
        int destin_row=0;
        int destin_col=col-1;

        int count_paths = 0;
        int i=start_row;
        int j=start_col;
        int up=0;
        int right=0;
        String coord = "";
        // Storing the coordinates as a string in the stack in order to preserve zeros before a number e.g 01
        stack.push(start_row +""+start_col);

        while (!stack.empty()) {
            coord = stack.pop();

            i = Integer.valueOf(coord.split("")[0]);
            j = Integer.valueOf(coord.split("")[1]);
            up = i - 1;
            right = j;
            if (up >=0) {

                // Check if the coord Up  is not visited , not equal to 1 and its not he last cell
                if (!visited.containsKey(up + "" + right) && grid.get(up).get(right) != "1" && (up != destin_row && right != destin_col)) {

                    stack.push(up + "" + right);
                    completePath.put(i + "" + j, 1);

                // Check if we from where we are we have visited the path and it in completePath map means it can lead us to the desired
               // Path therefore we count as possible path since its an intersection of two paths that are comunt from different directions
                } else if (visited.containsKey(up + "" + right) && completePath.containsKey(up + "" + right)) {
                    completePath.put(i + "" + j, 1);
                    completePath.put(up + "" + right, 1);
                    count_paths++;
                } else if ((up ==destin_row && right == destin_col)) {
                    completePath.put(i + "" + j, 1);
                    completePath.put(up + "" + right, 1);
                    count_paths++;
                }
            }
            up = i;
            right = j + 1;
            if (right < col) {

                // Check if the coord right is not visited , not equal to 1 and its not he last cell
                if (!visited.containsKey(up + "" + right) && grid.get(up).get(right) != "1" && (up != destin_row && right != destin_col)) {
                    stack.push(up +""+ right);
                    completePath.put(i + "" + j, 1);

                // Check if we from where we are we have visited the path and it in completePath map means it can lead us to the desired
               // Path therefore we count as possible path since its an intersection of two paths that are comunt from different directions
                } else if (visited.containsKey(up + "" + right) && completePath.containsKey(up + "" + right)) {
                    completePath.put(i + "" + j, 1);
                    completePath.put(up + "" + right, 1);
                    count_paths++;
                } else if ((up == destin_row && right == destin_col)) {
                    completePath.put(i + "" + j, 1);
                    completePath.put(up + "" + right, 1);
                    count_paths++;
                }
            }
               // Check if from the current coordinate if we can go up and right if not remove the current coord
               // from the completePath since it leads to a dead end
            up=i-1;
            right=j+1;
            if (right < col && up>=0) {

                // Check if the coord right is not visited , not equal to 1 and its not he last cell
                if (!visited.containsKey(up + "" + right) && grid.get(up).get(right) != "1" && (up != destin_row && right != destin_col)) {
                    stack.push(up +""+ right);
                    completePath.put(i + "" + j, 1);
                // Check if we from where we are we have visited the path and it in completePath map means it can lead us to the desired
                // Path therefore we count as possible path since its an intersection of two paths that are comunt from different directions
                } else if (visited.containsKey(up + "" + right) && completePath.containsKey(up + "" + right)) {
                    completePath.put(i + "" + j, 1);
                    completePath.put(up + "" + right, 1);
                    count_paths++;
                } else if ((up == destin_row && right == destin_col)) {
                    completePath.put(i + "" + j, 1);
                    completePath.put(up + "" + right, 1);
                    count_paths++;
                }
            }
            // Check if we can go up , right or diagonal right if not
            if (i-1>=0 && j+1<col) {
                if (grid.get(i - 1).get(j) == "1" && grid.get(i).get(j + 1) != "1" && grid.get(i-1).get(j + 1) != "1") {
                    completePath.remove(i + "" + j, 1);
                }
            }

               visited.put(i +""+ j, 1);
           }
            System.out.println(Arrays.toString(stack.toArray()) + " Visited "+ visited.toString() + " CompletePath  " + completePath.toString());
            return count_paths;
        }


}
