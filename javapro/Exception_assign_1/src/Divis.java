public class Divis {

	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int div= num1/num2;

			System.out.println("Result "+div);

		}
		catch(ArithmeticException z)
		{
			System.out.println("Number 2 can not be zero"+z.getMessage());
			z.printStackTrace();
		}
		
		catch(NumberFormatException f)
		{
			System.out.println("Number format check"+f.getMessage());
			f.printStackTrace();
		}


	}

}
