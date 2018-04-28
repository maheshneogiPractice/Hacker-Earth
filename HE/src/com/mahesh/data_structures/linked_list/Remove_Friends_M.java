package com.mahesh.data_structures.linked_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Remove_Friends_M {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int numOfTestCases = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        while(numOfTestCases-->0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            int top = -1;
            int[] input = new int[n];
            st = new StringTokenizer(br.readLine());
            while(n-->0) {
            	int temp = Integer.parseInt(st.nextToken());
            	
            	while(top>=0 && k>0 && temp> input[top])
            	{
            		top--;
            		k--;
            	}
            	input[++top] = temp;
            }
            
            while(k>0) {
            	top--;
            	k--;
            }
        	
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<=top; i++)
            {
            	sb.append(input[i]+ " ");
            }
            
            System.out.println(sb.toString());
        }

     }

}
