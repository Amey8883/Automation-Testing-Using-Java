package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QSP_FormValidation {

    public static void main(String[] args) throws InterruptedException {
        
        // Aim: This script demonstrates how to fill out a form on the QSPiders demo page and submit it.
        // It interacts with various input fields to test form validation by sending different types of data.
        
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window to ensure all elements are visible
        driver.manage().window().maximize();
        
        // Navigate to the QSPiders demo page
        driver.get("https://demoapps.qspiders.com/");
        
        // Wait for 5 seconds to ensure the page is fully loaded
        Thread.sleep(5000);
        
        // Click on the first block element to navigate to the form page
        driver.findElement(By.xpath("(//a[@class='block w-[100%] h-full'])[1]")).click();
        
        // Wait for 3 seconds to ensure the navigation is complete
        Thread.sleep(3000);
        
        // Click on the specific menu item to reach the form
        driver.findElement(By.xpath("//li[@class='no-use relative hover:bg-orange-50'][11]")).click();
        
        // Wait for 3 seconds to ensure the form is loaded
        Thread.sleep(3000);
        
        // Fill out the form with various types of data for validation
        driver.findElement(By.cssSelector("input[placeholder='Type something']")).sendKeys("my name is ");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Min 6 chars.']")).sendKeys("Pune, Maharastra");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("abc123");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Re-Type Password']")).sendKeys("abc123");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Max 6 chars.']")).sendKeys("Test");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Text between 5 - 10 chars length']")).sendKeys("Automation");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Enter a valid e-mail']")).sendKeys("abc123@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Min value is 6']")).sendKeys("18");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='URL']")).sendKeys("https://demo.automationtesting.in/Register.html");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Max value is 6']")).sendKeys("3");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Enter only digits']")).sendKeys("12345");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Number between 6 - 100']")).sendKeys("77");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Enter only numbers']")).sendKeys("78188");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Enter alphanumeric value']")).sendKeys("dgu567");
        Thread.sleep(1000);
        
        // Click the submit button to submit the form
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        
        // Wait for 1 second to observe the form submission
        Thread.sleep(1000);
        
        // Close the browser
        driver.quit();
    }
}
