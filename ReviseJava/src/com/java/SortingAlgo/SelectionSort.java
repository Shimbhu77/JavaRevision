package com.java.SortingAlgo;

public class SelectionSort {

	public static void selectionSort(int[] arr)
	{
		int n = arr.length;
		
		for(int i=0;i<n-1;i++)
		{
			int min_index = i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[min_index]>arr[j])
				{
					min_index=j;
				}
			}
			
			int temp  = arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
		
	}
	
	public static void main(String[] args) {
       
		int[] array = {5, 2, 8, 12, 3};
        
        System.out.println("Before sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        selectionSort(array);
        
        System.out.println("\nAfter sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }
	}
}
