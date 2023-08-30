
package org.learn.Javaprograms;
  
  import java.io.FileNotFoundException; import java.io.FileOutputStream; import
  java.io.IOException;
  
  public class FileOutputStreamExample {
  
  public static void main(String[] args) throws IOException {
	  // TODO  Auto-generated method stub 
	  String location="FileOutputStream.txt"; 
	  String content="This is FOS content";
  
  FileOutputStream fileoutputstream=new FileOutputStream(location); 
  byte[]  bytes=content.getBytes(); 
  System.out.println(bytes);
  fileoutputstream.write(bytes);
  fileoutputstream.close(); }
  
  }
 