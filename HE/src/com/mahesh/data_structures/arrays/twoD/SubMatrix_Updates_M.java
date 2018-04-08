package com.mahesh.data_structures.arrays.twoD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Scanner;
public class SubMatrix_Updates_M {


	private static int[][] updateSubMat(int[][] input, int subRow, int subCol, int subMSize, int k) {

		for (int i = 0; i < subMSize; i++) {
			for (int j = 0; j < subMSize; j++) {
				input[i + subRow][j + subCol] += k;
			}
		}

		return input;
	}

	public static void main(String[] args) throws IOException {
	
	/*		int[][] input = new int[][] {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
			};
			
			input = updateSubMat(input, 1, 2, 2,5);
			input = updateSubMat(input, 2, 1, 2, -3);
			
			for(int i=0; i<input.length; i++) {
				for(int j=0; j<input[0].length; j++)
				{
					System.out.print(input[i][j] + " ");
				}
				System.out.print("\n");
			}
	}*/
		
		

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int rowC =Integer.parseInt(st.nextToken());
        int colC =Integer.parseInt(st.nextToken());
        int numOfTC =Integer.parseInt(st.nextToken());
        
      
        int[][] input = new int[rowC][colC];
       
        for(int i=0; i<rowC; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<colC; j++){
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for(int i=0; i<numOfTC; i++){
             st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken())-1;
            int C = Integer.parseInt(st.nextToken())-1;
            int subMSize =Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
          input = updateSubMat(input,R, C , subMSize, k);
        }
        
         StringBuffer out = new StringBuffer();
			for(int i=0; i<input.length; i++) {
				for(int j=0; j<input[0].length; j++)
				{
					out.append(input[i][j] + " ");
				}
				out.append("\n");
			}
			 System.out.println(out);
	}

		

}
