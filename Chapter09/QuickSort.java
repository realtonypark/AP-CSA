public class QuickSort {
    public static void sortAscending(int[] arr){
        quickSort(arr, 0, arr.length-1);
	}

    public static void quickSort(int[] a, int start, int end){
        if(start >= end)
			return;

        int p = partition(a, start, end);
        quickSort(a, start, p-1);
        quickSort(a, p+1, end);    
	}

    private static int partition(int[] arr, int d, int u){
        int down = d;
        int up = u;
        int pivot = arr[d];
        while(down<up){
            while(arr[up]>pivot && down<up){
                up--;
                //System.out.println(up);
            }
            while(arr[down]<=pivot && down<up){
                down++;
                //System.out.println(d);
                //System.out.println(down);
            }
            swap(arr, down, up);
        }
        swap(arr, d, down);
        return down;
    }

    private static void swap(int[] ad, int i, int j) {
		int temp = ad[i];
		ad[i] = ad[j];
		ad[j] = temp;
	}
}