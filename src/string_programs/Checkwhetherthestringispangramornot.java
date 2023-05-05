package string_programs;

public class Checkwhetherthestringispangramornot {
	public static void main(String[] args) {
		String s ="THE ROSHAN";
		s=s.replace(" ", "");
		char ch[] = s.toCharArray();
		int a[] = new int[26];
		for(int i=0;i<a.length;i++)
		{
			a[i]=0;
		}
		int i=0;
		while(i!=ch.length)
		{
			int index = ch[i]-65;
			a[index]=1;
			++i;	
		}
		i=0;
		while(i!=26)
		{
			if(a[i]==1)
			{
				i++;
			}
			else
			{
				System.out.println("it is not a pangram");
				System.exit(i);
			}
		}
		System.out.println("it is a pangram");
		
	}

}
