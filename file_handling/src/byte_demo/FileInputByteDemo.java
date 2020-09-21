package byte_demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputByteDemo {

	public static void main(String[] args) {
		
		try(FileInputStream fis=new FileInputStream("bytedemo.txt");
				BufferedInputStream bis=new BufferedInputStream(fis);
				){
			System.out.println("Bytes available before read "+bis.available());
			//System.out.println((char)bis.read());
			StringBuilder sb=new StringBuilder();
			while(bis.available()!=0) {
				sb.append((char)bis.read());
			}
			System.out.println("Bytes available after read "+bis.available());
			System.out.println("Message extracted from the file is ");
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
