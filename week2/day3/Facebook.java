package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Precondition: - Initialize ChromeDriver - Load the URL
		 * 
		 * https://en-gb.facebook.com/ - Maximize the browser window - Add an implicit
		 * 
		 * wait to ensure the web page elements are fully loaded Requirements: - Click
		 * on the Create new account button. 
		 * - Enter the First name. 
		 * - Enter the 		 * Surname.
		 *  - Enter the Mobile number or email address. 
		 *  - Enter the New		 * password.
		 *  - Handle all three dropdowns in Date of birth 
		 *  - Select the radio
		 * button in Gender.
		 */
		
		//Precondition: - Initialize ChromeDriver - Load the URL
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load URL
		driver.get("https://en-gb.facebook.com/");
		
		//Click on the Create new account button. 
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		
		//Enter the First name. 
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("med");
		
		//Enter the 		 * Surname.
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("aj");
		
		//Enter the Mobile number
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("99022");
		
		//Enter the New		 * password
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("12345678");
		
		//Handle all three dropdowns in Date of birth
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select day1 = new Select(day);
		
		day1.selectByVisibleText("21");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select month1 = new Select(month);
		
		month1.selectByVisibleText("Oct");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select year1 = new Select(year);
		
		year1.selectByVisibleText("1998");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.close();
		
	
	}

}
