package arrayfuncs;
import java.lang.*;
import java.util.Arrays;

public class ArrayRotations {

    /*   https://www.geeksforgeeks.org/quickly-find-multiple-left-rotations-of-an-array/     */

    static public void printleftRotate(int arr[],int n,int k){
        System.out.println("Question: Quickly Printing all elements after rotation ");
        /*To get the the startin point */
        System.out.print("Original arr  " + Arrays.toString(arr)+" \n");
        int mod= k%n;
        /*printing the rotated array from the starting point */
        System.out.print("Rotated  arr " );
        for (int i=0;i<n;++i){
            System.out.print( arr[(i+mod)%n]+ " " );
        }
        System.out.println("\n");
    }

    /*   https://www.geeksforgeeks.org/find-a-rotation-with-maximum-hamming-distance/        */
    static public void hammingdistance(int arr[],int n,int k){
        /* Rotate copy array the compare corresponding indexes from original and rotated  and increase HD variable */

    }


    /*   https://www.geeksforgeeks.org/reversal-algorithm-right-rotation-array/   */
    static public void rotationByReversal(int arr[],int n,int k){
        /* get the pivot (rotation point) reverse left and right then merge then reverse again the merged array */

    }



    static public int rotateCount(int[] arr, int n){
        System.out.println("Question: Counting Number of array rotations ");
        /* https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/*/
        for (int i =0;i<n;i++){
            if (arr[i]>arr[i+1]){
                return i+1;
            }
        }
        return 0;

    }



}

