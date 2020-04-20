/*
 * Author:Shreyas Mohan
 */
//Java program to perform Merge Sort
import java.util.Scanner;

public class MergeSortProgram {
	
	void mergeSort(int a[]) {
		
		int n,mid;
		
		n=a.length;
		
		if(n<2)
		  return ;
		//Determine the middle position of array
        mid=n/2;
		
		int l[]= new int[mid];
		int r[]=new int[n-mid];
		//Dividing the array into sub arrays
		//Populating the left sub array elements
		for(int i=0;i<mid;i++)
			l[i]=a[i];
		//Populating the right sub array elements
		for(int i=mid;i<n;i++)
			r[i-mid]=a[i];
		 //Recursive call to divide into sub arrays
		 mergeSort(l);
		 mergeSort(r);
		 
		 merge(l,r,a);
		
	}
	//A function to merge two sub arrays l[] and r[] to a single array
	void merge(int l[],int r[],int a[]) {
		
		int nL=l.length;//Length of left array
		int nR=r.length;//Length of right array
		
		int i=0,j=0,k=0;//Counter variables
		
		while(i<nL && j<nR) {
			//To compare the elements between two arrays
			if(l[i]<=r[j]) {
				a[k]=l[i];
				i=i+1;
				}
			else {
				a[k]=r[j];
				j=j+1;
			}
			k=k+1;
		}
		//To merge the remaining elements of left array
		while(i<nL) {
			a[k]=l[i];
			i=i+1;
			k=k+1;
			
		}
		//To merge the remaining elements of right array
		while(j<nR) {
			a[k]=r[j];
			j=j+1;
			k=k+1;
		}
	}
	
	/* A function to display a given array */
	static void displayArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.println(arr[i] + " "); 
		System.out.println(); 
	} 
	//Main Program
	public static void main(String args[]) {
		
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
				
		        //Display the input array
				System.out.println("Given Array"); 
				displayArray(arr); 
				//int len=10000;
				/*int arr[]=new int[100000];
				for(int i=0;i<100000;i++)
				{
					arr[i]=i+1;
				}*/
				//Start Timer
				long startTime = System.nanoTime();
		        //Pass the array to the sorting method
				MergeSortProgram ms = new MergeSortProgram(); 
				ms.mergeSort(arr);
				//End Timer
				long endTime   = System.nanoTime();
				//Calculate execution time
				long totalTime = endTime - startTime;
				System.out.println("Execution time taken: "+totalTime+"ns");
				//Display the sorted array
				System.out.println("\nSorted array"); 
				displayArray(arr); 
				System.out.println("Execution time taken: "+totalTime+"ns");
				scanner.close();
	}

}
