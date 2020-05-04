package com.tests.Git_Gmail_MavenProject7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	
	 public static  WebDriver driver;
	   
	   @BeforeTest
	   public void SetUp(){
		   System.setProperty("webdriver.chrome.driver", "D:\\EduSol\\Selenium Jar Files\\Selenium Webdrivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.gmail.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30L ,TimeUnit.SECONDS);
	   }
	   
	   @Test
	   public void doLogin(){
	    driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("shahinsayyed66@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("shahin@123456");
		driver.findElement(By.xpath("//*[@id='passwordNext']/span/span")).click();
		
		 /* driver.findElement(By.xpath("//*[@id=':k0']/div/div")).click();
		  driver.findElement(By.xpath("//*[@id=':pk']")).sendKeys("shahinsayyed8421@gmail.com");
		  driver.findElement(By.xpath("//*[@id=':p2']")).sendKeys("MavenProject1");
		  driver.findElement(By.xpath("//*[@id=':q7']")).sendKeys("File doesn't attach");
		  driver.findElement(By.xpath("//*[@id=':os']")).click();*/
		   //driver.findElement(By.xpath("//*[@id=':y0']")).click();
	   }
	   
	   
	   /* @AfterTest
	   public void closing()
	   {
		   driver.close();
		   
		   }*/
	    
}
