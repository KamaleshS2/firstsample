package checkboxdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class checkboxdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		
	    driver.get("https://demoqa.com/checkbox");
	    driver.manage().window().maximize();
	    WebElement home = driver.findElement(By.xpath("//button[contains(@class,'rct-option rct-option-expand-all')]"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;  
	    js.executeScript("arguments[0].scrollIntoView();", home);
	    home.click();
	    
	    WebElement desktop = driver.findElement(By.xpath("//label[@for='tree-node-desktop']"));
	    desktop.click();
	    System.out.println("Desktop is selected : "+desktop.isEnabled());
	    
	    WebElement Angular = driver.findElement(By.xpath("//label[@for='tree-node-angular']"));
	   
	    js.executeScript("arguments[0].scrollIntoView();", Angular);
	    System.out.println("Angular is displayed : "+Angular.isDisplayed());
	    Angular.click();
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Angular is selected : " + Angular.isSelected());
	}

}
