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

    public void printMat() {
        for(double[] i : this.myMatrix){
            for(double j : i)
                System.out.print((int) j + " ");
            System.out.println();
        }
        System.out.println();
    }

    public void initialize(int x) {
        for(int i = 0; i < this.myMatrix.length; i++){
            for(int j = 0; j < this.myMatrix[i].length; j++){
                this.myMatrix[i][j] = x;
            }
        }
    }

    public void identify(){
        for(int i = 0; i < this.myMatrix.length; i++){
            for(int j = 0; j < this.myMatrix[i].length; j++){
                if(i==j)
                    this.myMatrix[i][j] = 1;
            }
        }
    }
}