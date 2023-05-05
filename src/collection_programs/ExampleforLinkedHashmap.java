package collection_programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExampleforLinkedHashmap {
	public static void main(String[] args) {
		HashMap<String,Integer> a = new HashMap<String,Integer>(); 
		a.put("Mom", 12345);
		a.put("Dad", 5678);
		a.put("Gf", null);
		System.out.println(a);
		for(Map.Entry e:a.entrySet())
		{
			System.out.println(e);
		}
		Set s = a.entrySet();
		Iterator r = s.iterator();
		while(r.hasNext())
		{
			Map.Entry<String,Integer> e=(Entry)r.next();
			System.out.println(e.getKey()+"   "+ e.getValue());
		}

	
	}

}
