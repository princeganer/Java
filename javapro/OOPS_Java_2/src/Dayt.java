/*
 * Class Program: 
 */
class Dayts{
	private int Dayt, Mon, Year;
	static int count=0;
	
	public Dayts() {    // default constructor
		Dayt= 01;
		Mon= 10;
		Year= 2012;
		count= ++count;
	}
	
	public Dayts(int d, int m, int y) {
		this.Dayt=d;
		this.Mon=m;
		this.Year=y;
		count= ++count;     // giving 0 for c++, ++c gives correct
		                    // as it first increments then assigns
	}
	
	public static void showCount(){
		System.out.println("Count is :"+count);
	}
}



public class Dayt {

	public static void main(String[] args) {
		Dayts d1=new Dayts();
		Dayts d7=new Dayts(1,1,1);
		Dayts d89455=new Dayts(2,2,2);
		Dayts d120=new Dayts(3,3,3);
		Dayts d78596244=new Dayts();
		Dayts d7856244=new Dayts();
		Dayts.showCount();
		

	}

}
