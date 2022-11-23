import java.util.Scanner;
public class Playground {
  static int N;
  static int[][] a;
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    a = new int[N][N];
    rec(N);
  }

  public static void rec(int num){
    if(num==1 ||) {
        return;
    }

        //중간꺼 공백으로 바꾸고
    for(int i=start+length/3;i<start+length/3*2;i++) c[i] = ' ';


        //첫번째거 세번째꺼 확인
    dfs(start,length/3);

    dfs(start+length/3*2,length/3);
  }
}