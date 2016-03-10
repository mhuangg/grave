//Mei Huang
//APCS2-pd 10
//HW#09 - Mergers and Acquisitions
//03-07-16

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: 
If the list has one item, then it is sorted. 
if the list has more than one item, then it is split in half into separate list until each of the lists are sorted. 
Once there is only item left, the card is given back to the list that it came from and compared. The smaller card will begin the list. 
The counter will increase as well as the corresponding index of the two cards being compared. 
Once two list is merged again, the comparing of the two separate lists will take place until sorted and then both lists will be passed to where it came from. 
Sorting: The first index is compared to the first index of the other -- then smaller one will be placed in a new list in the first index. 
The counter of the indices will increase accordingly until the full length of the list is exhausted. 
Again, this passes through until the original set has been sorted or again the length of a+b is 1. 



  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b )
    {
	int[] merged = new int [a.length + b.length];
	int c1 = 0;
	int c2 = 0;
	int i = 0;//index for merge list
	while (c1 != a.length && c2 != b.length) { //checks for smaller
	    if (a[c1] < b[c2]) { 
		    merged[i] = a[c1];
		    c1++;
		    i++;
		}
		else {
		    merged[i] = b[c2];
		    c2++;
		    i++;
		}
		}
	    if (c1 == a.length) {
		for (int k = i; k < merged.length;k++) {
		    merged[k] = b[c2];
		    c2++;
		}
	    }
	    else {
		for (int k = i; k < merged.length; k++) {
		    merged[k] = a[c1];
		    c1++;
		}
	    }
	    return merged;
    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) 
    {
	if (arr.length == 1) {
	    return arr;
	}
	else {
	    int[] list1 = new int[arr.length/2];
	
	for (int i = 0; i < list1.length; i++) {
	    list1[i] = arr[i];
	}
	int[] list2 = new int[arr.length - arr.length/2];
	for (int i = 0; i < list2.length; i++) {
	    list2[i] = arr[arr.length/2 + i];
	}
	arr = merge(sort(list1), sort(list2));
    }
    return arr;

    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
	
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {


	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};

	System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	mess(arr3);
	printArray( arr3 );

	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );

	System.out.println("\nMerging arr4 and arr6: ");
	printArray( merge(arr4,arr6) );

	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );

    }//end main()

}//end class MergeSort
