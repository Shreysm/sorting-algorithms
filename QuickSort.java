/*
 * Author:Shreyas Mohan
 
 */
//Java program to perform Quick Sort
import java.util.Scanner;
 
class QuickSort 
{ 
	/* This function takes first element as pivot, 
	places the pivot element at its correct 
	position in sorted array, and places all 
	smaller (smaller than pivot) to left of 
	pivot and all greater elements to right 
	of pivot */
	int partition(int arr[], int low, int high) 
	{ 
		//First element is initialized as pivot
		int pivot = arr[low]; 
		int start=low;
		int end=high;
		while(start<end) 
		{ 
			while(arr[start]<=pivot && start<end) {
				start=start+1;
			}
			
			while(arr[end]>pivot) {
				end=end-1;
			}
			
			if (start<end) 
			{ 
				// Swap arr[start] and arr[end] 
				int temp = arr[start]; 
				arr[start] = arr[end]; 
				arr[end] = temp; 
			} 
		} 

		// swap arr[low] and arr[end] (or pivot)
		arr[low]=arr[end];
		arr[end] = pivot; 
        //Return the partitioning index
		return end; 
	} 


	/* The sorting function that implements QuickSort() 
	arr[] --> Array to be sorted, 
	low --> Starting index, 
	high --> Ending index */
	void quicksort(int arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			/* pi is partitioning index, arr[pi] is 
			now at right place */
			int pi = partition(arr, low, high); 

			// Recursively sort elements before partition and after partition 
			quicksort(arr, low, pi-1); 
			quicksort(arr, pi+1, high); 
		} 
	} 

	/* A function to print array  */
	static void printArray(int arr[]) 
	{ 
		long n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.println(arr[i]+" "); 
		System.out.println(); 
	} 

	// Main program 
	public static void main(String args[]) 
	{ 
		//Read the input from user
		System.out.println("Enter the length of array");
		Scanner scanner = new Scanner(System.in);
		
		int len=scanner.nextInt();
		int arr[] =new int[len];
		System.out.println("Enter the elements of array");
		for(int i=0;i<len;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		/*int len=10000;
		int arr[]=new int[10000];
		for(int i=0;i<10000;i++)
		{
			arr[i]=i+1;
		}*/
        //Display the input array
		System.out.println("Given Array"); 
		printArray(arr); 
		//Pass the array to sorting method
		//Start Timer
		long startTime = System.nanoTime();
		QuickSort quick = new QuickSort(); 
		quick.quicksort(arr, 0, len-1);
		//End Timer
		long endTime   = System.nanoTime();
		//Calculate execution time
		long totalTime = endTime - startTime;
		
        //Display the sorted array
		System.out.println("Sorted array"); 
		printArray(arr); 
		System.out.println("Execution time taken: "+totalTime+"ns");
		scanner.close();
	} 
} 

