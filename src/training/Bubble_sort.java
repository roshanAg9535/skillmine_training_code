package training;

public class Bubble_sort {
	public static void main(String[] args) {
		int a[] = { 11,2,30,40,4};
		for(int i =1;i<a.length;i++)
		{
			for(int j=0;j<a.length-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array element after sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
