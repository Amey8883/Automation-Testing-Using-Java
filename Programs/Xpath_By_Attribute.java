// Package name declaration
package BasicNa;

// Importing necessary Selenium libraries
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Class declaration
public class Xpath_By_Attribute {

    // Main method to execute the test script
    public static void main(String[] args) throws InterruptedException {
        
        // Aim: To verify the landing page URL of the demo webshop and perform a search action using XPath by attribute.

        // Expected URL of the demo webshop landing page
        String expected_result = "https://demowebshop.tricentis.com/login";
        
        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Navigate to the demo webshop login page
        driver.get("https://demowebshop.tricentis.com/login");
        
        // Get the actual URL of the current page
        String actual_result = driver.getCurrentUrl();
        
        // Verify if the actual URL matches the expected URL
        if(actual_result.equals(expected_result)) {
            // Print confirmation message
            System.out.println("You are on the DWS landing page");
            
            // Locate the search field using XPath by attribute and enter "Laptop" in the search field
            WebElement search_field = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
            search_field.sendKeys("Laptop");
            
            // Pause the execution for 3 seconds to observe the action
            Thread.sleep(3000);

            // Close the browser
            driver.close();
        } else {
            // Print error message if the URL doesn't match
            System.out.println("You are not on the DWS landing page");
            
            // Close the browser
            driver.close();
        }
    }
}
