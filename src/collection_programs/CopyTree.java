package collection_programs;

import java.util.Set;
import java.util.TreeMap;

public class CopyTree {
public static void main(String[] args) {
	TreeMap<String,String> t1 = new TreeMap<String,String>();
	t1.put("c1", "Red");
	t1.put("c2", "Green");
	t1.put("c3", "Black");
	t1.put("c4", "White");
	t1.put("c5", "Blue");
	System.out.println(t1);
	TreeMap<String,String> t2 = new TreeMap<String,String>();
	t2.put("A1", "Orange");
	t2.put("A2", "Pink");
	System.out.println(t2);
	t1.putAll(t2);
	if(t1.containsValue("Green"))
	{
		System.out.println("The tree map contains green");
	}
	else
	{
		System.out.println("The treemap does not contains green");
	}
	System.out.println("Getting alll the keys from the treemap");
	Set<String>Keys = t1.keySet();
	for(String key: Keys)
	{
		System.out.println(key);
		
	}
	System.out.println("Reversing the order view of the treemap");
	System.out.println(t1.descendingKeySet());
	TreeMap<Integer, String>t= new TreeMap<Integer,String>();
	t.put(1, "mom");
	t.put(2, "dad");
	t.put(3, "brother");
	t.put(4, "sister");
	System.out.println(t.floorKey(5));
	
	
}
}
