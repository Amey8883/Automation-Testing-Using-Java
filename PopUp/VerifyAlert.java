package PopUp;

import org.openqa.selenium.By;

import CrossBrowserTesting.CrossBrowserTesting;

public class VerifyAlert extends CrossBrowserTesting{

	public static void main(String[] args) throws InterruptedException {

		preCondition("chrome");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
	}
}
