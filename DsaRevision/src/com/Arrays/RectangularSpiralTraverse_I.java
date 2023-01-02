package com.Arrays;

import java.util.*;

class RectangularSpiralTraverse_I
{
    
    public static void spiralRectangularMatrix(int n , int m , int[][] mat)
    {
       int top = 0,left=0,right=m-1,bottom=n-1;
       
       StringBuilder str  = new StringBuilder();
       int count=0;
       while(top<=bottom && left<=right)
       {
           for(int i=top;i<=bottom && count<n*m;i++)
           {
               count++;
               str.append(mat[i][left]+" ");
           }
           left++;
           
           for(int i=left;i<=right && count<n*m;i++)
           {
               count++;
               str.append(mat[bottom][i]+" ");
           }
           bottom--;
           
           for(int i=bottom;i>=top && count<n*m;i--)
           {
               count++;
               str.append(mat[i][right]+" ");
           }
           right--;
           
           for(int i=right;i>=left && count<n*m;i--)
           {
               count++;
               str.append(mat[top][i]+" ");
           }
           top++;
           
           
       }
        
        System.out.println(str);
        
    }
   
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        
        int tcs  = sc.nextInt();
        
        while(tcs-->0)
        {
        
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
            
            spiralRectangularMatrix(n,m,mat);
        }     
    }
}
