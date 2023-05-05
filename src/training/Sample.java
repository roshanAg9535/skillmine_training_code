package training;

public class Sample {
	
	String un;
	String pwd;
	Sample(String un, String pwd)
	{
		this.un= un;
		this.pwd = pwd;
		System.out.println(un);
		System.out.println(pwd);
	}
	public static void main(String[] args) {
		new Sample("Guru","abc123");
		
	}

}
