public class arrayExp {
    public static void main(String[] args){
        int row = 4;
        int col = 8;
        int[][] arr1 = new int[row][col];
        int num =1;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr1[i][j] = num++;
                //System.out.print(arr1[i][j]+ " ");
            }
            //System.out.println();
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
/*
    1 2 3 4 5 6 7 8 
    9 10 11 12 13 14 15 16 
    17 18 19 20 21 22 23 24 
    25 26 27 28 29 30 31 32 
 */
