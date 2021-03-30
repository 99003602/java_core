package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		 
//		WebElement ele=driver.findElement(By.xpath("//*[@id=\"slider1\"]/div/input"));
//			Actions act= new Actions(driver);
//			act.dragAndDropBy(ele, 50, 0).build().perform();	
			
			WebElement ele1=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[5]/a"));
			WebElement ele2=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/div/ol/li"));
			Actions act1= new Actions(driver);
			
			act1.dragAndDrop(ele1, ele2).build().perform();
			
}}
