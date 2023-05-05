package training;

public class Sarita {
	Sarita(int a)
	{
		System.out.println("Make one chapati for me");
	}
	Sarita(int a , int b)
	{
		System.out.println("Make two chapati for me");
	}
	public static void main(String[] args) {
		new Sarita(1);
		new Sarita(1,2);
	}

}
