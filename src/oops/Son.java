package oops;
class Grandfather
{
	String thing="Land of 1 acre";
}
class Father extends Grandfather
{
	String money = "10000$";
}
public class Son extends Father{
	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s.money);
		System.out.println(s.thing);
	}

}
