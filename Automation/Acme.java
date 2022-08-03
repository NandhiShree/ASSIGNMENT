package testLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acme {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com"); 
		driver.findElement(By.id("password")).sendKeys("leaf@12"); 
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	    String pageTitle=driver.getTitle();
		 System.out.println(pageTitle);
	
	
}}
//Load url "https://acme-test.uipath.com/login"
	 // Enter email as "kumar.testleaf@gmail.com"
	 //Enter Password as "leaf@12"
	 // Click login button
	 // Get the title of the page and print
	 // Click on Log Out
	 // Close the browser (use -driver.close())