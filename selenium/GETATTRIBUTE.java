package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GETATTRIBUTE {
	public static void main(String[] args) throws Exception {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//	driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
//	String s=driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]")).getText();
//    System.out.println(s);
//    
    driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
	WebElement f=driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr[5]/td[2]"));
	String s=f.getText();
   System.out.println(s);
   
    WebElement g=driver.findElement(By.xpath("//*[@class='table']/tbody/tr[5]/td[2]"));
   	String k=g.getText();
       System.out.println(k);
    
}
}//*[@id=”customers”]/tbody/tr[2]/td[2]