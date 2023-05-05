package programs.section;

import java.util.Scanner;

public class Duplicatearrayelements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int arr[]= new int[size];
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count =1;
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]&&arr[i]!=0)
				{
					arr[j] =0;
					count++;
				}
			}
		
		if(count>1&& arr[i]!=0)
		{
			System.out.println("the duplicate element is :"+ " "+arr[i]+" "+"number of times that element repeated is :  "+count);
		}
		int b[] = new int[arr.length-count];
		int k =0;
		for(int r = 0;r<arr.length;r++)
		{
			int temp = 0;
			for(int j =r+1;j<arr.length;j++)
			if(arr[r]==arr[j])
			{
				temp =1 ;
					}
			if(temp==0)
			{
				b[k]=arr[r];
				k++;
			}
		}
		for(int r=0;r<arr.length;r++)
		{
			System.out.print(b[r]+" ");
		}
		
		}
		
	}

}
