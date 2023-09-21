package Homework5;

public class testPen {
	
	public static void main(String[]args) {
		Pen a = new Pencil();
		a.setData("a牌", 30 );
		Pen b = new InkBrush();
		b.setData("b牌", -100.0);
		
		a.write();
		System.out.println("=================");
		b.write();
	}

}
