package Com.trainingofweekend.softwaretestingproject;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Dominotwo {

		public WebDriver driver;

		public void setBrowser(String WebSite) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ccene\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
			//browser settings
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//get to URL
			driver.get(WebSite);
			Thread.sleep(3000);
		}

		
		//Action type - data entry or mouse click
		public void ProcessStep(String actionType, String xPath, String inputValue) throws InterruptedException {
			
			WebElement theElement = driver.findElement(By.xpath(xPath));
			
			switch (actionType) {
			
			//Enter data on 'xPath'
			case "EnterData":
				if (theElement.isDisplayed()) {
					driver.findElement(By.xpath(xPath)).sendKeys(inputValue);
					Thread.sleep(2000);
				}
				else {
					System.out.println("Selected address type does not have the "+xPath+" element.");
				}
				break;
				
			//Mouse Click the 'xPath'
			case "MouseClick":
				driver.findElement(By.xpath(xPath)).click();
				Thread.sleep(2000);
				break;
			
			}
		}

		//How to select drop down menu's value
		public void DropDownValueSelector(String byType, String byElement, String byValue) throws InterruptedException {

			
			switch (byType) {

			case "ByID":
				
				WebElement obj_DropDownBox_id = driver.findElement(By.id(byElement));
				Select DropDownBox_id = new Select(obj_DropDownBox_id);
				//if an element is displayed then enter data or else print the element in not visible
				if (obj_DropDownBox_id.isDisplayed()) {
					DropDownBox_id.selectByValue(byValue);
					Thread.sleep(2000);
				}

				else {
					System.out.println("Selected address type does not have the "+byElement+" element.");
				}

				break;

			case "ByXP":

				WebElement obj_DropDownBox_xPath = driver.findElement(By.xpath(byElement));
				Select DropDownBox_xPath = new Select(obj_DropDownBox_xPath);
				//if an element is displayed then enter data or else print the element in not visible
				if (obj_DropDownBox_xPath.isDisplayed()) {
					DropDownBox_xPath.selectByValue(byValue);
					Thread.sleep(2000);
				}

				else {
					System.out.println("Selected address type does not have the "+byElement+" element.");
				}

				break;
			//Element by ClassName========================================================================
			case "ByCN":
				//Undefined
				break;
			//Element by Name=============================================================================
			case "ByN":
				//Undefined
				break;
			//Element by Link Text========================================================================
			case "ByLT":
				//Undefined
				break;
			//Element by Text Name========================================================================
			case "ByTN":
				//Undefined
				break;
			//Element by Partial Link Text=================================================================
			case "ByPLT":
				//Undefined
				break;
			}

		}


	}
