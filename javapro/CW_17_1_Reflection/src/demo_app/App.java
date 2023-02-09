package demo_app;
import util.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class App {

	public static void main(String[] args) {
		Employee E = new Employee();
		Class obj = E.getClass();
		System.out.println(obj);
		
		
		System.out.println("--------Constructors----------");
		Constructor carr[]=obj.getConstructors();
		for(Constructor c: carr) {
			System.out.println("Name:"+c.getName()+" Modifiers: "+c.getModifiers());
		}
		
		
		System.out.println("--------Methods----------");
		Method []marr=obj.getMethods();
		for(Method m: marr) {
			System.out.println(m.getName()+" "+m.getModifiers());
		}
		
		
		/*System.out.println("--------Parameters----------");
		Parameters p = obj.
		
		*/

	}

}
