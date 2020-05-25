package matrices;

import utils.UtilsFunctions;

import java.util.Arrays;

public class MatrixRotation extends UtilsFunctions {

    public static int rotateMatrixClockwise(int [][] mat , int rows , int cols ,int rowindex, int colIndex) {

        int temp = mat[rowindex][colIndex];
        Boolean goingDown, goingRight, goingUp, goingLeft;
        goingDown = true;
        goingRight = goingUp = goingLeft = false;
        int i = rowindex;
        int j = colIndex;

        // increment the rows and columns of the inner matrix after the 1st reccussive call
        // Reason : the indices of the inner array do not start with 0 therefore to traverse the whole matrix add 1
        // the col and row size
        if (i != 0 && j != 0) { ++rows;++cols;}
        if (rows==0 || cols==0)
            return 0;

        while (true ){
                if (goingDown==true){
                    if((i+1)<rows) {
                        mat[i][j]=mat[i+1][j];
                        i++;

                    }else {
                        goingDown = false;
                        goingRight = true;
                        i = rows - 1;
                }

                }else if (goingRight==true){
                    if((j+1)<cols) {
                        mat[i][j]=mat[i][j+1];
                        j++;
                    }else {
                        goingRight = false;
                        goingUp = true;
                        j = cols - 1;
                    }

                }else if (goingUp==true) {
                    if (i == rowindex){
                        goingUp = false;
                        goingLeft = true;
                        i = rowindex;
                    continue;
                    }
                    mat[i][j]=mat[i-1][j];
                    i--;
                }else if (goingLeft==true){
                    if(j==colIndex) {
                        goingLeft = false;
                        goingDown = true;
                        j = colIndex;
                        break;
                    }
                    mat[i][j]=mat[i][j-1];
                    j--;
                }

            }
       mat[i][j+1]=temp;
       System.out.println(Arrays.deepToString(mat) + "  temp "+ temp + " i : " + i  + " j " + j );
       if (rows<4 && cols<4)
           return 0;
       return rotateMatrixClockwise(mat,rows-2,cols-2,i+1,j+1);
    }


}
