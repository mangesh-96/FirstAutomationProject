package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath = "//input[@name='username']")
	private WebElement userName ;
	
	@FindBy (xpath = "//input[@name='pwd']")
	private WebElement password ;
	
	@FindBy (xpath ="//input[@name='remember']")
	private WebElement keepMeLogin ;
	
	@FindBy (xpath = "//a[@id='loginButton']")
	private WebElement login ;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName(String userId)
	{
		userName.sendKeys(userId);
	}
	public void sendPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickKeepMelogin()
	{
		keepMeLogin.click();
	}
	public void clickLogin()
	{
		login.click();
	}
	
	public void loginToApplication()
	{
		userName.sendKeys("admin");
		password.sendKeys("manager");
		keepMeLogin.click();
		login.click();
	}


}
