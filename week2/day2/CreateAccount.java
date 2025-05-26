package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
	public static void main(String args[]) {
		
		
		/*
		 *    Initialize the WebDriver (ChromeDriver).
		 *		- Load the URL http://leaftaps.com/opentaps/.
		 *		- Maximize the browser window.
		 */
		//Initialize WebDriver
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Maximize window and navigate to URL
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		
		/*Enter a username and password.
		- Click the "Login" button.
		- Click on the "CRM/SFA" link.
		- Click on the "Accounts" tab.
		- Click on the "Create Account" button.
		- Enter an account name.
		- Enter a description as "Selenium Automation Tester."
		- Enter a Number Of Employees.
		- Enter a Site Name as “LeafTaps”
		- Click the "Create Account" button.
		- Verify that the Title is displayed correctly.
		*/
		
		//Login
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		//input
		driver.findElement(By.cssSelector("input#accountName")).sendKeys("Mohamed");
		driver.findElement(By.cssSelector("textarea.inputBox[name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		//click Button - create account
		driver.findElement(By.cssSelector("input.smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		//close - browser
		driver.close();	
	}

}
