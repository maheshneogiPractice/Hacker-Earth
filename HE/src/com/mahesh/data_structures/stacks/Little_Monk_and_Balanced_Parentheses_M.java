package com.mahesh.data_structures.stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Little_Monk_and_Balanced_Parentheses_M {
	private static void printSol(int[] input, int size)
	 {
			int maxLength = 0;		
			Stack<Integer> s = new Stack<>();
			s.push(0);
			int count=0;
			for (int i = 1; i <= size; i++) {
				if (input[i] > 0) {				
					s.push(i);
				} else {				
						int temp = s.pop();
						if (input[temp]==-input[i]) {
							if(s.isEmpty())
							{
								s.push(i);
							}
							else
							{
								maxLength = Math.max(maxLength, i-s.peek());
							}
						}
						else
						{
						    s.push(i);
						}
				
			}
			
		}
			System.out.println(maxLength);
	 }
		
	    public static void main(String args[] ) throws Exception {
	        
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       int n = Integer.parseInt(br.readLine());
	       int[] input = new int[n+1];
	       StringTokenizer st = new StringTokenizer(br.readLine());
	      // StringBuilder sb = new StringBuilder();
	       for(int i=1; i<=n; i++){
	           input[i] = Integer.parseInt(st.nextToken());
	        // sb.append( input[i] +" ");
	       }
	      //  System.out.println(sb.toString());
	       printSol(input, n);

	    }
}
