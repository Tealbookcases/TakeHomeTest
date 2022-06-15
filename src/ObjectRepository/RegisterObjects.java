package ObjectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RegisterObjects {
	
	WebDriver driver;
	public RegisterObjects(WebDriver driver)
	{
	this.driver=driver;
	}
	By firstname = By.xpath("//input[@name='firstname']");
	By lastname = By.xpath("//input[@name='lastname']");
	By email = By.xpath("//input[@name='email']");
	By telephone = By.xpath("//input[@name='telephone']");
	By password = By.xpath("//input[@name='password']");
	By confirmPwd= By.xpath("//input[@name='confirm']");
	By termsconditions = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	By continueButton= By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	
	
	public WebElement fn()
	{
		return driver.findElement(firstname);
	}
	public WebElement ln()
	{
		return driver.findElement(lastname);
	}
	public WebElement emailId()
	{
		return driver.findElement(email);
	}
	public WebElement phone()
	{
		return driver.findElement(telephone);
	}
	public WebElement pwd()
	{
		return driver.findElement(password);
	}
	public WebElement cpwd()
	{
		return driver.findElement(confirmPwd);
	}
	public WebElement tc()
	{
		return driver.findElement(termsconditions);
	}
	public WebElement cb()
	{
		return driver.findElement(continueButton);
	}

}
