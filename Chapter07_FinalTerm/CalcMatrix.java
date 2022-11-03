import java.lang.Math;
import java.util.*;

public class CalcMatrix {
    // attributes
    public String myName;
    public int myRows;
    public int myCols;
    public int[][] myElements;

    //constructors
    public CalcMatrix(){
        myName = "Matrix";
        myRows = 5;
        myCols = 5;
        myElements = new int[myRows][myCols];
    }

    public CalcMatrix(String name, int rows, int cols){
        myName = name;
        myRows = rows;
        myCols = cols;
        myElements = new int[myRows][myCols];

        for(int i = 0; i < myRows; i++){
            for(int j = 0; j < myCols; j++){
                myElements[i][j] = 0;
            }
        }
    }

    public void initializeRandom(int min, int max){
        // element 값을 랜덤으로 채우기
        Random r = new Random();
        for(int i = 0; i < myRows; i++){
            for(int j = 0; j < myCols; j++){
                myElements[i][j] = min + r.nextInt(max - min); //이 코드 이해하기
            }
        }
    }

    public void initializeOnes(){
        // element 값을 1로 채우기
        for(int i = 0; i < myRows; i++){
            for(int j = 0; j < myCols; j++){
                myElements[i][j] = 1;
            }
        }
    }

    public void identityMatrix(){
        // Identity matrix 만들기
        for(int i = 0; i < myRows; i++){
            for(int j = 0; j < myCols; j++){
                if(i == j) myElements[i][j] = 1;
            }
        }
    }
    // Guassian Elemination
    public CalcMatrix gebs(CalcMatrix ab){
        int N = ab.myRows;
        for (int k = 0; k < N; k++) 
        {
            /** find pivot row **/
            int max = k;
            for (int i = k + 1; i < N; i++) 
                if (Math.abs(this.myElements[i][k]) > Math.abs(this.myElements[max][k])) 
                    max = i;
 
            /** swap row in A matrix **/    
            int[] temp = this.myElements[k]; 
            this.myElements[k] = this.myElements[max]; 
            this.myElements[max] = temp;
 
            /** swap corresponding values in constants matrix **/
            int t = ab.myElements[k]; 
            ab.myElements[k] = ab.myElements[max]; 
            ab.myElements[max] = t;
 
            /** pivot within A and B **/
            for (int i = k + 1; i < N; i++) 
            {
                int factor = this.myElements[i][k] / this.myElements[k][k];
                ab.myElements[i] -= factor * ab.myElements[k]; // 에러 나는 이유?
                for (int j = k; j < N; j++) 
                    this.myElements[i][j] -= factor * this.myElements[k][j];
            }
        }
    }

    // Back Substitution

    // Guassian Elemination & Back Substitution Verification (검산 - 에러의 표준편차, 평균 등...)


    // Matrix의 곱(Matrix Multiplication)
    public CalcMatrix multiply(CalcMatrix matrix){
        CalcMatrix mulMat = new CalcMatrix(this.myName+"X"+matrix.myName, this.myRows, matrix.myCols);
        if(this.myCols == matrix.myRows){
            for(int i=0;i<this.myRows;i++){
                for(int j=0;j<this.myCols;j++){    
                    for(int k=0;k<matrix.myCols;k++){
                        mulMat.myElements[i][k] += this.myElements[i][j] * matrix.myElements[j][k];
                    }
                }    
            }
        }
        else System.exit(0);
        return mulMat;
        //질문: CalcMatrix mulMat = new CalcMatrix(this.myName+"X"+matrix.myName, this.myCols, matrix.myRows); 이 코드를 if문 안에 쓰는게 논리적으로 맞지만 그러면 return도 if문 안에 넣게 되는데?
    }

    // Matrix 곱 검산 - identity matrix 사용?

    
    // Matrix의 합
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

    // Matrix의 차
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

    // Matrix 계산 evaluation - 아직 안 함. 하기.
    public static void evaluate(CalcMatrix matrix1, CalcMatrix matrix2){
        // 에러? 표준편차? 에러의 평균? 무슨 에러? 못 들음ㅜㅜㅜ
    }

    //toString 메소드 오버라이딩은 불편하니까 그냥 print 메소드 만들어서 출력하기
    public void printMatrix(){
        for(int i = 0; i < this.myRows; i++){
            for(int j = 0; j < this.myCols; j++){
                //System.out.print(Math.round(this.myElements[i][j]*100)/100.0+ " ");
                System.out.print(this.myElements[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(this.myName + "\n" + this.myRows + "X" + this.myCols+"\n");
    }
}
