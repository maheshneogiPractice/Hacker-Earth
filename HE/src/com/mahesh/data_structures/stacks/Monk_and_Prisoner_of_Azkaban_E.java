package com.mahesh.data_structures.stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Monk_and_Prisoner_of_Azkaban_E {
	
	private static int[] getXArray(long[] input, int size)
	{
		Stack<Integer> s = new Stack<>();
		int[] res = new int[size];
		s.push(size-1);
		if(size>1)
		{
			for(int i=size-2; i>=0; i--)
			{
				long currentEle = input[i];
				if(currentEle>input[s.peek()]){
					while(!s.isEmpty() && currentEle>input[s.peek()])
					{
						int poppedIndex = s.pop();
						res[poppedIndex] = i+1;
					}
				}
				s.push(i);
			}
		}
		while(!s.isEmpty())
		{
			res[s.pop()] = -1;
		}
		return res;
	}
	
	private static int[] getYArray(long[] input, int size)
	{
		Stack<Integer> s = new Stack<>();
		int[] res = new int[size];
		s.push(0);
		if(size>1)
		{
			for(int i=1; i<size; i++)
			{
				long currentEle = input[i];
				if(currentEle>input[s.peek()]){
					while(!s.isEmpty() && currentEle>input[s.peek()])
					{
						int poppedIndex = s.pop();
						res[poppedIndex] = i+1;
					}
				}
				s.push(i);
			}
		}
		while(!s.isEmpty())
		{
			res[s.pop()] = -1;
		}
		return res;
	}
	
	
	public static void main(String[] args) throws Exception {
	    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(reader.readLine());
	    
		int n=Integer.parseInt(st.nextToken());
		long[] input = new long[n];
			st = new StringTokenizer(reader.readLine());
		for(int j=0; j<n; j++)
		{
		    input[j] =Long.parseLong(st.nextToken());
		}
	
		
		int[] inputX = new int[n];
		int[] inputY = new int[n];
		
		inputX = getXArray(input, n);
		inputY = getYArray(input, n);

        StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++){
		sb.append(inputX[i]+inputY[i] + " ");
		}
		System.out.println(sb.toString());
	}

}
