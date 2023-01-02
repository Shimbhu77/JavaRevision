package com.Arrays;

import java.util.*;

class TransposeMatrix
{
    
    public static void transposeMatrix(int n , int m , int[][] mat)
    {
        int[][] arr = new int[m][n];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               arr[j][i]= mat[i][j];
            }
          
        }
        for(int i=0;i<m;i++)
        {
            StringBuilder str  = new StringBuilder();
            for(int j=0;j<n;j++)
            {
                str.append(arr[i][j]+" ");
            }
            System.out.println(str);
        }
        
        
    }
   
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        
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
        
        transposeMatrix(n,m,mat);
    }
}