package com.mahesh.algorithms.searching.linear_search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Simple_Search_E {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int toFind = Integer.parseInt(bf.readLine());
        
        for(int i=0; i<size; i++){
            if(toFind == Integer.parseInt(st.nextToken()))
                System.out.println(i);
        }
        
    }
}
