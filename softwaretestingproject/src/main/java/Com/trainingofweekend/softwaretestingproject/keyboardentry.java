package Com.trainingofweekend.softwaretestingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardentry {
	public static WebDriver driver;

	
	public static void main(String[] args) throws InterruptedException {
		  
	    System.out.println("Hello World!");
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ccene\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	
	    
	    driver.get("https://www.amazon.com/");
	    
	    Thread.sleep(5000);

	    WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
	    search.sendKeys("scooter");
	    //search.sendKeys(Keys.ENTER);
	    
	    Actions ob = new Actions(driver);
	    ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	    ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	    Thread.sleep(5000);
	    search.clear();
	    Thread.sleep(5000);
	    search.click();
	    ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
