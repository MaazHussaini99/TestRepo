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
public class Problem01 {
    
    
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
    
        int num = 0;
        for (int i = 1; i < n+1; i++) {
            if (isPrime(i) == true) {
                num+=i;
            }
        }
    return num;
    }
    
    //Since in isPrime function we are iterating through 2 to sqrt(n)
    //the complxity for isPrime is O(√n)
    
    //Simce in SumOfPrimes we are iterating from 1 to n+1 the complexity is O(n)
    
    /*but since we are calling isPrime from SumofPrimes in every call,
    after adding both methods we get the complexity of O(n(√n))*/
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
 
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
    
}
