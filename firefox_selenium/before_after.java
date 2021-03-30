package firefox_selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class before_after {
@BeforeMethod
public void first()
{
	System.out.println("first method");
}
@AfterMethod
public void last()
{
	System.out.println("last method");
}
@Test
public void A()
{
	System.out.println("A");
}
@Test
public void B()
{
	System.out.println("B");
}
@Test
public void C()
{
	System.out.println("C");
}
}
