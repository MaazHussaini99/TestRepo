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
public class LinearSearch {
    
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
         
         for (int i = 0; i < n; i++) {
            if(arr[i] == x){
                return i;
            }
        }
         return -1;
    }
    
    /*
    f(n) = n + n + 1 + 1
    f(n) = 2n
    since f(n) = c g(n)
    c1 = 2, g(n) = n
    therfore O(n);
    
    The Big Omega for Linear search could be Omega(1)
    
    The tight bound that is Bog Theta would be Theta(n/2) also can be Theta(n)
    */
    
}
