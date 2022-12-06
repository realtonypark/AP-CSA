public class Sort {
    public static void main (String[] args){
        int[] arr = {5, 8, 3, 1, 7, 10, 2, 9, 4, 6};

        Selection.sort(arr);
        System.out.println("...Selection Sort...");
        printArray(arr);

        Insertion.sort(arr);
        System.out.println("...Insertion Sort...");
        printArray(arr);

        Merge.sort(arr);
        System.out.println("...Merge Sort...");
        printArray(arr);
    }

    private static void printArray(int[] a){
        for(int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
}
