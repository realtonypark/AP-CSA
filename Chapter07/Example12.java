import java.util.ArrayList;

public class Example12{
    public static void main(String[] args){
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(1);
        x.add(2);
        x.add(3);
        int[] y = {1, 2, 3, 4, 5};

        for(int i=0; i<getProducts(x, y).length; i++)
            System.out.println(getProducts(x, y)[i]);
    }

    public static int[] getProducts(ArrayList<Integer> list, int[] arr){
        int[] prodArr;
        if(list.size() > arr.length)
        {
            int max = list.size();
            int min = arr.length;
            prodArr = new int[max];

            for(int i = 0; i < min; i++)
                prodArr[i] = list.get(i) * arr[i];
            for(int i = min; i < max; i++)
                prodArr[i] = list.get(i);
        }
        else
        {
            int min = list.size();
            int max = arr.length;
            prodArr = new int[max];

            for(int i = 0; i < min; i++)
                prodArr[i] = list.get(i) * arr[i];
            for(int i = min; i < max; i++)
                prodArr[i] = arr[i];
        }

        return prodArr;
    }
}