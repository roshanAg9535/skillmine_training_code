package array_programs;

import java.util.Scanner;

public class Linearsearch2 {
	public static void main(String[] args) {
		int a[] = {11,12,13,14,15,16,17,18,19,15};
	
		int index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element you want to check ");
		int item = sc.nextInt();
		for(int i =0;i<a.length;i++)
		{
			int result = 0;
			if(item==a[i])
			{
				result=1;
				index = i;
				System.out.println(index+" ");
			}
		}
		
	}

}
