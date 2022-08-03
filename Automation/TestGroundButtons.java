package testLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGroundButtons {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
		 driver.findElement(By.id("home")).click();
		 
		 WebElement Source = driver.findElement(By.id("position"));
		 Point xypoint=Source.getLocation();
		 int xvalue=xypoint.getX();
		 System.out.println("xvalue"+xvalue);
		 int yvalue=xypoint.getY();
		System.out.println("yvalue"+ yvalue);
		
		 WebElement colorButton = driver.findElement(By.id("color"));
		String color=colorButton.getCssValue("background-color");
		System.out.println("color"+color);
		
		WebElement sizeButton = driver.findElement(By.id("size"));
		int height=sizeButton.getSize().getHeight();
		int width=sizeButton.getSize().getWidth();
		System.out.println(height+"height" + width+"width");
		
	}
}
