import java.util.ArrayList;

public class Ex12 {
    public static void main(String[] args){
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(2);
        arr1.add(1);
        arr1.add(4);

        int[] arr2 = new int[] {5, 0, 3};

        for(int i = 0; i < getProducts(arr1, arr2).length ; i++){
            System.out.println(getProducts(arr1, arr2)[i]);
        }
    }

    public static int[] getProducts(ArrayList<Integer> list, int[] arr){
        int max, min;
        if(list.size() < arr.length){
            max = arr.length;
            min = list.size();
            int[] prodArray = new int[max];

            for(int i = 0; i < min; i++){
                prodArray[i] = list.get(i) * arr[i];
            }

            for(int i = min; i < max; i++){
                prodArray[i] = arr[i];
            }
            return prodArray;
        }

        else{
            min = arr.length;
            max = list.size();
            int[] prodArray = new int[max];

            for(int i = 0; i < min; i++){
                prodArray[i] = list.get(i) * arr[i];
            }

            for(int i = min; i < max; i++){
                prodArray[i] = list.get(i);
            }
            return prodArray;
        }


    }
}
