package rediffmailProject4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediffmail1 {
	
	public class DynamicElementRediffmail {
		
		public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    
		    driver.get("https://www.rediff.com/");
		    Thread.sleep(3000);
		    
		    String url = driver.getCurrentUrl();
		    System.out.println(url);
		    String title = driver.getTitle();
		    System.out.println(title);
		    if(url.equals("https://www.rediff.com/"))
		    {
		    	System.out.println("pass");
		    	
		    }
		    else {
		    	System.out.println("fail");
		    }
		    if(title.equals("Rediff.com: News | Rediffmail | Stock Quotes | Shopping"))
		    {
		    	System.out.println("pass");
		    	
		    }
		    else {
		    	System.out.println("fail");
		    }
		    
		    WebElement Createaccount = driver.findElement(By.xpath("//a[text()='Create Account']"));
		    Createaccount.click();
		    
		    WebElement FullName = driver.findElement(By.xpath("(//table[@align='center'])[2]//tr[3]//td[3]//input"));
		    FullName.sendKeys("Mangesh B Bhaware");
		    Thread.sleep(3000);
		    
		    WebElement rediffmailid = driver.findElement(By.xpath("//table[@id='tblcrtac']//tr[7]//input[1]"));
		    rediffmailid.sendKeys("mangeshbbs22");  //basic Xpath=(//input[@type='text'])[2]
		    Thread.sleep(3000);
		    
		    WebElement Checkavailability = driver.findElement(By.xpath("//table[@id='tblcrtac']//tr[7]//input[2]"));
		    Checkavailability.click();
		    Thread.sleep(3000);
		    
		    WebElement password = driver.findElement(By.xpath("(//table[@id='tblcrtac'])//tr[9]//input"));
		    password.sendKeys("Mangesh1234");
		    Thread.sleep(3000);
		    
		    WebElement Repassword = driver.findElement(By.xpath("(//table[@id='tblcrtac'])//tr[11]//input"));
		    Repassword.sendKeys("Mangesh1234");
		    Thread.sleep(3000);
		    
		    WebElement Checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		    Checkbox.click();
		    Thread.sleep(3000);
		    
		    WebElement SecurityQ = driver.findElement(By.xpath("//select[contains(@name,'hintq')]"));
		    Select s = new Select(SecurityQ);
		    s.selectByIndex(3);
		    Thread.sleep(3000);
		    
		    WebElement answer = driver.findElement(By.xpath("(//table[@cellspacing='0'])[5]//tr[4]//input"));
		    answer.sendKeys("sweets");
		    Thread.sleep(3000);
		    
		    WebElement MotherName = driver.findElement(By.xpath("(//table[@cellspacing='0'])[5]//tr[6]//input"));
		    MotherName.sendKeys("Shanta");
		    Thread.sleep(3000);
		    
		    WebElement MobileNo = driver.findElement(By.xpath("(//table[@cellspacing='0']//tr[20]//input)[2]"));
		    MobileNo.sendKeys("9309857252");
		    Thread.sleep(3000);
		    
		    WebElement Date = driver.findElement(By.xpath("(//table[@cellspacing='0'])[2]//tr[22]//select[1]"));
		    Select s1 = new Select(Date); // basic path= (//select[@onchange='fieldTrack(this);'])[2]
		    s1.selectByIndex(22);
		    Thread.sleep(3000);
		    
		    WebElement month = driver.findElement(By.xpath("(//table[@cellspacing='0'])[2]//tr[22]//select[2]"));
		    Select s2 = new Select(month); 
		    s2.selectByValue("10");
		    Thread.sleep(3000);
		    
		    WebElement year = driver.findElement(By.xpath("(//table[@cellspacing='0'])[2]//tr[22]//select[3]"));
		    Select s3 = new Select(year); 
		    s3.selectByVisibleText("1996");
		    Thread.sleep(3000);
		    
		    String url1 = driver.getCurrentUrl();
		    System.out.println(url1);
		    String title1 = driver.getTitle();
		    System.out.println(title1);
		    if(url1.equals("http://register.rediff.com/register/register.php?FormName=user_details"))
		    {
		    	System.out.println("pass");
		    	
		    }
		    else {
		    	System.out.println("fail");
		    }
		    if(title1.equals("Rediffmail Free Unlimited Storage"))
		    {
		    	System.out.println("pass");
		    	
		    }
		    else {
		    	System.out.println("fail");
		    }

		}
	}
}
