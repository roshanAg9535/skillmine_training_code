package collection_programs;

import java.util.HashMap;

public class Checkingkeyvaluepair {
	public static void main(String[] args) {
		HashMap<Integer,String>s = new HashMap<Integer,String>();
		s.put(1, "mom");
		s.put(2, "dad");
		s.put(3, "brother");
		s.put(4, "sister");
		System.out.println(s);
//		System.out.println("is 1 exist");
		for(int i = 0 ; i<s.size();i++) {
	     if(s.containsKey(i))
	     {
	    	 System.out.println("yes!- "+ s.get(i));
	    	 
	     }
	     else {
	    	 System.out.println("no");
	}
	     }
			System.out.println("is mom exist");
	if(s.containsValue("mom"))
	{
		System.out.println("yes!");
	}
	}
}
