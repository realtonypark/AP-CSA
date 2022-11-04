public class CalcMatrixTest {
    public static void main(String[] args){
        //CalcMatrix matA = new CalcMatrix("A", 2, 4);
        //CalcMatrix matB = new CalcMatrix("B", 4, 3);
        CalcMatrix matC = new CalcMatrix("C", 3, 3);
        //CalcMatrix b = new CalcMatrix("b", 3, 1);
        double[] b = new double[] {2, -1, 4};

        //matA.initializeRandom(-5, 5);
        //matB.initializeRandom(-5, 5);
        //matA.printMatrix();
        //matB.printMatrix();
        //(matA.multiply(matB)).printMatrix();

        matC.initializeRandom(-5, 5);
        matC.printMatrix();
        //b.initializeRandom(-5, 5);
        //(matC.gebs(b)).printMatrix();
        matC.gebs(b);
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