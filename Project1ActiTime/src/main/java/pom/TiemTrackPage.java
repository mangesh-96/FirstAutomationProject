package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TiemTrackPage {
	
	@FindBy (xpath = "//span[text()='New']")
	private WebElement crateNewTask;
	@FindBy (xpath = "//button[text()='- Select Customer -']")
	private WebElement selectCustomer;
	@FindBy (xpath = "//button[text()='- ALL ACTIVE CUSTOMERS -']")
	private WebElement activeCustomer;
	@FindBy (xpath = "//button[text()='- Select Project -']")
	private WebElement selectProject;
	@FindBy (xpath = "(//a[contains(text(),'PROJECTS')])[1]")
	private WebElement projectName;
	@FindBy (xpath = "(//input[@type='text'])[1]")
	private WebElement taskname1;
	@FindBy (xpath = "(//button[text()='set deadline'])[1]")
	private WebElement setDeadline1;
	@FindBy (xpath = "(//span[text()='25'])[2]")
	private WebElement date;
	@FindBy (xpath = "(//input[@type='text'])[2]")
	private WebElement taskname2;
	@FindBy (xpath = "(//button[text()='set deadline'])[1]")
	private WebElement setDeadline2;
	@FindBy (xpath = "(//span[text()='25'])[4]")
	private WebElement date1;
	@FindBy (xpath = "(//input[@type='text'])[3]")
	private WebElement taskname3;
	@FindBy (xpath = "//button[text()='set deadline']")
	private WebElement setDeadline3;
	@FindBy (xpath = "(//span[text()='25'])[6]")
	private WebElement date2;
	@FindBy (xpath = "//div[@id='createTasksPopup_commitBtn']")
	private WebElement crateTask;
	
	public TiemTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createNewTasks()
	{
		crateNewTask.click();
		selectCustomer.click();
		activeCustomer.click();
		selectProject.sendKeys("abc");
		projectName.sendKeys("actitime Maven");
		taskname1.sendKeys("write test cases");
		setDeadline1.click();
		date.click();
		taskname2.sendKeys("review test cases");
		setDeadline2.click();
		date1.click();
		taskname3.sendKeys("execute test cases");
		setDeadline2.click();
		date2.click();
		crateTask.click();
		

	}
	


}
