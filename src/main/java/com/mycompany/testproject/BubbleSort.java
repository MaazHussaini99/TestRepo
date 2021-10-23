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
public class BubbleSort {
    
    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                if (a[inner] > a[inner+1])
                {
                    // swap arr[j+1] and arr[j]
                    temp = a[inner];
                    a[inner] = a[inner+1];
                    a[inner+1] = temp;
                }
            }
        }
    }
    
}

//since f(n) = 1 + n*n the time complexity will be O(n^2)
