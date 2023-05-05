package practice;

import java.util.Scanner;

public class Sumofevenandoddinteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size =sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the array element");
		for(int i =0;i<a.length;i++)
		{
			a[i] =sc.nextInt();
		}
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even =a[i]+even;
			}
			else
			{
				odd=odd+a[i];
			}
		}
		System.out.println("The sum of even integer is :"+even);
		System.out.println("The sum of odd integer is :"+(odd));
	}

}
