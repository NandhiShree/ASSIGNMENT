package testLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
	
		WebElement dropDown = driver.findElement(By.id("dropdown1"));
		Select dd1=new Select(dropDown);
		dd1.selectByIndex(4);
		
		driver.findElement(By.className("dropdown")).sendKeys("Selenium");
		
		WebElement dropDown2 = driver.findElement(By.id("dropdown3"));
		Select dd3=new Select(dropDown2);
		dd3.selectByValue("3");
		
		WebElement dropDown1 = driver.findElement(By.id("dropdown2"));
		Select dd2=new Select(dropDown1);
		dd2.selectByVisibleText ("selenium");
		
		
			}
}
