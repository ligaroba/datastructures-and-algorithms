package arrayfuncs;

import utils.UtilsFunctions;

import java.util.Arrays;

public class ArrayArrangement  extends UtilsFunctions {


    /*   https://www.geeksforgeeks.org/rearrange-array-arri/    */
    static public void rearrangeIndexToElemen(int arr[], int n) {
        System.out.println(" https://www.geeksforgeeks.org/rearrange-array-arri/ ");
        int[] reArr = new int[n];
        int temp = 0;
        int j = 0;
        int l = 0;
        for (int c = 0; c < n; c++) {
            reArr[c] = -1;

        }
        /* Rearrange an array such that arr[i] = i */
        System.out.println("Rearrange an array such that arr[i] = i in place  \n");
        for (int i = 0; i < n; i++) {
            if (arr[i] == -1 ) continue;
            else if (arr[i] == i) continue;
            else {
                j = arr[i];
                temp = arr[j];
                arr[i]=temp;
                arr[j]=j;
                i--;
            }
        }
        System.out.println(Arrays.toString(arr) + " \n");
        System.out.println("Rearrange an array such that arr[i] = i using Extra space   \n");
        for (int k = 0; k < n; k++) {
            if (arr[k] != -1) {
                reArr[arr[k]] = arr[k];
            }
        }

        System.out.println(Arrays.toString(reArr));
    }

