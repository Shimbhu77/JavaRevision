package com.shimbhu.Basics;


import java.util.*;
import java.io.*;


public class Main2 {

  public static void main (String[] args) {
    // Arguments will be read by STDIN
    Scanner s = new Scanner(System.in); // do not change this
    String inputLine = s.nextLine(); // do not change this

    // you code will be inside this main method
    // to view the output, just print the string

    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm','n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    
    int count=0;
    for(int i=0;i<26;i++)
    {
      for(int j=0;j<inputLine.length();j++)
      {
        if(alphabet[i]==inputLine.charAt(j))
        {
          count++;
          break;
        }
      }
    }

    if(count==26)
    {
      System.out.println(true);
    }
    else
    {
      System.out.println(false);
    }
    // below is a sample program output
    System.out.print(inputLine);
  }
}

