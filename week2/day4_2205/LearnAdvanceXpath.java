package week2.day4_2205;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAdvanceXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Launch Application web page
		driver.get("https://testleaf-da-dev-ed.develop.my.salesforce.com/");
		
		//Login to application 
		driver.findElement(By.xpath()).sendKeys();
		

	}

}
