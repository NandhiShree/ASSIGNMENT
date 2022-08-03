package testLeaf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		//driver.findElement(By.xpath("//[text('Create New Account')]"));
		//driver.findElement(By.xpath("//button[(text()='Create New Account')]")).click();
		//WebElement createAccountHeading = driver.findElement(By.xpath("//span[text()='Create New Account']"));
		 driver.findElement(By.name("firstname")).sendKeys("Nandhi Shree");
		 driver.findElement(By.name("lastname")).sendKeys("Venkatesan");
		 driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com"); 
		 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@gmail.com"); 
		 
		 driver.findElement(By.id("password_step_input")).sendKeys("1234567"); 
			 WebElement dateElement = driver.findElement(By.name("birthday_day"));
			 WebElement monthElement = driver.findElement(By.name("birthday_month"));
			 WebElement yearElement = driver.findElement(By.name("birthday_year"));
			 
				Select dateDropdown = new Select (dateElement);
				Select monthDropdown = new Select (monthElement);
				Select yearDropdown = new Select (yearElement);
				
				dateDropdown.selectByVisibleText("22");
				monthDropdown.selectByVisibleText("Aug");
				yearDropdown.selectByVisibleText("2001");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
}
}
//Step 1: Download and set the path 
//Step 2: Launch the chromebrowser
//Step 3: Load the URL https://en-gb.facebook.com/
//Step 4: Maximise the window
//Step 5: Add implicit wait
//Step 6: Click on Create New Account button
//Step 7: Enter the first name
//Step 8: Enter the last name
//Step 9: Enter the mobile number
//Step 10: Enterthe password
//Step 11: Handle all the three drop downs
//Step 12: Select the radio button "Female" 
      //   ( A normal click will do for this step) 