package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	
	@FindBy (xpath = "//td[@class='middle-right-cell']")
	private WebElement customerAndProjects;
	@FindBy (xpath = "(//span[@class='checkbox'])[1]")
	private WebElement nameOfCustomer;
	@FindBy (xpath = "//span[text()='Close']")
	private WebElement close;
	@FindBy (xpath = "//input[@class='controlBorder']")
	private WebElement filter;
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement applyFilter;
	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement checkbox;
	@FindBy (xpath = "(//input[@class='hierarchy_element_wide_button'])[2]")
	private WebElement completeSelectedtask;
	@FindBy (xpath = "//a[text()='Completed Tasks']")
	private WebElement completedtask;
	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement checkbox1;
	@FindBy (xpath = "(//input[@type='button'])[3]")
	private WebElement deletedTask;
	
	
	
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openTasks() 
	{
		customerAndProjects.click();
		nameOfCustomer.click();
		close.click();
		filter.sendKeys("write");
		applyFilter.click();
		checkbox.click();
		completeSelectedtask.click();
		completedtask.click();
		checkbox1.click();
		deletedTask.click();
	}

}
