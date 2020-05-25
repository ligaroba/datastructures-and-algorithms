package utils;


import java.util.Arrays;

public class UtilsFunctions {

    public static int[] swap(int[] arr,int i,int j ){
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
        return arr;
    }

    public static int [][] swapMatrix(int [][] mat , int i , int j , int k, int l){
        int temp = mat[i][j];
        mat[i][j]=mat[k][l];
        mat[k][l]=temp;
        return mat;
    }
    static int right(int i){ return 2*i+2;}
    static int left(int i){ return 2*i+1;}
    static int parent(int i ) { return (i-1)/2;}


    public static void minHeapify(int [] harr , int i,int heap_size){
        int l = left(i);
        int r = right(i);
        int smallest =i;
        if (l<heap_size && harr[l]>harr[smallest])
            smallest=l;
        if (r<heap_size && harr[r]<harr[smallest])
            smallest=r;
        if (smallest!=i) {
            harr=swap(harr, i, smallest);
            minHeapify(harr,smallest,heap_size);
        }
    }
    public static int min(int a ,int b){
        return (a<b) ? a : b;
    }
    public static int max(int a ,int b){
        return (a>b) ? a : b;
    }

    public static void maxHeapify(int [] harr , int i,int heap_size){
        int l = left(i);
        int r = right(i);
        int largest =i;
        System.out.println(" harr[largest] " + harr[largest] +
                " harr[r] " + harr[r] +
                " harr[l] " + harr[l]);

        System.out.println(" largest index " + largest +
                " r " + r +
                " l " + l);
        if (l<heap_size && harr[l]>harr[largest]) {
            largest = l;
        }
        if (r<heap_size && harr[r]>harr[largest]) {
            largest = r;
        }
        System.out.println(" harr[largest] " + harr[largest] +
                " harr[r] " + harr[r] +
                " harr[l] " + harr[l]);

        System.out.println(" largest index " + largest +
                " r " + r +
                " l " + l);

        if (largest!=i) {
            harr = swap(harr, i, largest);
            System.out.println(" harr " + Arrays.toString(harr));
            maxHeapify(harr, largest, heap_size);

        }
    }

    // Heap sort
    public static int buildHeap(int [] harr, int heap_size, String heaptype){
        if (heap_size==0)
            return 0;
        int root = harr[0];
        if (heap_size>1){
            harr[0]=harr[heap_size-1];
            harr[heap_size-1]=root;
            if (heaptype=="min") {
                minHeapify(harr, 0, heap_size - 1);
            } else {
                maxHeapify(harr, 0, heap_size - 1);
            }
        }
        heap_size--;
        return buildHeap(harr, heap_size,heaptype);
    }



    // Quicksort Getting  parttion index for pivot
    static int minIndex(int [] arr ,int j ,int i , int k , int med ){
        int miIndex =0;
        int distj=Math.abs(arr[j]-med);
        int disti =Math.abs(arr[i]-med);
        int distk = Math.abs(arr[k]-med);
        if (distj<distk && distj<disti){
            miIndex=j;
        }else if (disti<distk){
            miIndex=i;
        }else{
            miIndex=k;
        }
        return miIndex;
    }
    // Extract Max Item from heap
    public static int extractMaxMinFromHeap(int [] harr,int heap_size,Boolean heaptype ){
        if (heap_size==0)
            return 0;
        int root = harr[0];
        if (heap_size>1){
            harr[0]=harr[heap_size-1];
            //harr[heap_size-1]=root;
            if (heaptype) {
                minHeapify(harr, 0, heap_size - 1);
            } else {
                maxHeapify(harr, 0, heap_size - 1);
            }
        }
        heap_size--;
        return root;
    }


    // Quicksort partition Algorithm
    public static int  partition(int [] arr,int lowindex,int highindex  ) {
        int divider = lowindex;
        int pivot = highindex;
        for (int i = lowindex; i < highindex; i++) {
            if (arr[i] < arr[pivot]) {
                arr = swap(arr, i, divider);
                divider++;
            }
        }
        arr = swap(arr, pivot, divider);
        return divider;
    }
}
