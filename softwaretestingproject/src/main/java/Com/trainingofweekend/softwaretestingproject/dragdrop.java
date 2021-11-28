package Com.trainingofweekend.softwaretestingproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static WebDriver driver;
	  public static void main(String[] args) throws InterruptedException {
		  
	    System.out.println("Hello World!");
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ccene\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	 //   driver.manage().deleteAllCookies();
	 //   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 //   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    driver.get("https://www.jqueryui.com/droppable");
	    
	    Thread.sleep(5000);
	    
	    driver.switchTo().frame(0);
	    
	    WebElement dragable= driver.findElement(By.id("draggable"));
	    WebElement dropable= driver.findElement(By.id("droppable"));
	    
	    Actions ob= new Actions (driver);
	   // ob.dragAndDrop(dragable, dropable).build().perform();
	    ob.dragAndDropBy(dragable, 60, 100).perform();
	   
	    /*driver.switchTo().parentFrame();
	   
	    WebElement demo=driver.findElement(By.xpath("(//*[text()='Demos'])[1]"));
	    demo.click();*/
	}

}
