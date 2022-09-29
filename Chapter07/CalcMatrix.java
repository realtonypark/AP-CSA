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
        myRows = 10;
        myCols = 10;
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
        for(int i = 0; i < myRows; i++){
            for(int j = 0; j < myCols; j++){
                myElements[i][j] = (int) (Math.random() * (max - min)) + min;
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

    public static void add(CalcMatrix matrix1, CalcMatrix matrix2){
        CalcMatrix addedMat = new CalcMatrix(matrix1.myName+"+"+matrix2.myName, matrix1.myRows, matrix1.myCols);
        if(matrix1.myRows == matrix2.myRows && matrix1.myCols == matrix2.myCols){
            for(int i = 0; i < addedMat.myRows; i++){
                for(int j = 0; j < addedMat.myCols; j++){
                    addedMat.myElements[i][j] = matrix1.myElements[i][j] + matrix2.myElements[i][j];
                }
            }
        }
        else System.exit(0);
    }

    public static void subtract(CalcMatrix matrix1, CalcMatrix matrix2){
        CalcMatrix subtractedMat = new CalcMatrix(matrix1.myName+"+"+matrix2.myName, matrix1.myRows, matrix1.myCols);
        if(matrix1.myRows == matrix2.myRows && matrix1.myCols == matrix2.myCols){
            for(int i = 0; i < subtractedMat.myRows; i++){
                for(int j = 0; j < subtractedMat.myCols; j++){
                    subtractedMat.myElements[i][j] = matrix1.myElements[i][j] - matrix2.myElements[i][j];
                }
            }
        }
        else System.exit(0);
    }

    public void evaluate(){

    }

    //toString 메소드 오버라이딩은 불편하니까 그냥 print 메소드 만들어서 출력하기
    public static void printMatrix(CalcMatrix matrix){
        for(int i = 0; i < matrix.myRows; i++){
            for(int j = 0; j < matrix.myCols; j++){
                System.out.print(matrix.myElements[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(matrix.myName + "\n" + matrix.myRows + "X" + matrix.myCols);
    }
}
