package com.Arrays;

import java.util.Scanner;

public class SpiralTraversalMatrix {

	public static void spiralMatrix(int n,int m,int[][] mat)
	{
		int top=0,bottom=n-1,left=0,right=m-1;
		
		StringBuilder str = new StringBuilder();
		
		while(top<=bottom && left<=right)
		{
			for(int i=left;i<=right;i++)
			{
				str.append(mat[top][i]+" ");
			}
			
			top++;
			
			for(int i=top;i<=bottom;i++)
			{
				str.append(mat[i][right]+" ");
			}
			
			right--;
			
			for(int i=right;i>=left;i--)
			{
				str.append(mat[bottom][i]+" ");
			}
			
			bottom--;
			
			for(int i=bottom;i>=top;i--)
			{
				str.append(mat[i][left]+" ");
			}
			
			left++;
			
		}
		
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
	        
//	        int tcs  = sc.nextInt();
//	        
//	        while(tcs-->0)
//	        {
//	        
	            int n = sc.nextInt();
	            int m = sc.nextInt();
	            
	            int[][] mat = new int[n][m];
	            
	            for(int i=0;i<n;i++)
	            {
	                for(int j=0;j<m;j++)
	                {
	                    mat[i][j]=sc.nextInt();
	                }
	            }
	            
	            spiralMatrix(n, m, mat);
//	        }  
//	        4 4 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
//	        4 3 1 2 3 4 5 6 7 8 9 10 11 12 
	}
}
