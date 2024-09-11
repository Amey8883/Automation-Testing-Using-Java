package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException   {
		
		String expected_result = "https://demowebshop.tricentis.com/";
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String actual_result = driver.getCurrentUrl();
		
		if(expected_result.equals(actual_result))
		{
			System.out.println("I am in the DWS page");
			
			WebElement register = driver.findElement(By.className("ico-register"));
			
			Actions act = new Actions(driver);
			
			act.moveToElement(register).build().perform();
			
			Thread.sleep(3000);
			
			act.contextClick().build().perform();
			
		}
		else {
			System.out.println("I am not in DWS page");
		}
		
		driver.quit();

	}

}
