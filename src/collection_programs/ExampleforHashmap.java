package collection_programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExampleforHashmap {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> a = new LinkedHashMap<String,Integer>(); 
		a.put("Mom", 12345);
		a.put("Dad", 5678);
		a.put("Gf", null);
		System.out.println(a);
		System.out.println(a.get("Mom"));
		System.out.println(a.remove("Gf"));
		System.out.println(a);
		System.out.println(a.keySet());
		System.out.println(a.values());
		System.out.println(a.entrySet());
		for(Object e:a.keySet())
		{
			System.out.println(e+"  "+a.get(e));
		}
		for(Map.Entry e:a.entrySet())
		{
			System.out.println(e);
		}

	
	}

}
