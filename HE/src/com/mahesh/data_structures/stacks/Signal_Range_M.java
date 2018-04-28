package com.mahesh.data_structures.stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Signal_Range_M {
    private static void printSol(int[] input, int size)
 {
		Stack<Integer> s =new Stack<>();
		int[] res = new int[size];
		s.push(size-1);
		for(int i= size-2; i>=0; i--){
			
			if(input[i]>input[s.peek()])
			{
				while(!s.isEmpty() && input[i]>input[s.peek()])
				{
				int range = s.peek()-i;
				res[s.peek()] = range;
				s.pop();
				}
			}
			s.push(i);
		}
		while(!s.isEmpty()){
			int top =  s.pop();
			int range =top+1;
			res[top] = range;
		}
		StringBuilder sb =new StringBuilder();
		sb.append("1 ");
		
		for(int i=1;i<res.length ;i++)
		{
			sb.append(res[i] + " ");
		}
		System.out.println(sb.toString());
 }
    public static void main(String args[] ) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int numOfTestCases = Integer.parseInt(br.readLine());
      StringTokenizer st = null;
      for(int i = 0; i< numOfTestCases; i++)
      {
          int size = Integer.parseInt(br.readLine());
          int[] input = new int[size];
          st = new StringTokenizer(br.readLine());
          for(int j=0; j< size; j++)
          {
              
              input[j] = Integer.parseInt(st.nextToken());
          }
          printSol(input, size);
      }
    }
}
