public class ArrayP {
    public static void main(String[] arags){
        int[] arr1 = new int[] {1, 2, 3, 4};
        
        /*
        for (int i = 0; i < arr1.length ; i++){
            System.out.println(arr1[i]);
        }
        */

        for (int i : arr1){
            System.out.print(i + " ");
        }
        
        System.out.println();

        for (int i : arr1){
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();
        
        for (int i = arr1.length-1; i >= 0; i--){
            System.out.println(arr1[i]);
        }

        System.exit(0);
    }
}
