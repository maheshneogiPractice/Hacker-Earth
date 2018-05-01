package com.mahesh.algorithms.searching.linear_search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Min_Max_E {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bf.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<size; i++)
        {
            int temp = Integer.parseInt(st.nextToken());
            if(temp<min){
                min = temp;
            }
            if(temp>max){
                max = temp;
            }
            sum+=temp;
        }
        System.out.println((sum-max)+" "+(sum-min));
    }
}
