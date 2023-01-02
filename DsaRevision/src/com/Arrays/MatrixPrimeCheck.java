package com.Arrays;

import java.util.*;

class MatrixPrimeCheck
{
    
    public static void matrixPrimeCheck(int n , int m , int[][] mat)
    {
        int count=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                 int x = mat[i][j];
                 if(isPrime(x))
                 {
                     count++;
                 }
                
            }
        }
        
        System.out.println(count);
    }
     public static boolean isPrime(int x)
     {
         if(x==1)
         {
             return false;
         }
         if(x==2)
         {
             return true;
         }
         for(int i=2;i<=Math.sqrt(x);i++)
         {
             if(x%i==0)
             {
                 return false;
             }
         }
         
         return true;
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
        
        matrixPrimeCheck(n,m,mat);
    }
}