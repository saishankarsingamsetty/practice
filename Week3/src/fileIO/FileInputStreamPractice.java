package fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamPractice {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("src/abc.txt");
		FileOutputStream fos=new FileOutputStream("src/bbc.txt",false);
		int data=0;
		while((data=fis.read())!=-1) {
			fos.write(data);
		}
		
		fis.close();
		
		
		//WRITING INTO A FILE
		
		fos.write(99);
		fos.flush();
		fos.close();
	}
}
