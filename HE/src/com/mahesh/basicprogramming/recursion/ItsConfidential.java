package com.mahesh.basicprogramming.recursion;

public class ItsConfidential {
	static void encrypt(String input, StringBuilder sb)
	{
		int length = input.length();
		if (length > 0) {
			if (length <=2) {
				sb.append(input);
				return;
			}
			else
			{
				int mid=(length-1)/2;
				sb.append(input.charAt(mid));
				int startIndex = 0;
				int endIndex = mid;
				//left substring
				if(startIndex<endIndex)
					encrypt(input.substring(startIndex, endIndex),sb);
				else
				{
					encrypt(String.valueOf(input.charAt(startIndex)),sb);
				}
				
				//right substring
				 startIndex = mid+1;
				 endIndex = length;
				 if(startIndex<endIndex)
						encrypt(input.substring(startIndex, endIndex),sb);
					else
					{
						encrypt(String.valueOf(input.charAt(startIndex)),sb);
					}
			}
			
		}
		
		
	}
    public static void main(String args[] ) throws Exception {
    		String input = "abcd";
    		 StringBuilder sb = new StringBuilder();
           encrypt(input, sb);
           System.out.println(sb.toString());
       

        

        // Write your code here

    }
}
