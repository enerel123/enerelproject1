package Com.trainingofweekend.softwaretestingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	
			public static WebDriver driver;
			private static String alertButton;
		    public static void main(String[] args) throws InterruptedException {
			  
		    System.out.println("Hello World!");
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\ccene\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("https://demoqa.com/alerts");
		    Thread.sleep(10000);
		    
			WebElement alert1= driver.findElement (By.id(alertButton));
		    alert1.click();
		    Thread.sleep(10000);
		    driver.switchTo().alert().accept();
		    
		    
		    WebElement alert3= driver.findElement(By.id("confirmButtom"));
		    alert3.click();
		    Thread.sleep(10000);
		    driver.switchTo().alert().dismiss();
		   
	}

}
