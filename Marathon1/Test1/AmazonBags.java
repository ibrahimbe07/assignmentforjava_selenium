package Marathon1.Test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBags extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// step 3 & 4:Type "Bags for boys" in the Search box
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for Boys",Keys.ENTER);
		
		//step 5 : Print the total number of results
		String result = driver.findElement(By.xpath("//span[text()='1-48 of over 10,000 results for']")).getText();
		System.out.println("Result of Bags for Boys" + result);
		
		//step 6: Select the first 2 brands in the left menu
		driver.findElement(By.xpath("//span[text()='Brands']/following::span[text()='Safari']")).click();
		driver.findElement(By.xpath("//span[text()='Brands']/following::span[text()='Gear']")).click();
		
		//step 7: Choose New Arrivals
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(2000);
		
		//step 8: Print the first resulting bag info
		String brand = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]")).getText();
		System.out.println("Selected brand is " + brand);
		if(brand == "Safari") {
			System.out.println("Selected brand is " + brand);
		}
		
		String bagName = driver.findElement(By.xpath("//span[contains(text(),'Verge 37L ')]")).getText();
		System.out.println("Bag Name: " + bagName);
		
		String bagPrice = driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[4]")).getText();
		
		bagPrice = bagPrice.replaceAll(",", "");
		int priceInt= Integer.parseInt(bagPrice);
		System.out.println("price of Bag: " + priceInt);
		
		String title = driver.getTitle();
		System.out.println("Title of the page: " +title);
		
		driver.close();
		
	}

}
