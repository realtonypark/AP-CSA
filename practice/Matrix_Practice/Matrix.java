public class Matrix {
    public double[][] myMatrix;
    public int myRows;
    public int myCols;

    public Matrix() {
        myRows = 10;
        myCols = 10;
        myMatrix = new double[myRows][myCols];
    }

    public Matrix(int row, int col) {
        myRows = row;
        myCols = col;
        myMatrix = new double[myRows][myCols];
    }
    
    //Matrix 출력
    public void printMat() {
        for(double[] i : this.myMatrix){
            for(double j : i)
                System.out.print((int) j + " ");
            System.out.println();
        }
        System.out.println();
    }

    //Matrix 초기화
    public void initialize(int x) {
        for(int i = 0; i < this.myMatrix.length; i++){
            for(int j = 0; j < this.myMatrix[i].length; j++){
                this.myMatrix[i][j] = x;
            }
        }
    }

    //Identity matrix 만들기
    public void identify(){
        for(int i = 0; i < this.myMatrix.length; i++){
            for(int j = 0; j < this.myMatrix[i].length; j++){
                if(i==j)
                    this.myMatrix[i][j] = 1;
            }
        }
    }

    //Matrix 덧셈
    public Matrix add(Matrix a){
        Matrix x = new Matrix(this.myRows, this.myCols);
        if(this.myRows == a.myRows && this.myCols == a.myCols){
            for(int i = 0; i < this.myRows; i++){
                for(int j = 0; j < this.myCols; j++){
                    x.myMatrix[i][j] = this.myMatrix[i][j] + a.myMatrix[i][j];
                }
            }    
        }
        else System.exit(0);
        return x;
    }
    
    public Matrix subtract(Matrix a){
        Matrix x = new Matrix(this.myRows, this.myCols);
        if(this.myRows == a.myRows && this.myCols == a.myCols){
            for(int i = 0; i < this.myRows; i++){
                for(int j = 0; j < this.myCols; j++){
                    x.myMatrix[i][j] = this.myMatrix[i][j] - a.myMatrix[i][j];
                }
            }    
        }
        else System.exit(0);
        return x;
    }

    public Matrix multiply(Matrix a){
        Matrix x = new Matrix(this.myRows, this.myCols);
        if(this.myRows == a.myRows && this.myCols == a.myCols){
            for(int i = 0; i < this.myRows; i++){
                for(int j = 0; j < this.myCols; j++){
                    x.myMatrix[i][j] = this.myMatrix[i][j] - a.myMatrix[i][j];
                }
            }    
        }
        else System.exit(0);
        return x;
    }
}