package testLeaf;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	
	import io.github.bonigarcia.wdm.WebDriverManager;
	public class EditUpdateLeads {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		 driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		   
		driver.findElement(By.id("firstNameField")).sendKeys("Nandhi Shree");
		driver.findElement(By.id("lastNameField")).sendKeys("Venkatesan");
	    driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Software Testing");
	    driver.findElement(By.id("createContactForm_description")).sendKeys("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
	    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abbc@gmail.com");
	    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("nandy");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("v");
		driver.findElement(By.id("createContactForm_importantNote")).sendKeys(":P");
		
		WebElement generalStateProvinceGeoId = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd1=new Select(generalStateProvinceGeoId);
		dd1.selectByVisibleText("New York");
		WebElement Country = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd2=new Select(Country);
		dd2.selectByVisibleText("Indiana");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Z Y X W V U T S R Q P O N M L K J I H G F E D C B A");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		String text=driver.getTitle();
		System.out.println(text);
		
	}
}
