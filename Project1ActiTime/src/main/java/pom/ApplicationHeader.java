package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {
	
	@FindBy (xpath = "//div[text()='Tasks']")
	private WebElement tasks;
	
	@FindBy (xpath = "//div[text()='Reports']")
	private WebElement reports;
	
	@FindBy (xpath = "//div[text()='Users']")
	private WebElement users;
	
	@FindBy (xpath = "//div[text()='Work Schedule']")
	private WebElement workSchedule;
	
	@FindBy (xpath = "//div[text()='Time-Track")
	private WebElement timeTrack;
	
	@FindBy (xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	
//	private WebDriver driver ;
//	private WebDriverWait wait ; 

	public ApplicationHeader(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
//		this.driver = driver;
//		wait = new WebDriverWait(driver,5);


	}
	
	public void clickOnTasks()
	{
//		WebDriverWait wait = new WebDriverWait(driver,5);
//		wait.until(ExpectedConditions.visibilityOf(tasks));
		tasks.click();
		
	}
	public void clickOnReports()
	{
//		wait.until(ExpectedConditions.visibilityOf(reports));
		reports.click();
		
	}
	public void clickOnUsers()
	{
		 users.click();
	    String text = users.getText();
	    
		
		
	}
	public void clickOnworkSchedule()
	{
		workSchedule.click();
		
	}
	public void clickOnTimeTrack()
	{
		timeTrack.click();
	}
	public void clickOnLogout()
	{
		logout.click();
	}
	

}



