package sorting;

import utils.UtilsFunctions;

import java.util.*;

public class SortingAlgorithms extends UtilsFunctions {
    public static void sort_the_files(int n, List<String> result) {
        // Write your solution here
        System.out.println("https://www.hiredintech.com/classrooms/algorithm-design/lesson/19/task/16");
        //List<String>  filelist = new ArrayList<String>();
        String [] filelist = new String[n];

        for (int i =0 ; i< n ; i++){
            if(i>1000)
                return ;
            filelist[i]= "IMG"+(i+1)+".jpg";
        }
        System.out.println(Arrays.toString(filelist));
        mergeSort(filelist,filelist.length);
    }

    public static void mergeSort(String [] arr , int n){
       if (arr.length==1)
            return; // arr of one digit is sorted
       int mid = (n/2);
       String [] left = new String [mid] ;
       String [] right = new String [n-mid];

       for (int l = 0 ; l<mid ; l++){
            left[l]=arr[l];
       }

       for (int r = mid ; r<n; r ++ ){
           right[r-mid]=arr[r];
       }

       mergeSort(left,mid);
       mergeSort(right,n-mid);
       merge(arr, left , right , mid , n-mid);
    }

    private static void merge(String[] arr, String[] left, String[] right, int l, int r) {
     int i , j , k ;
     i=j=k=0;
     while (i<l && j < r ){
         if (left[i].compareTo(right[j])>0){
             arr[k++] =left[i++];
         }else {
             arr[k++] =right[j++];
         }

     }

     while (i<l){
         arr[k++] = left[i++];
     }
     while (j<r){
       arr[k++] = right[j++] ;
     }
     System.out.println(Arrays.toString(arr));
    }

    public static int partition(List<Integer> dataList , int n ){
        int pivot = n-1;
        int divider = 0;
        int temp = 0 ;

        for (int i = 0 ; i < n-1 ;){
            if(dataList.get(i) < dataList.get(pivot)){
               Collections.swap(dataList,i,divider);
               i++;
               divider++;
            }else{
                i++;
            }

        }
        Collections.swap(dataList,pivot,divider);
        System.out.println(dataList.toString());
        return divider;
    }

    public static int maximum_completed_tasks(int n, int t, List<Integer> task_difficulties) {
        // Write your code here

       /* Let's look at how much time processing a sequence of tasks will take.
        If the sequence is t1, t2, t3, t4, the time to process is t1 + (t2 - t1) + t2 + (t3 - t2) + t3 + (t4 - t3) + t4.
        After we simplify this we get t2 + t3 + 2 * t4. To generalise this, for a set of tasks t1, t2, ..., tn, the total time to process them all will be t2 + t3 + ... + 2 * tn. This means that if we take the sequence of tasks with the lowest difficulties
        it will take the lowest possible time to complete from all sequences of tasks with the same length.*/

       int max_tasks=1;
        int sumTime=task_difficulties.get(0);
         // Sorting the list
        Collections.sort(task_difficulties);
        if (task_difficulties.get(0) > t) {
            return 0;
        }

        int i=1;
        while (i<task_difficulties.size()){
            sumTime+=  task_difficulties.get(i) + Math.abs(task_difficulties.get(i) -task_difficulties.get(i-1));
            if(sumTime<=t){
                max_tasks++;
            }
            i++;
        }
        System.out.println(max_tasks);
        return max_tasks ;
    }


}
