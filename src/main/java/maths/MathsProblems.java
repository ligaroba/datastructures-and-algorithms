package maths;

import java.util.Arrays;

public class MathsProblems {
    private static int gcd(int a, int b ){
        if (b==0)
            return a;
        System.out.println("a " + a + " b " + b + " a%b " + a%b);
        return gcd(b,a%b);
    }

    public static void simplifies_fraction(int numerator , int denominator,int[] results ){
        int g= gcd(numerator,denominator);
        results[0]=numerator/g;
        results[1]=denominator/g;
        System.out.println("results  " + Arrays.toString(results));

    }

    public static void matrixMultiplication(int [][] A , int [][] B){
        int rowsA= A.length;
        int rowsB = B.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int [][] res = new int [rowsA][colsB] ;
        if (colsA!=rowsB)
            return ;

        for (int j =0 ; j<rowsA ; j ++ ){
            for (int i =0 ; i<colsB;i++ ){
                for (int k =0; k <rowsA;k++){
                    res[j][i]= res[j][i] + A[j][k]*B[k][j];

                }
            }
        }


    }
}
