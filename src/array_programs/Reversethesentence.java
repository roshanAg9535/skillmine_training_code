package array_programs;

public class Reversethesentence {
	public static void main(String[] args) {
	String s ="Hello welcome to java";
	String a[] =s.split(" ");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}
	for(int i =0 ; i<a.length;i++)
	{
		String reverse ="";
		for(int j = a[i].length()-1;j>=0;j--)
		{
			reverse = reverse+a[i].charAt(j);
			
		}
		System.out.println();
		System.out.print(reverse);
	}
	}
}
