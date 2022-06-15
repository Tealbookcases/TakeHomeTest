package E2ETestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.LoginObjects;

public class PlaceOrder {
	
	@Test
	public void placeOrd()
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
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a")).click();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		driver.findElement(By.xpath("//*[text()='Checkout']")).click();
		WebElement bix=driver.findElement(By.xpath("//*[@id=\"content\"]/div[0]/div[1]"));
		bix.findElement(By.xpath("//*[@id=\"button-payment-address\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"button-shipping-address\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"button-shipping-method\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[3]/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"button-payment-method\"]")).click();
		js.executeScript("window.scrollBy(0,450)", "");
		driver.findElement(By.xpath("//*[@id=\"button-confirm\"]")).click();
		
		
	}

}
