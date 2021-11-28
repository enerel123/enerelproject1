package Com.trainingofweekend.softwaretestingproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitly {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		  
	    System.out.println("Hello World!");
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ccene\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    
	    driver.get("https://www.amazon.com");
	    
	    Thread.sleep(2000);
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    WebElement searchbox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
	    WebElement pharmacy= driver.findElement(By.xpath("//*[text()='pharmacy']"));
	    searchbox.click();
	    pharmacy.click();
	}

}
