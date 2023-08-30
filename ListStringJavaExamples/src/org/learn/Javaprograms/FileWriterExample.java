/**
 * 
 */
package org.learn.Javaprograms;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Harikrishnan
 *
 */
public class FileWriterExample {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 String location="Sample.txt";
		 String content="Learning Automation";

		 FileWriter filewriter=new FileWriter(location);
		 filewriter.write(content);
		 filewriter.close();
	}
	
}
