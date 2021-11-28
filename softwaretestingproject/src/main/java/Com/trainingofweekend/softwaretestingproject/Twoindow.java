package Com.trainingofweekend.softwaretestingproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Twoindow {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		  
	    System.out.println("Hello World!");
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ccene\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    
	    
	    
	    driver.get("https://www.amazon.com");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(5000);
	    
	    
	    Actions ob= new Actions(driver);
	    ob.keyDown(Keys.LEFT_SHIFT).build().perform();
	    driver.findElement(By.xpath("(//*[text()='Fashion'])[1]")).click();
	    ob.keyUp(Keys.LEFT_SHIFT).build().perform();
	    
	    
	    Set<String> winsession=driver.getWindowHandles();
	    Iterator<String>itr= winsession.iterator();
	    
	    String window1=itr.next();
	    String window2=itr.next();
	    

	    System.out.println("Session id of 1st window="+window1);
	    System.out.println("Session id of 1st window="+window2);
	    
	    Thread.sleep(5000);
	    driver.switchTo().window(window2);
	    driver.findElement(By.xpath("//*[@alt='Holiday Style Heroes. The Fashion gift guide.']")).click();
	    

	}

}
