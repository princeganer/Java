package Ass1;

public class Array {
	
	public static int max(int []arr){
		int max= arr[0];
		for(int i=1; i<=4; i++){
			if(arr[i]>max){
				max= arr[i];
			}
		}
		return max;
	}
	
	public static int min(int []arr){
		int min= arr[0];
		for(int i=1; i<=4; i++){
			if(arr[i]<min){
				min= arr[i];
			}
		}
		return min;
	}

	
	public static int avg(int []arr){
		int sum=0;
		
		for(int i=0; i<=4; i++){
			sum= sum+ arr[i];
		}
		return sum/5;
	}

		
	public static void main(String []arg) {
		
		int []ar= {10,20,30,40,50};
		int max1, min1 ,avg1;
		
		max1 = max(ar);
		System.out.println("max"+max1);
	}
}

		
		
	


