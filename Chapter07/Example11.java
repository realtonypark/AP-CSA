import java.util.ArrayList;

public class Example11 {
    public static void main(String[] args){
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(1);
        x.add(2);
        x.add(3);
        int[] y = {1, 2, 3, 4, 5};

        System.out.println(getProductSum(x, y));
    }

    public static int getProductSum(ArrayList<Integer> list, int[] arr){
        int min = Math.min(list.size(), arr.length);
        int sum = 0;

        for(int i = 0; i < min; i++){
            sum += list.get(i) * arr[i];
        }

        return sum;
    }
}
