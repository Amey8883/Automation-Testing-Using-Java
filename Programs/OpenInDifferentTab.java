package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import CrossBrowserTesting.CrossBrowserTesting;

public class OpenInDifferentTab extends CrossBrowserTesting {

    public static void main(String[] args) throws InterruptedException {
        
        // Aim: This script demonstrates how to open a link in a new tab using Selenium WebDriver.
        // It uses the `Actions` class to perform a Ctrl+Click operation on a link to open it in a new tab.
        
        // Initialize browser driver from the CrossBrowserTesting base class
        preCondition("chrome");
        
        // Wait for 2 seconds to ensure the browser and page elements are properly loaded
        Thread.sleep(2000);
        
        // Initialize the Actions class for performing advanced user interactions
        Actions act = new Actions(driver);
        
        // Locate the "Register" link on the page
        WebElement register = driver.findElement(By.className("ico-register"));
        
        // Wait for 2 seconds to ensure the link element is fully loaded
        Thread.sleep(2000);
        
        // Perform a Ctrl+Click action on the "Register" link to open it in a new tab
        act.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
    }
}
