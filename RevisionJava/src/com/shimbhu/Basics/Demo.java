package com.shimbhu.Basics;


import java.util.*;
import java.io.*;


public class Demo {

  public static void main (String[] args) {
    // Arguments will be read by STDIN
    Scanner s = new Scanner(System.in); // do not change this
    String inputLine = s.nextLine(); // do not change this

    // you code will be inside this main method
    // to view the output, just print the string
    char ch = ' ';
    int count = 0;
    for(int i=0;i<inputLine.length();i++)
    {
       count = 0;
       for(int j=0;j<inputLine.length();j++)
       {
         if(inputLine.charAt(i)==inputLine.charAt(j))
         {
          count++;
          if(count>1)
          {

            break;
          }
          
         }
       }

       if(count==1)
       {
        ch=inputLine.charAt(i);
        break;
       }
    }

    // below is a sample program output
    // System.out.println(inputLine);
    System.out.println(ch);
  }
}

