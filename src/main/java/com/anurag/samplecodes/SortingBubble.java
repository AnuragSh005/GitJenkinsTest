package com.anurag.samplecodes;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SortingBubble {

	
	public static void main(String[] args)
	{
		int[] array1={2,4,1,6,7,3,4};
		
		//bubble sort
		/*for(int i=0;i<array1.length-1;i++)
		{
			for(int j=0;j<array1.length-1-i;j++)
			{
				if(array1[j]>array1[j+1])
				{
					int t=array1[j];
					array1[j]=array1[j+1];
					array1[j+1]=t;
				}
			}
		}*/
		
		//Selection sort
		for(int i=0;i<array1.length;i++)
		{
			for(int j=i+1;j<array1.length;j++)
			{
				if(array1[i]>array1[j])
				{
					int t=array1[i];
					array1[i]=array1[j];
					array1[j]=t;
				}
			}
		}
		
		for(int i=0;i<array1.length;i++)
		{
			System.out.println(array1[i]);
		}
		
		
		
		
		//Searching
		int high=array1.length-1;
		int low=0;
		int mid=0;
		int n=8;
		while(high>low)
		{
			mid=(high+low)/2;
			if(n==array1[mid])
			{
				System.out.println("number found");
				break;
			}
			else
			{
				if(array1[mid]>n)
				{
					high=mid-1;
				}
				else 
					low=mid+1;
			}
		}
		
		int n1=5;
		int col=1+(n1-1)*2;
		for(int i=0,j=0;i<col;i=i+2,j++)
		{
			int l=col-j-1;
			while(l>0)
			{
				System.out.print(" ");
				l--;
			}
			int m=i;
			while(m>=0)
			{
				System.out.print("*");
				m--;
			}
			System.out.println();
		}
		
		
		Set s2=new HashSet<>();
		System.out.println(s2.add(1));
		System.out.println(s2.add(1));
		
		
		Map m=new HashMap<>();
		System.out.println(m.put(1, "A"));
		System.out.println(m.put(1, "B"));
		System.out.println(m.get(1));
		
	}



}
