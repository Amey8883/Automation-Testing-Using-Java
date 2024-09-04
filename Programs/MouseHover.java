package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

    public static void main(String[] args) throws InterruptedException {

        // Aim: This script navigates to the Myntra homepage, verifies the URL, 
        // hovers over the "Men" section in the navbar, and clicks on a submenu item.

        String expected_url = "https://www.myntra.com/";  // The expected URL after loading the homepage
        
        // Initialize Chrome WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window to ensure all elements are visible
        driver.manage().window().maximize();
        
        // Wait for the browser to properly initialize
        Thread.sleep(3000);
        
        // Navigate to the Myntra homepage
        driver.get("https://www.myntra.com/");
        
        // Get the current URL of the loaded page
        String actual_url = driver.getCurrentUrl();
        
        // Verify if the loaded URL matches the expected URL
        if (expected_url.equals(actual_url)) {
            System.out.println("I am on the Myntra page");
            
            // Initialize the Actions class for performing mouse and keyboard interactions
            Actions act = new Actions(driver);
            
            // Locate the "Men" section in the navbar by its XPath
            WebElement men = driver.findElement(By.xpath("//a[@data-reactid='21']"));
            
            // Wait to ensure the element is fully loaded
            Thread.sleep(3000);
            
            // Perform a hover action over the "Men" section
            act.moveToElement(men).build().perform();
            
            // Wait for the hover effect to take place
            Thread.sleep(1000);
            
            // Click on a submenu item under "Men" (e.g., T-Shirts)
            driver.findElement(By.xpath("//a[@data-reactid='41']")).click();
        } else {
            // Print a message if the page URL does not match the expected URL
            System.out.println("I am not on the Myntra page....");
        }

        // Close the browser
        driver.quit();
    }
}
