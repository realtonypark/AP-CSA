import java.lang.Math;

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

        for(int i = 0; i < myRows; i++){
            for(int j = 0; j < myCols; j++){
                myElements[i][j] = 0;
            }
        }
    }

    //methods
    public String toString(){
        // A
        // 10 X 10
        // 0.000 0.000 ... 
        // 0.000 0.000 ... 
        // 0.000 0.000 ... 
        // .
        // .
        // .

        return myName + "\n" + myRows + "X" + myCols + "\n";
    }

    
    public void initializeRandom(double min, double max){
        for(int i = 0; i < myRows; i++){
            for(int j = 0; j < myCols; j++){
                myElements[i][j] = (double) ((int) (Math.random() * (max - min)) + min);
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
}