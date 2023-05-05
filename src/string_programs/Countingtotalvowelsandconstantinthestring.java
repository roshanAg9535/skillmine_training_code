package string_programs;

import java.util.Scanner;

public class Countingtotalvowelsandconstantinthestring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		String s = sc.nextLine();
		char a[] = s.toCharArray();
		int vowel =0;
		int constant =0;
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]=='a'||a[i]=='e'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='O'||a[i]=='U'||a[i]=='i'||a[i]=='I')
			{
				vowel++;
			}
			else if(a[i]!=' ')
			{
				constant++;
			}
		}
		System.out.println("The number of vowels are:-  "+vowel+" "+"and number of constants are:-  "+constant);
	}

}

