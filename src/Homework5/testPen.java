package Homework5;

public class testPen {
	
	public static void main(String[]args) {
		Pen a = new Pencil();
		a.setData("a牌", 30 );
		a.write();
		
		System.out.println("=================");
		
		Pen b = new InkBrush();
		b.setData("b牌", -100.0);
		b.write();
	}

}
