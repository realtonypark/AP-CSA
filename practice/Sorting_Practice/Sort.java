public class Sort {
    public static void main (String[] args){
        int[] arr = {5, 8, 3, 1, 7, 10, 2, 9, 4, 6, 0};


        Quick.sort(arr);
        System.out.println("...Quick Sort...");
        printArray(arr);
    }

    private static void printArray(int[] a){
        for(int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
}
