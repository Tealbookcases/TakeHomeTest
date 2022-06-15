package E2ETestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RegisterObjects;

public class RegisterationStep {
	
	@Test
	public void Register()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\salee\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opencart.abstracta.us/");
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
		RegisterObjects ro=new RegisterObjects(driver);
		ro.fn().sendKeys("AnjumAyesha");
		ro.ln().sendKeys("Khan");
		ro.emailId().sendKeys("anjumayesha56778@gmail.com");
		ro.phone().sendKeys("9087897893");
		ro.pwd().sendKeys("Test@1234");
		ro.cpwd().sendKeys("Test@1234");
		ro.tc().click();
		ro.cb().click();
					
	}
	
	
	

}
