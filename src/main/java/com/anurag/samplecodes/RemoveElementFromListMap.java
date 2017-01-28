package com.anurag.samplecodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RemoveElementFromListMap {

	public static void main(String args[])
	{
		List<Integer> l=new ArrayList<Integer>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		/*l.forEach(x->{
			System.out.println("initial loop "+x);
			if(Integer.parseInt(x.toString())==2)
				l.remove(x);
		});*/
		for(Integer num: new ArrayList<Integer>(l))
		{
			System.out.println("ini "+num);
			if(num==2)
			{
				l.remove(num);
			}
		}
		
		l.forEach(x->{
			System.out.println(x);
		});
		
		
		ConcurrentHashMap<String, Integer> map=new ConcurrentHashMap();
		//Map<String, Integer> map=new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.forEach((key,value)->{
			System.out.println(key + "  "+value);
			map.remove("A");
			map.put("E", 5);
		});
		map.forEach((key,value)->{
			System.out.println("after "+key + "  "+value);
		});
	}
}
