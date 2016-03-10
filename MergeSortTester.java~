/*======================================
  class MergeSortTester

  ALGORITHM:
  Divide unsorted array into n partitions or levels until each array contains one element. 
  Repeatedly merge each of the sublists in order from smallest to greatest level by level until full array has been sorted. 
 
  BIG-OH CLASSIFICATION OF ALGORITHM:
  nlog(n) 
 
  Mean execution times for dataset of size n: in nanoseconds
  Batch size: 1000 times 
  n=10       time: 1563
  n=100      time: 11927
  n=1000     time: 131602
  n=10000    time: 1297424
  n=100000  time: 14087948

  ANALYSIS:
  10 - 1000 - expect 200 times, get ~87 times
  100 - 10000 - expect 200 times, get ~108 times
  10000 - 100000 - expect 12.5 times, get ~11 times.
  For small datasets, the trend is hardly followed, but we approach nlogn ratios as we reach
  into the hundred thousands.
  ======================================*/

public class MergeSortTester 
{
   public static long test(int n, int i){
      	long timeSum = 0;
      	for (int k = 0; k < i; k++){
      	    int[] arr = new int[n];
      	    for (int j = 0; j < n; j++){
      		arr[j] = (int)(n * 10 * Math.random());
      	    }
      	    long start = System.nanoTime();
      	    int[] a = MergeSort.sort(arr); 
      	    long end = System.nanoTime();
      	    timeSum += end - start;
      	}
      	return timeSum / i;
    }
    
    public static void main(String[] args){
	    System.out.println("Average time: " + test(10, 1000));
		  System.out.println("Average time: " + test(100, 1000));
	    System.out.println("Average time: " + test(1000, 1000));
		  System.out.println("Average time: " + test(10000, 1000));
		  System.out.println("Average time: " + test(100000, 1000));
    }
    
    /******************************
     * execution time analysis 
     * Generate a new array of size requested for each iteration
     * Populate with elements that sort of grow w/ array size (doesn't really matter)
     * Record time to sort.
     * Average time over all iterations.
     ******************************/

}//end class
