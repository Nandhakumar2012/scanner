package org.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcarttest
{
  public static void main(String[] args)
  {
	 
	System.setProperty("webdriver.chrome.driver", "C:\\ProjectClassPractice\\driver\\chromedriver.exe");
	
   WebDriver driver=new ChromeDriver();
   
   driver.get("https://www.flipkart.com/");
   
   driver.manage().window().maximize();
   
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
   
  System.out.println("test1.....");
  
  System.out.println("test2.....");
  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	 
	 
	 
	 
	 
}
}
