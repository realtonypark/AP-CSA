public class MyMatrixTest {
    public static void main(String[] args){
        MyMatrix matA = new MyMatrix();
        MyMatrix matB = new MyMatrix("B", 4, 8);
        MyMatrix matC = new MyMatrix("C", 3, 6);
    
        for(int i = 0; i < matA.myRows ; i++){
            for(int j = 0; j < matA.myCols; j++){
                System.out.print(matA.myElements[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(matA);

        matB.initializeRandom(-10, 10);
        for(int i = 0; i < matB.myRows; i++){
            for(int j = 0; j < matB.myCols; j++){
                System.out.print(matB.myElements[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(matB);

        matC.initializeOnes();
        for(int i = 0; i < matC.myRows; i++){
            for(int j = 0; j < matC.myCols; j++){
                System.out.print(matC.myElements[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(matC);
    }
}
