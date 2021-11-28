package Com.trainingofweekend.softwaretestingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendari {

	

		public static WebDriver driver;
		  public static void main(String[] args) throws InterruptedException {
			  
		    System.out.println("Hello World!");
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\ccene\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("https://www.expedia.com");
		    
		    driver.manage().window().maximize();
		    Thread.sleep(6000);
		    
		    driver.findElement(By.xpath("(//*class[uitk-faux-input uitk-form-field-trigger][1]"));
		    
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    Object clickoncalendar;
			js.executeScript("arguments[0].click()");
	
	}

}
