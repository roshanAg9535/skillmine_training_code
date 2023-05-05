//package Thread_programs;
//class Document
//{
//	synchronized void printdocuments(int numofcopies, String documentname)
//	{
//		for(int i = 1;i<=numofcopies;i++)
//		{
//			System.out.println(i+" "+documentname);
//		}
//	}
//}
//class John extends Thread
//{
//	//global reference variable of document class
//	Document d ;
//	//constructor
//	John(Document d)
//	{
//		this.d=d;
//	}
//	public void run()
//	{
//		//call the synchronized method of document class 
//		d.printdocuments(5, "john pdf");
//	}
//}
//class Smit extends Thread
//{
//	//global reference variable of document class
//		Document d ;
//		//constructor
//		Smit(Document d)
//		{
//			this.d=d;
//		}
//		public void run()
//		{
//			//call the synchronized method of document class 
//			d.printdocuments(10, "Smith pdf");
//		}
//	}
//
//public class Useofsynchroized {
//	public static void main(String[] args) throws InterruptedException {
//		Document d = new Document();
//		John j = new John(d);
//		Smit s = new Smit(d);
//		j.start();
//		s.start();
//		
//		
//	}
//
//}
