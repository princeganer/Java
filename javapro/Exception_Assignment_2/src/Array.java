
public class Array {

	public static void main(String[] chim) {
		int size, i, j, index;

		System.out.println("Enter the size of the array. ");
		size= Integer.parseInt(chim[0]);
		System.out.println(size);
		
		try {

			int []arr =new int [size];
			for(i=0, j=1; i< size; i++, j++) {
				System.out.println("Enter array element :");
				arr[i]=	Integer.parseInt(chim[j]);
				System.out.println(arr[i]);
				if(i==(size-1)) {
					break;
				}
			}
			
			System.out.println("Enter indexof element (from 0) :");
			index= Integer.parseInt(chim[arr.length+1]);
			System.out.println("Indexof :"+index);
			
			System.out.println("Your element is "+arr[index]);
			
			//arr[i]=	Integer.parseInt(chim[]);
			
		}
		
		catch(NumberFormatException a) {
			System.out.println(a.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException s) {
			System.out.println(s.getMessage());
		}
	}

}
