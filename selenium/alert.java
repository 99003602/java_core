package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	public static void main(String[] args) throws InterruptedException {
		//to work with chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		/*driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	   driver.findElement(By.className("btn-default")).click();
	    Thread.sleep(5000);
	    driver.switchTo().alert().accept(); // when inspect is not working*/
	    //driver.close();// to close 
		
		
		/*driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize(); // to maximize the page
		
		driver.findElement(By.className("btn-lg")).click();
		 Thread.sleep(5000);
		 driver.switchTo().alert().dismiss(); // when inspect is not working use this command*/
		 
		 driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
			driver.manage().window().maximize(); // to maximize the page
			 
	         driver.findElement(By.className("btn-lg")).click();
			 Thread.sleep(5000);
			 sendkeys("jhf");
			 driver.switchTo().alert().accept(); // when inspect is not working use this command
		 
	}

	private static void sendkeys(String string) {
		// TODO Auto-generated method stub
		
	}

}
