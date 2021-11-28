

package Com.trainingofweekend.softwaretestingproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static WebDriver driver;
	  public static void main(String[] args) throws InterruptedException {
		  
	    System.out.println("Hello World!");
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ccene\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	
	    
	    driver.get("http://deluxe-menu.com/popup-mode-sample.html");
	    
	    Thread.sleep(5000);
	    
	    Actions ob= new Actions (driver);
	    WebElement image = driver.findElement(By.xpath("//*[@style='cursor: pointer;']"));
	    ob.contextClick(image).build().perform();
	    Thread.sleep(5000);
	    
	    WebElement contact= driver.findElement(By.xpath("//*[text()='Contact Us']"));
	    contact.click();
	    driver.close();


	}

}
