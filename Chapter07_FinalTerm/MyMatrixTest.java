public class MyMatrixTest {
    public static void main(String[] args){
        MyMatrix matA = new MyMatrix();
        MyMatrix matB = new MyMatrix("B", 4, 8);
        MyMatrix matC = new MyMatrix("C", 3, 6);
    
        matA.printMatrix();

        matB.initializeRandom(-10, 10);
        matB.printMatrix();
        
        matC.initializeOnes();
        matC.printMatrix();
    }
}
