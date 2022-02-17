package tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import pom.ApplicationHeader;
import pom.LoginPage;
import pom.TiemTrackPage;
import pom.WorkSchedulePage;
import utils.Utility;

public class TestClass2 extends Browser {
	
	private WebDriver driver;
	private ApplicationHeader applicationHeader;
	private LoginPage loginPage;
	private WorkSchedulePage workSchedulePage;
	private int testId;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters("testdata")
	public void launchBrowser(String browser)
	{
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		if(browser.equalsIgnoreCase("Firefox"))
		{
			driver = launchFirefoxBrowser();	
		}
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = launchChromeBrowser();	
		}
		
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	}
	
	
	
	@BeforeClass
	public void createPomObject()
	{
		 loginPage = new LoginPage(driver);
		 applicationHeader = new ApplicationHeader(driver);
		 workSchedulePage = new WorkSchedulePage(driver);
	}
	
	@BeforeMethod
	public void loginToApplication() throws EncryptedDocumentException, IOException
	{
		 driver.get("http://localhost/login.do");

		 String userName = Utility.getExcelSheetData("sheet2",0,0);
		 loginPage.sendUserName(userName);
		 String password = Utility.getExcelSheetData("sheet2",1,0);
		 loginPage.sendPassword(password);
		 loginPage.clickKeepMelogin();
		 loginPage.clickLogin();
		
	}
	
	@Test
	public void toVerifyWorkScheduleTab()
	{
		testId =102;
		workSchedulePage.toVerifyWorkScheduleTab();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		Assert.assertEquals(url, "http://localhost/administration/workingdays.do");
		Assert.assertEquals(title, "actiTIME - Corporate Schedule");
		
	}
	
	@Test
	public void toVerifyUsersTab()
	{
		testId =102;
		
	    applicationHeader.clickOnUsers();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(url, "http://localhost/administration/userlist.do");
		softAssert.assertEquals(title, "actiTIME - User List");
		softAssert.assertAll();
		
	}
	
	
	
	@AfterMethod
	public void applicationLogOut(ITestResult result) throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.getScreenShot(driver, 101);
			
		}
	
		applicationHeader.clickOnLogout();
	}
	
	@AfterClass
	public void clearPomObject()
	{
		
		applicationHeader = null ;
		loginPage = null ;
		
	}

	
	@AfterTest
	public void closeBrowser () {
		
		driver.quit();
		driver = null ;
		
		System.gc();
	}
	
	
	

}
