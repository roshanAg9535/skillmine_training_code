package training;
interface A
{
	int a = 20;
}
interface B
{
	int b = 30;
}
interface C extends A,B
{
	
}
public class Getthecode implements C {

	public static void main(String[] args) {
		Getthecode c = new Getthecode();
		System.out.println(c.b);
        System.out.println(c.a);		

	}

}
