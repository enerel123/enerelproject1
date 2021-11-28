package Com.trainingofweekend.softwaretestingproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expwait {

		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			  
		    System.out.println("Hello World!");
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\ccene\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe");
		    driver=new ChromeDriver();
		    //driver.manage().window().maximize();
		    
		    
		    driver.get("https://www.amazon.com");
		    
		    WebDriverWait ob =new WebDriverWait (driver,20);
		    ob.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='twotabsearchtextbox']")));
		    
		    String sessionid= driver.getWindowHandle();
		    System.out.println("Session id of this window is="+sessionid);
		    
		    
		}

	}


