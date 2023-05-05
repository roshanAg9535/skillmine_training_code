package oops;
class Library
{
	String book1 ="Math";
	String book2 ="Science";
	String book3="English";
}
public class Student extends Library {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.book1);
		System.out.println(s.book2);
		System.out.println(s.book3);

	}
	

}
