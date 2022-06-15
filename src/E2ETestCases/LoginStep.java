package E2ETestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.LoginObjects;


public class LoginStep {
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\salee\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opencart.abstracta.us/");
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		LoginObjects lo=new LoginObjects(driver);
		lo.lemail().sendKeys("anjumayesha56778@gmail.com");
		lo.lpwd().sendKeys("Test@1234");
		lo.loginb().click();
	}
	
	
	

}
