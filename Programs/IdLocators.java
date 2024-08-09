package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*
   Aim: This script automates the process of verifying the title of the
   Demo Web Shop homepage and using an ID locator to enter "ps5" into the
   search field if the title matches.
 */
public class IdLocators {

    public static void main(String[] args) throws InterruptedException {
        
        // Expected title of the Demo Web Shop homepage
        String expected_result = "Demo Web Shop";
        
        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Navigate to the Demo Web Shop homepage
        driver.get("https://demowebshop.tricentis.com/");
        
        // Wait for 3 seconds to ensure the page has fully loaded
        Thread.sleep(3000);
        
        // Get the title of the current page
        String actual_result = driver.getTitle();
        
        // Check if the actual title matches the expected title
        if(expected_result.equals(actual_result))
        {
            System.out.println("I am in the DWS");
            // Find the search field by its ID and enter "ps5"
            driver.findElement(By.id("small-searchterms")).sendKeys("ps5");
            // Wait for 5 seconds to observe the result
            Thread.sleep(5000);
        } else
        {
            System.out.println("I am not in the DWS");
            // Close the browser if the title does not match
            driver.close();
        }

        // Quit the browser session
        driver.quit();
    }
}
