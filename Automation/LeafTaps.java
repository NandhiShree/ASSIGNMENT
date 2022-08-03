package testLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTaps {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	String text=driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
    driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Leads")).click();	
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nandhi Shree");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Venkatesan");
	driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("0001");
	driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");
    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
    driver.findElement(By.id("createLeadForm_description")).sendKeys("abcdefgijklmnopqrstuvwxyz");
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abbc@gmail.com");
    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("nandy");
	driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("v");
	driver.findElement(By.id("createLeadForm_importantNote")).sendKeys(":P");
    
	WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select dd1=new Select(Source);
	dd1.selectByVisibleText("Employee");
	
	WebElement Industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select dd2=new Select(Industry);
	dd2.selectByVisibleText("Computer Software");
	
	WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select dd3=new Select(Ownership);
	dd3.selectByVisibleText("Corporation");
	
	WebElement Marketing_Campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select dd4=new Select(Marketing_Campaign);
	dd4.selectByVisibleText("Automobile");
	
	WebElement Preferred_Currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
	Select dd5=new Select(Preferred_Currency);
	dd5.selectByVisibleText("AFA - Afghani");
	
	WebElement generalStateProvinceGeoId = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dd6=new Select(generalStateProvinceGeoId);
	dd6.selectByVisibleText("New York");
	
	driver.findElement(By.className("smallSubmit")).click();
	String title="View Lead | opentaps CRM";
	String title2= driver.getTitle();
			if(title.contains(title2)) {
				//if(title.equasls(title2)) {
				System.out.println("CreateLead is Created Successful");
			}else
			{
				System.out.println("CreateLead is Not Created Successful");
			}
			 driver.findElement(By.linkText("Edit")).click();	
			 driver.findElement(By.id("updateLeadForm_description")).clear();
			 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Testing is cool");
			 driver.findElement(By.xpath("//input[@name='submitButton'][1]")).click(); 
			 
			 String pageTitle=driver.getTitle();
			 System.out.println(pageTitle);
						
}
}
