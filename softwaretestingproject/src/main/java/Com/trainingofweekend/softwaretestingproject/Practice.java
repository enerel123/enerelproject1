package Com.trainingofweekend.softwaretestingproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
	
	
	public static WebDriver driver;
	  public static void main(String[] args) throws InterruptedException {
		  
	    System.out.println("Hello World!");
	   // System.setProperty("webdriver.chrome.driver","C:\\Users\\ccene\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe");
	    //driver=new ChromeDriver();
	    
	   
	    
	   System.setProperty("webdriver.gecko.driver","C:\\Users\\ccene\\eclipse-workspace\\softwaretestingproject2\\drivers\\geckodriver.exe");
	   driver=new FirefoxDriver();
	    
	    
	    
	   
	   //System.setProperty("webdriver.edge.driver","C:\\Users\\ccene\\eclipse-workspace\\softwaretestingproject2\\drivers\\msedgedriver.exe");
	  // driver=new EdgeDriver();
	    
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    driver.get("https://www.facebook.com");
	    
	    Thread.sleep(2000);
	    WebElement element= driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	   element.click();
	   
	   WebElement F_Name=driver.findElement(By.name("firstname"));
	   F_Name.sendKeys("Enerel");
	   WebElement L_Name= driver.findElement(By.name("lastname"));
	   L_Name.sendKeys("Chuluunbat");
	   WebElement uEmail=driver.findElement(By.name("reg_email__"));
	   uEmail.sendKeys("ccenerel@gmail.com");
	   WebElement ReEmail=driver.findElement(By.name("reg_email_confirmation__"));
	   ReEmail.sendKeys("ccenerel@gmail.com");
	   
	   WebElement BdayMonth= driver.findElement(By.name("birthday_month"));
	   Select bmButton=new Select(BdayMonth);
	   bmButton.selectByValue("11");
	   
	   WebElement Bday = driver.findElement(By.name("birthday_day"));
	   Bday.sendKeys("9");
	   WebElement BdayYear=driver.findElement(By.name("birthday_year"));
	   BdayYear.sendKeys("1989");
	   WebElement gender=driver.findElement(By.xpath("(//*[@class='_58mt'])[2]"));
	   gender.click();
	   
	   Thread.sleep(4000);
	   driver.close();
	   
	   
	}

}
