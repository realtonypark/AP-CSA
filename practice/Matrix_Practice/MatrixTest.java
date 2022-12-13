public class MatrixTest {
    public static void main(String[] args){
        //Matrix 만들기, 초기화
        Matrix mat1 = new Matrix();
        mat1.initialize(7);
        mat1.printMat();
        Matrix mat2 = new Matrix(7, 7);
        mat2.identify();
        mat2.printMat();

        //Matrix 사칙연산: 덧셈, 뺄셈, 곱셈 ...
        

    }
}