import java.lang.Math;
import java.util.*;
public class CalcMatrix {
    // add(), subtract(), evaluate()

    // attributes
    public String myName;
    public int myRows;
    public int myCols;
    public double[][] myElements;

    //constructors
    public CalcMatrix(){
        myName = "Matrix";
        myRows = 5;
        myCols = 5;
        myElements = new double[myRows][myCols];
    }

    public CalcMatrix(String name, int rows, int cols){
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

    public CalcMatrix add(CalcMatrix matrix){
        CalcMatrix addedMat = new CalcMatrix(this.myName+"+"+matrix.myName, this.myRows, this.myCols);
        if(this.myRows == matrix.myRows && this.myCols == matrix.myCols){
            for(int i = 0; i < addedMat.myRows; i++){
                for(int j = 0; j < addedMat.myCols; j++){
                    addedMat.myElements[i][j] = this.myElements[i][j] + matrix.myElements[i][j];
                }
            }
            //addedMat.printMatrix();
        }
        else System.exit(0);
        return addedMat;
    }

    public CalcMatrix subtract(CalcMatrix matrix){
        CalcMatrix subtractedMat = new CalcMatrix(this.myName+"-"+matrix.myName, this.myRows, matrix.myCols);
        if(this.myRows == matrix.myRows && this.myCols == matrix.myCols){
            for(int i = 0; i < subtractedMat.myRows; i++){
                for(int j = 0; j < subtractedMat.myCols; j++){
                    subtractedMat.myElements[i][j] = this.myElements[i][j] - matrix.myElements[i][j];
                }
            }
            //subtractedMat.printMatrix();
        }
        else System.exit(0);
        return subtractedMat;
    }

    public static void evaluate(CalcMatrix matrix1, CalcMatrix matrix2){
        // 에러? 표준편차? 에러의 평균? 무슨 에러? 못 들음ㅜㅜㅜ
    }

    //toString 메소드 오버라이딩은 불편하니까 그냥 print 메소드 만들어서 출력하기
    public void printMatrix(){
        for(int i = 0; i < this.myRows; i++){
            for(int j = 0; j < this.myCols; j++){
                System.out.print(Math.round(this.myElements[i][j]*100)/100.0+ " ");
            }
            System.out.println();
        }
        System.out.println(this.myName + "\n" + this.myRows + "X" + this.myCols+"\n");
    }
}
