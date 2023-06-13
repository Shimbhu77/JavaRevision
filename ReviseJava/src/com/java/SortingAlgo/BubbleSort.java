package com.java.SortingAlgo;

public class BubbleSort {

	public static void bubbleSort(int[] arr)
	{
		int n = arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
       
		int[] array = {5, 2, 8, 12, 3};
        
        System.out.println("Before sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        bubbleSort(array);
        
        System.out.println("\nAfter sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }
	}
}
