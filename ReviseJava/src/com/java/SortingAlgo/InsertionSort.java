package com.java.SortingAlgo;

public class InsertionSort {

	
	public static void insertionSort(int[] arr)
	{
		int n = arr.length;
		
		for(int i=1;i<n;i++)
		{
			int current = arr[i];
			
			int j=i-1;
			
			while(j>=0 && arr[j]> current)
			{
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=current;
		}
	}
	
	public static void main(String[] args) {

		int[] array = {5, 2, 8, 12, 3};
        
        System.out.println("Before sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        insertionSort(array);
        
        System.out.println("\nAfter sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }
	}
}
