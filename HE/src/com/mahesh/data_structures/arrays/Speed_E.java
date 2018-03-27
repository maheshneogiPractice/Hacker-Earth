package com.mahesh.data_structures.arrays;

import java.util.Scanner;

public class Speed_E {
    
    private static void printSol(int numOfCars, int[] speedArray)
    {
        int max = Integer.MAX_VALUE;
        int count = 0;
        for(int currentSpeed : speedArray){
            if(currentSpeed<=max)
            {
                count++;
                max = currentSpeed;
            }
        }
        System.out.println(count);
    }
    
    public static void main(String args[] ) throws Exception {
        
        
        Scanner s = new Scanner(System.in);
        int numOfTestCases = s.nextInt();
        
        for(int i=0; i<numOfTestCases; i++){
            int numOfCars = s.nextInt();
            int[] speedArray = new int[numOfCars];
            for(int j=0; j<numOfCars; j++)
            {
                speedArray[j] = s.nextInt();
            }
            
            printSol(numOfCars, speedArray);
        }


    }
}
