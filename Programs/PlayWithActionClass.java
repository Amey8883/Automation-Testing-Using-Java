package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import CrossBrowserTesting.CrossBrowserTesting;

public class PlayWithActionClass extends CrossBrowserTesting {

    public static void main(String[] args) throws InterruptedException {
        // Aim: This script navigates to the Demo Web Shop home page and performs a SHIFT+CLICK action on the 'Books' link.
        // The SHIFT+CLICK action typically opens the link in a new tab or window.

        // Expected URL of the Demo Web Shop home page
        String expected_result = "https://demowebshop.tricentis.com/";
        
        // Set up the preconditions for the browser
        preCondition("chrome");
        Thread.sleep(2000);
        
        // Get the actual URL of the current page
        String actual_result = driver.getCurrentUrl();
        
        // Check if the actual URL matches the expected home page URL
        if (actual_result.equals(expected_result)) {
            // Initialize Actions class for performing advanced actions
            Actions act = new Actions(driver);
            
            // Locate the 'Books' link element on the page
            WebElement books = driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
            
            // Wait for 2 seconds before performing the action
            Thread.sleep(2000);
            
            // Perform a SHIFT+CLICK action on the 'Books' link element
            // This will typically open the link in a new tab or window
            act.keyDown(Keys.SHIFT).click(books).perform();
        }
       //close the browser
        driver.close();
    }
}
