package practice;

import java.util.Scanner;

public class Arrayprogram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size =sc.nextInt();
		System.out.println("Enter the array element");
		int arr[] = new int[size];
		for(int i =0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i =0;i<arr.length;i++)
		{
			for(int j =0;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==14||arr[i]+arr[j]==15||arr[i]+arr[j]==16)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
				
			}
			
		}
	}
	}


