package training;
class Ketten_details
{
	private String name;
	private String model;
	private int price;
	Ketten_details(String name , String model ,int price)
	{
		this.name=name;
		this.model=model;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

public class Computer {
	public static void main(String[] args) {
		Ketten_details d1 = new Ketten_details("Phillips","A1",1000);
		Ketten_details d2 = new Ketten_details("Bosch","B1",2000);
		Ketten_details d3 = new Ketten_details("Skype","C1",3000);
		System.out.println(d1.getName()+" "+d1.getModel()+" "+d1.getPrice());
		System.out.println(d2.getName()+" "+d2.getModel()+" "+d2.getPrice());
		System.out.println(d3.getName()+" "+d3.getModel()+" "+d3.getPrice());
		
	}

}
