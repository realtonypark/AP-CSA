import java.lang.Math;
import java.util.*;
public class MyMatrix{
    // attributes
    public String myName;
    public int myRows;
    public int myCols;
    public double[][] myElements;

    //constructors
    public MyMatrix(){
        myName = "Matrix";
        myRows = 10;
        myCols = 10;
        myElements = new double[myRows][myCols];
    }

    public MyMatrix(String name, int rows, int cols){
        myName = name;
        myRows = rows;
        myCols = cols;
        myElements = new double[myRows][myCols];
        /*
        for(int i = 0; i < myRows; i++){
            for(int j = 0; j < myCols; j++){
                myElements[i][j] = 0;
            }
        }
        */
    }

    //methods
    public String toString(){
        return myName + "\n" + myRows + "X" + myCols;
    }

    
    public void initializeRandom(double min, double max){
        // element 값을 랜덤으로 채우기
        Random r = new Random();
        for(int i = 0; i < myRows; i++){
            for(int j = 0; j < myCols; j++){
                myElements[i][j] = min + (max - min) * r.nextDouble();
            }
        }
    }

    public void initializeOnes(){
        // element 값을 1로 채우기
        for(int i = 0; i < myRows; i++){
            for(int j = 0; j < myCols; j++){
                myElements[i][j] = 1.0;
            }
        }
    }

    public void identityMatrix(){
        // Identity matrix 만들기
        for(int i = 0; i < myRows; i++){
            for(int j = 0; j < myCols; j++){
                if(i == j) myElements[i][j] = 1.0;
            }
        }
    }

    //toString 메소드 오버라이딩은 불편하니까 그냥 print 메소드 만들어서 출력하기
    public void printMatrix(){
        for(int i = 0; i < this.myRows; i++){
            for(int j = 0; j < this.myCols; j++){
                System.out.print(Math.round(this.myElements[i][j]*100)/100.0+ " ");
            }
            System.out.println();
        }
        System.out.println(this+"\n");
    }
}