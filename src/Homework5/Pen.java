package Homework5;

abstract class Pen {
	
		protected String brand;
		protected double price;
		
		abstract void write();
		
		public void setData(String brandx, double pricex) {
			brand = brandx;
			if(pricex > 0) 
				price = pricex;
			else
				
				System.out.println("!!!請確認售價設定!!!");
			
		
		}
		public void getData(String brand, double price) {
               this.brand=brand;
               this.price=price;
		}
			
		
	}
 class Pencil extends Pen{
	 public void write() {
		 System.out.println("品牌為="+ brand);
		 System.out.println("建議售價為="+ price*0.8);
		 System.out.println("削鉛筆再寫");
	 }
 }
 
 class InkBrush extends Pen{
	 public void write() {
		 System.out.println("品牌為="+ brand);
		 System.out.println("建議售價為="+ price*0.9);
		 System.out.println("沾墨汁再寫");
	 }
 }
