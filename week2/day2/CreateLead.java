package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize WebDriver
		
		//chrome option 
		ChromeOption option = new ChromeOption();
		option.addArguments("guest");
		
		
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Maximize window and navigate to URL
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();

		//Login
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		//"Lead" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohamed");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ibrahim");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("test leaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("QA Management");
		
		driver.findElement(By.name("submitButton")).click();
		
		
		
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		//close - browser
		driver.close();
		
		
		

	}

}
