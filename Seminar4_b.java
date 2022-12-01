/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.seminar4_b;
//Darvaru Augustin-1221-B-TI-AN-2
/**
 *
 * @author augus
 */
public class Seminar4_b {

    /**
     * Function to search for element.
     * 
     * @var x
     *  Element we're searching for.
     * @return int
     *  Returns index of x if it is present in arr[l..r], else return -1
    */
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
  
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
               return mid;
  
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
               return binarySearch(arr, l, mid-1, x);
  
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid+1, r, x);
        }
  
        // We reach here when element is not present
        //  in array
        return -1;
    }
    
    
    // Driver method to test above.
    public static void main(String args[])
    {
        Seminar4_b ob = new Seminar4_b();
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present.");
        else
            System.out.println("Element found at index " +
                                                 result + ".");
    }
       
}

