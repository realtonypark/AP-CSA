import java.util.*;

public class SortTest
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int size;
		int[] array;

		if(args.length == 0)
			size = 10;
		else
			size = Integer.parseInt(args[0]);

		array = new int[size];
		for(int i = 0; i < array.length; i++)
			array[i] = i + 1;
		//printArray(array);

		randomInitialize(array, rand);
		//printArray(array);
		//System.out.println();

		/*
		System.out.println("Selection Sort...");
		SelectionSort.sortAscending(array);
		printArray(array);
		SelectionSort.sortDescending(array);
		printArray(array);
		System.out.println();

		System.out.println("Insertion Sort...");
		InsertionSort.sortAscending(array);
		printArray(array);
		InsertionSort.sortDescending(array);
		printArray(array);
		System.out.println();
		*/
		
		System.out.println("Merge Sort...");
		MergeSort.sortAscending(array);
		printArray(array);
		MergeSort.sortDescending(array);
		printArray(array);

		System.out.println("Quick Sort...");
		//int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//QuickSort.sort(a);
		//printArray(a);
		//QuickSort.sort(array);
		//printArray(array);
		QuickSort.sortAscending(array);
		printArray(array);
		QuickSort.sortDescending(array);
		printArray(array);

/*
		randomInitialize(array, rand);
		printArray(array);
		InsertionSort.sort(array);
		printArray(array);
		
		randomInitialize(array, rand);
		printArray(array);
*/
	}

	public static void randomInitialize(int[] a, Random rand)
	{
		rand = new Random(1);
		for(int i = a.length - 1; i > 0; i--)
		{
			int swap = rand.nextInt(i);
			int temp = a[i];
			a[i] = a[swap];
			a[swap] = temp;
		}
	}

	public static void printArray(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.print("[" + a[i] + "] ");
//			if((i + 1) % 10 == 0) System.out.println();
		}
		System.out.println();
	}
}
