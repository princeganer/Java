package Ass1;

class DemoBox{
	private int length,height,width;
	
	public DemoBox() {
		
	}
	public DemoBox(int l, int h, int w) {
		length=l;
		height=h;
		width=w;
	}
	
	public void Calvol()
	{
		System.out.println("Volume :"+(length*height*width));
		
	}
	
	
}
public class Box {
	
	public static void main(String[] args) {
	
		DemoBox b[]=new DemoBox[3];
		DemoBox b1=new DemoBox(1,2,3);
		DemoBox b2=new DemoBox(4,5,6);
		DemoBox b3=new DemoBox(7,8,9);
		b[0]=b1;
		b[1]=b2;
		b[2]=b3;
		
		b[0].Calvol();
		b[1].Calvol();
		b[2].Calvol();
	}

}
