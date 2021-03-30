package firefox_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class trxt {
	
	@Test
	public void login(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");

        WebDriver driver=new FirefoxDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
//        driver.switchTo().frame("SingleFrame");
//        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("abcd");
        
        driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
       
      
        driver.switchTo().frame(1);
        driver.switchTo().frame(0);
        String s=driver.getCurrentUrl();
        System.out.println("current url="+s);
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("abcd");
}
}