package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateDropDown {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Maximize window and navigate to URL
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();

		// Login
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		// create account link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();

		driver.findElement(By.cssSelector("textarea.inputBox[name='description']"))
				.sendKeys("Selenium Automation Tester");

		WebElement slt1 = driver.findElement(By.name("industryEnumId"));
		Select slt_1 = new Select(slt1);

		slt_1.selectByVisibleText("Computer Software");
		// Thread.sleep(5000);

		WebElement slt2 = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select slt_2 = new Select(slt2);

		slt_2.selectByVisibleText("S-Corporation");

		WebElement slt3 = driver.findElement(By.id("marketingCampaignId"));
		Select slt_3 = new Select(slt3);

		slt_3.selectByIndex(5);

		// Thread.sleep(5000);
		WebElement slt4 = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));

		Select slt_4 = new Select(slt4);

		slt_4.selectByVisibleText("Texas");

		// click Button - create account
		driver.findElement(By.cssSelector("input.smallSubmit")).click();

		String title = driver.getTitle();
		System.out.println("Title: " + title);

		// close - browser
		driver.close();

	}

}
