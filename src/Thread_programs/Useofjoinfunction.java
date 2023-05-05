package Thread_programs;
class john extends Thread
{
	public void run()
	{
		for(int i =1;i<=5;i++)
		{
			System.out.println(i+"john profiles");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}
class Smith extends Thread
{
	public void run()
	{
		for(int i = 1; i<=5;i++)
		{
			System.out.println(i+"smith profile");
		}
	}
}
public class Useofjoinfunction {
	public static void main(String[] args) throws InterruptedException {
		john j = new john();
		Smith s = new Smith();
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(j);
		t1.start();
		t1.join();
		t2.start();
		
		
	}

}
