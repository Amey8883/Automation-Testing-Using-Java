package BasicNa;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Aim: This program automates the process of navigating through different links 
 * on the Demo Web Shop website and verifies if the user is successfully redirected 
 * to the correct webpage by checking the URL.
 */
public class NavigateDemoWebShop {

    public static void main(String[] args) throws InterruptedException {
        // Define the expected URL to validate correct navigation
        String expected_result = "https://demowebshop.tricentis.com/";

        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize browser window
        driver.manage().window().maximize();
        
        // Open Demo Web Shop website
        driver.get("https://demowebshop.tricentis.com/");
        
        // Capture the current URL after page load
        String actual_result = driver.getCurrentUrl();
        
        // Verify if the actual URL matches the expected URL
        if(actual_result.equals(expected_result)) {
            System.out.println("I am on the DWS web page");

            // Find and iterate through the list of header links on the page
            List<WebElement> products = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
            
            for(WebElement web : products) {
                web.click();  // Click on each link
                Thread.sleep(1000);  // Wait for the page to load
                driver.navigate().back();  // Navigate back to the previous page
            }
            Thread.sleep(2000);  // Additional wait time
            driver.close();  // Close the browser
        } else {
            System.out.println("Failed to reach the DWS web page");
        }
        
        Thread.sleep(2000);  // Wait before closing the driver
        driver.close();  // Close the driver
    }
}
