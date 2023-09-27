package Homework7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class readSample {

	public static void main(String[] args) throws IOException {

		// 先接資料流讀取文字檔
		//讀入資料
		FileInputStream fr = new FileInputStream("C:\\THA104_workspace\\Homework_13\\Sample.txt");
		//從位元資料流轉為字元資料流
		InputStreamReader rr = new InputStreamReader(fr);
		//接上BufferedReader使用ReadLine
		BufferedReader br = new BufferedReader(rr);

		int xxx = 0;
		int yyy = 0;
		int zzz = 0;
		xxx = fr.available();

		// BufferedReader---readLine()---!= null
		String str;
		while ((str = br.readLine()) != null) {
			yyy += str.length();// 字元個數就是字元長度
			zzz++;// 因為是按行讀取，所以每次增加一即可計算出行的數目
		}

		br.close();
		rr.close();
		fr.close();

		// 輸出以下訊息：Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
		System.out.println("Sample.txt檔案共有");
		System.out.println(xxx + "個位元組");
		System.out.println(yyy + "個字元");
		System.out.println(zzz + "列資料");
	}

}
