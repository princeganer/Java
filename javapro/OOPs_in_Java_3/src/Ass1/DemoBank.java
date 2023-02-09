/*
 * Assignment 1: Add the static variable as int_rate(float), initialize in the static block.
 *               Add the static method updatelntRate() for updating existing int_rate.
 *               Display the balance with interest calculated as per int_rate.
 *               Modify int_rate and show the balance with int_rate.
 */

package Ass1;

public class DemoBank {

	public static void main(String[] args) {
		
		BankAcc b1= new BankAcc();
		b1.showBal();
		
		BankAcc b2= new BankAcc(203, 45.21f);
		b2.showBal();
		
		BankAcc b3= new BankAcc(210, 100f);
		b3.showBal();
		
		BankAcc.updateIntRate(4.5f);
		
		BankAcc b4= new BankAcc(310, 100.0f);
		b4.showBal();
		
		b3.showBal();

	}

}
