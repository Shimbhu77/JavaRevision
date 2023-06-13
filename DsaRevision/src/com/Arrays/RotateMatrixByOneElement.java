package com.Arrays;

import java.util.Scanner;

public class RotateMatrixByOneElement {

	public static void rotateMatrix(int n,int m,int[][] mat)
	{
		int val = mat[1][0];
		
		int row=1,col=0,loop=0;
		
		int top=0,bottom=n-1,left=0,right=m-1;
		
		StringBuilder str = new StringBuilder();
		
		while(top<=bottom && left<=right)
		{
			
			if(top==bottom && left==right && loop>0)
			{
				val=mat[col][col];
			}
			else if(loop>0)
			{
				val=mat[row][col];
			}
			System.out.println("val is : "+val);
			
			for(int i=left; i<=right;i++)
			{
				int temp = mat[top][i];
				mat[top][i]=val;
				val=temp;
			}
			
			top++;
			
			for(int i=top;i<=bottom;i++)
			{
				int temp = mat[i][right];
				mat[i][right]=val;
				val=temp;
			}
			
			right--;
			
			for(int i=right;i>=left;i--)
			{
				int temp = mat[bottom][i];
				mat[bottom][i]=val;
				val=temp;
			}
			
			bottom--;
			
			for(int i=bottom;i>=top;i--)
			{
				int temp = mat[i][left];
				mat[i][left]=val;
				val=temp;
			}
			
			left++;
			
			row++;
			col++;
			loop++;
				
		}		
		System.out.println(" output : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
//input values
//	4 4 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
//	4 3 1 2 3 4 5 6 7 8 9 10 11 12
//	3 3 1 2 3 4 5 6 7 8 9
	public static void main(String[] args) {
		
		 Scanner sc  = new Scanner(System.in);
		
		 int n = sc.nextInt();
         int m = sc.nextInt();
         
         int[][] mat = new int[n][m];
         
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<m;j++)
             {
                 mat[i][j]=sc.nextInt();
                 System.out.print(mat[i][j]+" ");
             }
             System.out.println();
         }
         
         rotateMatrix(n, m, mat);
	}
	
}
