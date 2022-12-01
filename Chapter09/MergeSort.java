public class MergeSort
{
	public static void sortAscending(int[] arr){
        mergeSort(arr, 0, arr.length-1, true);
	}

    public static void sortDescending(int[] arr){
        mergeSort(arr, 0, arr.length-1, false);
    }

    private static void mergeSort(int[] arr, int start, int end, boolean ad){
        if(start < end){
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid, ad);
            mergeSort(arr, mid+1, end, ad);

            if(ad)
                mergeAscending(arr, start, mid, end);
            else
                mergeDescending(arr, start, mid, end);
        }
    }

	private static void mergeAscending(int[] arr, int start, int mid, int end){
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
            temp[i] = arr[i];

        int part1 = start;
        int part2 = mid+1;
        int index = start;

        while(part1 <= mid && part2 <= end){
            if(temp[part1] <= temp[part2]){
                arr[index] = temp[part1];
                part1++;
            }
            else{
                arr[index] = temp[part2];
                part2++;
            }

            index++;
        }

        for(int i = 0; i <= mid - part1; i++)
            arr[index+i] = temp[part1+i];
    }

    private static void mergeDescending(int[] arr, int start, int mid, int end){
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
            temp[i] = arr[i];

        int part1 = start;
        int part2 = mid+1;
        int index = start;

        while(part1 <= mid && part2 <= end){
            if(temp[part1] >= temp[part2]){
                arr[index] = temp[part1];
                part1++;
            }
            else{
                arr[index] = temp[part2];
                part2++;
            }
            
            index++;
        }

        for(int i = 0; i <= mid - part1; i++)
            arr[index+i] = temp[part1+i];
    }
}