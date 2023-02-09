import java.util.List;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		List<Integer>  brocode = new ArrayList<>();
		brocode.add(50);
		brocode.add(60);
		brocode.add(40);
		brocode.add(80);
		brocode.add(55);
		brocode.add(69);
		brocode.add(99);
		System.out.println(brocode);

		List<Integer> Even = new ArrayList<>();
		List<Integer> Odd  = new ArrayList<>();
		
		public List<Integer> evenf(){
		
		for(int i = 0 ; i<brocode.size(); i++ )
			
			if(brocode.get(i)%2 == 0) {
				Even.add(brocode.get(i));
				
			}else {
				Odd.add(brocode.get(i));
			}
		return Even;
		}
		
		System.out.println(Odd);
		System.out.println(Even);
	}

}
 