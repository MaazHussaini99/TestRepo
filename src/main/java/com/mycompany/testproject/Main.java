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
public class Main {
    
    public static void main(String[] args) {
        
        //Calling Binary Search from BinarySearch
        BinarySearch ob = new BinarySearch();
        int sortedArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = ob.runBinarySearchIteratively(sortedArray, 5, 1, 8);
        System.out.println(num);
        
        
        //Calling getSumePrime from Problem01
        Problem01 pb = new Problem01();
        long num1 = pb.getSumOfPrimes(10);
        System.out.println(num1);
        
        
        //Calling Search from LinearSearch
        LinearSearch ls = new LinearSearch();
        int num2 = ls.search(sortedArray, 5);
        System.out.println(num2);
        
        int unSortedArray[] = {5, 1, 8, 9, 7, 4, 2, 3, 6};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(unSortedArray, unSortedArray.length);
        System.out.println();
        for (int i = 0; i < unSortedArray.length; i++) {
            System.out.print(", " + unSortedArray[i]);
        }
        
        
    }
    
}
