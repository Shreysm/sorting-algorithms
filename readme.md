# Sorting

Programming Language : Java
Source Code:MergeSortProgram,QuickSort

### Steps to compile and execute:

In command line,

javac MergeSortProgram.java QuickSort.java

java MergeSortProgram

or

java QuickSort

Example

Enter the length of array
10
Enter the elements of array
10 9 8 4 2 5 1 3 3 3
Given Array
10 
9
8 
4 
2 
5 
1 
3 
3 
3 

Sorted array
1 
2 
3 
3 
3 
4 
5 
8 
9 
10
Execution time taken: 19478ns 
##	Merge Sort Explanation

Methods:

•	mergeSort(int a[])- Array is passed as an argument. The array is divided into two sub arrays based on the middle index.  This is a recursive method. After all the elements are divided until there are two elements left in sub array, merge() method is called.
 
•	merge(int l[],int r[],int a[])- Two sub arrays and the array is passed as arguments to this method. The elements of left and right most sub array are compared and sorted. The sorted elements are stored in the merged array a[].
 
•	main() – It takes the length and array elements input from the user. It passes the array to the mergeSort() method and displays the sorted array with the execution time taken.

##Quick Sort Explanation

Methods:

•	partition(int arr[],int low, int high)- It takes array, starting and ending position of array as arguments. This method takes the first element as pivot,  the pivot at its correct position ,places all smaller elements to left of the pivot and all greater elements to right of the pivot.
 
•	quicksort()- It recursively sorts the elements before the partition index and elements after the partition index.
 
•	main()– It takes the length and array elements input from the user. It passes the array to the partition() method and displays the sorted array with the execution time taken.
