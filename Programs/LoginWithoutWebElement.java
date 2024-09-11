package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import CrossBrowserTesting.CrossBrowserTesting;

public class LoginWithoutWebElement extends CrossBrowserTesting {

    public static void main(String[] args) throws InterruptedException {
        
        // Aim: This script performs a login operation on the Demo Web Shop site using keyboard actions only. 
        // It navigates to the login page, enters credentials, and interacts with form elements without directly locating them.

        // Expected URL of the login page
        String expected_result = "https://demowebshop.tricentis.com/login";
        
        // Set up the preconditions for the browser
        preCondition("chrome");
        Thread.sleep(2000);
        
        // Navigate to the Demo Web Shop home page
        driver.get("https://demowebshop.tricentis.com/");
        
        // Initialize Actions class for keyboard interactions
        Actions act = new Actions(driver);
        
        // Perform TAB key actions to navigate through form fields
        act.keyDown(Keys.TAB).build().perform();
        Thread.sleep(1000);
        act.keyDown(Keys.TAB).build().perform();
        Thread.sleep(1000);
        act.keyDown(Keys.TAB).build().perform();
        Thread.sleep(1000);
        act.keyDown(Keys.ENTER).build().perform();
        Thread.sleep(1000);
        
        // Get the actual URL of the current page
        String actual_result = driver.getCurrentUrl();
        
        // Check if the actual URL matches the expected login page URL
        if (actual_result.equals(expected_result)) {
            // Enter the email address into the email field
            act.sendKeys("amey1234@gmail.com").build().perform();
            Thread.sleep(1000);
            
            // Navigate to the password field
            act.keyDown(Keys.TAB).build().perform();
            Thread.sleep(1000);
            
            // Enter the password into the password field
            act.sendKeys("Nuttertools@12").build().perform();
            Thread.sleep(1000);
            
            // Navigate to the "Remember Me" checkbox
            act.keyDown(Keys.TAB).build().perform();
            Thread.sleep(1000);
            
            // Locate the "Remember Me" checkbox and click it
            WebElement remember_me = driver.findElement(By.xpath("//input[@id='RememberMe']"));
            act.click(remember_me).build().perform();
            
            // Wait for a short period before closing the browser
            Thread.sleep(1000);
            
            // Close the browser
            driver.quit();
        }
    }
}
