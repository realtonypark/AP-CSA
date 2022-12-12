public class InsertionSort
{
	public static void sortAscending(int[] a)
	{
        /*
        for(int index = 1 ; index < arr.length ; index++){ // 1.
            int temp = arr[index];
            int prev = index - 1;
            while( (prev >= 0) && (arr[prev] > temp) ) {    // 2.
               arr[prev+1] = arr[prev];
               prev--;
            }
            arr[prev + 1] = temp;                           // 3.
         }
        */

        int size = a.length;
        for (int i = 1; i < size; i++) 
        {
            int key = a[i];
            int j = i - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key < a[j]) 
            {
                a[j + 1] = a[j];
                j--;
            }

            // Place key at after the element just smaller than it.
            a[j + 1] = key;
        }   
	}

	public static void sortDescending(int[] a)
	{
		int size = a.length;

        for (int step = 1; step < size; step++) 
        {
            int key = a[step];
            int j = step - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key > a[j]) 
            {
                a[j + 1] = a[j];
                j--;
            }

            // Place key at after the element just smaller than it.
            a[j + 1] = key;
        }   
	}
}
