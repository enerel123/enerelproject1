package Regression;

import org.testng.annotations.Test;

import Com.pages.AmazonHome;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PrimeTest {
public static WebDriver driver;

 @BeforeTest
 public void beforeTest() throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ccene\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe"); 
    driver=new ChromeDriver();  
    driver.get("https://www.amazon.com/");
    driver.manage().window().maximize();
    Thread.sleep(5000);
    System.out.println("this is before test");
 }
 
 @Test
 public void f() throws InterruptedException {
  AmazonHome ob = new AmazonHome (driver);
  ob.signinhover();
  Thread.sleep(5000);
  ob.clickonamazonprime();
 }

 @AfterTest
 public void afterTest() throws InterruptedException {
  Thread.sleep(5000);
//  driver.close();
 }}