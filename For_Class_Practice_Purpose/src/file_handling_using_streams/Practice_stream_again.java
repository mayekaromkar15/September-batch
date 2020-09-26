package file_handling_using_streams;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice_stream_again {
	
	public static void main(String[] args) {
		FileOutputStream fo = null;
		BufferedOutputStream bo = null;
		
		try {
			fo = new FileOutputStream("newfile.txt");
			bo = new BufferedOutputStream(fo);
			
			String input = "Take me as an input";
			byte b[] = input.getBytes();
			bo.write(b);
			System.out.println("Your message is written inside the file");
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
			finally {
				try {
					bo.flush();
					bo.close();
					fo.close();
				} catch (IOException e) {
					System.out.println(e);
				}
			}
		
	}

}
