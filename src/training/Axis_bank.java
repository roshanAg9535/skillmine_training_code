package training;
class Bankdetails
{
	private String name;
	private String address;
	private int balance;
	Bankdetails(String name,String address,int balance)
	{
		this.name=name;
		this.address=address;
		this.balance=balance;
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
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void showbalance()
	{
		System.out.println("Account holder name "+name+" Balance is "+balance);
	}
	public void deposit(int amount)
	{
		if(amount<=0)
		{
			System.out.println("The amount deposit should be greater than zero");
		}
		else
		{
			balance = balance+amount;
			System.out.println("The amount "+amount+" deposit successfully");
			showbalance();
		}
	}
	public void withdraw(int amount)
	{
		if(amount<=balance)
		{
			balance = balance-amount;
			System.out.println("The amount "+amount+" withdrawn succesfully");
			showbalance();
		}
		else
		{
			System.out.println("Insufficient balance");
			showbalance();
		}
	}
}

public class Axis_bank {

	public static void main(String[] args) {
		Bankdetails b1 = new Bankdetails("Roshan","Bangalore",7000);
		System.out.println(b1.getName()+" "+b1.getAddress()+" "+b1.getBalance());
		b1.deposit(2000);
		b1.withdraw(1000);

	}

}
