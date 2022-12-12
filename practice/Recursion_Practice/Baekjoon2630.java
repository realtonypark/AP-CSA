import java.util.Scanner;

public class Baekjoon2630 {
    static int[][] arr;
    static int white;
    static int blue;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N][N];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();
        }
        partition(0, 0, N);
        System.out.println(white);
        System.out.println(blue);
    }

    private static void partition(int row, int col, int size){

        if(color(row, col, size)){
            if(arr[row][col] == 0)
                white++;
            else
                blue++;
            //return;
        }
        else{
            int newSize = size/2;
            partition(row, col, newSize);
            partition(row, col+newSize, newSize);
            partition(row+newSize, col, newSize);
            partition(row+newSize, col+newSize, newSize);
        }

    }

    private static boolean color(int row, int col, int size){
        int s = arr[row][col];
        for(int i = row; i < row+size; i++){
            for(int j = col; j < col+size; j++)
                if(arr[i][j] != s)
                    return false;
        }
        return true;
    }
}
