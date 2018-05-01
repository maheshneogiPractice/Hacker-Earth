package com.mahesh.algorithms.searching.linear_search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Square_Transaction_E {
	
	private static void printSol(int n, long[] sumArray, int size) {
		
		int low = 0; 
		int high = size-1;
		int temp = -1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(sumArray[mid] == n) {
				System.out.println(mid+1);
				return;
			}
			
			else if(sumArray[mid]<n) {
				low = mid+1;				
			}
			else {
				temp = mid;
				high = mid-1;
			}
			
		}
		
		if(temp>-1)
		{
			System.out.println(temp+1);
		}
		else
			System.out.println(-1);
		
	}
	
    public static void main(String args[] ) throws Exception {
    	
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	int size = Integer.parseInt(bf.readLine());
    	long[] sumArray = new long[size];
    	int sum = 0;
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	
    	for(int i=0; i<size; i++) {
    		sum += Integer.parseInt(st.nextToken());
    		sumArray[i]=sum;
    	}
    	
    	int numOfTestCases = Integer.parseInt(bf.readLine());
    	
    	for(int i=0;i<numOfTestCases; i++) {
    		int q = Integer.parseInt(bf.readLine());
    		printSol(q, sumArray, size);
    	}
    	
    }
}
