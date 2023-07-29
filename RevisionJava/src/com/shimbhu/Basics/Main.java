package com.shimbhu.Basics;
//Write a function myCode(str) which takes str as parameter (in string type) and display following output, 
//where str contains 5 (as an example) which represents number of rows:

//  *
// ***
//*****
//*******
//*********


import java.util.*;
import java.io.*;


public class Main {

  public static void main (String[] args) {
    // Arguments will be read by STDIN
    Scanner s = new Scanner(System.in); // do not change this
    String inputLine = s.nextLine(); // do not change this
     
    int rows = Integer.parseInt(inputLine);
    
    for(int i=1;i<=rows;i++)
    {
    	 for (int j = 1; j <= rows - i; j++) {
             System.out.print(" ");
         }

         // Print stars
         for (int k = 1; k <= 2 * i - 1; k++) {
             System.out.print("*");
         }
         
         System.out.println();

    }
    // you code will be inside this main method
    // to view the output, just print the string

    
    // below is a sample program output
//    System.out.print(inputLine);
  }
}

