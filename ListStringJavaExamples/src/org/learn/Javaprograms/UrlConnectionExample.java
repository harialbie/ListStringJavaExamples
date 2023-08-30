package org.learn.Javaprograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class UrlConnectionExample {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jarfiles\\chromedriver_win32\\chromedriver.exe"); WebDriver driver=new
				ChromeDriver(); driver.get("https://testmatick.com/best-demo-websites-to-perform-software-test-automation/");
				driver.manage().window().maximize(); 

				List<WebElement> listElements=driver.findElements(By.xpath("//a"));
				List<WebElement> activeElements=new ArrayList<WebElement>();

				for(WebElement ele : listElements) {

					if(ele.getAttribute("href") != null && ele.getAttribute("href").startsWith("https")) {

						activeElements.add(ele);
					}
				}

				System.out.println("The Attribute links are");

				for(int i=0;i<activeElements.size();i++) {

					System.out.println(activeElements.get(i).getAttribute("href"));

				}

				/*
				 * for(int i=0;i<activeElements.size();i++) {
				 * 
				 * System.out.println(activeElements.get(i).getText());
				 * 
				 * HttpURLConnection url=(HttpURLConnection) new
				 * URL(activeElements.get(i).getAttribute("href")).openConnection();
				 * url.connect();
				 * System.out.println(activeElements.get(i).getAttribute("href")+"--->"+url.
				 * getResponseCode()); System.out.println(url.getResponseMessage());
				 * url.disconnect(); }
				 */
				activeElements.parallelStream().forEach(e -> {
					try {
						connectUrl(e);
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				});

			//
				activeElements=null;
				listElements=null;
				driver.quit();

	}
	public static void connectUrl(WebElement ele) throws MalformedURLException, IOException {
		HttpURLConnection url=(HttpURLConnection) new URL(ele.getAttribute("href")).openConnection();
		url.connect();
		System.out.println(ele.getAttribute("href")+"--->"+url.getResponseCode());  
		System.out.println(url.getResponseMessage());  
		url.disconnect();
	}

}
