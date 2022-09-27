public class arrayPrac {
    public static void printMatrix(int[][] matrix){
        for (int[] row : matrix){
            for (int i : row){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int row = 4;
        int col = 8;
        int[][] arr1 = new int[row][col];
        int num =1;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr1[i][j] = num++;
            }
        }

        printMatrix(arr1);
    }
}
