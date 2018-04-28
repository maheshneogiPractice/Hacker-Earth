package com.mahesh.data_structures.stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class A_Game_Of_Numbers_E {
	private static void printSol(int[] input, int size)
{
	Stack<Integer> s = new Stack<>();
	Stack<Integer> sx = new Stack<>();
	int[] res = new int[size];
	int[] xres = new int[size];
	s.push(0);
	
	if(size>1)
	{
		for(int i=1; i<size; i++)
		{
			int currentEle = input[i];
			if(!s.isEmpty() && currentEle>input[s.peek()]){
				while(!s.isEmpty() && currentEle>input[s.peek()])
				{
					int poppedIndex = s.pop();
					res[poppedIndex] = i;
					sx.push(i);
				}
			}
			else if(!sx.isEmpty() && currentEle<input[sx.peek()])
			{
				while(!sx.isEmpty() && currentEle<input[sx.peek()])
				{
					int poppedIndex = sx.pop();
					xres[poppedIndex] = input[i];
					
				}
			}
			s.push(i);
		}
	}
	while(!s.isEmpty())
	{
		res[s.pop()] = -1;
	}
	while(!sx.isEmpty())
	{
		xres[sx.pop()] = -1;
	}
	
	
	
	StringBuilder sb = new StringBuilder();
	for(int i=0; i<res.length; i++){
		if(res[i]!=-1)
		{
			sb.append(xres[res[i]] + " ");
		}
		else
		{
			sb.append("-1 ");
		}
	}
	
	System.out.println(sb.toString());
}
public static void main(String args[] ) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] input = new int[n];
    for(int i=0; i<n; i++)
    {
        
        input[i] = Integer.parseInt(br.readLine());
    }
    printSol(input, n);

}
}
