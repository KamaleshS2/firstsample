package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    WebDriver driver = new ChromeDriver(options);
	    
	    driver.get("https://igvenkatesh.github.io/simpleHtmlDemoPage/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@value='m']")).click();
	    driver.findElement(By.id("fname")).clear();
//	    driver.findElement(By.id("fname")).sendKeys("Kamal");
	    driver.findElement(By.cssSelector("#fname")).sendKeys("Kamal");
	    driver.findElement(By.id("lname")).clear();
	    driver.findElement(By.id("lname")).sendKeys("Dinesh");
	    driver.findElement(By.name("newsletter")).click();
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

}
