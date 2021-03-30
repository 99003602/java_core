package selenium;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliders {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.findElement(By.linkText("Home Loan")).click();
		
		//loan amount
	    WebElement ele=driver.findElement(By.id("loanamountslider"));
		Actions act= new Actions(driver);
		act.dragAndDropBy(ele, 110, 0).build().perform();
		
		//interest rate
		 WebElement ele1=driver.findElement(By.id("loaninterestslider"));
	     Actions act1= new Actions(driver);
	     act1.dragAndDropBy(ele1, 50, 0).build().perform();
	     
	     WebElement ele2=driver.findElement(By.id("loantermslider"));
	     Actions act2= new Actions(driver);
	     act2.dragAndDropBy(ele2, 50, 0).build().perform();
	     

}
}