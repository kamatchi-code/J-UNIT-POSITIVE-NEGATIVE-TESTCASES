package itlearnpositivenegativetestcases;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitUser1 {
	public static WebDriver driver;
	
	 @BeforeClass
   public static void beforeCla() {
		 driver=new ChromeDriver();
		 driver.get("https://www.itlearn360.com/");
		 
		// TODO Auto-generated method stub
	    	System.out.println("before class");

	}
	    @AfterClass
	    public static void afterCla() {
	    	driver.quit();
			// TODO Auto-generated method stub
	    	System.out.println("after class");

		}
	    @Before
	    public void before() {
	    	Date d = new Date();
			System.out.println("start time "+d);
	    	System.out.println("hi start");

	    	
			
		}
	    @After
	    public void after() {
	    	Date d = new Date();
			System.out.println("start time "+d);
	    	System.out.println("hi end");

	    

		}
	    @Test
	    public void test() throws InterruptedException {
	    	WebElement sign = driver.findElement(By.xpath("//span[contains(text(),'Sign in?')]"));
			sign.click();
			driver.manage().window().fullscreen();
			Thread.sleep(2000);
			
			//user sign in
			WebElement element = driver.findElement(By.id("ser_login"));// Entered wrong locator
			element.sendKeys("KAMATCHI11");//negative test case
			Thread.sleep(2000);
			
			
		}
	    @Test
	    public void test1() throws InterruptedException, IOException {
	    	WebElement element2 = driver.findElement(By.id("user_pass"));//positive test case
			element2.sendKeys("MIAMI@123$");
			WebElement element3 = driver.findElement(By.name("wp-submit"));
			element3.click();
			//
			TakesScreenshot ts = (TakesScreenshot)driver;//downcasting
			File sc1 = ts.getScreenshotAs(OutputType.FILE);
			File sc2= new File("C:\\Users\\kamsr\\OneDrive\\Desktop\\SeleniumBrowser\\ScreenShot\\fail.png");
			FileUtils.copyFile(sc1,sc2);
			driver.manage().window().maximize();
		
	    	Thread.sleep(2000);
	    	
	    	

//Disadvantage it can run only in albetic order,can't give priority,
	    	//so we go for TestNG
}
}
