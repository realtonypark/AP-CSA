//import java.util.Random;
import java.util.*;

public class Matrix {
    public int row;
    public int column;
    public double[][] mat;

    public Matrix(){
        row = 5;
        column = 5;
        mat = new double[row][column];
    }

    public Matrix(int myrow, int mycolumn, double element){
        row = myrow;
        column = mycolumn;
        mat = new double[row][column];
        for(int i = 0; i < mat.length ; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = 1;
            }
        }
    }

    public void printMatrix(){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(Math.round(mat[i][j]*100)/100.0 + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void fivesInitialize(){
        for(int i = 0; i < row ; i++){
            for(int j = 0; j < column; j++){
                mat[i][j] = 5;
            }
        }
    }

    public void randomInitialize(int min, int max){
        Random rand = new Random();
        
        for(int i = 0; i < row ; i++){
            for(int j = 0; j < column; j++){
                //mat[i][j] = (max-min) * Math.random() + min;
                mat[i][j] = (max-min) * rand.nextDouble() + min;
            }
        }
    }
}
