package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.telerik.com/contact");
		
		WebElement dd1 = driver.findElement(By.name("DropdownListFieldController_0"));
		WebElement dd2 = driver.findElement(By.id("Dropdown-2"));
		WebElement dd3 = driver.findElement(By.id("Country-1"));
		//Thread.sleep(5000);
		
		Select opt1 = new Select(dd1);
		opt1.selectByIndex(5);
		
		
		Select opt2 = new Select(dd2);
		opt2.selectByVisibleText("UI for React");
		
		Select opt3 = new Select(dd3);
		opt3.selectByValue("France");
		
		driver.close();
		
		
		
		
		
		

	}

}
