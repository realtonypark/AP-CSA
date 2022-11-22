import java.util.Scanner;

public class Playground {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.nextInt() >= 0){
            int N = sc.nextInt();
            N = (int) Math.pow(3, N);
            char[] arr = new char[N];
            for(int i = 0; i<N; i++){
                arr[i] = '-';
            }
            
            rec(arr, N);
        }
    }

    public static void rec(char[] list, int n) {
        int sum = 0;
        for(char i : list) {
            if(i == '-') {
                sum += 1;
            }
        }
        if(sum==(int) Math.pow(3, n)){
            for(int i = 0; i<list.length; i++){
                System.out.print(i);
            }
            System.out.println();
        }
        else{
            for(int i = sum / 3; i<(sum / 3)*2; i++){
                list[i] = ' ';
            }
            rec(list, n);
        }
		
	}
}