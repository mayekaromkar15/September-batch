package durga;

import java.io.File;
import java.util.Scanner;
//import java.io.IOException;
//import java.io.IOException;

public class Firstfile {
	
	public static void main(String[] args) throws Exception{
		System.out.println("               ░W░E░L░C░O░M░E░                                      ");
		while (true) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("\n>>> (っ◔◡◔)っ ♥ Please enter your name : ♥");
//		System.out.print("");
		String i = sc.next();
	
//		System.out.println("Enter ur credentials");
		if(i.equalsIgnoreCase("omkar")) {
	
			while (true) {
		
		System.out.println("ᴡʜᴀᴛ ᴡᴏᴜʟᴅ ʏᴏᴜ ʟɪᴋᴇ ᴛᴏ ᴅᴏ?\n"
				+ "\n【﻿１．】-- 【﻿Ａｄｄ　ｎｅｗ　ｄｉｒｅｃｔｏｒｙ】\n"
				+ "【﻿2．】-- 【﻿Ｄｅｌｅｔｅ　ｅｘｉｓｔｉｎｇ　ｄｉｒｅｃｔｏｒｙ】\n"
				+ "【﻿3．】-- 【﻿Ａｄｄ　ｎｅｗ　ｆｉｌｅ】\n"
				+ "【﻿4．】-- 【﻿Ｖｉｅｗ　ｔｈｅ　ｃｏｎｔｅｎｔｓ　ｐｒｅｓｅｎｔ　ｉｎ　ｔｈｅ　ｃｕｒｒｅｎｔ　ｄｉｒｅｃｔｏｒｙ】\n"
				+ "【﻿5．】-- 【﻿Ｅｘｉｔ】");
		int input = sc.nextInt();
		
					if(input == 1) {
			System.out.println("Enter a directory you would like to add");
			String a = sc.next();
			
			File f = new File("D:\\Full Stack\\Simplilearn\\Omkar_practice\\firstdir", a);
			f.mkdir();
			System.out.println("success");
		}
		
					else if(input == 2) {
			System.out.println("Which file do you want to delete");
			String a = sc.next();
			
			File f = new File("D:\\Full Stack\\Simplilearn\\Omkar_practice\\firstdir", a);
			f.delete();
			System.out.println("success");
		}
		
					else if(input == 3) {
			System.out.println("Enter a file name  you would like to add");
			String a = sc.next();
			
			File f = new File("D:\\Full Stack\\Simplilearn\\Omkar_practice\\firstdir", a);
			f.createNewFile();
			System.out.println("success");
		}
		
					else if(input == 4) {
			File f = new File("D:\\Full Stack\\Simplilearn\\Omkar_practice\\firstdir");
			int count = 0;
			String[] s = f.list();
			for(String s1:s) {
				System.out.println(s1);
				count++;
			}
			System.out.println("the total number of files present are :"+count);
		
			System.out.println("success");
		
	}	
					else if(input == 5) {
			System.out.println("Thank you :");
			break;
		}
		
		
		else {
			System.out.println("\nplease give a valid input :\n)");
		}
//		sc.close();
	}
}
		else {
			System.out.println("you are not a valid user :");
		}
}
	
}
}

