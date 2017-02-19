package com.anurag.samplecodes;

public class MergeSortForArray {

	public static void main(String args[])
	{
		int[] numbers = { 3, 8, 7, 5, 2, 1, 9, 6, 4 };
        int len = 9;
 
        System.out.println("MergeSort By Recursive Method");
 
        mergeSort(numbers, 0, len - 1);
        for (int i = 0; i < 9; i++)
            System.out.println(numbers[i]);
		
	}
	public static void mergeSort(int []arr, int left, int right)
	{
		int mid;
		if(left<right)
		{
			mid=(right+left)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			mergeSortedArray(arr, left, mid+1, right);
		}
	}
	
	public static void mergeSortedArray(int []arr, int left, int  mid, int right){
		int []temp=new int[25];
		int left_end, numberOfElements, tmp_pos;
		numberOfElements=right-left+1;
		left_end=mid-1;
		tmp_pos=left;
		
		while((left<=left_end) && (mid<=right))
		{
			if(arr[left]<=arr[mid])
			{
				temp[tmp_pos++]=arr[left++];
			}
			else 
			{
				temp[tmp_pos++]=arr[mid++];
			}
		}
		while(left<=left_end)
			temp[tmp_pos++]=arr[left++];
		while(mid<=right)
			temp[tmp_pos++]=arr[mid++];
		for(int i=0;i<numberOfElements;i++)
		{
			arr[right]=temp[right];
			right--;
		}
	}
}
