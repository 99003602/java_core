package selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class icici {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://loan.icicibank.com/asset-portal-all/check-eligibility?loanType=al&WT.mc_id=Desk_OAPN_cms_cl_index_btn_applynow");
		driver.findElement(By.xpath("//*[@id=\"carRelbtn\"]")).click();
		driver.findElement(By.linkText("New Car Loan")).click();
		driver.findElement(By.id("MOBILENUM")).click();
		driver.findElement(By.id("MOBILENUM")).sendKeys("7406522053");
		driver.findElement(By.id("CUSTFIRSTNAME")).sendKeys("chandan");
		driver.findElement(By.id("CUSTLASTNAME")).sendKeys("j");
		driver.findElement(By.id("CUSTCOMMUCITY")).click();
		driver.findElement(By.id("CUSTCOMMUCITY")).sendKeys("MYSORE");
		
		Robot rb = new Robot();
		Thread.sleep(1000);
        rb.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        rb.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
		
		driver.findElement(By.id("residancespan")).click();
		driver.findElement(By.linkText("Rented Staying Alone")).click();;
		driver.findElement(By.id("yrspan_mvce")).click();
		driver.findElement(By.linkText("2018")).click();
		driver.findElement(By.id("mnthspan")).click();
		driver.findElement(By.linkText("Jun")).click();
		driver.findElement(By.xpath("//*[@id=\"DLR\"]/div/div[1]/label/span")).click();
		driver.findElement(By.id("DEALERNAME")).sendKeys("mannja");
		
		driver.findElement(By.name("model")).click();
		driver.findElement(By.name("model")).sendKeys("Honda City I-DTEC SV");
		driver.findElement(By.xpath("//*[@id=\"CITY_NAME\"]")).sendKeys("mumbai");
		driver.findElement(By.xpath("//*[@id=\"CAR_MODEL_PRIZE\"]")).click();
		
		driver.findElement(By.id("selSalbtn")).click();
		driver.findElement(By.linkText("Salaried")).click();
		
		driver.findElement(By.id("EMPLOYERNAME")).click();
		driver.findElement(By.id("EMPLOYERNAME")).sendKeys("ACCEL LTD");
		Robot rb1 = new Robot();
		Thread.sleep(1000);
        rb1.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        rb1.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
		
		driver.findElement(By.id("yrspan_we")).click();
		
		driver.findElement(By.linkText("2021")).click();
		driver.findElement(By.id("mnthspan_we")).click();
		driver.findElement(By.linkText("Feb")).click();
		driver.findElement(By.id("totalworkexp")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("1")).click();
		driver.findElement(By.id("MONTHLY_NET_HM_SAL")).click();
		driver.findElement(By.id("MONTHLY_NET_HM_SAL")).sendKeys("30000");
		driver.findElement(By.id("GROSS_FIXED_M_SAL")).click();
		driver.findElement(By.id("GROSS_FIXED_M_SAL")).sendKeys("34000");
		driver.findElement(By.id("TOTAL_CURR_EMI_PAID")).click();
		driver.findElement(By.id("TOTAL_CURR_EMI_PAID")).click();
		driver.findElement(By.id("TOTAL_CURR_EMI_PAID")).sendKeys("1");
		
	//	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[4]/div/div/i/div/div[5]/div[2]/div/div[1]/label/span")).click();
		
		driver.findElement(By.id("CUSTCONSENT")).click();
		driver.findElement(By.id("CUSTCONSENT")).click();
		driver.findElement(By.id("eligibility-btn")).click();
	
		
		
}
}