package arrayfuncs;


import utils.UtilsFunctions;

import java.util.Arrays;

public class ArrayOrderStats extends UtilsFunctions {
    private static Object Pair;

    public static int  kLargeSmallElemsQuickSort(int [] arr , int lowIndex , int highindex, int k){
        System.out.println("https://www.geeksforgeeks.org/k-largestor-smallest-elements-in-an-array/");
        System.out.println("k largest(or smallest) elements in an array | added Min Heap method\n" +
        "Question: Write an efficient program for printing k largest elements in an array. Elements in array can be in any order.\n");

        if (k>0 && k <arr.length) {
            if (highindex - lowIndex > 0) {
                System.out.println(Arrays.toString(arr));
                int pivot = partition(arr, lowIndex, highindex);
                if (pivot == k - 1)
                    return arr[pivot];
                if (pivot > k - 1)
                    return kLargeSmallElemsQuickSort(arr, lowIndex, pivot - 1, k);
                return kLargeSmallElemsQuickSort(arr, pivot + 1, highindex, k);

            }
        }
        System.out.println(Arrays.toString(arr));
       return Integer.MAX_VALUE;
    }


    public static int medianOfStreamingInts(int [] arrStream,int [] minHarr , int [] maxHarr,int instreamIndex, int minHCurrIndex, int maxHCurrIndex,int median) {
        int intstream=0;
        if (instreamIndex<arrStream.length){
            intstream= arrStream[instreamIndex];
            if (intstream < median) {
                maxHarr[maxHarr.length-1] = intstream;
                maxHeap(maxHarr);
                maxHCurrIndex++;
            } else {
                minHarr[minHarr.length-1] = intstream;
                minHeap(minHarr);
                minHCurrIndex++;
            }

            if(Math.abs(minHCurrIndex - maxHCurrIndex)>1){ // if the sizes of the heaps are greater than 1
                System.out.println("Teting ");
                if (minHCurrIndex - maxHCurrIndex > 1) {
                    maxHarr[maxHarr.length-1] = minHarr[0];
                    minHarr[0]=Integer.MAX_VALUE;
                    minHeap(minHarr);
                    maxHeap(maxHarr);
                    minHCurrIndex--;
                    maxHCurrIndex++;
                } else if (maxHCurrIndex - minHCurrIndex > 1) {
                    minHarr[minHarr.length-1] = maxHarr[0];
                    maxHarr[0]=Integer.MIN_VALUE;
                    minHeap(minHarr);
                    maxHeap(maxHarr);
                    maxHCurrIndex--;
                    minHCurrIndex++;
                }
            }
            if (minHCurrIndex - maxHCurrIndex <= 1) {
                System.out.println(maxHCurrIndex + " " + minHCurrIndex);
                if (minHCurrIndex - maxHCurrIndex > 0) {
                    median = minHarr[0];
                } else if (maxHCurrIndex - minHCurrIndex > 0) {
                    median = maxHarr[0];
                } else {
                    median = (minHarr[0] + maxHarr[0]) / 2;
                }
            }

            System.out.println("Median of the stream : " + median +" Stream No " + intstream + " \n" +
                    "Max Heap :  " + Arrays.toString(maxHarr) + " \n" +
                    "Min Heap : " + Arrays.toString(minHarr) + " " +
                    "\nminHCurrIndex : " + minHCurrIndex +
                    "\nmaxHCurrIndex: " + maxHCurrIndex);
            instreamIndex++;
            return medianOfStreamingInts(arrStream,minHarr,maxHarr,instreamIndex,minHCurrIndex,maxHCurrIndex,median);
       }
       return median;
    }

    public static int [] maxHeap(int []  arr ){
        int heap_size = arr.length;
        int i = (heap_size-1)/2;
        while (i>=0){ // n
           maxHeapify(arr,i,heap_size);//log n
           i--;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }


    public static int findSmallestMissingNumber(int [] arr ){
        System.out.println(" https://www.geeksforgeeks.org/find-the-first-missing-number/ ");

        int num = (arr[0]-0)!=0 ? 0 : -1 ;
        if (arr.length==0)
            return -1;
        if (num ==0 )
            return num ;
        int pattern=1;//arr[1]-arr[0];
        System.out.println(pattern);

        /*for (int j = 1 ; (j+1)<arr.length;j++){
            pattern=min(pattern,arr[j+1]-arr[j]);
        }*/

        for (int i = 0 ; (i+1)< arr.length ; i ++ ){
            if (arr[i + 1]- arr[i]>pattern){
                return arr[i]+1;
            }
        }

        return num;
    }

    public static int [] minHeap(int []  arr ){
        int heap_size = arr.length;
        int i = (heap_size-1)/2;
        while (i>=0){
            minHeapify(arr,i,heap_size);
            i--;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

}
