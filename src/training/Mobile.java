package training;
 class Student_details {
	private String name ;
	private String address ;
	private String course;
	Student_details(String name , String address , String course)
	{
		this.name=name;
		this.address=address;
		this.course=course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	

	

}

public class Mobile {
	@Override
	public String toString() {
		return "Mobile [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	public static void main(String[] args) {
		Student_details s1 = new Student_details("Roshan","Bangalore","python");
		System.out.println(s1.getName()+" "+s1.getAddress()+" "+s1.getCourse());
		Student_details s2 = new Student_details("Rajesh","Hyderabad","Java");
		System.out.println(s2.getName()+" "+s2.getAddress()+" "+s2.getCourse());
		s2.setName("Raj");
		System.out.println(s2.getName()+" "+s2.getAddress()+" "+s2.getCourse());
		System.out.println(s1);
		System.out.println(s2);
		
		
	}

	

}
