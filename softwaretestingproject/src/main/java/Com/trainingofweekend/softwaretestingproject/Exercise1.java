package Com.trainingofweekend.softwaretestingproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	
		
		public static WebDriver driver;
		  public static void main(String[] args) throws InterruptedException {
			  
		    System.out.println("Hello World!");
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\ccene\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    
		    driver.get("https://www.homedepot.com");
		    
		    Thread.sleep(2000);
		    		    
		    
		    WebElement element= driver.findElement(By.xpath("(//*[@class='MyAccount__label SimpleFlyout__link--bold'][1])"));
			   element.click();
			
			Thread.sleep(2000);
			
			WebElement element1= driver.findElement(By.xpath("(//*[@class='MyAccount__auth'][1])"));
			   element1.click();
			   
			Thread.sleep(2000);
			
			WebElement email=driver.findElement(By.name("email"));
			email.sendKeys("ccenerel@gmail.com");
			
			Thread.sleep(2000);
			
			WebElement element2=driver.findElement(By.className("bttn__content"));
			element2.click();
			
			Thread.sleep(2000);
			
			WebElement element3=driver.findElement(By.xpath("(//*[@class='bttn__content'][1])"));
			element3.click();
			
			WebElement password=driver.findElement(By.id("password-input-field"));
			password.sendKeys("Chadd1inbolta$lda2");
			
			WebElement zipcode=driver.findElement(By.name("zipcode"));
			zipcode.sendKeys("22201");
			
			WebElement phone=driver.findElement(By.name("phone"));
			phone.sendKeys("7035558888");
			
			WebElement keepme=driver.findElement(By.xpath("(//*[@class='checkbox-btn__label-test u__text-align--left'][1])"));
			keepme.click();
			
			WebElement verify=driver.findElement(By.xpath("//*[@for='verify-phone-checkbox']"));
			verify.click();
			
			
			


			
	}

}
