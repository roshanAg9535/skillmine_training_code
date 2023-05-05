package oops;

abstract class Calculator{
	// concrete method
	void add() {
		int a = 10;
		 int b = 20;
		 System.out.println(a+b);
	}	
	// abstract function / method
	abstract void subtract();
}

class Sample extends Calculator{
	void subtract() {
		int m = 20;
		int n = 10;
		System.out.println(m-n);	
	}	
}

public class Laptop {
	public static void main(String[] args) {
		Sample s = new Sample();
		Calculator c = new Sample();
		s.add();
		s.subtract();
	}
}
