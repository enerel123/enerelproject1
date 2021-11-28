package Com.trainingofweekend.softwaretestingproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class Dominone {

			    public static <MyFunctions> void main(String[] args) throws InterruptedException {
				System.out.println("Hello World!");
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ccene\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				

				

					
						
					
						
						String [] LocationType = {"House","Apartment","Business","Campus/Base","Hotel","Other"};
						
						String [] CustomerInfo = {"PeopleNTech","8133 Leesburg Pike","220","Vienna","VA","22182"};
						
						int a=2, b=0;// 'a' for LocationType array, 'b' for CustomerInfo array
						
						//Calling setBrowser function from MyFunctions class /w URL argument
						setBrowser("https://www.dominos.com");
						
						//Navigate to customer info page
						ProcessStep("MouseClick", "(//button[@data-quid='close-button-component'])[1]", null);
						System.out.println("Popup closed.");
						
						ProcessStep("MouseClick", "//*[@data-quid='main-navigation-order-online']", null);
						System.out.println("Clicked order online");
						
						ProcessStep("MouseClick", "//span[@data-quid='easy-order-locator-delivery']", null);
						System.out.println("Clicked for delivery");
						
						//House, Apartment, Business, Campus/Base, Hotel, Other
						DropDownValueSelector("ByID", "Address_Type_Select", LocationType[a]);
						System.out.println("Location type '"+LocationType[a]+"' selected for delivery.");
						
						//Enter customer info
						ProcessStep("EnterData","//input[@id='Location_Name']", CustomerInfo[b]);
						ProcessStep("EnterData","//input[@id='Street']", CustomerInfo[b+1]);
						ProcessStep("EnterData","//input[@id='Address_Line_2']", CustomerInfo[b+2]);
						ProcessStep("EnterData","//input[@id='City']", CustomerInfo[b+3]);
						DropDownValueSelector("ByID", "Region", CustomerInfo[b+4]);
						ProcessStep("EnterData","//input[@id='Postal_Code']", CustomerInfo[b+5]);
						ProcessStep("EnterData","//input[@id='Postal_Code_Sep']", CustomerInfo[b+5]);
						ProcessStep("MouseClick", "//button[@data-quid='locator-search-button']", null);
						System.out.println("Customer info entered");
						

						//Future order
						ProcessStep("MouseClick", "//input[@id='Order_Timing_Future']", null);
						ProcessStep("MouseClick", "//img[@id='futureDateButtonImage']", null);
						ProcessStep("MouseClick", "//td[@aria-label='11-21-2021']", null);
						System.out.println("Future delivery date selected.");
						
						DropDownValueSelector("ByXP", "//select[@title='Future Time']", "13:45:00");
						System.out.println("Future delivery time selected.");
						
						/*======================= AFTER 12:00 AM ====================================
						
						//Select future date
						obj.ProcessStep("MouseClick", "(//button[@type='button'])[10]", null);
						obj.ProcessStep("MouseClick", "(//td[@aria-label])[14]", null);
						System.out.println("Future delivery date selected.");
						
						
						//Select future time
						obj.DropDownValueSelector("ByXP", "(//select[@aria-label='Select Time'])[2]", "12:00:00");
						System.out.println("Future delivery time selected.");
						
						//submit
						obj.ProcessStep("MouseClick", "(//button[@type='submit'])[2]", null);

						=============================================================================*/
						
						
						//waiting to quit the driver
						System.out.println("Waiting for ChromeDriver to quit.");
						Thread.sleep(20000);
						System.out.println("ChromeDriver closed.\nCompleted process.");
						driver.quit();
						

					}

				private static void DropDownValueSelector(String string, String string2, String string3) {
					// TODO Auto-generated method stub
					
				}

				private static void ProcessStep(String string, String string2, Object object) {
					// TODO Auto-generated method stub
					
				}

				private static void setBrowser(String string) {
					// TODO Auto-generated method stub
					
				}

				}
