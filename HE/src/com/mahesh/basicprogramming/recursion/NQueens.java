package com.mahesh.basicprogramming.recursion;

public class NQueens {
	
	
	static boolean is_attacked( int cr, int cc, int[][] array,int  N)
	{
		
	    //checking for row and column
	    for(int i=0;i<array.length;i++)
	    {
	    if(array[i][cc]== 1)
	        return true;
	    }
	    for(int i=0;i<array[0].length;i++)
	    {
	    if(array[cr][i]== 1)
	        return true;
	    }
	    
	    //diagonals
	    
	    int m = array.length;
			int n =array[0].length;
			
			
			int ccr = cr;
			int ccc = cc;
			while(ccr>=0 && ccc>=0)
			{
				if(ccr==cr && ccc==cc)
					{
					ccr--;
					ccc--;
					continue;
					}
				if(array[ccr--][ccc--]==1)
				return true;
				
				
			}
			
			
			 ccr = cr;
			 ccc = cc;
			while(ccr>=0 && ccc<n)
			{
				if(ccr==cr && ccc==cc)
				{
				ccr--;
				ccc++;
				continue;
				}
					if(array[ccr--][ccc++]==1)
				return true;
				
				
			}
			
		
			 ccr = cr;
			 ccc = cc;
			while(ccr<m && ccc>=0)
			{
				if(ccr==cr && ccc==cc)
				{
				ccr++;
				ccc--;
				continue;
				}
					if(array[ccr++][ccc--]==1)
				return true;
			
				
			}
			
			
			 ccr = cr;
			 ccc = cc;
			while(ccr<m && ccc<n)
			{
				if(ccr==cr && ccc==cc)
				{
				ccr++;
				ccc++;
				continue;
				}
					if(array[ccr++][ccc++]==1)
				return true;
			
				
			}
	    
	    //diag end
	    
	    
	    return false;

	}

	static boolean NQueens( int board[][],int N)
	{
	    if (N== 0)                     //All queens have been placed
	        return true;
	    for (int i = 0; i<board.length;i++) {
	        for (int j = 0; j<board[0].length; j++) {
	        	
	            if (is_attacked(i, j, board, N))
	            {
	               continue;
	            }
	            else
	            {
	            board[i][j] = 1;           //Place current queen at cell (i,j)
	            if(NQueens(board, N-1))    // Solve subproblem
	                return true ;                  // if solution is found return true
	            board[i][j] = 0;
	            }/* if solution is not found undo whatever changes 
	                                       were made i.e., remove  current queen from (i,j)*/
	            
	        }
	       
	    }
	    
	    return false;
	}

	
	
	
	public static void main(String[] args) {	

		  
      
      int n = 5;
      int[][] array = new int[n][n];
      if(NQueens(array, n))
      {          
          for(int i=0;i<array.length;i++)
          {
              for(int j=0;j<array[0].length;j++)
              {
                  System.out.print(array[i][j] + " ");
              }
            System.out.print("\n");
          }
      }
      else
      {
    	  System.out.println("Not possible");
      }

       

       

    
	
	
	}

}
