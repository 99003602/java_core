package firefox_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class login {
	WebDriver driver;
	@Test(priority=0,description = "launching the program",enabled=false)
	public void launch()
	{
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
//
//        driver=new FirefoxDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		System.out.println("a");
	}
	
	@Test(priority=1,description ="")
	public void loginn()
	{
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();
		System.out.println("b");
	}
	
	@Test(priority=2)
	public void logout() throws InterruptedException
	{
//		Thread.sleep(5000);
//		driver.findElement(By.linkText("Welcome Paul")).click();
//		driver.findElement(By.linkText("Logout")).click();
		System.out.println("c");
	}
}
