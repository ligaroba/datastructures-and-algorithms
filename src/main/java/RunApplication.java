
import utils.UtilsFunctions;

import java.util.Arrays;

public class RunApplication {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        int n = arr.length;
        int k = 2;
        //ArrayRotations.printleftRotate(arr, n, k);

        int arr2[] = {15, 18, 2, 3, 6, 12};
        int n2=arr2.length;
        //int res=ArrayRotations.rotateCount(arr2, n2);
        //System.out.println(" number of rotations " + res);

        int arr3[] = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
                11, 10, 9, 5, 13,16, 2, 14, 17, 4};
        int arr4[]={-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int n3=arr3.length;
        //ArrayArrangement.rearrangeIndexToElemen(arr3, n3);

        int arr5[] = {1, 2, 1, 4, 5, 6, 8, 8};
        //{1, 2, 3, 4, 5, 6, 7}
        int n5=arr5.length;
        //ArrayArrangement.rearrangeEvenAndOdd(arr5, n5);

        int arr6[] ={12,11,-13,-5,6,-7,5,-3,-6};//{-1, 2, -3, 4, 5, 6, -7, 8, 9};//{-1,-1,-1,2,2};  // {-1, 2, -3, 4, 5, 6, -7, 8, 9};//{-1,-1,-1,2,2};//
        int n6=arr6.length;
        //ArrayArrangement.arangePostveAndNegAltenatively(arr6, n6);

        int arr7[] ={12 ,11 ,-13 ,-5 ,6 ,-7, 5 ,-3 ,-6};
        int n7=arr7.length;
        //ArrayArrangement.reArrangePosNeg(arr7, 0,n7-1);


        int arr8[] ={2,1,1,0,1,2,1,2,0,0,0,1,2};
        int n8=arr8.length;
        //ArrayArrangement.arrangeArrZerosOnesTwos(arr8,n8);
        int arr9[] ={1,2,3,4,5,7,9,13};
        int n9=arr9.length;
       // ArrayArrangement.rearrangeArrAlternatively(arr9,n9);
        int arr10[] ={1,0,2,0,3,0,4,0,5,0,6};
        int n10=arr10.length;
        //ArrayArrangement.rearrangeArrZerosToRight(arr10,n10);
       // ArrayArrangement.rearrangeArrZerosToLeft(arr10,n10);


        int arr11[] = {2, 1, 5, 6, 3};//{2, 7, 9, 5, 8, 7, 4};
        int n11=arr11.length;
        int c = 3;
        //ArrayArrangement.rearrangeArrZerosToRight(arr10,n10);
       // ArrayArrangement.groupElemntsLessK(arr11,n11,c);


        //String algorthms
        String str="ABRACADXABRAWGDWERZ";
        //AbstractMap<String,String> res = StringManipulation.encodeString(str);
        //System.out.println("Encoded String : " + res.getKey());
        //StringManipulation.decodeString(res);

        int [] arr12={7, 10, 4, 3, 20, 15};//{12, 3, 5, 7, 4, 19, 26};
        k = 5;
       //int kth= ArrayOrderStats.kLargeSmallElemsQuickSort(arr12,0,arr.length-1,k);
       //System.out.println(kth);

        int [] arr13={ 7, 10, 4, 3, 20, 15 , 12, 3, 5, 7, 4, 19, 26};
        k = 5;
        //int  [] harr = ArrayOrderStats.minHeap(arr13);
        //UtilsFunctions.extractMaxMinFromHeap(harr,harr.length);
        //System.out.println(Arrays.toString(harr));
        int minHCurrIndex = Integer.MAX_VALUE ;
        int maxHCurrIndex =Integer.MAX_VALUE;

        int [] minHarr= new int []{Integer.MAX_VALUE,Integer.MAX_VALUE
        ,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};

        int [] maxHarr = new int []{Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE,
                Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};

        int maxHeap_size =maxHCurrIndex+1;
        int minHeap_size =maxHCurrIndex+1;
        int median =0;
        int[] arrStream = {7, 10, 4, 3, 20, 15, 12, 3, 5, 7, 4, 19, 26};
        //medianOfStreamingInts(arrStream , minHarr,maxHarr,0,0,0,0);
        int [] arr14 = {1,2,6,7,9};
        //int val = findSmallestMissingNumber(arr14);
        //System.out.println(val);

        int [][] mat ={{1,2,3},
                      {4,5,6},
                      {7,8,9}};

        int [][] mat2 = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        int [][] mat3 = {{5,4,7},
                         {8,1,3},
                         {2,9,6}};
        int [][] mat4 ={{5,15,7,12},
                {8,1,14,11},
                {16,9,6,10},
                {2,13,3,4}};
       // MatrixRotation.rotateMatrixClockwise(mat2,4,4,0,0);
        //MatrixSorting.sortMatrix(mat3,3,3,false);
        //System.out.println(Arrays.deepToString(mat3));
            //int sum = OtherAlgorithms.digit_sum(1325132435);
            //System.out.println(sum);
            //OtherAlgorithms.numberDigits(10001);
           //Boolean paldrome = OtherAlgorithms.isNumericPalindromeNoSpace(10001);
           //System.out.println(paldrome);

       /* List<Integer> seq = new ArrayList<Integer>();
         seq.add(16);
         seq.add(3);
         seq.add(5);
         seq.add(19);
         seq.add(10);
         seq.add(14);
         seq.add(12);
         seq.add(0);
         seq.add(15);
        List<Integer> res =DynamicPrograming.longest_increasing_subsequence(seq);
        System.out.println(Arrays.toString(res.toArray()));*/

      /*List<String> row1 = new ArrayList<>();
      row1.add("0");
      row1.add("1");
      row1.add("1");
      row1.add("0");
      row1.add("1");
      row1.add("0");

      List<String> row2 = new ArrayList<>();
      row2.add("1");
      row2.add("1");
      row2.add("1");
      row2.add("0");
      row2.add("0");
      row2.add("1");

      List<String> row3 = new ArrayList<>();
      row3.add("0");
      row3.add("0");
      row3.add("0");
      row3.add("1");
      row3.add("1");
      row3.add("0");

      List<String> row4 = new ArrayList<>();
      row4.add("0");
      row4.add("1");
      row4.add("0");
      row4.add("1");
      row4.add("0");
      row4.add("0");

      List<String> row5 = new ArrayList<>();
      row5.add("0");
      row5.add("0");
      row5.add("1");
      row5.add("0");
      row5.add("1");
      row5.add("1");

      List<List<String>> grid = new ArrayList<List<String>>();
      grid.add(row1);
      grid.add(row2);
      grid.add(row3);
      grid.add(row4);
      grid.add(row5);
      System.out.println(Arrays.toString(grid.toArray()));
     int coun_paths =  DynamicPrograming.count_the_paths(grid);
     System.out.println(coun_paths);*/
    // List<String> sortedres = new ArrayList<String>();
     //int  N = 30 ;
     //SortingAlgorithms.sort_the_files(N,sortedres);

   /* List<Integer> task_difficulties= new ArrayList<Integer>();
    task_difficulties.add(24);
    task_difficulties.add(23);
    task_difficulties.add(22);
    task_difficulties.add(10);
    task_difficulties.add(20);
    int N =task_difficulties.size();
    int T = 65;
    //SortingAlgorithms.partition(task_difficulties,N);

    SortingAlgorithms.maximum_completed_tasks(N,T,task_difficulties);
*/

   /*     int [] results=new int [2];
        MathsProblems.simplifies_fraction(10,12 , results);
*/
        int [] harr=new int [] {3,4,2,5,6,7};
        UtilsFunctions.buildHeap(harr,harr.length,"max");

        System.out.println(Arrays.toString(harr));

    }


}
