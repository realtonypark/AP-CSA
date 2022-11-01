public class CalcMatrixTest {
    public static void main(String[] args){
        CalcMatrix matD = new CalcMatrix("D", 3, 3);
        CalcMatrix matE = new CalcMatrix("E", 3, 3);

        //matD.identityMatrix();
        //matE.identityMatrix();
        matD.initializeRandom(1, 7);
        matE.initializeRandom(1, 7);
        matD.printMatrix();
        matE.printMatrix();

        (matD.multiply(matE)).printMatrix();
    }
}
/*
 * CalcMatrix matA = new CalcMatrix();
        CalcMatrix matB = new CalcMatrix("B", 5, 5);
        CalcMatrix matC = new CalcMatrix("C", 5, 5);
        CalcMatrix matD = new CalcMatrix("D", 4, 3);
        CalcMatrix matE = new CalcMatrix("E", 3, 4);
    
        //matB.initializeRandom(-10, 10);
        //matB.printMatrix();
        //matC.initializeOnes();
        //matC.printMatrix();
        //(matB.add(matC)).printMatrix();
        //(matA.subtract(matB)).printMatrix();

        matD.identityMatrix();
        matE.identityMatrix();
        matD.printMatrix();
        matE.printMatrix();

 */