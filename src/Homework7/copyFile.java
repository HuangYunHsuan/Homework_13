package Homework7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class copyFile {
	public static void main(String[] args) throws IOException {
		
		//先建檔案
		File f1 = new File("C:\\THA104_workspace\\Homework_13\\copyfrom.txt");
		File f2 = new File("C:\\THA104_workspace\\Homework_13\\paste.txt");

		copyFile(f1, f2);

	}

	private static void copyFile(File f1, File f2) throws IOException {
		try {

			String str;//假設要傳的資料為字串
			
			//接輸入端水管
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
            //接輸出端水管
			FileWriter fw = new FileWriter(f2);
			BufferedWriter bw = new BufferedWriter(fw);
			
			//因為要複製過去所以多一個PrintWriter
			PrintWriter pw = new PrintWriter(bw);
            //如果是傳照片的話
			//FileOutputStream fos = new FileOutputStream(f2);

			// byte[] b = new byte[4096];//自訂緩衝區byte[]資料
			
            //當字串不等於null(就是還有資料),就複製過去
			while ((str = br.readLine()) != null) {
				pw.write(str); // write將指定的字元寫入文件，print是位元
				
			}

			pw.close();
			br.close();

		} catch (FileNotFoundException er) {
			er.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}