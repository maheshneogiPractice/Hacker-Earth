package com.mahesh.data_structures.arrays.OneD;

import java.util.Scanner;

public class Monk_and_lucky_minimum_E {
	
	/* solution using hashmap (bit slower)
    private static void checkIfLucky(int n, int[] inputArray)
    {
        Map<Integer, Integer> frequency = new HashMap<>();
    	int min = Integer.MAX_VALUE;
    	for(int i=0; i<n; i++)
    	{
    		int temp = 1;
    		int currentItem = inputArray[i];
    		if(inputArray[i]<=min)
    		{
    			min = currentItem;
    		}
    		if(frequency.containsKey(currentItem))
    		{
    			temp = frequency.get(currentItem)+1;
    		}
    		
    			frequency.put(currentItem, temp);
    		
    	}
    
    	if(frequency.get(min)%2!=0)
    	{
    		System.out.println("Lucky");
    	}
    	else
    	{
    		System.out.println("Unlucky");
    	}
    	
    }
	*/
	
    
    private static void checkIfLucky(int n, int[] inputArray)
    {
	        
	    	int min = Integer.MAX_VALUE;
	    	int currentItem =0; 
	    	int count = 0;
	    	for(int i=0; i<n; i++)
	    	{	
	    		currentItem = inputArray[i];
	    		if(currentItem==min)
	    			count = count+1;
	    		else if(currentItem<=min)
	    		{
	    			min = currentItem;
	    			count = 1;
	    		}
	    		
	    	}
	    
	    	if(count%2!=0)
	    	{
	    		System.out.println("Lucky");
	    	}
	    	else
	    	{
	    		System.out.println("Unlucky");
	    	}
	    	
	    }
    public static void main(String args[] ) throws Exception {

        //Scanner
        Scanner s = new Scanner(System.in);
        int numOfTestCases = s.nextInt();
        
        for(int i=0; i<numOfTestCases; i++){
            int n = s.nextInt();
            int[] inputArray = new int[n];
            for(int j=0; j<n; j++)
            {
                inputArray[j] = s.nextInt();
                
            }
            checkIfLucky(n, inputArray);
            
        }

    }
}
