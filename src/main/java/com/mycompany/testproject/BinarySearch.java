/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testproject;

/**
 *
 * @author maazh
 */
public class BinarySearch {
    
    
    
    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 
    
}
/*
First Iteration,
Length of array = n

Second Iteration,
Length of array = n⁄2

Third Iteration,
Length of array = (n⁄2)⁄2 = n⁄2^2


Kth Iteration, 
Length of array = n⁄2^k
        
Length of array = n⁄2^k=1
=> n = 2^k
=> k = log2 (n)
O(Log n)

The Space complexity is O(1) since only one element is worked on at a time.
*/