public class ArrayP {
    public static void main(String[] arags){
        int[] arr1 = new int[] {1, 2, 3, 4, 0};
        int[] arr2 = {5, 7, 2, 7, 9};

        int[] sample = new int[52];
        System.out.println(sample.length);

        System.out.println(findMinsIndex(arr1));

        swapArrays(arr1, arr2);
        for(int i : arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : arr2){
            System.out.print(i+" ");
        }
        System.out.println();

        int[] arr3 = returnSwappedArrays(arr1, arr2);
        for(int i : arr3){
            System.out.print(i+" ");
        }


        /*
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

        //System.exit(0);
        */
    }
    public static int findMinsIndex(int[] arr){
        int min = arr[0];
        int minIndex = 0;
        for(int i=1; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swapArrays(int a1[], int a2[]){
        int[] temp = new int[a1.length];
        for(int i = 0; i < a1.length; i++){
            temp[i] = a1[i];
            a1[i] = a2[i];
            a2[i] = temp[i];
        }
    }

    public static int[] returnSwappedArrays(int a1[], int a2[]){
        int[] temp = new int[a1.length];
        for(int i = 0; i < a1.length; i++){
            temp[i] = a1[i];
            a1[i] = a2[i];
            a2[i] = temp[i];
        }
        return a1;
    }
}