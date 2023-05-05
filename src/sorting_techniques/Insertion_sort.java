package sorting_techniques;

public class Insertion_sort {
	public static void main(String[] args) {
		int a[] = {11,20,3,40,50,1};
		int j;
		for(int i=1;i<a.length;i++)
		{
			int temp = a[i];
			for( j= i-1;j>=0&&a[j]>temp;j--)
			{
				a[j+1]=a[j];
				a[j] =temp;
				
			}
//			a[j+1]=temp;
		}
		for(int i=0 ; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
