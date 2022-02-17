package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkSchedulePage {
	
	@FindBy (xpath = "//div[text()='Work Schedule']")
	WebElement workSchedule;
	
	public WorkSchedulePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void toVerifyWorkScheduleTab()
	{
		workSchedule.click();
	}
	

}
