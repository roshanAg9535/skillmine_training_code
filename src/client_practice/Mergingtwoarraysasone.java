package client_practice;

public class Mergingtwoarraysasone {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int b[] = {11,22,33,44,55,66,77,88,99,111,222};
		int mergedarray[] = new int[a.length+b.length];
		int i =0;
		for( i = 0;i<a.length;i++)
		{
			mergedarray[i]=a[i];
		}
		for(int j=0;j<b.length;j++)
		{
			mergedarray[i]=b[j];
			i++;
		}
		for(int k=0;k<mergedarray.length;k++)
		{
			System.out.print(mergedarray[k]+" ");
		}
	}

}
