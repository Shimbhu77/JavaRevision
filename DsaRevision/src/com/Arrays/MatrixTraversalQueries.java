package com.Arrays;

import java.util.*;

class MatrixTraversalQueries
{
    
    public static void queryTraverseMatrix(int n , int m , int q ,int[][] mat)
    {
        StringBuilder str  = new StringBuilder();
        if(q==1)
        {
            for(int i=0;i<n;i++)
            {
                if(i%2==0)
                {
                    for(int j=0;j<m;j++)
                    {
                        str.append(mat[i][j]+" ");
                    }
                }
                else
                {
                    for(int j=m-1;j>=0;j--)
                    {
                        str.append(mat[i][j]+" ");
                    }
                }
            }
        }
        else if(q==2)
        {
            for(int i=0;i<n;i++)
            {
                if(i%2==1)
                {
                    for(int j=0;j<m;j++)
                    {
                        str.append(mat[i][j]+" ");
                    }
                }
                else
                {
                    for(int j=m-1;j>=0;j--)
                    {
                        str.append(mat[i][j]+" ");
                    }
                }
            }
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
            int q = sc.nextInt();
            
            int[][] mat = new int[n][m];
            
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    mat[i][j]=sc.nextInt();
                }
            }
            
            queryTraverseMatrix(n,m,q,mat);
        }     
    }
}
