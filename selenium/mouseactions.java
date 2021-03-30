package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseactions {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement ele=driver.findElement(By.linkText("Leave"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).build().perform();
		//driver.findElement(By.linkText("Apply")).click();
		
		WebElement ele1=driver.findElement(By.linkText("Recruitment"));
		Actions act1= new Actions(driver);
		act1.moveToElement(ele1).build().perform();
		driver.findElement(By.linkText("Candidates")).click();
		
		WebElement ele2=driver.findElement(By.linkText("Entitlements"));
		Actions act2= new Actions(driver);
		act2.moveToElement(ele2).build().perform();
		driver.findElement(By.linkText("Employee Entitlements")).click();
}
}