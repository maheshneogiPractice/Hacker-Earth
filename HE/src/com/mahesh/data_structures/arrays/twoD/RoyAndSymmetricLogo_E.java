package com.mahesh.data_structures.arrays.twoD;

import java.util.Scanner;

public class RoyAndSymmetricLogo_E {
	
	
	private static boolean checkForRow(int[][]input, int row) {
		int colNum = input[0].length;
		for(int i=0; i<(colNum/2); i++)
		{
			if(input[row][i]!=input[row][colNum-1-i])
				return false;
		}
		
		return true;
	}
	
	private static void checkForSymmetry(int[][] input) {
		int rowC = input.length;
		int colC = input[0].length;
		
		for(int i=0; i<rowC/2; i++)
		{
			for(int j=0; j<colC; j++)
			{
				//check if x-axis is symmetric
				//i.e check if  0th row is same as 4th row and 1st is same as 3rd etc
				if(input[i][j] != input[rowC-1-i][j])
				{
					System.out.println("NO");
					return;
				}
				
				
			}
			//check if y-axis is symmetric
			//i.e check if row is a palindrome
			if(!checkForRow(input, i)) {
				System.out.println("NO");
				return;
			}
		}
		//if length is odd
		//check if the middle row(2nd row) is a palindrome
		if(rowC%2==1)
		{
			if(!checkForRow(input, rowC/2))
			{
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
	
	public static void main(String[] args) {
	/*	int[][] input = new int[][] {
			                          {0,1,1,1,0},
			                          {0,1,0,1,0},
			                          {1,0,0,0,1},
			                          {0,1,0,1,0},
			                          {0,0,1,1,0}
			                          };
		
		checkForSymmetry(input);*/
  
        //Scanner
        Scanner s = new Scanner(System.in);
       int numOfTestCases = s.nextInt();
       
       for(int i=0; i<numOfTestCases; i++)
       {
           int matrixSize = s.nextInt();
           s.nextLine();
           int[][] input = new int[matrixSize][matrixSize];
           for(int m=0;m<matrixSize; m++)
           {
               String currentLine = s.nextLine();
                
               char[] in = currentLine.toCharArray();
               for(int n=0; n<matrixSize; n++){
                   
                   input[m][n] = in[n];
               }
           }
           checkForSymmetry(input);
       }


       

    
		
	}
}
