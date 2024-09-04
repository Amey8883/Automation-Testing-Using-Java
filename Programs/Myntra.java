package Assignments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

    // Aim: The purpose of this program is to navigate to the Myntra homepage, 
    // verify the correct URL is loaded, and hover over each element in the navbar 
    // to trigger any hover effects or dropdowns.

    public static void main(String[] args) throws InterruptedException {
        
        // Define the expected URL of the Myntra homepage
        String expected_result = "https://www.myntra.com/";
        
        // Initialize the ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize the browser window for better visibility
        driver.manage().window().maximize();
        
        // Navigate to the Myntra homepage
        driver.get(expected_result);
        
        // Wait for the page to fully load (including dynamic content)
        Thread.sleep(5000);
        
        // Get the actual URL of the current page
        String actual_result = driver.getCurrentUrl();
        
        // Check if the actual URL matches the expected URL
        if(expected_result.equals(actual_result))
        {
            System.out.println("Welcome to the Shopping world");

            // Locate all navbar elements on the page
            List<WebElement> products = driver.findElements(By.xpath("//nav[@class='desktop-navbar']/div/div/div/a"));
            
            // Initialize the Actions class to handle complex actions like hovering
            Actions action = new Actions(driver);
            
            // Loop through each navbar element
            for(WebElement items : products)
            {
                // Wait for 2 seconds before hovering (optional, for visibility)
                Thread.sleep(2000);
                
                // Hover over the current navbar item
                action.moveToElement(items).perform();
                
                // Wait for 3 seconds to observe the hover effect (optional)
                Thread.sleep(1000);
            }
        }
        
        // Close the browser after the operations are complete
        driver.quit();    
    }
}
