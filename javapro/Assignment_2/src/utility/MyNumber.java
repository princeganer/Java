package utility;

public class MyNumber implements IntOperations {
	private int num;
	
	public MyNumber() {
		num=5;   
	}
	
	public MyNumber(int num) {
		this.num= num; 
	}
	
	public boolean isOdd() {
		boolean go=true;
		if(num%2 == 0) {
			go= false;
		}
		return go;
	}
	
	public boolean isEven() {
		boolean go=true;
		if(num%2 != 0) {
			go= false;
		}
		return go;
	}
	
	public boolean isPrime() {
		boolean go=true;
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				go= false;
				break;
			}
		}
		return go;
	}
	
	public int calFactorial() {
		for(int i=num;i>1;i--) {
			num= num*i;
		}
		return num;
	}
}
