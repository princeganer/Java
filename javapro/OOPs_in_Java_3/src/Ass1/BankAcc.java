package Ass1;

public class BankAcc {
	private int accno;
	private float bal;
	private static float int_rate;
	private static int count;
	
	static {
		count=100;
		int_rate= 6.9f;
	}
	
	public BankAcc(){
		accno= ++count;
		bal= 0.0f;
	}
	
	public BankAcc(int accno, float bal){
		this.accno= accno;
		this.bal= bal;	
	}
	
	public static void updateIntRate(float int_rates) {
		int_rate= int_rates;
	}
	
	public void showBal() {
		float bal1;
		bal1= bal + bal*int_rate/100;
		System.out.println("Account no: "+accno+" has Balance : "+bal1);
	}
	
}
