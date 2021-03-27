package selenium;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IBEF {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ibef.org/ibefusers/signupRequest");
		driver.findElement(By.id("signupFname")).sendKeys("chandan");
		driver.findElement(By.id("signupLname")).sendKeys("j");
		driver.findElement(By.xpath("//*[@id=\"userSignUpForm\"]/div/div/div[2]/ul[1]/li/span[1]/span/a")).click();
		driver.findElement(By.id("signupEmail")).sendKeys("chandanhuliyar@gmail.com");
		driver.findElement(By.id("signupPassword")).sendKeys("Chandan@12");
		driver.findElement(By.id("signupCPassword")).sendKeys("Chandan@12");
		driver.findElement(By.id("signupUserOrg")).sendKeys("ltts");
		driver.findElement(By.id("signupUserContact")).sendKeys("12345678");
		//driver.findElement(By.xpath("//*[@id=\"userSignUpForm\"]/div/div/div[2]/ul[2]/li[6]/div/div/span")).click();
		//driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/form/div/div/div[2]/ul[2]/li[6]/div/ul/li[25]/a")).click();
		
		//Type the entered captcha to the text box
		driver.findElement(By.xpath("//*[@id=\"userSignUpForm\"]/div/div/div[2]/ul[2]/li[8]/span[1]/a")).click();
	
	}
}
