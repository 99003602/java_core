package firefox_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class basic {
	
	static String drivername="webdriver.gecko.driver";
    static String driverpath="C:\\\\Users\\\\Training\\\\Downloads\\\\geckodriver-v0.29.0-win64\\\\geckodriver.exe";
        static WebDriver driver;
        static
       {

			System.setProperty(drivername,driverpath);

			driver=new FirefoxDriver();

			driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

			driver.manage().window().maximize();

			

		}

	@Test
	public void alert1() throws InterruptedException {
		
        //alert
        driver.findElement(By.className("btn-default")).click();
        Thread.sleep(5000);
       driver.switchTo().alert().accept();
	}
	
	@Test
	void alert2() throws InterruptedException {
		
        //alert(accept and decline
        driver.findElement(By.className("btn-lg")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        driver.findElement(By.className("btn-lg")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().dismiss();
	}
	@Test
	void alert3() throws InterruptedException {
		
        
       
		 
		Thread.sleep(1000);

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(3000);
		
         driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
		 Thread.sleep(5000);
		 driver.switchTo().alert().sendKeys("jhf");
		 driver.switchTo().alert().accept(); // when inspect is not working use this command
	}
	@Test
		 void close() {
		
			 driver.close();
		 }
	
}
