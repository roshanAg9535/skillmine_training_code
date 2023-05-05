package exception_programs;

public class DivisionError {

	public static void main(String[] args) {
		 
		int a = 10;
		int b = 0;
		
		try {
		System.out.println(a/b);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("error while dividing by zero");
		}
		
		finally {
			System.out.println("program executed successfully");
		}
		
	}
}