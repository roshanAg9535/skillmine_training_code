package Thread_programs;
class Numberprinting extends Thread
{
	public void run()
	{
		for(int i = 1;i<=5;i++)
		{
			System.out.print(i);
		}
	}
}
class Nameprinting implements Runnable
{
	public void run()
	{
		for(int i = 1;i<5;i++)
		{
			System.out.print("java");
		}
	}
}
public class o1_Makingthread {
	public static void main(String[] args) {
		Numberprinting n1 = new Numberprinting();
		Nameprinting n2 = new Nameprinting();
		
		Thread t1 =new Thread(n1);
		Thread t2 = new Thread(n2);
		t1.start();
		t2.start();
	}

}
