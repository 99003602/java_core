package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize(); 
		
	/*	Select dd=new Select(driver.findElement(By.id("select-demo")));
				dd.selectByVisibleText("Sunday");
				Thread.sleep(5000);
				dd.selectByValue("Friday");
				Thread.sleep(5000);
				dd.selectByIndex(3);
				Thread.sleep(5000);*/
//multi select
		
		Select d=new Select(driver.findElement(By.id("multi-select")));
	
		
	    d.isMultiple();
		driver.findElement(By.id("printAll")).click();;
		
}
}