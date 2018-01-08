package project;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class linearSearch {
	static int arr[] = {12,34, 54, 45, 67,78, 56,90,1, 5,6,23,46,78,93,68,23,64,43,91,22,41,93,38,12,34,58,30,121,42,53,57,48,4,7,37,89,12,34, 54, 45, 67,78, 56,90,1, 5,6,23,46,78,93,68,23,64,43,91,22,42,92,31,13,32,51,32,122,43,51,53,45,41,33,82};
    
    /* Recursive Method to search x in arr[l..r] */
    static int recSearch(int arr[], int l, int r, int x)
    {
         if (r < l)
            return -1;
         if (arr[l] == x)
            return l;
         return recSearch(arr, l+1, r, x);
    }
     
    // Driver method
    public static void main(String[] args) 
    {
       int x = 3; 
        long start = System.currentTimeMillis();
       //Method call to find x
       int index = recSearch(arr, 0, arr.length-1, x);
       if (index != -1)
          System.out.println("Element " + x + " is present at index " + 
                                                   index);
       else
           System.out.println("Element " + x + " is not present");
       

       long end = System.currentTimeMillis();
       NumberFormat formatter = new DecimalFormat("#0.00000");
       System.out.print("Execution time is " + formatter.format((end-start)/1000d) + " seconds ");
    
    }

}
