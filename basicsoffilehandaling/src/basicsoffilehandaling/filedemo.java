package basicsoffilehandaling;

import java.io.File;
import java.io.IOException;



public class filedemo {
public static void main (String[]args) throws IOException {
	
	File f=new File("/home/pratik/Desktop/filehandaling.txt/demo.txt");
	boolean newFile=f.createNewFile();
			
           if(newFile) {
			System.out.println("file created sucessfull!!!");
			
		}else {
			System.out.println("file not created!!");
		}
			
			
	
}
}
