package Ass1;

class ArrayA{
	private int i;
	private static int [][]arr= {{3,5,1}, {5,1,3},{9,4,3}};
	
	public static void sumRow(int [][]arr) {
		int i=0, j=0,sum=0;
		
		for(i=0;i<=2;i++) {
			for(j=0;j<=2; j++) {
				sum= sum + arr[i][j];
			}
			if(i==0){
				int s1=sum;
				System.out.println(s1);
				sum=0;
			}
			if(i==1){
				int s2=sum;
				System.out.println(s2);
				sum=0;
			}
			if(i==2){
				int s3=sum; 
				System.out.println(s3);
				sum=0;
			}
		}
	
	}
	
}

public class ArraySum {
	
	public static void main(String[] args) {
		int [][]ar= {{3,5,1}, {5,1,3},{9,4,3}};
		int outp;
		
		ArrayA f1= new ArrayA();
		
		ArrayA.sumRow(ar);
		
		

	}

}
