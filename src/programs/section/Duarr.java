package programs.section;

public class Duarr {
	public static void main(String[] args) {
		int a [] = { 11,12,13,11,12,10};
		int count =0;
		for(int i =0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("The duplicate element is "+a[i]);
					count++;
					
				}
			}
		}
		System.out.println();
		System.out.println("the duplicate elements are repeated "+count+" times");
		int b[]=new int[a.length-count];
		int k =0;
		for(int i =0;i<a.length;i++)
		{
			int temp =0;
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==a[j])
				{
					temp=1;
				}
			}
				if(temp==0)
				{
					b[k]=a[i];
					k++;
				}
		}
		for(int i = 0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
