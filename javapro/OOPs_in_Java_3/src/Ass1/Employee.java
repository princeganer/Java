package Ass1;

public class Employee {
	private int eid;
	private String name;
	private Date doj;
	
	public Employee() {
		eid=0;
		name=null;
		doj=null;
	}
	public Employee(int eid, String nm, Date doj) {
		super();
		this.eid = eid;
		this.name = nm;
		this.doj = doj;
	}
	
	public Employee(int eid, String nm, int d, int m, int y) {
		super();
		this.eid = eid;
		this.name = nm;
		doj= new Date(d,m,y);
	}
	
	
	public void	DisplayEmployee() {
		System.out.println("--------------------");
		System.out.println("Employee Id :"+eid);
		System.out.println("Employee Name :"+name);
		doj.Display();
		/*System.out.println("Employee DOJ :"+doj.Display());*/ //
		System.out.println("--------------------");
	
	}
	 
}
