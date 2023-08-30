package org.learn.Javaprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BufferedWriterExample {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 String location="BufferedWriterfile.txt";
		 String content="This is Buffered writer content \nAnd Learn it \nit is interesting";

		 FileWriter filewriter=new FileWriter(location);
		 BufferedWriter bufferedwriter=new BufferedWriter(filewriter);
		 bufferedwriter.write(content);
		 bufferedwriter.close();
		 
		 FileReader filereader= new FileReader(location);
		 BufferedReader reader=new BufferedReader(filereader);
		 
		 String read=reader.readLine();
		 while (read!=null) {
			 // read=reader.readLine();
			 System.out.println(read);
			 read=reader.readLine();
		}
	
		 
		 reader.close();
		 
			
			  System.setProperty("webdriver.chrome.driver",
			  "E:\\Jarfiles\\chromedriver_win32\\chromedriver.exe"); WebDriver driver=new
			  ChromeDriver(); driver.get("http://www.google.com");
			  driver.manage().window().maximize(); driver.quit();
			  driver.quit();
			  System.out.println("Fine....");
			  driver.quit();
		 FileInputStream fileinputstream=new FileInputStream("configure.properties");
		 Properties properties=new Properties();
		 properties.load(fileinputstream);
		 
		 System.out.println(properties.get("browser"));
		
	}
}
