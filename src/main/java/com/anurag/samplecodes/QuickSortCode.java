package com.anurag.samplecodes;
import java.util.Arrays;

public class QuickSortCode {

	public static void main(String args[])
	{
		int[] x = { 9, 2, 4, 7, 3, 7, 10 };
		System.out.println(Arrays.toString(x));
 
		int low = 0;
		int high = x.length - 1;
 
		quickSort(x, low, high);
		System.out.println(Arrays.toString(x));
	}
	
	public static void quickSort(int [] array, int low, int high)
	{
		if(array==null || array.length==0)
			return;
		
		int pivot=array[((low+high)/2)];
		int i=low,j=high;
		while(i<=j){
			while(array[i]<pivot)
				i++;
			while(array[j]>pivot)
				j--;
			if(i<=j)
			{
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				i++;
				j--;
			}
		}
		if(low<j)
			quickSort(array, low, j);
		if(high>i)
			quickSort(array, i, high);
	}
}
