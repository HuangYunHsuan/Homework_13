package Homework7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.PrintStream;

public class Random1_100 {

	public static void main(String[] args) throws IOException {
		//此處極為輸入端,故不需要再連資料輸入端
		// p.155 append=false,新增的資料附加在後面
		// append=false,新增的資料覆蓋掉前面的資料
		FileOutputStream fos = new FileOutputStream("C:\\THA104_workspace\\Homework_13\\Data.txt", true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);

		for (int i = 1; i <= 10; i++) {
			ps.println((int) (Math.random() * 1000) + 1);
		}

		ps.close(); // 記得關水管
		bos.close();
		fos.close();

	}
}
