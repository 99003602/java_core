package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
			 
			Thread.sleep(1000);

			JavascriptExecutor js = ((JavascriptExecutor) driver);

			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

			Thread.sleep(3000);
			
	         driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
			 Thread.sleep(5000);
			 driver.switchTo().alert().sendKeys("jhf");
			 driver.switchTo().alert().accept(); // when inspect is not working use this command
		 
	}

	private static void sendkeys(String string) {
		// TODO Auto-generated method stub
		
	}

}
