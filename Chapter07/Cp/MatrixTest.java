public class MatrixTest {
    public static void main(String[] args){
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix(10, 10, 1.5);
        Matrix m3 = new Matrix();

        m1.printMatrix();
        m2.printMatrix();
        m3.printMatrix();

        m1.fivesInitialize();
        m1.printMatrix();

        m3.randomInitialize(10, 20);
        m3.printMatrix();
    }
}
