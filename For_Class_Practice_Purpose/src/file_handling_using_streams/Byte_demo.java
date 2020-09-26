package file_handling_using_streams;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byte_demo {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("again.txt");
			bos = new BufferedOutputStream(fos);
			
			
			String message="\nI am new message tooooo";
			byte b[]=message.getBytes();
			bos.write(b);
			System.out.println("Your message is written inside the file");
			
		} catch (FileNotFoundException  e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				bos.flush();
				bos.close();
				fos.close();
			} catch (IOException e) {
				System.out.println(e);
			}
			
		}
		
		
		
	}

}
