package Com.trainingofweekend.softwaretestingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App {
	public static WebDriver driver;
  public static void main(String[] args) throws InterruptedException {
	  
    System.out.println("Hello World!");
    System.setProperty("webdriver.chrome.driver","C:\\Users\\ccene\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.facebook.com");
   
    WebElement create= driver.findElement(By.xpath("(//a[@role='button'])[2]"));
    create.click();
    Thread.sleep(5000);
   
    
    WebElement firstnamefield =driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/div/div/div/div/input)[1]"));
    firstnamefield.sendKeys("Enerel");
    Thread.sleep(5000);
    
    WebElement lastnamefield =driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/div/div/div/div/input)[2]"));
    lastnamefield.sendKeys("Chuluunbat");
    Thread.sleep(5000);
    

    /*WebElement bdaymonth=driver.findElement(By.name("birthday_month"));
    Select ob=new Select(bdaymonth);
    ob.selectByVisibleText("Dec");
    ob.selectByIndex(1);
    ob.selectByValue("3");
    Thread.sleep(15000);*/
    
    
    
    // WebElement create = driver.findElement(By.xpath(" //*[contains(text(),'Please')]"));
    //  create.click();
    
    
    
    
    //WebElement create = driver.findElement(By.xpath("(//*[contains(@data-testid,'open')[2]"));
    	   
    //create.click();
    
   // Thread.sleep(15000);
    
    
    
    
    //WebElement forgotpass= driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/div/form/div/a)[1]"));
    //forgotpass.click();
   // Thread.sleep(15000);
    
    //Partial link
    //WebElement forgotpass= driver.findElement(By.partialLinkText("Forgot P"));
   // forgotpass.click();
    //Thread.sleep(15000);
    
    
    
    //Text Link
    //WebElement forgotpass= driver.findElement(By.linkText("Forgot Password?"));
    //forgotpass.click();
    //Thread.sleep(15000);
    
    
    
    //ID
    /*WebElement emailfield =driver.findElement(By.id("email"));
    emailfield.sendKeys("ccenerel@gmail.com");
    
    
    WebElement passfield = driver.findElement(By.id("pass"));
    passfield.sendKeys("gfdfhjcx");
    
    
    //Name
    
    WebElement loginbutton= driver.findElement(By.name("login"));
    loginbutton.click();
    
    Thread.sleep(15000);
    driver.close();*/
    
  }
}
