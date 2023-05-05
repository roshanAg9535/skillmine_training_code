package training;

public class Linearsearch {
	public static void main(String[] args) {
		int a[] = {10,40,50,30,60};
		int itemtosearch = 30;boolean search = false;int index = 0;
		for( int i=0;i<a.length;i++)
		{
			if(a[i]==itemtosearch)
			{
				search = true;
				index=i;
			}
		}
		if(search == true)
		{
			System.out.print("your search item "+itemtosearch+" is at index "+index);
		}
		else
		{
			System.out.println("The item your searching is not present in the string");
		}
		
		
	}

}
