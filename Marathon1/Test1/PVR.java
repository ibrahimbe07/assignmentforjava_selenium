package Marathon1.Test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVR {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//step3 : Choose Your location as "Chennai"
		//driver.findElement(By.xpath("//div[@class='cities-show']")).click();
		//driver.findElement(By.xpath("//span[@class=\"sc-gjcoXW hFdstN pointer\" and text()='Chennai']")).click();
		
		//Click on Cinema under Quick Book
		driver.findElement(By.xpath("//span[@class='cinemas-inactive' and text()='Cinema']")).click();
		Thread.sleep(3000);
		
		//Select Your Cinema
		driver.findElement(By.xpath("//span[@class='imax-logo-show-poster']/following::img[@alt='MISSION: IMPOSSIBLE - THE FINAL RECKONING']")).click();
		driver.findElement(By.xpath("//span[text()='Book Now']")).click();
	
		//Select Your Date as Tomorrow
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		
		//Select Your Show Time
		driver.findElement(By.xpath("(//h5[contains(text(),'PM')])[2]")).click();
		
		//Click Accept on Term and Condition
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Accept' and @class='sc-kfeOyU hsmcHs reject-terms']")).click();
		//Book seat
		driver.findElement(By.xpath("(//span[text()='7' and @class='seat-current-pvr'])[1]")).click();
		
		// proceed payment
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		// select seat & price
		String seat = driver.findElement(By.xpath("//p[text()='J7']")).getText();
		String price = driver.findElement(By.xpath("//span[text()='82.38']")).getText();
		System.out.println("Seat: "+ seat + "Price: " +price);
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
			
		
		
		
		
	}
	

}
