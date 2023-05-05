package training;

public class Suresh {

	public static void main(String[] args) {
		Pvrcinema p1 = new Pvrcinema();
		p1.bookTicket(1); p1.bookTicket(1, 2);
	}

}

class Pvrcinema
{
	void bookTicket(int a)
	{
		System.out.println("Booked 1 Ticket");
	}
	void bookTicket(int a,int b)
	{
		System.out.println("Booked 2 Ticket");
	}
	
}