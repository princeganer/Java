package app;

class Base
{
	public static void fun()
	{
		System.out.println(" I am In Base class Static Method");
	}
	public void fun1()
	{
		System.out.println(" In class Base fun1 ");
	}
}
class Derive extends Base
{
	
	
	public void fun1()
	{
		System.out.println(" In class Base fun1 ");
		super.fun();
	}
	
}


// Accept 5 integer from command line and create it's array
public class Test {
	public static void main(String [] args) {
		
		String str;
		int arr[]=new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			/* int Integer 
			// char Character
			int a;
			Integer aa;
			char ch;
	       Character chh;
	       chh.
			aa.
			*/
		arr[i]=Integer.parseInt(args[i]);
			
		}
		
		
	}

}
