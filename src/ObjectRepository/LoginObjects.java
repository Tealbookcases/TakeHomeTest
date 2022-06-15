package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObjects {

	WebDriver driver;
	public LoginObjects(WebDriver driver)
	{
	this.driver=driver;
	}
	By loginemail = By.xpath("//*[@id=\"input-email\"]");
	By loginpwd = By.xpath("//*[@id=\"input-password\"]");
	By loginbutton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	
	public WebElement lemail()
	{
		return driver.findElement(loginemail);
	}
	public WebElement lpwd()
	{
		return driver.findElement(loginpwd);
	}
	public WebElement loginb()
	{
		return driver.findElement(loginbutton);
	}
}
