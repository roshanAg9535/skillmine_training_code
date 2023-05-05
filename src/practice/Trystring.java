package practice;

import java.util.Arrays;

public class Trystring {
public static void main(String[] args) {
	String a = "army";
	String b ="mary";
	char a1 [] = a.toLowerCase().toCharArray();
	char b1[] = b.toLowerCase().toCharArray();
	Arrays.sort(a1);
	Arrays.sort(b1);
	boolean result = Arrays.equals(a1, b1);
	if(result==true)
	{
		System.out.println("Angram");
	}
	else
	{
		System.out.println("It is not a angram");
	}
}
}
