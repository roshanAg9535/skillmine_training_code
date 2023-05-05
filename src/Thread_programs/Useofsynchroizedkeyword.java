package Thread_programs;
class Document
{
	 void printdocuments(int numofcopies, String documentname)
	{
		for(int i = 1;i<=numofcopies;i++)
		{
			System.out.println(i+" "+documentname);
		}
	}
}
class Joh extends Thread
{
	//global reference variable of document class
	Document d ;
	//constructor
	Joh(Document d)
	{
		this.d=d;
	}
	public void run()
	{
		synchronized  (d) {
		//call the synchronized method of document class 
		d.printdocuments(5, "john pdf");
		}
	}
}
class Smit extends Thread
{
	//global reference variable of document class
		Document d ;
		//constructor
		Smit(Document d)
		{
			this.d=d;
		}
		public void run()
		{
			synchronized  (d) {
			//call the synchronized method of document class 
			d.printdocuments(10, "Smith pdf");
			}
		}
	}

public class Useofsynchroizedkeyword {
	public static void main(String[] args) throws InterruptedException {
		Document d = new Document();
		Joh j = new Joh(d);
		Smit s = new Smit(d);
		j.start();
		s.start();
		
		
	}

}
