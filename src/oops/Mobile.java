package oops;
interface Calculations{
	// public , final,
	// functions abstract and public . 
	void add();
	void subtract();
	void multiply();
}

class Demo implements Calculations{
	public void add() {
		int a = 10; int b = 20; System.out.println(a+b);
	}
	 
	public void subtract() { 
		System.out.println(10-3);
	}

	public void multiply() {
         System.out.println(20*4);
	}	
}

public class Mobile {
	public static void main(String[] args) {
	   // cannot create object of an interface. 
//		Calculations c1 = new Calculations();  this is not  allowed.
		Demo d = new Demo();
		d.add();
		d.subtract();
		d.multiply();
		Calculations c1 = new Demo();
		c1.add();
		c1.subtract();
		c1.multiply();
	}
}