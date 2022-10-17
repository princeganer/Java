
public class ThreadingApp {

	public static void main(String[] args) {
		
		MyThread F1 = new MyThread ();
		MyThread F2 = new MyThread ();
		MyThread F3 = new MyThread ();
		MyThread F4 = new MyThread ();
		MyThread F5 = new MyThread ();
		
		F1.start();
		F2.start();
		F3.start();
		F4.start();
		F5.start();
		
		F1.setName("Shell");
		F2.setName("Red bull");
		F3.setName("Ford");
		F4.setName("Ferrari");
		F5.setName("Bosch");
		F1.setPriority(4);
		//Thread.currentThread().setName("BOSCH");
		System.out.println(Thread.currentThread().getName());
	}

}
