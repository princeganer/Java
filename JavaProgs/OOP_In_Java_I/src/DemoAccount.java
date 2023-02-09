
class BankAccount
{
	private int acno;
	private static double rate;
	private String name;
	public BankAccount()
	{
		acno=100;
		name=null;
	}
	public BankAccount(int acno,String name)
	{
		this.acno=acno;
		this.name=name;
	}
	public static void setRate(double val)
	{
		rate=val;
	}
	public void showBankAccount()
	{
		System.out.println("------------------------");
		System.out.println(" Acno : "+acno);
		System.out.println(" name : "+name);
		System.out.println(" rate : "+rate);
		System.out.println("------------------------");
	}
	
}
public class DemoAccount {

	public static void main(String[] args) {
		
		
		BankAccount b1=new BankAccount(101,"Seeta");
		BankAccount b2=new BankAccount(102,"Geeta");
		BankAccount b3=new BankAccount();
		b1.setRate(7.6);
		
		
		b1.showBankAccount();
		b2.showBankAccount();
		b3.showBankAccount();
	}
}
