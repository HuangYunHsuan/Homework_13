package Homework7;

import java.io.EOFException;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DogCat {
	public static void main(String[] args) throws Exception {

		File file = new File("C:\\THA104_Workspace\\Homework_13\\src\\data\\Object.ser"); // .ser(就是那個空介面)存著物件的檔案
		File file2 = new File("C:\\THA104_Workspace\\Homework_13\\src\\data");

		// 用程式創造data資料夾
		if (!file2.exists()) {
			file2.mkdirs();
		}

		Cat cat = new Cat("貓");
		Dog dog = new Dog("狗");

		// 輸出Dog與Cat類別分別產生的兩個物件到Object.ser
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos); // 使用ObjectOutputStream類別將物件寫出
		oos.writeObject(cat);
		oos.writeObject(dog);

		oos.close();
		fos.close();

		// 輸入Object.ser在console印出
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis); // 使用ObjectOutputStream類別將物件讀入
		System.out.println(file.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while (true) { // 一直讀入資料，直到沒資料又繼續處理而產生意外
				// 物件反序列化
				((Cat) ois.readObject()).speak(); // 透過資料流.readObject然後呼叫方法speak(),因為物件是Object類別,參照不到所以要轉型才能呼叫到Cat的方法,
				// 把ois.readObject括號轉型,不然會以為是整個到speak()的結果要轉型,speak()方法的回傳是void
				((Dog) ois.readObject()).speak();
			}
		} catch (EOFException e) { // 針對源頭沒有資料又繼續處理的例外
			System.out.println("資料讀取完畢！"); // 代表已經沒資料了
		}

		ois.close();
		fis.close();

	}
}