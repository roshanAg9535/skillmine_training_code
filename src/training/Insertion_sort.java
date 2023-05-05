package training;

public class Insertion_sort {
	public static void main(String[] args) {
		int a[] = { 11,2,30,40,4};
		for(int i=1;i<a.length;i++)
		{
			int temp =a[i];
			for(int j=i-1;j>=0&&a[j]>temp;j--)
			{
				a[j+1]=a[j];
				a[j]=temp;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	
	}

}
