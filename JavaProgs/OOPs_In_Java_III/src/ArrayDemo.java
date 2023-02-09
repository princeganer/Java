
public class ArrayDemo {
	public static void display(int a[])
	{
		System.out.println("\n--------------------\n");
		for(int i=0;i<a.length;i++)
			System.out.print("   "+a[i]);
		System.out.println("\n--------------------\n");
	}
	public static void main(String[] args) {
		
		int arr[]= {32,43,54,76,786};
		int arr1[]= {54,34,65,87,34,65,32,43,54,76,786};
		int arr2[]= {32,43,54};
		
		display(arr);
		display(arr1);
		display(arr2);
		
		
		
	}

}
