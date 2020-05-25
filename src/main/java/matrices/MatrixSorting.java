package matrices;

import utils.UtilsFunctions;

import java.util.Arrays;

public class MatrixSorting extends UtilsFunctions {

    public static int sortMatrix(int [] [] mat,int rows , int cols ,Boolean lastRow){
        Boolean rowWise , colWise , rowColWise;
        colWise = rowColWise = false;
        rowWise = true;
        int i,j ,k;
        i=j=k=0;

        if (rows<=1 && cols<=1)
            return 0 ;
        if (lastRow==true){
            i=rows-1;
            j=0;
            while ((j+1)<cols){
                if (mat[i][j] > mat[i][j+1]) {
                    mat = swapMatrix(mat, i, j, i, j + 1);
                    j++;
                }else {
                    j++;
                }
            }

            System.out.println(Arrays.deepToString(mat));
        }

        while (true){
           if (rowWise){
                //Check if j is < col size else increment i and reset j to 0
                if ((j+1)<cols){
                    // If mat[i][j] > mat[i][j+1] Swap and increment j else increment j
                    if (mat[i][j] > mat[i][j+1]) {
                        mat = swapMatrix(mat, i, j, i, j + 1);
                        j++;
                    }else {
                        j++;
                    }

                }else {
                    if ((i+1)<rows){
                        i++;
                        j=0;
                    }else {
                        rowWise=false;
                        colWise=true;
                        i=0;
                        j=0;
                        if (lastRow==true)
                             return 0;

                    }

                }
            }else if(colWise){
                //Check if i is < row size else increment j and reset i to 0
                if ((i+1)<rows){
                    // If mat[i][j] > mat[i][j+1] Swap and increment j else increment j
                    if (mat[i][j] > mat[i+1][j]) {
                        mat = swapMatrix(mat, i, j, i+1, j);
                        i++;
                    }else {
                        i++;
                    }

                }else {
                    if ((j+1)<rows){
                        j++;
                        i=0;
                    }else {
                        colWise=false;
                        rowColWise=true;
                        i=0;
                        j=0;
                    }

                }
            }else if (rowColWise){
              if ((i+1)<rows && j<cols){
                  System.out.println(Arrays.deepToString(mat) + " rowwise " + rowWise + " colWise "  + colWise + " rowColWise " +rowColWise+ " i " + i + " j " + j + " k " + k);
                  //Check if mat[i][j] > mat[i+1][j] swap
                  if (mat[i][j]>mat[i+1][j]){
                        mat= swapMatrix(mat,i,j,i+1,j);
                        j++;
                        //after swapping check for values in the row (i+1) where mat[i+1][k] if
                       // There are values that are less than mat[i][j] for values of k=0 to k<j
                      //Then reset k to 0
                        if(k<j && j<cols){
                            while (k<j){
                                System.out.println("i " + i + " j " + j +  " k " + k);
                                if (mat[i][j]>mat[i+1][k]){
                                    mat= swapMatrix(mat,i,j,i+1,k);
                                    k++;
                                }else{
                                    k++;
                                }
                            }

                            k=0;
                        }
                    //Check the current  mat[i][j] > for values of mat[i+1][k] and swap from k=0 to k<j then reset k to 0
                    }else if (mat[i][j]>mat[i+1][k]){
                      mat= swapMatrix(mat,i,j,i+1,k);
                      k++;
                      if(k<j){
                          while (k<j){
                              if (mat[i][j]>mat[i+1][k]){
                                  mat= swapMatrix(mat,i,j,i+1,k);
                                  k++;
                              }else{
                                 k++;
                              }
                          }
                       }
                      k=0;
                  }  else {
                       if ((j+1)<cols) {
                            j++;
                        }else {
                            j=0;i++;
                        }

                  }
                }else {
                    if ((i+1)<=rows) {i++;
                    }else{
                        return sortMatrix(mat,rows,cols,true);
                    }
                }

            }
        }

    }


}
