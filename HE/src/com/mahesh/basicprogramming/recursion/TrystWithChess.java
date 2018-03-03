package com.mahesh.basicprogramming.recursion;

public class TrystWithChess {

	
	static int ans = 0;
	static int[][] chessBoard = new int[10][10];
	
	static boolean isValidBlock(int i, int j)
	{
		if(i>=0 && i<chessBoard.length && j>=0 && j<chessBoard[0].length)
		{
			return true;
		}
		return false;
	}
	
	public static void findBlocks(int i, int j, int remainingMoves)
	{
		if(remainingMoves>0)
		{
		if(isValidBlock(i-1, j-2))
		{
			if(remainingMoves==1 && chessBoard[i-1][j-2]!=1)
			{
				chessBoard[i-1][j-2]=1;
				ans++;
			}
			else
				findBlocks(i-1, j-2, remainingMoves-1);
		}
		
		if(isValidBlock(i-2, j-1))
		{
			if(remainingMoves==1 && chessBoard[i-2][j-1]!=1)
			{
				chessBoard[i-2][j-1]=1;
				ans++;
			}
			else
				findBlocks(i-2, j-1, remainingMoves-1);
		}
		
		if(isValidBlock(i-1, j+2))
		{
			if(remainingMoves==1 && chessBoard[i-1][j+2]!=1)
			{
				chessBoard[i-1][j+2]=1;
				ans++;
			}
			else
				findBlocks(i-1, j+2, remainingMoves-1);
		}
		
		if(isValidBlock(i-2, j+1))
		{
			if(remainingMoves==1 && chessBoard[i-2][j+1]!=1)
			{
				chessBoard[i-2][j+1]=1;
				ans++;
			}
			else
				findBlocks(i-2, j+1, remainingMoves-1);
		}
		
		if(isValidBlock(i+1, j-2))
		{
			if(remainingMoves==1 && chessBoard[i+1][j-2]!=1)
			{
				chessBoard[i+1][j-2]=1;
				ans++;
			}
			else
				findBlocks(i+1, j-2, remainingMoves-1);
		}
		
		if(isValidBlock(i+2, j-1))
		{
			if(remainingMoves==1 && chessBoard[i+2][j-1]!=1)
			{
				chessBoard[i+2][j-1]=1;
				ans++;
			}
			else
				findBlocks(i+2, j-1, remainingMoves-1);
		}
		
		if(isValidBlock(i+1, j+2))
		{
			if(remainingMoves==1 && chessBoard[i+1][j+2]!=1)
			{
				chessBoard[i+1][j+2]=1;
				ans++;
			}
			else
				findBlocks(i+1, j+2, remainingMoves-1);
		}
		
		if(isValidBlock(i+2, j+1))
		{
			if(remainingMoves==1 && chessBoard[i+2][j+1]!=1)
			{
				chessBoard[i+2][j+1]=1;
				ans++;
			}
			else
				findBlocks(i+2, j+1, remainingMoves-1);
		}
		}
		
	}
	public static void main(String[] args) {

		
		int i =3, j=6, n=6;
		
		findBlocks(i,j,n);
		System.out.println(ans);
		
	

	}

}
