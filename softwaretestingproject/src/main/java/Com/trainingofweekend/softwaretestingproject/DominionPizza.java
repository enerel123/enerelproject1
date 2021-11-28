package Com.trainingofweekend.softwaretestingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominionPizza {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		  
	    System.out.println("Hello World!");
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ccene\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	   
	    
	    
	    driver.get("https://www.dominos.com");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    //JavascriptExecutor js=(JavascriptExecutor)driver;
	    
	    WebElement popup= driver.findElement(By.className("css-1folkw8"));
	    popup.click();
	    
	    Thread.sleep(5000);
	    
	    WebElement delivery= driver.findElement(By.className("css-xkd0lx"));
	    delivery.click();
	   
	    WebElement streetadd= driver.findElement(By.xpath("//*[@id='Street']"));
	    streetadd.sendKeys("12707 Inverness Way");
	    
	    WebElement appnumber= driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div/div/div/div/input"));
	    appnumber.sendKeys("201");
	    
	    
	    WebElement condelivery= driver.findElement(By.xpath(" //*[@class='btn btn--large btn--search-location js-search-cta c-locationsearch-search-cta']"));
	    condelivery.click();
	   
	    
	}

}
