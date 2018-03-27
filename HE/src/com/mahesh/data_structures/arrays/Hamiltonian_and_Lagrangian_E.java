package com.mahesh.data_structures.arrays;

import java.util.Scanner;

public class Hamiltonian_and_Lagrangian_E {

    
    private static void printSol(int[] inputArray, int n)
    {
           	for(int i=0; i<n; i++)
    	{
    		int temp = inputArray[i];
    		boolean ans = true;
    		for(int j=i+1; j<n; j++)
    		{
    			if(temp<inputArray[j])
    			{
    			ans = false;
    			break;
    			}
    		}
    		if(ans)
    		{
    			System.out.print(temp);
    			if(i!=n-1)
    			{
    				System.out.print(" ");
    			}
    		}
    	}
    }
    
    public static void main(String args[] ) throws Exception {
 
        //Scanner
        Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int[]  inputArray= new int[n];
       for(int i =0; i<n; i++)
       {
           inputArray[i] = s.nextInt();
       }
        
        printSol(inputArray, n);

    }


}
