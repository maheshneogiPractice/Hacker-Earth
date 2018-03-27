package com.mahesh.data_structures.arrays.OneD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hamiltonian_and_Lagrangian_E {

    
    private static void printSol(int[] inputArray, int n)
	{
    	int max=0;
    	List<Integer>ans = new ArrayList<>();
		for (int i = n - 1; i >= 0; i--) {
			if(inputArray[i]>= max)
			{
				ans.add(inputArray[i]);
				max = inputArray[i];
			}
		}
		
		for(int i=ans.size()-1; i>=0;i--)
		{
			System.out.print(ans.get(i)+" ");
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
