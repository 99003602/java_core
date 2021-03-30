package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class easy {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Maintenance")).click();
		driver.findElement(By.linkText("Access Records")).click();
		driver.findElement(By.id("confirm_password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"frmPurgeEmployeeAuthenticate\"]/div/div/input")).click();
		driver.findElement(By.id("employee_empName")).sendKeys("Nina patel");
		//to scroll
		JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"frmAccessEmployeeData\"]/div/div/input")).click();
		
		/*driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		Select mon=new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
		mon.selectByValue("mar");*/
		
		WebElement ele=driver.findElement(By.linkText("Leave"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).build().perform();
		driver.findElement(By.linkText("Apply")).click();
	
		Select d=new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
		d.selectByValue("9");
		
		driver.findElement(By.xpath("//*[@id=\"frmLeaveApply\"]/fieldset/ol/li[3]/img")).click();
		Select year=new Select(driver.findElement(By.className("ui-datepicker-year")));
		year.selectByValue("2021");
		Select mon=new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
		mon.selectByValue("2");
		driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[5]/td[1]/a")).click();
		
		
}
}