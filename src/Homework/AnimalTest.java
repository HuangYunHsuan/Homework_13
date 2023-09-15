package Homework;

public class AnimalTest {

	public static void main(String[] args) {
		// 只打10.5時,因屬性為Double故無法呼叫,需更改為f
		Animal dog = new Animal(2, 5.0f);
		// 需使用設定的物件dog呼叫方法speak
		dog.speak();

	}

}
