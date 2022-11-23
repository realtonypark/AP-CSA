import java.util.Scanner;
public class Sentence {
    //백준 25501번 - 재귀의 귀재
    static int num;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            num = 0;
            String s = sc.next();
            System.out.print(isPalindrone(s) + " " + num);
            System.out.println();
        }
    }

    public static int isPalindrone(String s){
      return rec(s, 0, s.length()-1);
    }
    public static int rec(String q, int start, int end){
        num++;
        if(start>=end){
            return 1;
        }
        else{
            String first = q.substring(start, start+1);
            String last = q.substring(end, end+1);
            if (first.equals(last)){
                return rec(q, start+1, end-1);
            }
            else
                return 0;
        }

    }
}