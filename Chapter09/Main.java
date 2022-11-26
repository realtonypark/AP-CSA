import java.util.Scanner;

//백준 재귀 5956
class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    System.out.println(rec(N, M, 0, 1));
    //rec(N, M);
    //System.out.println();
  }

  public static int rec(int row, int col, int sum, int num) {
    if (row % 2 == 0 || col % 2 == 0) {
      return sum;
    } else if (row == 1 || col == 1) {
      sum += num;
      num *= 4;
      return sum;
    } else {
      sum += num;
      num *= 4;
      return rec(row / 2, col / 2, sum, num);
    }
  }
}