public class QuickSort {
    public static void sortAscending(int[] arr){
        quickSortA(arr, 0, arr.length-1);
	}
    public static void sortDescending(int[] arr){
        quickSortD(arr, 0, arr.length-1);
	}

    public static void quickSortA(int[] arr, int left, int right){
        if(left<right){
            int pivot = (right-left)/2;

             do{
                while(arr[left]< arr[pivot])
                    left++;

                while(arr[right]>arr[pivot])
                    right--;

                if(left<=right){
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }

                } while(left<=right);

        quickSort(arr, left, pivot-1);
        quickSort(arr, pivot+1, right);
        }
	}

    public static void quickSortD(int[] arr, int left, int right){
        if(left<right){
            int pivot = (right-left)/2;

             do{
                while(arr[left]> arr[pivot])
                    left++;

                while(arr[right]<arr[pivot])
                    right--;

                if(left<=right){
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }

                } while(left<=right);

        quickSort(arr, left, pivot-1);
        quickSort(arr, pivot+1, right);
        }
	}
}
