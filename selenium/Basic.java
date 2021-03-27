package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basic {
public static void main(String[] args) throws InterruptedException {
	System.out.println("welcome to java ");
	//to work with chrome
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	/*driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
    driver.findElement(By.name("Submit")).click();*/
	driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    driver.findElement(By.className("form-control")).sendKeys("Admin");
   
    Thread.sleep(5000);
    driver.findElement(By.id("at-cv-lightbox-close")).click();
  //Thread.sleep(5000);
    driver.findElement(By.className("btn-default")).click();
	
}
}
