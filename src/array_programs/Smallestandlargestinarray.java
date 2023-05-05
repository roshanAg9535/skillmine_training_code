package array_programs;

import java.util.Scanner;

public class Smallestandlargestinarray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of size");
	int size = sc.nextInt();
	System.out.println("Enter all the array elements");
	int a[] = new int[size];
	for(int i = 0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	int max = a[0];
	int min = a[0];
	for(int i =1;i<a.length;i++)
	{
	
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
	
	System.out.println("The maximum element is:  "+max);
	System.out.println("The minimum element is:  "+min);
}
}
