public class Quick {
    public static void sort(int[] arr){
        quickSortA(arr, 0, arr.length-1);
	}

    public static void quickSortA(int[] a, int start, int end){
        if(start >= end)
			return;

        int p = partition(a, start, end);
        quickSortA(a, start, p-1);
        quickSortA(a, p, end);
	}

    static int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
        }

    /*
    private static int partition(int[] arr, int d, int u){
        int down = d;
        int up = u;
        int pivot = arr[u];
        while(down<up){
            while(arr[down]<pivot && down<up)
                down++;
            while(arr[up]>=pivot && down<up)
                up--;
            swap(arr, down, up);
        }
        swap(arr, u, down);
        return down;
    }
    */

    
    
    private static void swap(int[] ad, int i, int j) {
		int temp = ad[i];
		ad[i] = ad[j];
		ad[j] = temp;
	}
}