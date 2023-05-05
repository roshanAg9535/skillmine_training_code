package training;

public class Updatingthearrayelement {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int index =2;
		int element = 60;
		System.out.println("The array element before updation");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++)
		{
			if(i==index)
			{
				a[i]=element;
			}
		}
		System.out.println();
		System.out.println("The update array element is : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
