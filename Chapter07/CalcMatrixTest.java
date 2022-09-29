public class CalcMatrixTest {
    public static void main(String[] args){
        CalcMatrix matA = new CalcMatrix();
        CalcMatrix matB = new CalcMatrix("B", 5, 5);
        CalcMatrix matC = new CalcMatrix("C", 5, 5);
    
        matB.initializeRandom(-10, 10);
        matC.initializeOnes();

        CalcMatrix.add(matB, matC);
        CalcMatrix.subtract(matB, matC);
        
        
    }
}
