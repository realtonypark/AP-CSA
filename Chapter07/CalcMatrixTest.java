public class CalcMatrixTest {
    public static void main(String[] args){
        CalcMatrix matA = new CalcMatrix();
        CalcMatrix matB = new CalcMatrix("B", 5, 5);
        CalcMatrix matC = new CalcMatrix("C", 5, 5);
    
        matB.initializeRandom(-10, 10);
        matB.printMatrix();
        matC.initializeOnes();
        matC.printMatrix();

        (matB.add(matC)).printMatrix();
        (matA.subtract(matB)).printMatrix();

        
    }
}