    static public void rearrangeEvenAndOdd(int arr[],int n){
        System.out.println("https://www.geeksforgeeks.org/rearrange-array-arri-arrj-even-arri/");
        System.out.println("Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] if i is odd and j < i \n");

        int j=0;
        int i=j+1;
        int temp =0;
        while (i<n-1 && j>=0) {
            if (i%2==0){
                if (arr[j]<=arr[i]){
                    j+=1;
                    i+=1;
                }else{
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    if (j==0) {
                        j+=1;
                        i+=1;
                    }
                    else{
                        j-=1;
                        i-=1;
                    }
                }
            } else {
                if (arr[j]>=arr[i]){
                    j+=1;
                    i+=1;

                }   else {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    if (j==0) {
                        j+=1;
                        i+=1;
                    }
                    else{
                        j-=1;
                        i-=1;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void arangePostveAndNegAltenatively(int arr[],int n){
        System.out.println("https://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers-publish/");
        System.out.println("Rearrange positive and negative numbers in O(n) time and O(1) extra space \n");
        int i=0;
        int j=i+1;
        while (i<n-1) {
            //Reset J to i+1  whenever value of j is greater than size of array
            if (j > n-1 )  j=i+1;
            if (i % 2 == 0) {
                     //If i is even and arr[i] is neg and arr[j] is pos swap and increment both i and j
                    if (arr[i] < 0 && arr[j] > -1) {
                        arr = swap(arr, i, j);
                        i++;
                        j = i + 1;
                        //If i is even and arr[i] is neg increment j until you find value of and arr[j] is pos
                    } else if (arr[i] < 0) {
                        j++;
                    }else{
                        i++;
                        j=i+1;
                    }
                } else{
                //If i is odd and arr[i] is pos and arr[j] is neg swap and increment both i and j
                    if (arr[i] > -1 && arr[j] < 0) {
                        arr = swap(arr, i, j);
                        i++;
                        j = i + 1;
                        //If i is odd and arr[i] is pos increment j until you find value of and arr[j] is neg
                    } else if (arr[i] >-1) {
                        i++;
                        j++;
                    } else{
                            i++;
                            j=i+1;
                    }
            }

        }
        System.out.println(Arrays.toString(arr));

        }




    public static void rerrangePostveAndNeg(int arr[],int n){
        System.out.println("https://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers/");
        System.out.println("Rearrange positive and negative numbers with constant extra space \n");

        int j=arr.length-1; //looks for negative values on the right of pos
        int temp=0;
        int i=j-1; // looks for pos values on the left of neg

        while (i>-1) {
            if (arr[i] >= 0 && arr[j] < 0) {
                arr=swap(arr,i,j);
                j--;
                i = j - 1;
                System.out.println(Arrays.toString(arr));
            } else if (arr[i] < 0 && arr[j] < 0) {
                i--;
            }else {
                j--;
                i = j - 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void merge(int[] arr, int l , int m,int r ){
        int i=l;
        int j=m+1;

        while (i<=m && arr[i]<0)
            i++;
        while (j<=r && arr[j]<0)
            j++;
        //reverse the left side
        reverse(arr , i, m);
        //reverse right sub array
        reverse(arr , m+1, j-1);
        // reverse the whole array
        reverse(arr , i, j-1);

    }

    static void reverse(int[] arr , int l , int r){
        if (l<r){
            arr=swap(arr,l,r);
            reverse(arr,++l,--r);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void reArrangePosNeg(int arr [] ,int l , int r  ){
         if (l<r){
                int m = l + (r-1)/2; // same as (l+r)/2 to avoid overflows
             reArrangePosNeg(arr,l,m);
             reArrangePosNeg(arr,m+1,r);
             merge(arr,l,m,r);



         }
    }


    public static void arrangeArrZerosOnesTwos(int arr [] , int n ){
     int low=0;
     int high = n-1;
     int mid =0;

     while (mid <= high ){
         if (arr[mid]==0){
            // System.out.println(" 1st " + Arrays.toString(arr) + " arr[low]:low " + arr[low] +":" +  low  +"  arr[mid]:mid " +arr[mid] +":"+mid+ " arr[high]:high " + arr[high]+":" + high);
             arr=swap(arr,low,mid);
             low++;
             mid++;
             //System.out.println(Arrays.toString(arr));
         }else if (arr[mid]==1){
             mid++;
         }else if (arr[mid]==2){
            // System.out.println(" 3rd " + Arrays.toString(arr) + " arr[low]:low " + arr[low] +":" +  low  +"  arr[mid]:mid " +arr[mid] +":"+mid+ " arr[high]:high " + arr[high]+":" + high);
             arr=swap(arr,mid,high);
             high--;
            //System.out.println(Arrays.toString(arr));
         }
     }
     System.out.println(Arrays.toString(arr));

    }

    public static void rearrangeArrAlternatively(int arr [] ,int n){
       /*
       - if index is even arr[i]=arr[i]+arr[max i] % max element * max element;
       - if index is odd  arr[i]=arr[i]+arr[min i] % max element * max element;
       -  Printing Alternate array divide  every element by max elemnt
       - Printing Original array mode every element with max element
        */
       int maxElemnt=arr[n-1] + 1;
       int minIndex=0;
       int maxIndex = n-1;
       int i=0;
       while (i<n){
           if (i%2==0) {
               arr[i]=arr[i]+arr[maxIndex]% maxElemnt* maxElemnt ;
               maxIndex--;
           }else{
               arr[i]=arr[i]+arr[minIndex] % maxElemnt * maxElemnt;
               minIndex++;
           }
           i++;
       }

       System.out.println(" Moded array : " + Arrays.toString(arr));
       // Printing the Alternate array
        for (int j=0;j<n;j++){
            arr[j]=arr[j]/maxElemnt;
       }
       System.out.println(" Alternate array  : " + Arrays.toString(arr));

//        for (int j=0;j<n;j++){
//            arr[j]=arr[j]%maxElemnt;
//        }
//        System.out.println(" Original Array  : " + Arrays.toString(arr));

    }

    public static void rearrangeArrZerosToRight(int[] arr, int n) {
        System.out.println("https://www.geeksforgeeks.org/move-zeroes-end-array-set-2-using-single-traversal/");
        System.out.println("Move all zeroes to end of array | Set-2 (Using single traversal) \n");
        int i =0 ;
        int minIndexOfZeroSoFar=n+1;
        while (i+1<n){
            // If arr[i] is zero and arr[i+1] > zero then prepare to swap
            if (arr[i]==0 && arr[i+1]>0){
                // before swap compare between the current zero pos and then mini pos of zero that we've seen so far
                // take the min(i,minIndexOfZeroSoFar) swap then none zero with the min of the two and assign it to zero
                minIndexOfZeroSoFar=min(i,minIndexOfZeroSoFar);
                arr=swap(arr,minIndexOfZeroSoFar,i+1);
                // increment minIndexOfZeroSoFar to the new pos after swapping
                minIndexOfZeroSoFar++;
                i++;
            }else {
                i++;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
    public static void rearrangeArrZerosToLeft(int[] arr, int n) {
        System.out.println("https://www.geeksforgeeks.org/move-zeroes-end-array-set-2-using-single-traversal/");
        System.out.println("Move all zeroes to end of array | Set-2 (Using single traversal) \n");
        int i =n-1 ;
        int maxIndexOfZeroSoFar=0;
        while (i!=0){
            // If arr[i] is zero and arr[i+1] > zero then prepare to swap
            if (arr[i-1]>0 && arr[i]==0){
                // before swap compare between the current zero pos and then mini pos of zero that we've seen so far
                // take the max(i,maxIndexOfZeroSoFar) swap then none zero with the min of the two and assign it to zero
                maxIndexOfZeroSoFar=max(maxIndexOfZeroSoFar,i);
                arr=swap(arr,maxIndexOfZeroSoFar,i-1);
                // increment maxIndexOfZeroSoFar to the new pos after swapping
                maxIndexOfZeroSoFar--;
               i--;
            }else {
                i--;
            }

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void groupElemntsLessK(int[] arr , int n,int k){
        System.out.println("https://www.geeksforgeeks.org/minimum-swaps-required-bring-elements-less-equal-k-together/");
        System.out.println("Minimum swaps required to bring all elements less than or equal to k together");
       int  countLessK=0;
        int  countGreatK=0;
        int posOfK=-1;
        for (int i =0 ; i<n;i++) {
            if (arr[i] == k) {
                posOfK = i;
            } else if (posOfK > -1) {
                if (arr[i] < k) {
                    countLessK += 1;
                }
            } else if (posOfK == -1 && arr[i] > k) {
                countGreatK += 1;
            }
            if (countGreatK > 0 && countLessK > 0) {
                countGreatK -= 1;
                countLessK -= 1;
            }
            System.out.println(" countGreatK : " + countGreatK + " countLessK: " +countLessK+ " posOfK : " + posOfK);
        }
        if (posOfK==-1){
                System.out.println("Value of K : " + k + " Not found " );
        }

    }

    public int smallestMissingNum(int[] arr){

        int minSofar=0;
        boolean allnegs=false;
        Arrays.sort(arr);

        for (int i =0 ; i<arr.length; i++){
          if (minSofar==0 && (i+1<arr.length) ){
              System.out.printf(" arr " +  " "  + arr[i] +  "  " + arr[i+1] );
              if((arr[i]>0 && arr[i+1]>0) && arr[i+1]-arr[i]>=2){
                  System.out.printf("arr " + Arrays.toString(arr));
                  minSofar=arr[i+1]-1;
                  allnegs=false;
              }else if((arr[i]<0 && arr[i+1]<0)){
                  System.out.printf(" arr " +  " "  + arr[i] +  "  " + arr[i+1] );
                  i++;
                  allnegs=true;
              }else{
                  if(arr[i+1]-arr[i]>1)
                     minSofar=1;
              }

          }
        if (allnegs==true)
               minSofar++;
      }
        return minSofar;
    }
}
