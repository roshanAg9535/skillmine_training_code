package string_programs;

import java.util.HashMap;

public class Printingfrequencyofeachcharacterinthestring {
	public static void main(String[] args) {
		String s1 = "hello ecoders";
		int freq[] = new int[s1.length()];
		char s[] =s1.toCharArray();
		System.out.println("Duplicate characters in a given string ");
		for(int i =0;i<s.length;i++)
		{
			freq[i]=1;
			for(int j=0;j<s.length;j++)
			{
				if(s[i]==s[j]&&s[i]!=' ')
				{
					freq[i]++;
					s[j]='0';
				}
				
			}
		}
		for(int i=0;i<freq.length;i++)
		{
			if(s[i]!=' '&&s[i]!='0')
			{
				System.out.println(s[i]+" "+freq[i]);
			}
		}
		System.out.println("\nprinting using hashmap__\n");
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		for(int i = 0 ;i<s1.length();i++)
		{
			if(hm.containsKey(s1.charAt(i)))
					{
				       int count = hm.get(s1.charAt(i));
				       hm.put(s1.charAt(i), ++count);
					}
			else
			{
				hm.put(s1.charAt(i), 1);
			}
		}
		System.out.println(hm);
		
	}

}
