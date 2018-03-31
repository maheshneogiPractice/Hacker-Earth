package com.mahesh.data_structures.arrays.OneD;

import java.util.Scanner;
import java.util.Stack;

public class NiceArches_M {

	private static int count=0;
	private static void countBubblyWords(String input) {
		Stack<Character> s = new Stack<>();
		if(input.length()%2!=0)
		{
			return;
		}
		else
		{
			char[] inputArray = input.toCharArray();
			for(int i=0; i<inputArray.length; i++) {
				if(!s.isEmpty() && inputArray[i]==s.peek())
				{
					s.pop();
				}
				else
				{
					s.push(inputArray[i]);
				}
			}
			
			if(s.isEmpty())
				count++;
			
		}
	}

    
    public static void main(String args[] ) throws Exception {
      
        Scanner s = new Scanner(System.in);
        int numberOfTestCases = s.nextInt();
        s.nextLine();
        for(int i=0;i<numberOfTestCases; i++){
            countBubblyWords(s.nextLine());
           
        }
     System.out.println(count);
    }
}
