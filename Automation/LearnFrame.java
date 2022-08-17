package testLeaf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement Frame1=driver.findElement(By.id("Click"));
		Frame1.click();
		Thread.sleep(3000);
		String text= Frame1.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement frame2=driver.findElement(By.id("Click"));
		frame2.click();
		Thread.sleep(3000);
		String text1= frame2.getText();
		System.out.println(text1);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		
		List<WebElement> count = driver.findElements(By.tagName("iframe"));
		int size = count.size();
		System.out.println(size);
}
}
