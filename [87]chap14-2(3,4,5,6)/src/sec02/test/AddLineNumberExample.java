package sec02.test;

import java.io.*;

public class AddLineNumberExample {

	public static void main(String[] args) throws Exception {
		String filePath = "src\\sec02\\test\\AddLineNumberExample.java";
		Reader read = new FileReader(filePath);
		BufferedReader br = new BufferedReader(read);
		
		int i=1;
		String r;
		while(true) {
			r=br.readLine();
			if(r==null) {
				break;
			}
			System.out.println(i+": "+r);
			i+=1;
		}
		
	}

}
