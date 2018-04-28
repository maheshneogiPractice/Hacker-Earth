package com.mahesh.data_structures.stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class TheFootBallFest_E {
	private static Stack<Integer> possessionStack = null;
	private static Stack<Integer> passStack  =null;
	
	public static void main(String[] args) throws Exception {
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int numOfTestCases = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<numOfTestCases; i++){
			possessionStack = new Stack<>();
			passStack = new Stack<>();
			
			st = new StringTokenizer(reader.readLine());
			int numOfPases = Integer.parseInt(st.nextToken());
			int initialPlayer = Integer.parseInt(st.nextToken());
			possessionStack.push(initialPlayer);
			
			for(int j=0; j<numOfPases; j++)
			{
				st  = new StringTokenizer(reader.readLine());
				
				String passType = st.nextToken();
				
				switch (passType) {
				case "P":
						int passedTo = Integer.parseInt(st.nextToken());
						int passedBy = possessionStack.pop();
						
						passStack.push(passedBy);
						possessionStack.push(passedTo);
						
					break;
					
				case "B":
					int backPassedTo = passStack.pop();
					int backPassedBy = possessionStack.pop();
					
					passStack.push(backPassedBy);
					possessionStack.push(backPassedTo);
					
					break;
				default:
					break;
				}
			}
			System.out.println("Player "+possessionStack.peek());
		}
	}

}
